import { act, render, screen, within } from "@testing-library/react";
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
    expect(canvasRoom).toHaveAccessibleName("Studio 4 × 3 m");

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

describe("RoomPlanner plan import", () => {
  beforeEach(() => {
    window.localStorage.clear();
  });

  it("imports a valid plan and restores the previous plan with undo", async () => {
    const user = userEvent.setup();
    renderPlanner();
    await user.click(screen.getByRole("button", { name: "Add room" }));

    const imported = {
      ...createInitialPlannerState(),
      name: "Client plan",
      rooms: [
        { id: "imported", name: "Imported office", x: 1, y: 1, width: 2, depth: 2 },
      ],
    };
    const input = screen.getByLabelText("Import plan");
    await user.upload(
      input,
      new File([serializeSnapshot(imported)], "client-plan.json", {
        type: "application/json",
      }),
    );

    const canvas = screen.getByRole("region", { name: "Plan canvas" });
    expect(
      await within(canvas).findByRole("button", { name: "Imported office 2 × 2 m" }),
    ).toBeInTheDocument();
    expect(within(canvas).queryByRole("button", { name: /Room 1/ })).not.toBeInTheDocument();
    expect(screen.getByText('Imported "Client plan" with 1 room.')).toBeInTheDocument();
    expect(screen.getByRole("textbox", { name: "Plan name" })).toHaveValue("Client plan");

    await user.click(screen.getByRole("button", { name: "Undo import" }));
    expect(
      await within(canvas).findByRole("button", { name: "Room 1 4 × 3 m" }),
    ).toBeInTheDocument();
    expect(within(canvas).queryByRole("button", { name: /Imported office/ })).not.toBeInTheDocument();
    expect(
      screen.getByText("Import undone. Your previous plan is restored."),
    ).toBeInTheDocument();
    expect(screen.getByRole("textbox", { name: "Plan name" })).toHaveValue("Untitled plan");
  });

  it("keeps the current plan when an imported file is invalid", async () => {
    const user = userEvent.setup();
    renderPlanner();
    await user.click(screen.getByRole("button", { name: "Add room" }));

    await user.upload(
      screen.getByLabelText("Import plan"),
      new File(["{"], "broken.json", { type: "application/json" }),
    );

    expect(await screen.findByRole("alert")).toHaveTextContent(
      "The snapshot is not valid JSON.",
    );
    const canvas = screen.getByRole("region", { name: "Plan canvas" });
    expect(
      within(canvas).getByRole("button", { name: "Room 1 4 × 3 m" }),
    ).toBeInTheDocument();
  });

  it("retires import undo after a subsequent plan edit", async () => {
    const user = userEvent.setup();
    renderPlanner();
    const imported = {
      ...createInitialPlannerState(),
      name: "Client plan",
      rooms: [
        { id: "imported", name: "Imported office", x: 1, y: 1, width: 2, depth: 2 },
      ],
    };
    await user.upload(
      screen.getByLabelText("Import plan"),
      new File([serializeSnapshot(imported)], "client-plan.json", {
        type: "application/json",
      }),
    );

    const canvas = screen.getByRole("region", { name: "Plan canvas" });
    expect(
      await within(canvas).findByRole("button", { name: "Imported office 2 × 2 m" }),
    ).toBeInTheDocument();
    await user.click(screen.getByRole("button", { name: "Move Imported office right" }));

    expect(screen.queryByRole("button", { name: "Undo import" })).not.toBeInTheDocument();
    expect(screen.queryByText('Imported "Client plan" with 1 room.')).not.toBeInTheDocument();
  });
});

describe("RoomPlanner editing history", () => {
  beforeEach(() => {
    window.localStorage.clear();
  });

  it("undoes and redoes an added room with native buttons", async () => {
    const user = userEvent.setup();
    renderPlanner();
    expect(screen.getByRole("button", { name: "Undo last edit" })).toBeDisabled();

    await user.click(screen.getByRole("button", { name: "Add room" }));
    await user.click(screen.getByRole("button", { name: "Undo last edit" }));
    expect(screen.getByText("Your plan starts here.")).toBeInTheDocument();
    expect(screen.getByText("Undid last edit.")).toBeInTheDocument();

    await user.click(screen.getByRole("button", { name: "Redo last edit" }));
    const canvas = screen.getByRole("region", { name: "Plan canvas" });
    expect(
      await within(canvas).findByRole("button", { name: "Room 1 4 × 3 m" }),
    ).toBeInTheDocument();
    expect(screen.getByText("Redid last edit.")).toBeInTheDocument();
  });

  it("keeps a committed room name in sync with undo and redo", async () => {
    const user = userEvent.setup();
    renderPlanner();
    await user.click(screen.getByRole("button", { name: "Add room" }));

    const nameInput = screen.getByRole("textbox", { name: "Room name" });
    await user.clear(nameInput);
    await user.type(nameInput, "Studio");
    await user.tab();
    const canvas = screen.getByRole("region", { name: "Plan canvas" });
    const canvasRoom = within(canvas).getByRole("button", { name: "Studio 4 × 3 m" });
    canvasRoom.focus();

    await user.keyboard("{Control>}z{/Control}");
    expect(nameInput).toHaveValue("Room 1");
    expect(
      within(canvas).getByRole("button", { name: "Room 1 4 × 3 m" }),
    ).toBeInTheDocument();

    await user.keyboard("{Control>}{Shift>}z{/Shift}{/Control}");
    expect(nameInput).toHaveValue("Studio");
    expect(
      within(canvas).getByRole("button", { name: "Studio 4 × 3 m" }),
    ).toBeInTheDocument();
  });

  it("supports keyboard history without overriding text-input undo", async () => {
    const user = userEvent.setup();
    renderPlanner();
    await user.click(screen.getByRole("button", { name: "Add room" }));
    await user.click(screen.getByRole("button", { name: "Move Room 1 right" }));
    expect(screen.getByRole("spinbutton", { name: "X position in metres" })).toHaveValue(0.5);

    const canvas = screen.getByRole("region", { name: "Plan canvas" });
    const canvasRoom = within(canvas).getByRole("button", { name: "Room 1 4 × 3 m" });
    canvasRoom.focus();
    await user.keyboard("{Control>}z{/Control}");
    expect(screen.getByRole("spinbutton", { name: "X position in metres" })).toHaveValue(0);

    await user.keyboard("{Control>}{Shift>}z{/Shift}{/Control}");
    expect(screen.getByRole("spinbutton", { name: "X position in metres" })).toHaveValue(0.5);

    await user.keyboard("{Control>}z{/Control}");
    expect(screen.getByRole("spinbutton", { name: "X position in metres" })).toHaveValue(0);
    await user.keyboard("{Control>}y{/Control}");
    expect(screen.getByRole("spinbutton", { name: "X position in metres" })).toHaveValue(0.5);

    const nameInput = screen.getByRole("textbox", { name: "Room name" });
    nameInput.focus();
    await user.keyboard("{Control>}z{/Control}");
    expect(screen.getByRole("spinbutton", { name: "X position in metres" })).toHaveValue(0.5);
    expect(canvasRoom).toBeInTheDocument();
  });
});

