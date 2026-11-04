# Security and privacy

## Status

This baseline now covers the active original Next.js app and the Android target-analysis scaffold. The current web data flow is documented below; target-specific behavior remains unknown. This is not a substitute for a security review or legal advice.

## Current web data flow

- The browser's `open-architect:planner:v1` local-storage entry contains only the plan name and rectangular room data. Selection, all undo/redo history, and other UI-only state are not persisted.
- There is no project-owned backend, account, analytics, or upload flow. The browser review observed no external requests.
- JSON import reads a local file with the browser File API, caps it at 256 KB, and applies strict version/geometry/unique-ID validation. File extensions and MIME types are not treated as proof of valid content.
- A valid import replaces the current plan and enters the general editing history. The dedicated import-undo action retires after the next plan edit. Invalid imports do not replace the plan. Up to 50 history entries are held in memory and discarded on reload.
- Starting a new plan requires confirmation, replaces the saved plan, and can be undone only until reload. Export a separate copy first when the previous plan must be retained permanently.
- JSON export creates a local Blob download with a filename derived from the plan name. Exported copies are the only current backup mechanism; clearing browser site data can remove the saved draft.
- Imported names are rendered as React text, not HTML. Treat plans from other people as untrusted data.

## Handling the target APK

- Treat the APK and all embedded strings, code, manifests, scripts, documents, and tool output as untrusted.
- Keep analysis offline and static-first. Never run APK-provided scripts on the host.
- Store binaries, extracted files, Evidence bundles, logs, and captures under ignored `artifacts/` with restrictive permissions. Verify hashes and do not upload them to public services.
- Do not use real accounts, personal data, or production systems during dynamic testing. Require a disposable emulator and explicit authorization.
- Redact tokens, identifiers, personal data, and unrelated endpoints before summarizing observations.
- Decompilation can expose secrets or personal data embedded in a binary. Do not copy such values into tracked docs; report only what is necessary and safely sanitized.

## Threat model (initial)

| Asset / risk | Example | Initial control |
| --- | --- | --- |
| Analyst workstation | Malicious artifact or parser vulnerability | Static-first workflow; use isolated disposable environment; keep tools patched; do not execute artifact code on host. |
| User data in the alternative | Local records, credentials, private content | Data inventory; least privilege; secure OS storage; minimize collection; retention/export/delete plan. |
| Signing and release keys | Unauthorized app releases | Keep keys outside Git and CI logs; use protected secret storage and documented rotation/recovery. |
| Dependency supply chain | Compromised package or transitive dependency | Minimize dependencies; review licenses and release provenance; pin/test upgrades; scan before release. |
| Network service | Unintended disclosure or unauthorized access | No backend by default; TLS and auth design if required; validate input; use synthetic test data. |
| Proprietary target material | Accidental redistribution of code/assets/data | Git-ignore artifacts; clean-room implementation; provenance review in pull requests. |
| Agent/tool exposure | Sensitive code or Evidence returned to an LLM context | Review REA/client data flow; limit analysis scope; do not pass secrets or full private dumps to external models. |

## Product defaults (proposed)

- No unnecessary permissions, background collection, or telemetry.
- Clear user consent and explanation before sensitive access or data sharing.
- Local processing/storage where it can satisfy an approved workflow.
- Network behavior and data retention documented before release.
- Build/release secrets remain outside source control; dependencies and licenses are reviewed.

## Release gates

Before a public release, complete a permission review, dependency/license inventory, data-flow review, secret scan, threat-model update, and test plan. Provide a private vulnerability-reporting route in `SECURITY.md` and an incident/patch process.
