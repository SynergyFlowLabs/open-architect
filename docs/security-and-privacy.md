# Security and privacy

## Status

This is a design baseline for a project with no app implementation yet. Revisit it after the APK, workflows, and data flows are understood. It is not a substitute for a security review or legal advice.

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
