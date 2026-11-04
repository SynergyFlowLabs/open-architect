# Evidence ledger

## Status

No target evidence has been collected. The APK is not present in the workspace. Do not populate this ledger with guessed class names, screens, endpoints, permissions, or behavior.

## Rules

- Give every observation a stable ID (`E-001`, `E-002`, …) and link requirements/feature rows to those IDs.
- Record the exact APK SHA-256, REA/JADX version, operation, selector, and source location where available.
- Quote only the minimum necessary sanitized content. Keep full Evidence bundles and decompiler output in ignored `artifacts/`.
- Separate **observed** from **inferred**. An inference must list its supporting evidence and alternatives.
- Confidence: **high** = direct, reproducible observation; **medium** = multiple consistent static clues but not directly observed at runtime; **low** = plausible hypothesis with material gaps. Confidence is not a substitute for limitations.
- Record negative/absent results only when the relevant inventory is known to be complete; otherwise write “not observed in this query.”
- A new APK hash starts a new ledger section; do not silently carry claims across builds.

## Evidence table

| ID | APK SHA-256 | Claim / observation | Type (direct / inference) | Tool + version / operation | Selector or source location | Confidence | Limitations / alternative explanations | Related feature / requirement |
| --- | --- | --- | --- | --- | --- | --- | --- | --- |

## Analysis session record

| Session | APK SHA-256 | Host / emulator | REA version | JADX/JDK | Scope / commands | Output location (ignored) | Notes |
| --- | --- | --- | --- | --- | --- | --- | --- |

## App-specific findings

None yet. This section should be populated only after a verified artifact is available and the analysis plan has been followed.
