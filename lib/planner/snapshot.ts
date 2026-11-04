import {
  PLAN_SIZE,
  ROOM_RULES,
  type PlannerState,
  type Room,
} from "./reducer";

export const PLANNER_STORAGE_KEY = "open-architect:planner:v1";

export interface StorageAdapter {
  getItem: (key: string) => string | null;
  setItem: (key: string, value: string) => void;
}

export type SnapshotResult =
  | { ok: true; state: PlannerState }
  | { ok: false; error: string };

export type LoadPlannerResult =
  | { status: "loaded"; state: PlannerState }
  | { status: "empty" | "invalid" | "unavailable"; state: null };

function isRecord(value: unknown): value is Record<string, unknown> {
  return typeof value === "object" && value !== null && !Array.isArray(value);
}

function invalid(error: string): SnapshotResult {
  return { ok: false, error };
}

function parseRoom(value: unknown): Room | null {
  if (!isRecord(value)) {
    return null;
  }

  const { id, name, x, y, width, depth } = value;
  if (
    typeof id !== "string" ||
    !id.trim() ||
    id.length > 100 ||
    typeof name !== "string" ||
    !name.trim() ||
    name.length > ROOM_RULES.maximumNameLength ||
    typeof x !== "number" ||
    typeof y !== "number" ||
    typeof width !== "number" ||
    typeof depth !== "number" ||
    ![x, y, width, depth].every(Number.isFinite)
  ) {
    return null;
  }

  if (
    x < 0 ||
    y < 0 ||
    width < ROOM_RULES.minimumWidth ||
    depth < ROOM_RULES.minimumDepth ||
    width > PLAN_SIZE.width ||
    depth > PLAN_SIZE.depth ||
    x + width > PLAN_SIZE.width ||
    y + depth > PLAN_SIZE.depth
  ) {
    return null;
  }

  return { id, name: name.trim(), x, y, width, depth };
}

export function parseSnapshot(input: string): SnapshotResult {
  let value: unknown;
  try {
    value = JSON.parse(input);
  } catch {
    return invalid("The snapshot is not valid JSON.");
  }

  if (!isRecord(value)) {
    return invalid("The snapshot must contain a plan object.");
  }

  const { version, name, units, size, rooms } = value;
  if (version !== 1) {
    return invalid("Only version 1 planner snapshots are supported.");
  }
  if (
    typeof name !== "string" ||
    !name.trim() ||
    name.length > ROOM_RULES.maximumNameLength ||
    units !== "m" ||
    !isRecord(size) ||
    size.width !== PLAN_SIZE.width ||
    size.depth !== PLAN_SIZE.depth ||
    !Array.isArray(rooms) ||
    rooms.length > ROOM_RULES.maximumRooms
  ) {
    return invalid("The snapshot metadata or room collection is invalid.");
  }

  const parsedRooms: Room[] = [];
  const ids = new Set<string>();
  for (const roomValue of rooms) {
    const room = parseRoom(roomValue);
    if (!room || ids.has(room.id)) {
      return invalid("The snapshot contains an invalid or duplicate room.");
    }
    ids.add(room.id);
    parsedRooms.push(room);
  }

  return {
    ok: true,
    state: {
      name: name.trim(),
      rooms: parsedRooms,
      selectedRoomId: null,
    },
  };
}

export function serializeSnapshot(state: PlannerState): string {
  return JSON.stringify(
    {
      version: 1,
      name: state.name,
      units: "m",
      size: {
        width: PLAN_SIZE.width,
        depth: PLAN_SIZE.depth,
      },
      rooms: state.rooms.map(({ id, name, x, y, width, depth }) => ({
        id,
        name,
        x,
        y,
        width,
        depth,
      })),
    },
    null,
    2,
  );
}

export function loadPlanner(storage: StorageAdapter): LoadPlannerResult {
  let serialized: string | null;
  try {
    serialized = storage.getItem(PLANNER_STORAGE_KEY);
  } catch {
    return { status: "unavailable", state: null };
  }

  if (serialized === null) {
    return { status: "empty", state: null };
  }

  const result = parseSnapshot(serialized);
  return result.ok
    ? { status: "loaded", state: result.state }
    : { status: "invalid", state: null };
}

export function savePlanner(storage: StorageAdapter, state: PlannerState): boolean {
  try {
    storage.setItem(PLANNER_STORAGE_KEY, serializeSnapshot(state));
    return true;
  } catch {
    return false;
  }
}
