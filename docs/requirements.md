# Requirements

## Status

There are no verified target-specific product requirements yet. The APK is unavailable, so the target's user tasks and expected outcomes are unknown. The requester separately approved an original Next.js slice under [Decision 0002](decisions/0002-nextjs-web-foundation.md). The items below remain target-analysis constraints/proposals, not a verified target feature list.

## Requirement status

Use `proposed`, `evidence-backed`, `approved`, `implemented`, `verified`, or `deferred`. Each target-parity requirement must cite evidence IDs and have a testable acceptance condition. Keep unsupported details as `TBD`.

## Product requirements register

| ID | Requirement | Rationale | Evidence | Acceptance criteria | Status |
| --- | --- | --- | --- | --- | --- |
| PR-001 | The alternative shall implement only the user-visible workflows selected for the MVP after analysis and review. | Avoid speculative scope. | TBD | Every MVP workflow has an approved feature row, evidence IDs, and at least one acceptance scenario. | proposed |
| PR-002 | Target-specific claims shall distinguish verified behavior from assumptions and list known gaps. | Prevent false parity claims. | This project process | Reviewers can trace each claim to the evidence ledger and reproduce the stated test where applicable. | proposed |
| PR-003 | The app shall request only the Android permissions required for approved MVP workflows and explain them at the point of use. | Minimize user risk. | TBD | Permission review maps each declared permission to an approved requirement; no unexplained permissions remain. | proposed |
| PR-004 | If the alternative stores user data, it shall provide documented retention, export/delete, and backup behavior appropriate to the data. | Privacy and user control. | TBD | Data inventory and tests cover retention and deletion before release. | proposed |
| PR-005 | Any required network/backend behavior shall use a project-owned, documented interface and shall not require access to the target vendor's private service. | Independence and sustainability. | TBD | Integration tests run against an owned test service or documented local substitute. | proposed |
| PR-006 | The project shall not redistribute target APK contents, source, private data, branding, or assets without documented rights. | Provenance and legal risk. | Project boundary | Repository scan and maintainer review find no unapproved target materials. | proposed |
| PR-007 | The shipped app shall provide accessible labels, keyboard/switch compatibility where relevant, and usable text scaling for implemented workflows. | Inclusive use. | Product decision pending | Accessibility checks are included in the acceptance matrix and defects are tracked. | proposed |

## Non-functional requirements (proposed)

- **Privacy:** data collection and telemetry are off by default unless explicitly justified, disclosed, and approved.
- **Security:** secrets never enter source control; validate untrusted input; review dependencies and permissions before release.
- **Reliability:** errors, empty states, and unavailable network/service conditions are handled without data loss where feasible.
- **Maintainability:** core behavior is testable without the original APK or service; interfaces isolate platform and storage concerns.
- **Accessibility:** implemented flows are checked against the accessibility plan in `testing.md`.
- **Reproducibility:** document toolchain, build, test, and release-signing steps when an app implementation exists.
- **Compatibility:** minimum Android API, target API, form factors, language coverage, and offline requirements are TBD until approved.

## Discovery questions before MVP approval

1. What exact user problem and top workflows must the alternative solve?
2. Which flows must work offline, and what data is local vs. server-side?
3. What accounts, external services, or legal terms affect the user journey?
4. What is the supported device/API/language/accessibility baseline?
5. Which behaviors are essential, and which can intentionally differ for better privacy or safety?
6. What license, project name, release channel, and maintenance expectations are approved?
