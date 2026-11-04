"use client";

import {
  useCallback,
  useEffect,
  useReducer,
  useRef,
  type ChangeEvent,
  type ReactNode,
} from "react";
import {
  createInitialPlannerState,
  createRoom,
  plannerReducer,
  type PlannerAction,
  type PlannerState,
  type Room,
} from "@/lib/planner/reducer";
import {
  loadPlanner,
  savePlanner,
  serializeSnapshot,
  type LoadPlannerResult,
} from "@/lib/planner/snapshot";
import { parseSnapshotFile } from "@/lib/planner/snapshot-file";
import { PlanCanvas } from "./plan-canvas";
import { RoomInspector } from "./room-inspector";

type StorageStatus = "loading" | "empty" | "saved" | "invalid" | "unavailable";

const storageMessages: Record<StorageStatus, string> = {
  loading: "Checking local storage…",
  empty: "Changes save on this device after you edit.",
  saved: "Saved on this device",
  invalid: "Saved data could not be read. New changes will replace it.",
  unavailable: "Local saving is unavailable. Export to keep your plan.",
};

interface ImportNotice {
  type: "success" | "error" | "undone";
  message: string;
}

interface EditorState {
  plan: PlannerState;
  storageStatus: StorageStatus;
  isHydrated: boolean;
  dirty: boolean;
  importUndo: PlannerState | null;
  importNotice: ImportNotice | null;
}

type EditorAction =
  | { type: "user"; action: PlannerAction }
  | { type: "hydrate"; result: LoadPlannerResult }
  | { type: "import"; plan: PlannerState }
  | { type: "importError"; message: string }
  | { type: "undoImport" }
  | { type: "saved"; saved: boolean };

function createEditorState(): EditorState {
  return {
    plan: createInitialPlannerState(),
    storageStatus: "loading",
    isHydrated: false,
    dirty: false,
    importUndo: null,
    importNotice: null,
  };
}

function editorReducer(state: EditorState, action: EditorAction): EditorState {
  switch (action.type) {
    case "user": {
      const plan = plannerReducer(state.plan, action.action);
      if (plan === state.plan) {
        return state;
      }
      const selectionOnly = action.action.type === "select";
      return {
        ...state,
        plan,
        dirty: state.dirty || !selectionOnly,
        importUndo: selectionOnly ? state.importUndo : null,
        importNotice: selectionOnly ? state.importNotice : null,
      };
    }
    case "hydrate":
      return {
        plan: action.result.state
          ? plannerReducer(state.plan, { type: "hydrate", plan: action.result.state })
          : state.plan,
        storageStatus: action.result.status === "loaded" ? "saved" : action.result.status,
        isHydrated: true,
        dirty: false,
        importUndo: null,
        importNotice: null,
      };
    case "import": {
      const roomCount = action.plan.rooms.length;
      return {
        ...state,
        plan: plannerReducer(state.plan, { type: "hydrate", plan: action.plan }),
        dirty: true,
        importUndo: state.plan,
        importNotice: {
          type: "success",
          message: `Imported "${action.plan.name}" with ${roomCount} ${roomCount === 1 ? "room" : "rooms"}.`,
        },
      };
    }
    case "importError":
      return {
        ...state,
        importNotice: { type: "error", message: action.message },
      };
    case "undoImport":
      if (!state.importUndo) {
        return state;
      }
      return {
        ...state,
        plan: state.importUndo,
        dirty: true,
        importUndo: null,
        importNotice: {
          type: "undone",
          message: "Import undone. Your previous plan is restored.",
        },
      };
    case "saved":
      return {
        ...state,
        storageStatus: action.saved ? "saved" : "unavailable",
        dirty: false,
      };
  }
}

function formatNumber(value: number): string {
  return new Intl.NumberFormat("en", { maximumFractionDigits: 2 }).format(value);
}

function RoomList({
  rooms,
  selectedRoomId,
  onSelect,
}: {
  rooms: Room[];
  selectedRoomId: string | null;
  onSelect: (roomId: string) => void;
}) {
  if (rooms.length === 0) {
    return null;
  }

  return (
    <section aria-labelledby="room-list-title" className="room-list">
      <div className="panel-heading">
        <h2 id="room-list-title">Rooms</h2>
        <span>{rooms.length}</span>
      </div>
      <ul>
        {rooms.map((room) => (
          <li key={room.id}>
            <button
              aria-pressed={selectedRoomId === room.id}
              onClick={() => onSelect(room.id)}
              type="button"
            >
              <span>{room.name}</span>
              <span>{formatNumber(room.width * room.depth)} m²</span>
            </button>
          </li>
        ))}
      </ul>
    </section>
  );
}

