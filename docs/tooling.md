# Reverse-engineering tooling

## REA integration

[REA (Reverse Engineer Anything)](https://github.com/morluto/rea) is a local CLI/MCP tool that connects an agent to analysis tools. It is a separate tool, not a dependency of the alternative app, so this project does not vendor its source.

As of 2026-11-04, the official npm package is `rea-agents@6.8.0`. Its published Node engine range is `^22.23.4 || ^24.22.1 || >=26.12.1`. The interactive setup is:

```sh
npx --yes rea-agents@6.8.0 setup
```

Run the setup from a trusted directory. Select the agent you actually use, review the exact configuration paths and changes, approve them yourself, and restart the selected agent. Setup modifies local agent configuration; do not commit that configuration unless it is deliberately reviewed as project configuration. See the [official installation guide](https://github.com/morluto/rea/blob/main/docs/installation.md).

## Android APK prerequisites

REA's Android workflow uses a headless JADX engine. Per the [official Android analysis guide](https://github.com/morluto/rea/blob/main/docs/android-analysis.md), install/provide:

- A **full JDK 17 or newer**, including the Java compiler module.
- `jadx-headless-mcp` **0.7.1**. The guide pins SHA-256 to `6e5eacf500b64292bfb73c49797c1958f6ee44646e43e868039ae7feb573ff75`.
- On Linux, a procps-compatible `ps` on the REA process `PATH`.
- `adb` and an isolated emulator/device only if dynamic observation is separately authorized; static APK inspection does not require a device.

REA does not install Java, the Android SDK, JADX, an emulator, or an Android device service for you. Follow the upstream guide to obtain and verify the pinned JAR; then provide its absolute path to the REA process, for example:

```sh
export REA_JADX_MCP_JAR="$HOME/.local/share/rea/android/jadx-headless-mcp-0.7.1-all.jar"
export JAVA_HOME="/absolute/path/to/a/full-jdk"
```

Do not use a JAR unless its checksum matches the upstream-pinned value. A successful tool readiness check establishes prerequisites, not the authenticity of an APK or completeness of a decompilation.

## Useful CLI entry points

After setting up REA and its Android prerequisites, the documented static-analysis commands include:

```sh
rea inspect-android-package "$APK"
rea search-android-classes "$APK" 'search term'
rea inspect-android-class "$APK" 'com.example.SomeClass'
rea inspect-android-method "$APK" 'com.example.SomeClass' 'someMethod'
rea trace-android-references "$APK" 'com.example.SomeClass'
```

Use class and method names discovered from the artifact; the example names above are placeholders. REA can refuse ambiguous overloads rather than guessing. Consult the [Android guide](https://github.com/morluto/rea/blob/main/docs/android-analysis.md) for selector details, limitations, Evidence handling, and the current released-package boundary. Do not infer runtime behavior solely from decompiled source.

## Current workspace readiness (2026-11-04)

| Check | Observed | Effect |
| --- | --- | --- |
| Node.js | 22.22.3 | Below REA 6.8.0's declared minimum (22.23.4 in the 22.x line). |
| npm | 10.9.8 | Present. |
| `ps` | `/usr/bin/ps` | Present. |
| `java` / `javac` | Not found | No full JDK available for JADX. |
| `jadx` / pinned headless JAR | Not found / not configured | Android static workflow is not ready. |
| `adb` | Not found | Dynamic device workflow is not ready. |
| Target APK | Drive metadata available; filename suggests Planner 5D 2.101.0; 192,807,124 bytes | Exceeds the connector's 100 MiB per-file transfer limit; no bytes or SHA-256 are available, so analysis cannot begin. |

For these reasons, REA was not installed or run in this workspace. Upgrade the local toolchain and provide the APK before running the workflow. Do not put the target binary or raw analysis output in Git.
