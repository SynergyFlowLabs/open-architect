import { describe, expect, it } from "vitest";
import {
  createInitialPlannerState,
  createRoom,
  duplicateRoom,
  PLAN_SIZE,
  plannerReducer,
  type Room,
} from "./reducer";

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

describe("plannerReducer", () => {
  it("adds and selects a valid room", () => {
    const initial = createInitialPlannerState();
    const next = plannerReducer(initial, { type: "add", room: room() });

    expect(next.rooms).toEqual([room()]);
    expect(next.selectedRoomId).toBe("room-1");
    expect(initial.rooms).toEqual([]);
  });

  it("normalizes added geometry to the plan bounds and grid", () => {
    const initial = createInitialPlannerState();
    const next = plannerReducer(initial, {
      type: "add",
      room: room({ x: 10.2, y: -2, width: 20, depth: 0.2 }),
    });

    expect(next.rooms[0]).toMatchObject({
      x: 0,
      y: 0,
      width: PLAN_SIZE.width,
      depth: 1,
    });
  });

  it("ignores non-finite geometry and duplicate IDs", () => {
    const initial = createInitialPlannerState();
    const withRoom = plannerReducer(initial, { type: "add", room: room() });

    expect(
      plannerReducer(withRoom, { type: "add", room: room({ x: Number.NaN }) }),
    ).toBe(withRoom);
    expect(plannerReducer(withRoom, { type: "add", room: room() })).toBe(withRoom);
  });

  it("updates a room without allowing it to leave the plan", () => {
    const state = {
      ...createInitialPlannerState(),
      rooms: [room({ x: 7.5 })],
      selectedRoomId: "room-1",
    };
    const next = plannerReducer(state, {
      type: "update",
      roomId: "room-1",
      changes: { x: 11, y: 7.7, width: 5, name: "  Studio  " },
    });

    expect(next.rooms[0]).toEqual({
      ...room(),
      name: "Studio",
      x: 7,
      y: 5,
      width: 5,
      depth: 3,
    });
  });

  it("resizes without moving the top-left origin or exceeding remaining bounds", () => {
    const state = {
      ...createInitialPlannerState(),
      rooms: [room({ x: 6, y: 4 })],
      selectedRoomId: "room-1",
    };
    const next = plannerReducer(state, {
      type: "resize",
      roomId: "room-1",
      width: 20,
      depth: 0.2,
    });

    expect(next.rooms[0]).toMatchObject({ x: 6, y: 4, width: 6, depth: 1 });
  });

  it("snaps resize dimensions and ignores invalid or no-op resize actions", () => {
    const state = {
      ...createInitialPlannerState(),
      rooms: [room({ x: 0.25, y: 0.25 })],
      selectedRoomId: "room-1",
    };
    const next = plannerReducer(state, {
      type: "resize",
      roomId: "room-1",
      width: 4.7,
      depth: 3.8,
    });

    expect(next.rooms[0]).toMatchObject({ x: 0.25, y: 0.25, width: 4.5, depth: 4 });
    expect(
      plannerReducer(next, {
        type: "resize",
        roomId: "room-1",
        width: Number.NaN,
        depth: 4,
      }),
    ).toBe(next);
    expect(
      plannerReducer(next, {
        type: "resize",
        roomId: "room-1",
        width: 4.5,
        depth: 4,
      }),
    ).toBe(next);
    expect(
      plannerReducer(next, { type: "resize", roomId: "missing", width: 2, depth: 2 }),
    ).toBe(next);
  });

  it("moves in half-metre increments and preserves state at an edge", () => {
    const state = {
      ...createInitialPlannerState(),
      rooms: [room()],
      selectedRoomId: "room-1",
    };
    const moved = plannerReducer(state, {
      type: "move",
      roomId: "room-1",
      direction: "right",
    });

    expect(moved.rooms[0].x).toBe(0.5);

    const atEdge = {
      ...moved,
      rooms: [{ ...moved.rooms[0], x: PLAN_SIZE.width - 4 }],
    };
    expect(
      plannerReducer(atEdge, { type: "move", roomId: "room-1", direction: "right" }),
    ).toBe(atEdge);
  });

  it("selects the next available room after deletion", () => {
    const state = {
      ...createInitialPlannerState(),
      rooms: [room(), room({ id: "room-2", name: "Room 2" }), room({ id: "room-3" })],
      selectedRoomId: "room-2",
    };
    const next = plannerReducer(state, { type: "delete", roomId: "room-2" });

    expect(next.rooms.map((item) => item.id)).toEqual(["room-1", "room-3"]);
    expect(next.selectedRoomId).toBe("room-3");
    expect(plannerReducer(next, { type: "select", roomId: "missing" }).selectedRoomId).toBeNull();
  });

  it("renames a plan without changing its rooms and ignores no-op names", () => {
    const state = {
      ...createInitialPlannerState(),
      rooms: [room()],
      selectedRoomId: "room-1",
    };
    const next = plannerReducer(state, { type: "rename", name: "  City apartment  " });

    expect(next.name).toBe("City apartment");
    expect(next.rooms).toBe(state.rooms);
    expect(next.selectedRoomId).toBe("room-1");
    expect(plannerReducer(next, { type: "rename", name: "City apartment" })).toBe(next);
    expect(plannerReducer(next, { type: "rename", name: "   " })).toBe(next);
    expect(plannerReducer(next, { type: "rename", name: "x".repeat(61) }).name).toHaveLength(60);
  });

  it("resets the whole plan and treats an already-new plan as a no-op", () => {
    const state = {
      ...createInitialPlannerState(),
      name: "Client draft",
      rooms: [room()],
      selectedRoomId: "room-1",
    };
    const next = plannerReducer(state, { type: "reset" });

    expect(next).toEqual(createInitialPlannerState());
    expect(next).not.toBe(state);
    expect(plannerReducer(next, { type: "reset" })).toBe(next);
  });
});

