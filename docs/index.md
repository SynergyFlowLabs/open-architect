# Documentation

This documentation is a planning scaffold. No target APK is available in the workspace, so target-specific behavior, requirements, and architecture remain unverified.

## Project definition

- [Project brief](project-brief.md) — goal, working assumptions, and decisions needed.
- [Requirements](requirements.md) — initial quality constraints and a template for evidence-backed product requirements.
- [Architecture](architecture.md) — proposed Android-first structure, pending discovery.
- [Roadmap](roadmap.md) — gated path from artifact intake to release.

## Reverse engineering

- [Tooling and REA setup](tooling.md) — official REA integration, pinned version, host prerequisites, and current sandbox status.
- [Target intake](analysis/target-intake.md) — artifact access, authorization, and chain-of-custody checklist.
- [Reverse-engineering plan](analysis/reverse-engineering-plan.md) — repeatable static-first workflow and stop conditions.
- [Feature inventory](analysis/feature-inventory.md) — blank worksheet for user-visible behavior.
- [Evidence ledger](analysis/evidence-ledger.md) — provenance and confidence format for observations.

## Build and stewardship

- [Agent skills](agent-skills.md) — curated project-local skill inventory, provenance, maintenance, and trust policy.
- [Security and privacy](security-and-privacy.md) — handling rules and threat model.
- [Testing strategy](testing.md) — proposed validation plan.
- [Legal and provenance](legal-and-provenance.md) — authorization, clean-room boundaries, and license decision.
- [Decision 0001: REA as external tooling](decisions/0001-rea-as-external-tool.md) — why REA is documented as a local analyst tool rather than vendored into the app.
