# Proposed architecture

## Status

**Proposal only.** This repository contains no app code and no APK-specific technical findings. The Android-first assumption follows from the supplied artifact being an APK; confirm product scope before choosing a framework, SDK baseline, backend, or storage model.

## Constraints

- Implement only approved, evidence-backed workflows.
- The alternative must not depend on the target app's private APIs, credentials, backend, source, or assets.
- Keep data local by default. Add a network service only when an approved requirement needs it.
- Isolate platform permissions, persistence, and external integrations behind small testable interfaces.

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
