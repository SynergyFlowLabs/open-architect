# Feature inventory

This is a blank worksheet, not an inventory of the unavailable target app. Add one row per user goal or user-observable flow. Link every observation to evidence IDs in `evidence-ledger.md`.

## Inventory

| Feature ID | User goal | Preconditions / entry point | User actions | Visible result / state changes | Data stored or sent (if known) | Permissions / services | Evidence IDs | Status / gaps |
| --- | --- | --- | --- | --- | --- | --- | --- | --- |

## Per-feature observation checklist

For each feature in proposed MVP scope, record:

- User goal and initiating screen/action.
- Inputs, validation, loading, success, error, cancellation, and empty states.
- Navigation before and after the flow; back/restore behavior.
- State changes and whether they persist after restart, logout, or offline use.
- Permissions and the exact point at which consent is requested.
- Network/service dependency only when directly observed and authorized.
- Accessibility semantics, localization, and responsive layout observations where tested.
- Variations by API level, account state, and connectivity; untested cases stay marked unknown.
- Screenshots only if authorized and legally appropriate; keep private screenshots out of Git.

## Status vocabulary

- `unobserved` — no evidence collected.
- `observed-static` — inferred from static metadata/code; not confirmed in runtime.
- `observed-runtime` — reproduced in a recorded, authorized test environment.
- `specified` — converted to a reviewed behavior requirement.
- `implemented` — independent alternative behavior exists.
- `verified` — acceptance tests pass for the documented test matrix.
- `blocked` — a named dependency, authorization, or missing artifact prevents progress.
