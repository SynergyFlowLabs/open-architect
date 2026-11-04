# Architecture

## Status

The original Next.js web foundation is active under [Decision 0002](decisions/0002-nextjs-web-foundation.md). The Android structure below remains a proposal. There are no APK-specific technical findings, and target-parity features remain gated on artifact intake and explicit requirements.

## Constraints

- Implement only approved, evidence-backed workflows.
- The alternative must not depend on the target app's private APIs, credentials, backend, source, or assets.
- Keep data local by default. Add a network service only when an approved requirement needs it.
- Isolate platform permissions, persistence, and external integrations behind small testable interfaces.

## Current web structure

```text
app/                 Server-rendered routes, metadata, global tokens, and layout
components/          Original brand assets and client editor leaves
lib/planner/         Pure room state, geometry rules, snapshots, and storage adapter
test/                Vitest/Testing Library setup
```

The server studio route passes its brand component into the client planner boundary. The planner reducer owns plan and room transitions; a pure editor reducer coordinates hydration, save status, import feedback, and bounded undo/redo stacks. Plan rename and reset use the same history path as room edits, while a committed-draft field keeps plan names synchronized with imports and history. A dedicated resize action anchors the room's top-left origin, including off-grid imported origins, and clamps snapped dimensions to the remaining plan bounds. Room creation and duplication share bounded, grid-aligned first-free placement; duplication copies geometry, generates a concise unique copy name, receives a fresh browser-generated UUID, and enters through the ordinary add/history action. Add and Duplicate controls share the 100-room capacity guard. Each new plan edit clears redo, selection-only changes create no history entries, and a gesture-scoped history key coalesces pointer movement or resize updates into one entry. Both stacks are capped at 50 plan states and remain in memory only. Browser storage is accessed only in effects through a versioned adapter. Snapshots contain plan data, not selection, history, or other UI-only state. Export filenames are derived locally from Unicode plan names. A separate file adapter enforces the 256 KB import cap and delegates content to the same strict snapshot parser. No backend or analytics service exists.

## Candidate Android structure

If Android is confirmed as the first platform, a modular structure could be:

```text
app/             Application entry points, navigation, dependency wiring
ui/              Screens and reusable accessible UI components
domain/          Use cases, entities, and repository contracts
data/            Repository implementations and mapping
storage/         Local persistence, added only for approved retained data
network/         Project-owned API client, only if a verified requirement needs it
```

This is a conceptual boundary map, not a commitment to Kotlin, Compose, Gradle modules, Room, or a backend. Pick implementation technology after target behavior, support matrix, contributor skills, and build constraints are agreed.

## Data and service boundaries

- Represent each user workflow as a domain operation with explicit inputs, outputs, and errors.
- Keep Android platform APIs and permission prompts in the platform/UI boundary.
- Define a data inventory before persistence; use encryption or OS-backed protection where justified by sensitivity.
- If remote behavior is essential, define a new project-owned API and data model. Do not silently call or impersonate the original app's service.
- Avoid analytics and tracking by default. Any opt-in diagnostics must be documented, minimized, and controllable.

## Open decisions

| Decision | Status | Trigger |
| --- | --- | --- |
| Native Android vs. cross-platform | TBD | After product and contributor requirements are reviewed. |
| Kotlin/Compose or alternative UI stack | TBD | After Android support baseline and maintainability discussion. |
| Offline-first vs. account/server model | TBD | After data flow and offline behavior are evidenced. |
| Local database and backup behavior | TBD | Only if approved workflows require persisted structured data. |
| Backend / hosting | TBD | Only if a project-owned service is necessary. |
| License and release signing | TBD | Before implementation/distribution. |

For changes to these decisions, record rationale and tradeoffs in a dated decision record under `docs/decisions/`.