export function RoomPlanner({ brand }: { brand: ReactNode }) {
  const [editor, editorDispatch] = useReducer(
    editorReducer,
    undefined,
    createEditorState,
  );
  const { plan: state, storageStatus, importNotice, importUndo } = editor;
  const importRequestRef = useRef(0);

  const dispatch = useCallback((action: PlannerAction) => {
    editorDispatch({ type: "user", action });
  }, []);

  useEffect(() => {
    editorDispatch({ type: "hydrate", result: loadPlanner(window.localStorage) });
  }, []);

  useEffect(() => {
    if (!editor.isHydrated || !editor.dirty) {
      return;
    }

    editorDispatch({
      type: "saved",
      saved: savePlanner(window.localStorage, editor.plan),
    });
  }, [editor.isHydrated, editor.dirty, editor.plan]);

  const selectedRoom = state.rooms.find((room) => room.id === state.selectedRoomId) ?? null;

  function addRoom() {
    dispatch({
      type: "add",
      room: createRoom(state.rooms, crypto.randomUUID()),
    });
  }

  async function importPlan(event: ChangeEvent<HTMLInputElement>) {
    const file = event.currentTarget.files?.[0];
    event.currentTarget.value = "";
    if (!file) {
      return;
    }

    const requestId = ++importRequestRef.current;
    const result = await parseSnapshotFile(file);
    if (requestId !== importRequestRef.current) {
      return;
    }

    if (result.ok) {
      editorDispatch({ type: "import", plan: result.state });
    } else {
      editorDispatch({ type: "importError", message: result.error });
    }
  }

  function exportPlan() {
    const blob = new Blob([serializeSnapshot(state)], { type: "application/json" });
    const url = URL.createObjectURL(blob);
    const link = document.createElement("a");
    link.href = url;
    link.download = "open-architect-plan.json";
    document.body.append(link);
    link.click();
    link.remove();
    URL.revokeObjectURL(url);
  }

  return (
    <>
      <header className="studio-header page-frame">
        {brand}
        <div className="studio-actions">
          <button className="button button-secondary" onClick={addRoom} type="button">
            <span aria-hidden="true">+</span>
            Add room
          </button>
          <input
            accept=".json,application/json"
            aria-describedby="plan-import-help"
            className="file-input"
            id="plan-import"
            onChange={(event) => {
              void importPlan(event);
            }}
            type="file"
          />
          <label className="button button-secondary" htmlFor="plan-import">
            Import plan
          </label>
          <button className="button button-primary" onClick={exportPlan} type="button">
            Export plan
          </button>
        </div>
      </header>

      <main className="studio-main page-frame" id="main-content">
        <div className="studio-titlebar">
          <div>
            <p className="section-label">Local workspace</p>
            <h1>Room planner</h1>
          </div>
          <p className="save-status" data-status={storageStatus} role="status">
            {storageMessages[storageStatus]}
          </p>
        </div>

        <p className="import-guidance" id="plan-import-help">
          Import a version 1 JSON plan up to 256 KB. Import replaces the current plan;
          undo is available until the next edit.
        </p>

        {importNotice ? (
          <div
            className="import-feedback"
            data-type={importNotice.type}
            role={importNotice.type === "error" ? "alert" : "status"}
          >
            <p>{importNotice.message}</p>
            {importUndo ? (
              <button
                className="button button-secondary"
                onClick={() => editorDispatch({ type: "undoImport" })}
                type="button"
              >
                Undo import
              </button>
            ) : null}
          </div>
        ) : null}

        <div className="studio-layout">
          <div className="workspace-column">
            <PlanCanvas
              onChange={(roomId, changes) =>
                dispatch({ type: "update", roomId, changes })
              }
              onMove={(roomId, direction) =>
                dispatch({ type: "move", roomId, direction })
              }
              onSelect={(roomId) => dispatch({ type: "select", roomId })}
              rooms={state.rooms}
              selectedRoomId={state.selectedRoomId}
            />
            <RoomList
              onSelect={(roomId) => dispatch({ type: "select", roomId })}
              rooms={state.rooms}
              selectedRoomId={state.selectedRoomId}
            />
          </div>

          {selectedRoom ? (
            <RoomInspector
              key={selectedRoom.id}
              onChange={(changes) =>
                dispatch({ type: "update", roomId: selectedRoom.id, changes })
              }
              onDelete={() => dispatch({ type: "delete", roomId: selectedRoom.id })}
              onMove={(direction) =>
                dispatch({ type: "move", roomId: selectedRoom.id, direction })
              }
              room={selectedRoom}
            />
          ) : (
            <aside className="room-inspector inspector-empty">
              <h2>Select a room</h2>
              <p>Add a room or choose one on the canvas to edit its dimensions.</p>
            </aside>
          )}
        </div>

        <p className="studio-disclaimer">
          Concept sketches only. Room overlap is allowed; this tool does not check
          building codes, structure, or construction accuracy. Export your plan for a
          separate copy.
        </p>
      </main>
    </>
  );
}
