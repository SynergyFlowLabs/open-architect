import {
  createInitialPlannerState,
  plannerReducer,
  type PlannerAction,
  type PlannerState,
} from "./reducer";
import type { LoadPlannerResult } from "./snapshot";

export const HISTORY_LIMIT = 50;

export type StorageStatus = "loading" | "empty" | "saved" | "invalid" | "unavailable";

export interface EditorFeedback {
  type: "imported" | "importError" | "importUndone" | "history";
  message: string;
}

export interface EditorState {
  plan: PlannerState;
  storageStatus: StorageStatus;
  isHydrated: boolean;
  dirty: boolean;
  past: PlannerState[];
  future: PlannerState[];
  lastHistoryKey: string | null;
  feedback: EditorFeedback | null;
}

export type EditorAction =
  | { type: "user"; action: PlannerAction; historyKey?: string }
  | { type: "hydrate"; result: LoadPlannerResult }
  | { type: "import"; plan: PlannerState }
  | { type: "importError"; message: string }
  | { type: "undoImport" }
  | { type: "undo" }
  | { type: "redo" }
  | { type: "saved"; saved: boolean };

export function createEditorState(): EditorState {
  return {
    plan: createInitialPlannerState(),
    storageStatus: "loading",
    isHydrated: false,
    dirty: false,
    past: [],
    future: [],
    lastHistoryKey: null,
    feedback: null,
  };
}

function updateWithHistory(
  state: EditorState,
  plan: PlannerState,
  historyKey?: string,
): EditorState {
  const continuingGesture = historyKey !== undefined && historyKey === state.lastHistoryKey;
  return {
    ...state,
    plan,
    past: continuingGesture
      ? state.past
      : [...state.past, state.plan].slice(-HISTORY_LIMIT),
    future: [],
    dirty: true,
    feedback: null,
    lastHistoryKey: historyKey ?? null,
  };
}

function undo(
  state: EditorState,
  feedback: EditorFeedback,
): EditorState {
  const previous = state.past[state.past.length - 1];
  if (!previous) {
    return state;
  }

  return {
    ...state,
    plan: previous,
    past: state.past.slice(0, -1),
    future: [state.plan, ...state.future].slice(0, HISTORY_LIMIT),
    dirty: true,
    feedback,
    lastHistoryKey: null,
  };
}

function redo(state: EditorState): EditorState {
  const next = state.future[0];
  if (!next) {
    return state;
  }

  return {
    ...state,
    plan: next,
    past: [...state.past, state.plan].slice(-HISTORY_LIMIT),
    future: state.future.slice(1),
    dirty: true,
    feedback: { type: "history", message: "Redid last edit." },
    lastHistoryKey: null,
  };
}

export function editorReducer(state: EditorState, action: EditorAction): EditorState {
  switch (action.type) {
    case "user": {
      const plan = plannerReducer(state.plan, action.action);
      if (plan === state.plan) {
        return state;
      }
      if (action.action.type === "select") {
        return { ...state, plan, lastHistoryKey: null };
      }
      return updateWithHistory(state, plan, action.historyKey);
    }

    case "hydrate":
      return {
        ...createEditorState(),
        plan: action.result.state
          ? plannerReducer(state.plan, { type: "hydrate", plan: action.result.state })
          : state.plan,
        storageStatus: action.result.status === "loaded" ? "saved" : action.result.status,
        isHydrated: true,
      };

    case "import": {
      const roomCount = action.plan.rooms.length;
      const next = updateWithHistory(
        state,
        plannerReducer(state.plan, { type: "hydrate", plan: action.plan }),
      );
      return {
        ...next,
        feedback: {
          type: "imported",
          message: `Imported "${action.plan.name}" with ${roomCount} ${roomCount === 1 ? "room" : "rooms"}.`,
        },
      };
    }

    case "importError":
      return {
        ...state,
        feedback: { type: "importError", message: action.message },
        lastHistoryKey: null,
      };

    case "undoImport":
      return undo(state, {
        type: "importUndone",
        message: "Import undone. Your previous plan is restored.",
      });

    case "undo":
      return undo(state, { type: "history", message: "Undid last edit." });

    case "redo":
      return redo(state);

    case "saved":
      return {
        ...state,
        storageStatus: action.saved ? "saved" : "unavailable",
        dirty: false,
      };
  }
}
