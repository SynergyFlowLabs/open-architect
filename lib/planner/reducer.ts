export const PLAN_SIZE = {
  width: 12,
  depth: 8,
} as const;

export const ROOM_RULES = {
  minimumWidth: 1,
  minimumDepth: 1,
  step: 0.5,
  maximumRooms: 100,
  maximumNameLength: 60,
} as const;

export interface Room {
  id: string;
  name: string;
  x: number;
  y: number;
  width: number;
  depth: number;
}

export interface PlannerState {
  name: string;
  rooms: Room[];
  selectedRoomId: string | null;
}

export type RoomChanges = Partial<
  Pick<Room, "name" | "x" | "y" | "width" | "depth">
>;

export type MoveDirection = "up" | "down" | "left" | "right";

export type PlannerAction =
  | { type: "rename"; name: string }
  | { type: "reset" }
  | { type: "add"; room: Room }
  | { type: "select"; roomId: string | null }
  | { type: "update"; roomId: string; changes: RoomChanges }
  | { type: "move"; roomId: string; direction: MoveDirection }
  | { type: "delete"; roomId: string }
  | { type: "hydrate"; plan: Pick<PlannerState, "name" | "rooms"> };

export function createInitialPlannerState(): PlannerState {
  return {
    name: "Untitled plan",
    rooms: [],
    selectedRoomId: null,
  };
}

function clamp(value: number, minimum: number, maximum: number): number {
  return Math.min(Math.max(value, minimum), maximum);
}

function snap(value: number): number {
  return Number((Math.round(value / ROOM_RULES.step) * ROOM_RULES.step).toFixed(2));
}

function hasFiniteGeometry(room: Room): boolean {
  return [room.x, room.y, room.width, room.depth].every(Number.isFinite);
}

function normalizeName(name: string): string {
  return name.trim().slice(0, ROOM_RULES.maximumNameLength) || "Untitled room";
}

function normalizeRoom(room: Room): Room {
  const width = clamp(snap(room.width), ROOM_RULES.minimumWidth, PLAN_SIZE.width);
  const depth = clamp(snap(room.depth), ROOM_RULES.minimumDepth, PLAN_SIZE.depth);

  return {
    id: room.id.trim().slice(0, 100),
    name: normalizeName(room.name),
    width,
    depth,
    x: clamp(snap(room.x), 0, PLAN_SIZE.width - width),
    y: clamp(snap(room.y), 0, PLAN_SIZE.depth - depth),
  };
}

function roomsEqual(left: Room, right: Room): boolean {
  return (
    left.id === right.id &&
    left.name === right.name &&
    left.x === right.x &&
    left.y === right.y &&
    left.width === right.width &&
    left.depth === right.depth
  );
}

function overlaps(left: Room, right: Room): boolean {
  return (
    left.x < right.x + right.width &&
    left.x + left.width > right.x &&
    left.y < right.y + right.depth &&
    left.y + left.depth > right.y
  );
}

export function createRoom(existingRooms: Room[], id: string): Room {
  let roomNumber = existingRooms.length + 1;
  const existingNames = new Set(existingRooms.map((room) => room.name));
  while (existingNames.has(`Room ${roomNumber}`)) {
    roomNumber += 1;
  }

  const template: Room = {
    id,
    name: `Room ${roomNumber}`,
    x: 0,
    y: 0,
    width: 4,
    depth: 3,
  };

  for (let y = 0; y <= PLAN_SIZE.depth - template.depth; y += template.depth) {
    for (let x = 0; x <= PLAN_SIZE.width - template.width; x += template.width) {
      const candidate = { ...template, x, y };
      if (existingRooms.every((room) => !overlaps(candidate, room))) {
        return candidate;
      }
    }
  }

  const offset = (existingRooms.length % 6) * ROOM_RULES.step;
  return { ...template, x: offset, y: offset };
}

export function plannerReducer(
  state: PlannerState,
  action: PlannerAction,
): PlannerState {
  switch (action.type) {
    case "rename": {
      if (!action.name.trim()) {
        return state;
      }
      const name = action.name.trim().slice(0, ROOM_RULES.maximumNameLength);
      return name === state.name ? state : { ...state, name };
    }

    case "reset": {
      const initial = createInitialPlannerState();
      return state.name === initial.name &&
        state.rooms.length === 0 &&
        state.selectedRoomId === null
        ? state
        : initial;
    }

    case "add": {
      if (
        state.rooms.length >= ROOM_RULES.maximumRooms ||
        !action.room.id.trim() ||
        !hasFiniteGeometry(action.room)
      ) {
        return state;
      }

      const room = normalizeRoom(action.room);
      if (state.rooms.some((item) => item.id === room.id)) {
        return state;
      }

      return {
        ...state,
        rooms: [...state.rooms, room],
        selectedRoomId: room.id,
      };
    }

    case "select": {
      const selectedRoomId = state.rooms.some((room) => room.id === action.roomId)
        ? action.roomId
        : null;
      return selectedRoomId === state.selectedRoomId
        ? state
        : { ...state, selectedRoomId };
    }

    case "update": {
      const roomIndex = state.rooms.findIndex((room) => room.id === action.roomId);
      if (roomIndex < 0) {
        return state;
      }

      const current = state.rooms[roomIndex];
      if (
        action.changes.name !== undefined &&
        !action.changes.name.trim()
      ) {
        return state;
      }

      const candidate = { ...current, ...action.changes };
      if (!hasFiniteGeometry(candidate)) {
        return state;
      }

      const updated = normalizeRoom(candidate);
      if (roomsEqual(current, updated)) {
        return state;
      }

      const rooms = [...state.rooms];
      rooms[roomIndex] = updated;
      return { ...state, rooms };
    }

    case "move": {
      const room = state.rooms.find((item) => item.id === action.roomId);
      if (!room) {
        return state;
      }

      const changes: RoomChanges =
        action.direction === "left"
          ? { x: room.x - ROOM_RULES.step }
          : action.direction === "right"
            ? { x: room.x + ROOM_RULES.step }
            : action.direction === "up"
              ? { y: room.y - ROOM_RULES.step }
              : { y: room.y + ROOM_RULES.step };

      return plannerReducer(state, {
        type: "update",
        roomId: action.roomId,
        changes,
      });
    }

    case "delete": {
      const roomIndex = state.rooms.findIndex((room) => room.id === action.roomId);
      if (roomIndex < 0) {
        return state;
      }

      const rooms = state.rooms.filter((room) => room.id !== action.roomId);
      const selectedRoomId =
        state.selectedRoomId === action.roomId
          ? (state.rooms[roomIndex + 1]?.id ?? state.rooms[roomIndex - 1]?.id ?? null)
          : state.selectedRoomId;

      return { ...state, rooms, selectedRoomId };
    }

    case "hydrate":
      return {
        name: action.plan.name,
        rooms: action.plan.rooms,
        selectedRoomId: action.plan.rooms[0]?.id ?? null,
      };
  }
}
