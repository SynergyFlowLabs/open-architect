"use client";

import { useState } from "react";
import { ROOM_RULES } from "@/lib/planner/reducer";

export function PlanNameField({
  name,
  onCommit,
}: {
  name: string;
  onCommit: (name: string) => void;
}) {
  const [draft, setDraft] = useState(name);
  const [previousName, setPreviousName] = useState(name);

  if (name !== previousName) {
    setPreviousName(name);
    setDraft(name);
  }

  function commit() {
    const nextName = draft.trim();
    if (nextName && nextName !== name) {
      onCommit(nextName);
    } else {
      setDraft(name);
    }
  }

  return (
    <div className="text-field plan-name-field">
      <label htmlFor="plan-name">Plan name</label>
      <input
        aria-describedby="plan-name-help"
        autoComplete="off"
        id="plan-name"
        maxLength={ROOM_RULES.maximumNameLength}
        onBlur={commit}
        onChange={(event) => setDraft(event.target.value)}
        onKeyDown={(event) => {
          if (event.key === "Enter") {
            event.currentTarget.blur();
          }
        }}
        type="text"
        value={draft}
      />
      <span className="field-help" id="plan-name-help">
        Press Enter or move focus to apply. Up to 60 characters.
      </span>
    </div>
  );
}
