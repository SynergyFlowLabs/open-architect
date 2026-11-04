import { render, screen, within } from "@testing-library/react";
import userEvent from "@testing-library/user-event";
import { beforeEach, describe, expect, it, vi } from "vitest";
import { PLANNER_STORAGE_KEY, serializeSnapshot } from "@/lib/planner/snapshot";
import { createInitialPlannerState } from "@/lib/planner/reducer";
import { RoomPlanner } from "./room-planner";

function renderPlanner() {
  return render(<RoomPlanner brand={<span>Open Architect</span>} />);
}

describe("RoomPlanner", () => {
  beforeEach(() => {
    window.localStorage.clear();
  });

  it("adds, edits, moves, and deletes a room through native controls", async () => {
    const user = userEvent.setup();
    renderPlanner();

    await user.click(screen.getByRole("button", { name: "Add room" }));

    const canvas = screen.getByRole("region", { name: "Plan canvas" });
    const canvasRoom = within(canvas).getByRole("button", { name: /Room 1/ });
    expect(canvasRoom).toHaveAttribute("aria-pressed", "true");
    expect(screen.getByRole("region", { name: "Room inspector" })).toBeInTheDocument();

    const nameInput = screen.getByRole("textbox", { name: "Room name" });
    await user.clear(nameInput);
    await user.type(nameInput, "Studio");
    await user.tab();
    expect(canvasRoom).toHaveAccessibleName(/Studio/);

    canvasRoom.focus();
    await user.keyboard("{ArrowRight}");
    expect(screen.getByRole("spinbutton", { name: "X position in metres" })).toHaveValue(0.5);
    expect(await screen.findByText("Saved on this device")).toBeInTheDocument();

    await user.click(screen.getByRole("button", { name: "Delete Studio" }));
    expect(screen.queryByRole("region", { name: "Room inspector" })).not.toBeInTheDocument();
    expect(screen.getByText("Your plan starts here.")).toBeInTheDocument();
  });

  it("hydrates a saved plan without overwriting it during initialization", async () => {
    const saved = {
      ...createInitialPlannerState(),
      rooms: [{ id: "saved", name: "Saved studio", x: 1, y: 1, width: 4, depth: 3 }],
    };
    const serialized = serializeSnapshot(saved);
    window.localStorage.setItem(PLANNER_STORAGE_KEY, serialized);
    const setItem = vi.spyOn(Storage.prototype, "setItem");

    renderPlanner();

    const canvas = screen.getByRole("region", { name: "Plan canvas" });
    expect(
      await within(canvas).findByRole("button", { name: /Saved studio/ }),
    ).toBeInTheDocument();
    expect(setItem).not.toHaveBeenCalled();
  });

  it("keeps the editor usable when local storage is unavailable", async () => {
    vi.spyOn(Storage.prototype, "getItem").mockImplementation(() => {
      throw new Error("Storage blocked");
    });
    const user = userEvent.setup();
    renderPlanner();

    expect(await screen.findByText(/Local saving is unavailable/)).toBeInTheDocument();
    await user.click(screen.getByRole("button", { name: "Add room" }));
    expect(screen.getByRole("region", { name: "Room inspector" })).toBeInTheDocument();
  });
});