describe("RoomPlanner plan management", () => {
  beforeEach(() => {
    window.localStorage.clear();
  });

  it("renames a plan and keeps the name field in sync with history", async () => {
    const user = userEvent.setup();
    renderPlanner();
    const nameInput = screen.getByRole("textbox", { name: "Plan name" });
    expect(nameInput).toHaveValue("Untitled plan");
    expect(screen.getByRole("button", { name: "New plan" })).toBeDisabled();

    await user.clear(nameInput);
    await user.type(nameInput, "City apartment");
    await user.tab();
    expect(nameInput).toHaveValue("City apartment");
    expect(screen.getByRole("button", { name: "New plan" })).toBeEnabled();

    await user.click(screen.getByRole("button", { name: "Undo last edit" }));
    expect(nameInput).toHaveValue("Untitled plan");
    await user.click(screen.getByRole("button", { name: "Redo last edit" }));
    expect(nameInput).toHaveValue("City apartment");
  });

  it("confirms a new plan and restores the replaced plan with undo", async () => {
    const user = userEvent.setup();
    const confirmation = vi.spyOn(window, "confirm").mockReturnValue(false);
    renderPlanner();
    await user.click(screen.getByRole("button", { name: "Add room" }));
    const nameInput = screen.getByRole("textbox", { name: "Plan name" });
    await user.clear(nameInput);
    await user.type(nameInput, "Client draft");
    await user.tab();

    await user.click(screen.getByRole("button", { name: "New plan" }));
    expect(confirmation).toHaveBeenCalledWith(expect.stringContaining("Client draft"));
    expect(nameInput).toHaveValue("Client draft");
    expect(screen.getByRole("textbox", { name: "Room name" })).toHaveValue("Room 1");

    confirmation.mockReturnValue(true);
    await user.click(screen.getByRole("button", { name: "New plan" }));
    expect(nameInput).toHaveValue("Untitled plan");
    expect(screen.getByText("Your plan starts here.")).toBeInTheDocument();
    expect(screen.getByRole("button", { name: "New plan" })).toBeDisabled();

    await user.click(screen.getByRole("button", { name: "Undo last edit" }));
    expect(nameInput).toHaveValue("Client draft");
    expect(screen.getByRole("textbox", { name: "Room name" })).toHaveValue("Room 1");
    await user.click(screen.getByRole("button", { name: "Redo last edit" }));
    expect(nameInput).toHaveValue("Untitled plan");
    expect(screen.getByText("Your plan starts here.")).toBeInTheDocument();
  });

  it("retires a pending import when a new plan is confirmed", async () => {
    const user = userEvent.setup();
    vi.spyOn(window, "confirm").mockReturnValue(true);
    renderPlanner();
    await user.click(screen.getByRole("button", { name: "Add room" }));

    const imported = {
      ...createInitialPlannerState(),
      name: "Late import",
      rooms: [
        { id: "imported", name: "Imported office", x: 1, y: 1, width: 2, depth: 2 },
      ],
    };
    let resolveRead: (contents: string) => void = () => {
      throw new Error("The import did not start.");
    };
    const file = new File(["{}"], "late-plan.json", { type: "application/json" });
    vi.spyOn(file, "text").mockImplementation(
      () =>
        new Promise<string>((resolve) => {
          resolveRead = (contents) => resolve(contents);
        }),
    );
    await user.upload(screen.getByLabelText("Import plan"), file);
    await user.click(screen.getByRole("button", { name: "New plan" }));

    await act(async () => {
      resolveRead(serializeSnapshot(imported));
      await Promise.resolve();
    });

    expect(screen.getByRole("textbox", { name: "Plan name" })).toHaveValue("Untitled plan");
    expect(screen.getByText("Your plan starts here.")).toBeInTheDocument();
    expect(screen.queryByRole("button", { name: /Imported office/ })).not.toBeInTheDocument();
  });
});
