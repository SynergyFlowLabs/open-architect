# Android reverse-engineering plan

## Status and boundaries

This is a repeatable plan, not a report of completed analysis. The APK is not available in the workspace. All target-specific sections remain unverified until a hash-identified artifact is received. Start with static analysis; decompilation is incomplete and does not prove runtime behavior.

Analyze only software and systems you are authorized to inspect. Do not bypass DRM, licensing, authentication, anti-abuse, or access restrictions. Do not use production accounts or send test traffic to a live service. Dynamic execution is a separate, explicit step requiring an isolated disposable emulator and a reviewed test plan.

## Phase 0 — intake and readiness

1. Complete [target intake](target-intake.md), confirm authorization and scope, and compute the APK SHA-256.
2. Verify that REA's Node, JDK, and pinned JADX prerequisites are met using [tooling.md](../tooling.md). On Linux, check the `ps` process prerequisite.
3. Store the artifact and all raw outputs under Git-ignored `artifacts/`. Never commit the APK, raw decompiler tree, database, traffic capture, or secrets.
4. Record all tool versions, selected engine, host OS, and artifact digest in the evidence ledger.

## Phase 1 — static package map

Using REA's `inspect_android_package`, record the package/application identity, SDK declarations, permissions, declared components, intent filters, and any reported limitations. Do not infer that a declaration is active or reachable at runtime. Treat exported-component results as risk/surface observations, not proof of exploitability.

Use the manifest and reported class inventory to locate candidate UI and domain classes. Search for terms only after collecting app-visible labels/resources or a concrete user question. Avoid assumptions such as a class named `MainActivity` or a particular framework.

## Phase 2 — feature-focused trace

For each user-observable feature chosen for the MVP:

1. Describe the user goal and the visible start/end states in the feature inventory.
2. Record the screen entry point, relevant class and method selectors, and observed state transitions.
3. Follow static references from the selected methods; inspect call sites, local data/state, and error handling where available.
4. Note resource strings, URLs, permissions, storage locations, or third-party SDK indicators only when directly observed and relevant.
5. Mark whether each conclusion is direct, inferred, or unknown. Note obfuscation, missing bodies, reflection, native code, dynamic loading, or other analysis gaps.
6. Translate the finding into a behavior-level requirement; do not copy code or assets.

REA's documented CLI entry points (class names and query values below are placeholders):

```sh
rea inspect-android-package "$APK"
rea search-android-classes "$APK" 'search term'
rea inspect-android-class "$APK" 'package.ClassName'
rea inspect-android-method "$APK" 'package.ClassName' 'methodName'
rea trace-android-references "$APK" 'package.ClassName'
rea trace-android-references "$APK" 'package.ClassName' --method-name 'methodName'
```

For overloaded methods, inspect the class inventory first and select the exact overload. REA's overload indexes are tied to that artifact/engine, not stable identifiers across builds. Preserve Evidence identifiers and limitations; use the official [REA Android guide](https://github.com/morluto/rea/blob/main/docs/android-analysis.md) for current CLI options and result semantics.

## Phase 3 — dynamic observations (optional, gated)

Dynamic observation is not required to start the alternative and is not authorized merely by possession of an APK. Before it:

- Obtain explicit approval for running the app and state exactly what will be observed.
- Use a disposable emulator/snapshot, non-production test identity, and no personal data.
- Block external network by default. If a network behavior is essential and authorized, use a controlled test environment and sanitize captures before recording any summary.
- Do not defeat certificate pinning, licensing, authentication, anti-tamper, or other controls. Stop if a workflow requires that.
- Record the emulator image/API level, installed APK hash, steps, observed outcome, and cleanup.

The result of an emulator session applies only to that tested environment; it is not proof of all devices, accounts, or server states.

## Phase 4 — independent specification and implementation

1. Consolidate observations into the feature inventory and evidence ledger.
2. Draft requirements in user-visible terms with measurable acceptance criteria and evidence links.
3. Review scope, licensing/provenance, security, privacy, and product decisions with the requester.
4. Implement the alternative independently using new code, UI assets, copy, identifiers, and any necessary project-owned service.
5. Validate against evidence-backed acceptance scenarios. Report known behavior differences instead of claiming exact parity.

## Deliverables from the analysis

- Hash-identified intake record.
- Sanitized package/manifest summary, with tool versions and analysis limitations.
- Feature inventory for agreed MVP features.
- Evidence ledger linking each claim to an artifact selector/location and operation.
- Requirements and testable acceptance scenarios.
- Explicit unknowns and blockers; no inference from missing data.
