# Decision 0001: Use REA as external analysis tooling

- **Status:** Accepted for analysis workflow; not a runtime dependency.
- **Date:** 2026-11-04

## Context

The project needs a repeatable way to inspect Android APK metadata and decompiled methods. The requester identified [REA (Reverse Engineer Anything)](https://github.com/morluto/rea), which exposes reverse-engineering workflows through a local CLI/MCP integration. REA is maintained separately and has its own setup and tool prerequisites.

## Decision

Use the official `morluto/rea` / `rea-agents` distribution as an optional local analysis tool. Document setup and version/tool prerequisites in `docs/tooling.md`. Do not copy or vendor REA into this repository, ship it inside the alternative app, or make the alternative depend on its availability at runtime.

## Consequences

- Analysis remains reproducible when artifact hashes and REA/JADX versions are recorded.
- Developers must install and configure REA locally; setup changes agent configuration and requires their review/approval.
- REA and JADX prerequisites remain outside the app build.
- The alternative must not contain target APKs or raw analysis output.
- REA results are evidence with limitations, not proof of runtime behavior or a replacement for authorized testing.

## Revisit when

A future implementation genuinely needs an embedded analysis component, or upstream REA licensing, availability, package requirements, or security posture changes materially.
