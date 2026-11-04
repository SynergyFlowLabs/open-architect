# Testing strategy

## Status

The Next.js app has an active ESLint, TypeScript, Vitest, and production-build gate. Forty-two tests pass: 9 planner reducer, 9 snapshot/storage, 4 snapshot-file, 7 editing-history reducer, 12 planner component, and 1 landing-page component. They cover bounded geometry, selection, deletion, plan rename/reset, pending-import invalidation, portable filenames, versioned round-trips, file size/read failures, malformed data, keyboard movement, hydration, unavailable storage, valid/invalid import, import undo expiry, undo/redo, redo invalidation, the 50-entry cap, drag coalescing, native text-input shortcut preservation, and name-field synchronization after history. The combined M3–M4 Chromium review passed 20 Playwright checks, and the focused M5 review passed 19. A focused M6 production Chromium review passed 18 additional checks covering rename persistence, ASCII and Unicode export filenames, blank-name recovery, import synchronization, reset cancellation/confirmation, undoable reset, 320/390 px layouts, and browser errors. Axe reported no tested WCAG A/AA violations on the reviewed landing and studio states. This is not a full accessibility certification: screen readers and additional browsers remain unreviewed. No target-specific behavior has been measured, and the Android matrix remains a proposal.

## Test layers

1. **Unit tests:** planner domain rules, validation, state transitions, serialization, and error mapping without framework or network access.
2. **Component tests:** Next.js UI and editor state with Testing Library and synthetic data.
3. **Browser tests:** local Playwright checks for keyboard operation, responsive layout, persistence, and console errors.
4. **Android instrumentation (future):** permissions, lifecycle, navigation, persistence, process death, and accessibility on disposable emulators if Android is approved.
5. **Service contract tests (if needed):** project-owned API against local/test fixtures; no dependency on the original vendor service.
6. **Acceptance tests:** user-visible scenarios derived from approved requirements and linked to evidence IDs when target-derived.
7. **Security/privacy checks:** dependency/license review, secret scan, data-retention/delete checks, and offline/network behavior.
8. **Manual exploratory checks:** screen-reader labels, text scaling, keyboard/switch navigation where relevant, rotation/resizing, and error states.

## Behavior validation

- Compare observable outcomes only in an authorized, controlled environment; do not compare or reuse internal code.
- Keep a record of APK hash, test device/API image, application version, steps, expected/actual result, and limitations.
- A test against one build or emulator does not establish behavior for all versions, devices, accounts, or server conditions.
- Do not include target APKs, copyrighted screenshots, live credentials, personal data, or raw traffic captures in public fixtures.
- Use synthetic data and project-owned services in automated tests.

## Initial test matrix (to approve)

| Dimension | Candidate coverage | Status |
| --- | --- | --- |
| Android API levels | Minimum supported, current target, one recent release | TBD |
| Form factors | Small phone, large phone, tablet/foldable if in scope | TBD |
| Connectivity | Offline, slow/unavailable service, normal test service if required | TBD |
| Account/state | Signed out, valid synthetic test state, expired/empty state if relevant | TBD |
| Accessibility | TalkBack, text scaling, contrast, touch targets, keyboard/switch if relevant | TBD |
| Lifecycle | Restart, rotation/resizing, background/foreground, process recreation | TBD |

## Release criteria (proposed)

- Every MVP requirement has a passing test or a documented accepted limitation.
- No known high-severity security/privacy issue is unresolved.
- User data behavior, permissions, dependencies, supported Android range, and license are documented.
- A reproducible build and signing/release procedure are in place.
- Release notes distinguish verified behavior from known differences to the target.
