"use client";

import { useRef, type KeyboardEvent, type PointerEvent } from "react";
import {
  PLAN_SIZE,
  type MoveDirection,
  type Room,
  type RoomChanges,
} from "@/lib/planner/reducer";

const arrowDirections: Record<string, MoveDirection | undefined> = {
  ArrowUp: "up",
  ArrowDown: "down",
  ArrowLeft: "left",
  ArrowRight: "right",
};

function formatNumber(value: number): string {
  return new Intl.NumberFormat("en", { maximumFractionDigits: 2 }).format(value);
}

function HistoryIcon({ direction }: { direction: "undo" | "redo" }) {
  return (
    <svg aria-hidden="true" viewBox="0 0 24 24">
      <path
        d={
          direction === "undo"
            ? "M9 7 4 12l5 5M4 12h9a6 6 0 0 1 6 6v1"
            : "m15 7 5 5-5 5M20 12h-9a6 6 0 0 0-6 6v1"
        }
      />
    </svg>
  );
}

interface DragState {
  pointerId: number;
  roomId: string;
  mode: "move" | "resize";
  historyKey: string;
  startClientX: number;
  startClientY: number;
  originX: number;
  originY: number;
  originWidth: number;
  originDepth: number;
  canvasWidth: number;
  canvasHeight: number;
}

interface PlanCanvasProps {
  rooms: Room[];
  selectedRoomId: string | null;
  canUndo: boolean;
  canRedo: boolean;
  onSelect: (roomId: string) => void;
  onMove: (roomId: string, direction: MoveDirection) => void;
  onChange: (roomId: string, changes: RoomChanges, historyKey: string) => void;
  onResize: (roomId: string, width: number, depth: number, historyKey: string) => void;
  onUndo: () => void;
  onRedo: () => void;
}

export function PlanCanvas({
  rooms,
  selectedRoomId,
  canUndo,
  canRedo,
  onSelect,
  onMove,
  onChange,
  onResize,
  onUndo,
  onRedo,
}: PlanCanvasProps) {
  const canvasRef = useRef<HTMLDivElement>(null);
  const dragRef = useRef<DragState | null>(null);
  const dragSequenceRef = useRef(0);

  function startDrag(event: PointerEvent<HTMLButtonElement>, room: Room) {
    if (event.button !== 0) {
      return;
    }

    onSelect(room.id);
    const bounds = canvasRef.current?.getBoundingClientRect();
    if (!bounds || bounds.width === 0 || bounds.height === 0) {
      return;
    }

    const mode =
      event.target instanceof Element && event.target.closest("[data-resize-handle]")
        ? "resize"
        : "move";
    dragRef.current = {
      pointerId: event.pointerId,
      roomId: room.id,
      mode,
      historyKey: `${mode === "resize" ? "resize" : "drag"}-${++dragSequenceRef.current}`,
      startClientX: event.clientX,
      startClientY: event.clientY,
      originX: room.x,
      originY: room.y,
      originWidth: room.width,
      originDepth: room.depth,
      canvasWidth: bounds.width,
      canvasHeight: bounds.height,
    };
    event.currentTarget.setPointerCapture(event.pointerId);
  }

  function continueDrag(event: PointerEvent<HTMLButtonElement>) {
    const drag = dragRef.current;
    if (!drag || drag.pointerId !== event.pointerId) {
      return;
    }

    const deltaX =
      ((event.clientX - drag.startClientX) / drag.canvasWidth) * PLAN_SIZE.width;
    const deltaY =
      ((event.clientY - drag.startClientY) / drag.canvasHeight) * PLAN_SIZE.depth;
    if (drag.mode === "resize") {
      onResize(
        drag.roomId,
        drag.originWidth + deltaX,
        drag.originDepth + deltaY,
        drag.historyKey,
      );
      return;
    }

    onChange(
      drag.roomId,
      {
        x: drag.originX + deltaX,
        y: drag.originY + deltaY,
      },
      drag.historyKey,
    );
  }

  function endDrag(event: PointerEvent<HTMLButtonElement>) {
    if (dragRef.current?.pointerId !== event.pointerId) {
      return;
    }
    dragRef.current = null;
    if (event.currentTarget.hasPointerCapture(event.pointerId)) {
      event.currentTarget.releasePointerCapture(event.pointerId);
    }
  }

  function handleKeyDown(event: KeyboardEvent<HTMLButtonElement>, roomId: string) {
    const direction = arrowDirections[event.key];
    if (direction) {
      event.preventDefault();
      onMove(roomId, direction);
    }
  }

  return (
    <section aria-labelledby="plan-canvas-title" className="plan-section">
      <div className="panel-heading">
        <h2 id="plan-canvas-title">Plan canvas</h2>
        <div className="canvas-heading-tools">
          <div aria-label="Edit history" className="history-controls" role="group">
            <button
              aria-keyshortcuts="Control+Z Meta+Z"
              aria-label="Undo last edit"
              className="history-button"
              disabled={!canUndo}
              onClick={onUndo}
              title="Undo (Ctrl or Command + Z)"
              type="button"
            >
              <HistoryIcon direction="undo" />
            </button>
            <button
              aria-keyshortcuts="Control+Shift+Z Meta+Shift+Z Control+Y"
              aria-label="Redo last edit"
              className="history-button"
              disabled={!canRedo}
              onClick={onRedo}
              title="Redo (Ctrl or Command + Shift + Z)"
              type="button"
            >
              <HistoryIcon direction="redo" />
            </button>
          </div>
          <span>{PLAN_SIZE.width} × {PLAN_SIZE.depth} m</span>
        </div>
      </div>
      <div className="plan-canvas" ref={canvasRef}>
        {rooms.length === 0 ? (
          <div className="plan-empty">
            <strong>Your plan starts here.</strong>
            <span>Add a room to make the first mark.</span>
          </div>
        ) : null}
        {rooms.map((room, index) => (
          <button
            aria-describedby="plan-canvas-help"
            aria-pressed={selectedRoomId === room.id}
            className="room-shape"
            data-color={(index % 4) + 1}
            key={room.id}
            onClick={() => onSelect(room.id)}
            onKeyDown={(event) => handleKeyDown(event, room.id)}
            onPointerCancel={endDrag}
            onPointerDown={(event) => startDrag(event, room)}
            onPointerMove={continueDrag}
            onPointerUp={endDrag}
            style={{
              left: `${(room.x / PLAN_SIZE.width) * 100}%`,
              top: `${(room.y / PLAN_SIZE.depth) * 100}%`,
              width: `${(room.width / PLAN_SIZE.width) * 100}%`,
              height: `${(room.depth / PLAN_SIZE.depth) * 100}%`,
            }}
            type="button"
          >
            <span className="room-shape-label">{room.name}</span>{" "}
            <span className="room-shape-measure">
              {formatNumber(room.width)} × {formatNumber(room.depth)} m
            </span>
            {selectedRoomId === room.id ? (
              <span
                aria-hidden="true"
                className="room-resize-handle"
                data-resize-handle="true"
              />
            ) : null}
          </button>
        ))}
      </div>
      <p className="panel-help" id="plan-canvas-help">
        Drag a room to move it, or drag the selected room’s lower-right corner to resize.
        Focus a room and use arrow keys to move by 0.5 metres; use the inspector for exact
        dimensions. Ctrl/Command+Z undoes an edit; add Shift to redo.
      </p>
    </section>
  );
}
