import { describe, expect, it } from "vitest";
import { createInitialPlannerState, type PlannerState } from "./reducer";
import {
  loadPlanner,
  parseSnapshot,
  PLANNER_STORAGE_KEY,
  savePlanner,
  serializeSnapshot,
  type StorageAdapter,
} from "./snapshot";

const state: PlannerState = {
  ...createInitialPlannerState(),
  rooms: [
    { id: "studio", name: "Studio", x: 0.5, y: 1, width: 4, depth: 3 },
    { id: "kitchen", name: "Kitchen", x: 5, y: 1, width: 3.5, depth: 2.5 },
  ],
  selectedRoomId: "kitchen",
};

describe("versioned planner snapshots", () => {
  it("round-trips plan data without persisting selection UI state", () => {
    const serialized = serializeSnapshot(state);
    const result = parseSnapshot(serialized);

    expect(result).toEqual({
      ok: true,
      state: { ...state, selectedRoomId: null },
    });
    expect(JSON.parse(serialized)).not.toHaveProperty("selectedRoomId");
    expect(JSON.parse(serialized)).toMatchObject({
      version: 1,
      units: "m",
      size: { width: 12, depth: 8 },
    });
  });

  it.each([
    ["malformed JSON", "{"],
    ["an unsupported version", JSON.stringify({ version: 2 })],
    ["out-of-bounds geometry", JSON.stringify({
      version: 1,
      name: "Plan",
      units: "m",
      size: { width: 12, depth: 8 },
      rooms: [{ id: "a", name: "A", x: 10, y: 0, width: 4, depth: 3 }],
    })],
    ["duplicate room IDs", JSON.stringify({
      version: 1,
      name: "Plan",
      units: "m",
      size: { width: 12, depth: 8 },
      rooms: [
        { id: "a", name: "A", x: 0, y: 0, width: 2, depth: 2 },
        { id: "a", name: "B", x: 3, y: 0, width: 2, depth: 2 },
      ],
    })],
  ])("rejects %s", (_label, input) => {
    expect(parseSnapshot(input)).toMatchObject({ ok: false });
  });
});

describe("planner storage adapter", () => {
  it("loads a valid snapshot from the versioned key", () => {
    const storage: StorageAdapter = {
      getItem: (key) => key === PLANNER_STORAGE_KEY ? serializeSnapshot(state) : null,
      setItem: () => undefined,
    };

    expect(loadPlanner(storage)).toEqual({
      status: "loaded",
      state: { ...state, selectedRoomId: null },
    });
  });

  it("distinguishes empty, invalid, and unavailable storage", () => {
    const empty = loadPlanner({ getItem: () => null, setItem: () => undefined });
    const invalid = loadPlanner({ getItem: () => "not json", setItem: () => undefined });
    const unavailable = loadPlanner({
      getItem: () => { throw new Error("blocked"); },
      setItem: () => undefined,
    });

    expect(empty).toEqual({ status: "empty", state: null });
    expect(invalid).toEqual({ status: "invalid", state: null });
    expect(unavailable).toEqual({ status: "unavailable", state: null });
  });

  it("reports write failures without throwing", () => {
    expect(savePlanner({
      getItem: () => null,
      setItem: () => { throw new Error("quota"); },
    }, state)).toBe(false);
  });
});
