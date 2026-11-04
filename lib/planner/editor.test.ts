import { describe, expect, it } from "vitest";
import {
  createEditorState,
  editorReducer,
  HISTORY_LIMIT,
} from "./editor";
import { createInitialPlannerState, type Room } from "./reducer";

function room(overrides: Partial<Room> = {}): Room {
  return {
    id: "room-1",
    name: "Room 1",
    x: 0,
    y: 0,
    width: 4,
    depth: 3,
    ...overrides,
  };
}

describe("editor history", () => {
  it("undoes and redoes a plan edit", () => {
    let state = createEditorState();
    state = editorReducer(state, { type: "user", action: { type: "add", room: room() } });
    expect(state.past).toHaveLength(1);

    state = editorReducer(state, { type: "undo" });
    expect(state.plan.rooms).toEqual([]);
    expect(state.future).toHaveLength(1);
    expect(state.feedback).toEqual({ type: "history", message: "Undid last edit." });

    state = editorReducer(state, { type: "redo" });
    expect(state.plan.rooms).toEqual([room()]);
    expect(state.future).toEqual([]);
    expect(state.feedback).toEqual({ type: "history", message: "Redid last edit." });
  });

  it("does not create a history entry for selection", () => {
    let state = createEditorState();
    state = editorReducer(state, { type: "user", action: { type: "add", room: room() } });
    state = editorReducer(state, {
      type: "user",
      action: { type: "add", room: room({ id: "room-2", name: "Room 2", x: 4 }) },
    });
    state = editorReducer(state, {
      type: "user",
      action: { type: "select", roomId: "room-1" },
    });

    expect(state.past).toHaveLength(2);
    state = editorReducer(state, { type: "undo" });
    expect(state.plan.rooms.map((item) => item.id)).toEqual(["room-1"]);
  });

  it("clears redo after a new plan edit", () => {
    let state = createEditorState();
    state = editorReducer(state, { type: "user", action: { type: "add", room: room() } });
    state = editorReducer(state, {
      type: "user",
      action: { type: "move", roomId: "room-1", direction: "right" },
    });
    state = editorReducer(state, { type: "undo" });
    expect(state.future).toHaveLength(1);

    state = editorReducer(state, {
      type: "user",
      action: { type: "move", roomId: "room-1", direction: "down" },
    });
    expect(state.future).toEqual([]);
    expect(state.plan.rooms[0]).toMatchObject({ x: 0, y: 0.5 });
  });

  it("coalesces updates with the same drag history key", () => {
    let state = createEditorState();
    state = editorReducer(state, { type: "user", action: { type: "add", room: room() } });
    for (const x of [0.5, 1, 1.5]) {
      state = editorReducer(state, {
        type: "user",
        action: { type: "update", roomId: "room-1", changes: { x } },
        historyKey: "drag-1",
      });
    }

    expect(state.past).toHaveLength(2);
    expect(state.plan.rooms[0].x).toBe(1.5);
    state = editorReducer(state, { type: "undo" });
    expect(state.plan.rooms[0].x).toBe(0);
  });

  it("coalesces a resize gesture into one history entry", () => {
    let state = createEditorState();
    state = editorReducer(state, { type: "user", action: { type: "add", room: room() } });
    for (const width of [4.5, 5, 5.5]) {
      state = editorReducer(state, {
        type: "user",
        action: { type: "resize", roomId: "room-1", width, depth: 3 },
        historyKey: "resize-1",
      });
    }

    expect(state.past).toHaveLength(2);
    expect(state.plan.rooms[0].width).toBe(5.5);
    state = editorReducer(state, { type: "undo" });
    expect(state.plan.rooms[0]).toMatchObject({ x: 0, width: 4, depth: 3 });
  });

  it("bounds history to the documented limit", () => {
    let state = createEditorState();
    state = editorReducer(state, { type: "user", action: { type: "add", room: room() } });
    for (let index = 0; index < HISTORY_LIMIT + 5; index += 1) {
      state = editorReducer(state, {
        type: "user",
        action: {
          type: "update",
          roomId: "room-1",
          changes: { x: (index + 1) % 2 === 0 ? 0 : 0.5 },
        },
      });
    }

    expect(state.past).toHaveLength(HISTORY_LIMIT);
  });

  it("keeps import undo compatible with general redo", () => {
    let state = createEditorState();
    state = editorReducer(state, { type: "user", action: { type: "add", room: room() } });
    const imported = {
      ...createInitialPlannerState(),
      name: "Imported plan",
      rooms: [room({ id: "imported", name: "Imported room" })],
    };
    state = editorReducer(state, { type: "import", plan: imported });
    expect(state.feedback?.type).toBe("imported");

    state = editorReducer(state, { type: "undoImport" });
    expect(state.plan.rooms).toEqual([room()]);
    expect(state.feedback?.type).toBe("importUndone");
    expect(state.future).toHaveLength(1);

    state = editorReducer(state, { type: "redo" });
    expect(state.plan.rooms[0].id).toBe("imported");
  });

  it("does not add history for a no-op edit", () => {
    let state = createEditorState();
    state = editorReducer(state, { type: "user", action: { type: "add", room: room() } });
    const previous = state;
    state = editorReducer(state, {
      type: "user",
      action: { type: "update", roomId: "room-1", changes: { x: 0 } },
    });

    expect(state).toBe(previous);
    expect(state.past).toHaveLength(1);
  });
});
