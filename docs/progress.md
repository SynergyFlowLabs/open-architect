# Delivery progress

Last updated: 2026-11-04

## Current direction

The requester has directed work to begin on an original Next.js application. The first web slice is a local-first room-planning studio. It is not a claim of feature parity with the uninspected Android target. See [Decision 0002](decisions/0002-nextjs-web-foundation.md).

## Milestones

| Milestone | Scope | Status | Verification |
| --- | --- | --- | --- |
| M0 — Direction and skills | Next.js/React skill discovery, design direction, decision record, progress tracking | completed | 33 project skills installed; design and accessibility searches reviewed |
| M1 — Application foundation | Next.js 16, React 19, TypeScript, linting, unit-test setup, original landing page | completed | ESLint 10, TypeScript, 1 component test, and production build passed; `/` and `/studio` prerendered |
| M2 — Studio vertical slice | Room reducer, accessible editor, local persistence, JSON export | completed | 19 tests passed across reducer, snapshots, editor, and landing page; ESLint, TypeScript, and production build passed |
| M3 — Browser review | Desktop/mobile interaction, keyboard flow, persistence, export, console, accessibility spot checks | completed | 15 Playwright checks passed; zero axe A/AA violations on desktop landing/studio; screenshots reviewed; lint, type, 19 tests, and build passed |

## Testing seams

The public test seams for the first feature are the planner reducer and versioned snapshot parser/serializer.

- Reducer tests catch invalid geometry, selection, and state-transition regressions. They do not verify browser rendering or pointer coordinates.
- Snapshot tests catch malformed-data and data-loss regressions. They do not verify browser storage availability.
- Browser checks must separately verify rendered controls, keyboard alternatives, responsive layout, and console errors.

## M3 browser evidence

The Git-ignored `artifacts/browser-review/` directory contains the JSON report, downloaded plan, and desktop/mobile screenshots. Python Playwright 1.64.1 drove Chromium 153 against the production build. The standard Playwright browser CDN is outside the sandbox allowlist, so the temporary runtime used the npm-hosted `@sparticuz/chromium` binary; no browser tooling was added to the app or Git.

Verified flows include the skip link, add/rename, keyboard and numeric edits, local save/reload, pointer dragging, JSON download contents, 320px/390px overflow checks, and zero console errors, uncaught page errors, or external browser requests. Axe reported no tested WCAG A/AA violations on the desktop landing and populated studio pages. Screen-reader behavior, other browser engines, and full accessibility conformance remain unverified.

The review corrected accessible-name/visible-text mismatches and replaced font-dependent direction glyphs with inline SVG arrows. Final screenshots were reviewed after those corrections.

## Blockers and open decisions

- Target APK intake and target-specific behavior remain blocked. No target-parity requirement is approved.
- The project license remains `TBD`; no public release or open-source claim is authorized by this web work.
- Product name and brand clearance remain `TBD`. "Open Architect" is a working repository name.
- Backend, accounts, telemetry, and target-vendor services are out of scope for the current slice.

## Pull requests

- [#3](https://github.com/SynergyFlowLabs/open-architect/pull/3) — installed the initial 30-skill collection; merged 2026-11-04.
- [#4](https://github.com/SynergyFlowLabs/open-architect/pull/4) — Next.js foundation and local-first room studio; merged 2026-11-04.

## Update protocol

Update this file at every milestone. Commit and push coherent changes on the active Arena branch. After a few completed tasks or one usable vertical slice, open a pull request, review its checks and merge state, and merge it as requested by the maintainer.
