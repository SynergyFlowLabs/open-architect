# Testing strategy

## Status

No application exists yet and no target-specific behavior has been measured. This is a proposed test plan. Convert evidence-backed requirements into reproducible acceptance scenarios before implementing their corresponding features.

## Test layers

1. **Unit tests:** domain rules, validation, state transitions, serialization, and error mapping without Android framework or network access.
2. **Component tests:** repository/storage adapters and UI state with fakes and synthetic data.
3. **Android instrumentation:** permissions, lifecycle, navigation, persistence, process death, and accessibility on disposable emulators.
4. **Service contract tests (if needed):** project-owned API against local/test fixtures; no dependency on the original vendor service.
5. **Acceptance tests:** user-visible scenarios derived from approved requirements and linked to evidence IDs.
6. **Security/privacy checks:** permission diff, dependency/license review, secret scan, data-retention/delete checks, and offline/network behavior.
7. **Manual exploratory checks:** screen-reader labels, text scaling, keyboard/switch navigation where relevant, rotation/resizing, and error states.

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