describe("createRoom", () => {
  it("uses a unique default name and the first unoccupied standard slot", () => {
    const existing = [room(), room({ id: "room-2", name: "Room 2", x: 4 })];
    const created = createRoom(existing, "new-room");

    expect(created).toEqual({
      id: "new-room",
      name: "Room 3",
      x: 8,
      y: 0,
      width: 4,
      depth: 3,
    });
  });
});

describe("duplicateRoom", () => {
  it("copies dimensions and uses the first available slot", () => {
    const source = room({ name: "Studio" });
    const duplicate = duplicateRoom([source], source, "studio-copy");

    expect(duplicate).toEqual({
      id: "studio-copy",
      name: "Studio copy",
      x: 4,
      y: 0,
      width: 4,
      depth: 3,
    });
    expect(source).toEqual(room({ name: "Studio" }));
  });

  it("creates unique copy names within the 60-character limit", () => {
    const source = room({ name: "x".repeat(60), width: 12, depth: 8 });
    const first = duplicateRoom([source], source, "copy-1");
    const second = duplicateRoom([source, first], source, "copy-2");

    expect(first.name).toHaveLength(60);
    expect(second.name).toHaveLength(60);
    expect(second.name).toMatch(/ copy 2$/);
    expect(second.name).not.toBe(first.name);
  });

  it("keeps a duplicate bounded when overlap is unavoidable", () => {
    const source = room({ name: "Full plan", width: 12, depth: 8 });
    const duplicate = duplicateRoom([source], source, "full-copy");

    expect(duplicate).toMatchObject({ x: 0, y: 0, width: 12, depth: 8 });
    expect(
      duplicate.x + duplicate.width <= PLAN_SIZE.width &&
        duplicate.y + duplicate.depth <= PLAN_SIZE.depth,
    ).toBe(true);
  });
});
