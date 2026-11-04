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

interface DragState {
  pointerId: number;
  roomId: string;
  startClientX: number;
  startClientY: number;
  originX: number;
  originY: number;
  canvasWidth: number;
  canvasHeight: number;
}

interface PlanCanvasProps {
  rooms: Room[];
  selectedRoomId: string | null;
  onSelect: (roomId: string) => void;
  onMove: (roomId: string, direction: MoveDirection) => void;
  onChange: (roomId: string, changes: RoomChanges) => void;
}

export function PlanCanvas({
  rooms,
  selectedRoomId,
  onSelect,
  onMove,
  onChange,
}: PlanCanvasProps) {
  const canvasRef = useRef<HTMLDivElement>(null);
  const dragRef = useRef<DragState | null>(null);

  function startDrag(event: PointerEvent<HTMLButtonElement>, room: Room) {
    if (event.button !== 0) {
      return;
    }

    onSelect(room.id);
    const bounds = canvasRef.current?.getBoundingClientRect();
    if (!bounds || bounds.width === 0 || bounds.height === 0) {
      return;
    }

    dragRef.current = {
      pointerId: event.pointerId,
      roomId: room.id,
      startClientX: event.clientX,
      startClientY: event.clientY,
      originX: room.x,
      originY: room.y,
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
    onChange(drag.roomId, {
      x: drag.originX + deltaX,
      y: drag.originY + deltaY,
    });
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
        <span>{PLAN_SIZE.width} × {PLAN_SIZE.depth} m</span>
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
            aria-label={`${room.name}, ${formatNumber(room.width)} by ${formatNumber(room.depth)} metres`}
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
            <span className="room-shape-label">{room.name}</span>
            <span className="room-shape-measure">
              {formatNumber(room.width)} × {formatNumber(room.depth)} m
            </span>
          </button>
        ))}
      </div>
      <p className="panel-help" id="plan-canvas-help">
        Drag a room, or focus it and use the arrow keys to move by 0.5 metres. Use the
        inspector for exact dimensions.
      </p>
    </section>
  );
}
