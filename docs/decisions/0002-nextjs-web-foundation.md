# Decision 0002: Begin an original Next.js web foundation

Date: 2026-11-04

## Status

Accepted by the requester's direction to start a Next.js-based project and continue delivering through reviewed pull requests.

## Context

The repository began as an Android-analysis scaffold. The target APK is still unavailable, so no target-specific screens, workflows, permissions, or services have been verified. The earlier plan deferred framework code until product scope and licensing were agreed. The requester has now explicitly directed implementation to start with Next.js and recurring milestone pull requests.

## Decision

- Build an original Next.js web application using the App Router, React, and TypeScript.
- Limit the first usable slice to a local-first 2D room planner: add, select, move, resize, rename, delete, save locally, and export rectangular rooms.
- Keep landing pages and other static content in Server Components. Isolate interactive editor code in a client leaf.
- Use browser storage with a versioned schema. Do not add accounts, a backend, telemetry, or target-vendor integrations.
- Use original wording, visual assets, geometry, and code. Make no target-parity or verified-target-behavior claims.
- Test pure planner state and snapshot boundaries, then review the browser interaction and accessibility behavior.

## Consequences

- The repository gains a web implementation and Node.js toolchain alongside the analysis documents.
- Android remains a possible future target, not a commitment to replace it with this web app.
- The first slice can be useful without the APK, but it cannot be described as a verified alternative workflow.
- The project license, name clearance, release model, and public distribution remain unresolved release blockers. This decision does not select a license or authorize an open-source release claim.
- Future target-parity features still require artifact intake, evidence, and explicit product approval.
