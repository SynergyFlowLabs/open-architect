# Testing strategy

## Status

The Next.js app has an active ESLint, TypeScript, Vitest, and production-build gate. Nineteen tests pass: 7 reducer, 8 snapshot/storage, 3 editor component, and 1 landing-page component. They cover bounded geometry, selection, deletion, versioned round-trips, malformed data, keyboard movement, hydration, and unavailable storage. The M3 Chromium review also passed 15 Playwright checks covering the skip link, editing, keyboard and pointer movement, persistence, JSON download, responsive overflow, and browser errors. Axe reported no tested WCAG A/AA violations on the desktop landing or populated studio pages. This is not a full accessibility certification: screen readers and additional browsers remain unreviewed. No target-specific behavior has been measured, and the Android matrix remains a proposal.

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
