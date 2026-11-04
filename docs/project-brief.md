# Project brief

## Intent

Build an independent, open-source alternative to the Android application represented by an APK the requester intends to provide. The goal is to understand the target's observable user-facing workflows, write an evidence-backed specification, and implement an original application with its own code, name, visual assets, and data services.

## Status

**Target discovery is blocked on receiving the binary.** Google Drive metadata identifies a Planner 5D 2.101.0 APK, but the file is 192,807,124 bytes and exceeds the connector's 100 MiB per-file transfer limit. The binary is not present locally, so its package identity, screens, workflows, API, permissions, and behavior remain unverified. See [target intake](analysis/target-intake.md). Separately, the requester directed an original Next.js web slice; that work makes no target-parity claim and does not select a license.

## Working assumptions (not findings)

1. Android remains a candidate for the target-derived alternative because the supplied artifact is an APK; the independently approved web slice does not settle the future target platform.
2. The desired outcome is a functionally useful alternative, not a byte-for-byte clone or a distribution of the target APK.
3. Initial analysis will be static. Dynamic observation needs a disposable, isolated test environment and explicit authorization.
4. Requirements and architecture in this repository are proposals until the target has been inspected and the owner has approved scope.

## Principles

- **Evidence-led:** Every target-specific requirement points to an evidence ID and records uncertainty.
- **Independent implementation:** Recreate user-visible behavior, not proprietary implementation, source, branding, or assets.
- **Privacy by default:** Avoid unnecessary collection, tracking, permissions, and network dependencies.
- **Safe analysis:** Treat the APK as untrusted; no live accounts or production services in exploratory testing.
- **Accessible and maintainable:** Define accessibility and support requirements before implementation.
- **Open source in fact, not label:** Select and add an appropriate license before advertising the code as open source.

## Decisions needed after intake

- Target app name, package ID, version, signer, and the requester's authority to analyze that build.
- Which user problem and workflows are in MVP scope.
- Android minimum/target SDK, device form factors, languages, accessibility targets, and offline expectations.
- Whether any server behavior is essential; if so, what can be replaced by a new project-owned service.
- App/project name, license, contribution model, and release/signing process.
