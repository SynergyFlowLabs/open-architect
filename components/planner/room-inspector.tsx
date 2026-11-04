"use client";

import { useState, type KeyboardEvent } from "react";
import {
  PLAN_SIZE,
  ROOM_RULES,
  type MoveDirection,
  type Room,
  type RoomChanges,
} from "@/lib/planner/reducer";

function formatNumber(value: number): string {
  return new Intl.NumberFormat("en", { maximumFractionDigits: 2 }).format(value);
}

const arrowPaths: Record<MoveDirection, string> = {
  up: "M12 19V5m-6 6 6-6 6 6",
  down: "M12 5v14m6-6-6 6-6-6",
  left: "M19 12H5m6-6-6 6 6 6",
  right: "M5 12h14m-6-6 6 6-6 6",
};

function DirectionArrow({ direction }: { direction: MoveDirection }) {
  return (
    <svg aria-hidden="true" viewBox="0 0 24 24">
      <path d={arrowPaths[direction]} />
    </svg>
  );
}

interface NumberFieldProps {
  id: string;
  label: string;
  value: number;
  min: number;
  max: number;
  onCommit: (value: number) => void;
}

function NumberField({ id, label, value, min, max, onCommit }: NumberFieldProps) {
  const [draft, setDraft] = useState(String(value));
  const [previousValue, setPreviousValue] = useState(value);

  if (value !== previousValue) {
    setPreviousValue(value);
    setDraft(String(value));
  }

  function commit() {
    const nextValue = Number(draft);
    if (draft.trim() && Number.isFinite(nextValue)) {
      onCommit(nextValue);
    } else {
      setDraft(String(value));
    }
  }

  function handleKeyDown(event: KeyboardEvent<HTMLInputElement>) {
    if (event.key === "Enter") {
      event.currentTarget.blur();
    }
  }

  return (
    <div className="number-field">
      <label htmlFor={id}>{label}</label>
      <input
        id={id}
        inputMode="decimal"
        max={max}
        min={min}
        onBlur={commit}
        onChange={(event) => setDraft(event.target.value)}
        onKeyDown={handleKeyDown}
        step={ROOM_RULES.step}
        type="number"
        value={draft}
      />
    </div>
  );
}

interface RoomInspectorProps {
  room: Room;
  onChange: (changes: RoomChanges) => void;
  onMove: (direction: MoveDirection) => void;
  onDelete: () => void;
}

export function RoomInspector({ room, onChange, onMove, onDelete }: RoomInspectorProps) {
  const [nameDraft, setNameDraft] = useState(room.name);
  const [previousName, setPreviousName] = useState(room.name);

  if (room.name !== previousName) {
    setPreviousName(room.name);
    setNameDraft(room.name);
  }

  function commitName() {
    if (nameDraft.trim() && nameDraft.trim() !== room.name) {
      onChange({ name: nameDraft });
    } else {
      setNameDraft(room.name);
    }
  }

  return (
    <section aria-labelledby="room-inspector-title" className="room-inspector">
      <div className="panel-heading">
        <h2 id="room-inspector-title">Room inspector</h2>
        <span>{formatNumber(room.width * room.depth)} m²</span>
      </div>

      <div className="inspector-body">
        <div className="text-field">
          <label htmlFor="room-name">Room name</label>
          <input
            id="room-name"
            maxLength={ROOM_RULES.maximumNameLength}
            onBlur={commitName}
            onChange={(event) => setNameDraft(event.target.value)}
            onKeyDown={(event) => {
              if (event.key === "Enter") {
                event.currentTarget.blur();
              }
            }}
            type="text"
            value={nameDraft}
          />
          <span className="field-help">Press Enter or move focus to apply.</span>
        </div>

        <fieldset className="geometry-fields">
          <legend>Room geometry</legend>
          <div className="field-grid">
            <NumberField
              id="room-width"
              label="Width in metres"
              max={PLAN_SIZE.width}
              min={ROOM_RULES.minimumWidth}
              onCommit={(width) => onChange({ width })}
              value={room.width}
            />
            <NumberField
              id="room-depth"
              label="Depth in metres"
              max={PLAN_SIZE.depth}
              min={ROOM_RULES.minimumDepth}
              onCommit={(depth) => onChange({ depth })}
              value={room.depth}
            />
            <NumberField
              id="room-x"
              label="X position in metres"
              max={PLAN_SIZE.width - room.width}
              min={0}
              onCommit={(x) => onChange({ x })}
              value={room.x}
            />
            <NumberField
              id="room-y"
              label="Y position in metres"
              max={PLAN_SIZE.depth - room.depth}
              min={0}
              onCommit={(y) => onChange({ y })}
              value={room.y}
            />
          </div>
          <p className="field-help">
            Entries snap to 0.5 metres and stay inside the plan.
          </p>
        </fieldset>

        <div className="move-section">
          <div>
            <h3>Move room</h3>
            <p>0.5 metres per step</p>
          </div>
          <div aria-label="Move room" className="move-controls" role="group">
            <button
              aria-label={`Move ${room.name} up`}
              className="move-button move-up"
              onClick={() => onMove("up")}
              type="button"
            >
              <DirectionArrow direction="up" />
            </button>
            <button
              aria-label={`Move ${room.name} left`}
              className="move-button move-left"
              onClick={() => onMove("left")}
              type="button"
            >
              <DirectionArrow direction="left" />
            </button>
            <span aria-hidden="true" className="move-step">0.5 m</span>
            <button
              aria-label={`Move ${room.name} right`}
              className="move-button move-right"
              onClick={() => onMove("right")}
              type="button"
            >
              <DirectionArrow direction="right" />
            </button>
            <button
              aria-label={`Move ${room.name} down`}
              className="move-button move-down"
              onClick={() => onMove("down")}
              type="button"
            >
              <DirectionArrow direction="down" />
            </button>
          </div>
        </div>

        <button className="button button-danger" onClick={onDelete} type="button">
          Delete {room.name}
        </button>
      </div>
    </section>
  );
}
