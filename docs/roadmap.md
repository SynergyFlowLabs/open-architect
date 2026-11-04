# Roadmap

This roadmap has no dates because the target APK and scope are not available. A phase advances only when its exit criteria are met.

## Phase 0 — unblock and prepare

**Status: in progress / blocked on APK transfer.** Google Drive metadata is available, but the binary exceeds the connector's 100 MiB per-file download limit.

- [x] Create project, analysis, security, testing, and provenance documentation.
- [x] Document REA setup and Android tool prerequisites.
- [ ] Transfer the authorized target APK into the workspace (the Drive file is 192,807,124 bytes, above the connector's 100 MiB limit).
- [ ] Confirm scope/authorization and record artifact SHA-256.
- [ ] Upgrade toolchain and pass REA/JADX readiness checks.

**Exit:** hash-identified artifact, scope approval, and working static analysis toolchain.

## Phase 1 — discover behavior

- [ ] Build a package/component map.
- [ ] Select high-value user workflows with the requester.
- [ ] Trace static evidence for each workflow; perform isolated runtime observation only if approved and necessary.
- [ ] Fill the feature inventory and evidence ledger, including unknowns and limitations.

**Exit:** reviewed feature inventory, evidence-backed requirements, and explicit unresolved questions.

## Phase 2 — approve product and architecture

- [ ] Confirm MVP, Android/API/device/language/accessibility baseline, privacy posture, and service needs.
- [ ] Select app/project name, open-source license, and release model.
- [ ] Approve architecture and data/security decisions.

**Exit:** no unresolved `TBD` that blocks MVP implementation; license file and contributor/release policies agreed.

## Phase 3 — independent MVP

- [ ] Build original UI, logic, and assets for approved workflows.
- [ ] Add persistence or a project-owned backend only where requirements support it.
- [ ] Implement automated and accessibility tests alongside behavior.
- [ ] Document deviations and intentionally different privacy/safety behavior.

**Exit:** acceptance scenarios pass on the agreed test matrix; no unresolved release-blocking security/privacy issues.

## Phase 4 — public beta and maintenance

- [ ] Publish a reproducible build and source under the chosen license.
- [ ] Complete dependency/provenance review and enable private security reporting.
- [ ] Publish limitations, privacy/data-flow documentation, and support policy.
- [ ] Collect feedback without collecting unnecessary user data; prioritize fixes from evidence and user needs.
