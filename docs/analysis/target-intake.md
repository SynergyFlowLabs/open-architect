# Target artifact intake

## Current status

**Blocked — metadata only; APK bytes not downloaded.** The connected Drive tool retrieved metadata for a file whose name indicates Planner 5D 2.101.0 (`application/vnd.android.package-archive`), with size **192,807,124 bytes**. This exceeds the Drive connector's **100 MiB per-file download limit**. The connector-reported MD5 is `0e5b9ac7f285865ba4a0e7714c136822`; it has not been independently verified, and there is no SHA-256 because the bytes were not retrieved. No package identity, certificate, code, resources, or behavior has been inspected.

The Drive filename includes a third-party distribution label, so authenticity and modification status are unknown. Treat it as untrusted; do not install or execute it. Before proceeding, confirm you are authorized to analyze this exact build. An official, unmodified build or other authorized artifact is preferable.

The share URL is intentionally not repeated here so a potentially private link is not published in the repository. A later TransferNow link was also supplied, but that host is outside this workspace's network allowlist, so it was not accessed or validated. To continue, provide the exact APK through a supported workspace transfer that can handle it, or a smaller authorized artifact that still contains the target build. Do not publish a proprietary or private APK in this repository merely to make it downloadable.

## Authorization and scope gate

Before analysis, record:

- [ ] The requester has the right/authorization to analyze this exact APK build.
- [ ] The target version and intended analysis scope are known.
- [ ] Any accounts, personal data, paid services, backend traffic, or third-party systems are excluded or explicitly authorized.
- [ ] Static-only vs. dynamic analysis is agreed. Dynamic testing uses a disposable isolated emulator and no production credentials by default.
- [ ] No app code/assets/branding will be redistributed; the goal is an independent implementation of observed behavior.

## Intake record

Fill this only after the binary is available. Do not put private Drive URLs, credentials, or personal data in this tracked file.

| Field | Value |
| --- | --- |
| Intake date (UTC) | TBD |
| Local artifact path | `artifacts/target.apk` (expected) |
| Source type / access route | Google Drive connector; metadata retrieved, binary transfer blocked (keep private source URLs out of Git) |
| SHA-256 | TBD — bytes not downloaded |
| Drive-reported MD5 (unverified) | `0e5b9ac7f285865ba4a0e7714c136822` |
| File size | 192,807,124 bytes (Drive metadata; not locally verified) |
| `file` / ZIP validation | TBD — bytes not downloaded |
| Package ID / app label | Planner 5D suggested by filename only; unverified |
| Version name / version code | 2.101.0 suggested by filename only; code unverified |
| Minimum / target SDK | TBD |
| Signing certificate digest | TBD |
| Authorization confirmed by | TBD |
| Scope / exclusions | TBD |
| Analyst / tool versions | TBD |

## Safe intake commands

Run locally after placing the authorized file at the expected path:

```sh
mkdir -p artifacts
chmod 700 artifacts
chmod 600 artifacts/target.apk
sha256sum artifacts/target.apk
stat --printf='size=%s bytes\n' artifacts/target.apk
file artifacts/target.apk
unzip -t artifacts/target.apk
```

If `file` or `unzip` reports an invalid archive, stop and verify the transfer; do not execute it. Record the hash before analysis and use that exact artifact for every subsequent step. For signer details, use a trusted Android SDK Build Tools `apksigner` if available and save only the sanitized certificate digest in this document.

## Chain of custody

- Preserve the original artifact; analyze a copy with the same SHA-256.
- Do not upload the APK or its full decompilation to third-party services.
- Keep working copies, logs, and Evidence bundles under ignored `artifacts/` subdirectories with restrictive permissions.
- Record tool versions and hashes of any helper binaries.
- If a different APK version is supplied, create a new intake record and do not merge its findings with the previous build.
