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
| M4 — Plan restore | Validated JSON import, non-destructive errors, and one-step import undo | completed | 26 tests and 20 browser checks passed; export/import/undo/reload flow and screenshots reviewed; lint, type, and build passed |
| M5 — Editing history | General undo/redo, keyboard shortcuts, bounded history, and drag coalescing | completed | 36 tests and 19 focused browser checks passed; screenshots reviewed; lint, type, and production build passed |

## Testing seams

The public test seams for the first feature are the planner reducer, the editing-history reducer, and the versioned snapshot parser/serializer.

- Reducer tests catch invalid geometry, selection, and state-transition regressions. They do not verify browser rendering or pointer coordinates.
- Snapshot tests catch malformed-data and data-loss regressions. They do not verify browser storage availability.
- Browser checks must separately verify rendered controls, keyboard alternatives, responsive layout, and console errors.

## M3 browser evidence

The Git-ignored `artifacts/browser-review/` directory contains the JSON report, downloaded plan, and desktop/mobile screenshots. Python Playwright 1.64.1 drove Chromium 153 against the production build. The standard Playwright browser CDN is outside the sandbox allowlist, so the temporary runtime used the npm-hosted `@sparticuz/chromium` binary; no browser tooling was added to the app or Git.

Verified flows include the skip link, add/rename, keyboard and numeric edits, local save/reload, pointer dragging, JSON download contents, 320px/390px overflow checks, and zero console errors, uncaught page errors, or external browser requests. Axe reported no tested WCAG A/AA violations on the desktop landing and populated studio pages. Screen-reader behavior, other browser engines, and full accessibility conformance remain unverified.

The review corrected accessible-name/visible-text mismatches and replaced font-dependent direction glyphs with inline SVG arrows. Final screenshots were reviewed after those corrections.

## M4 plan-restore evidence

The M4 browser review recorded 20 passing checks. The exercised portability loop was: create and export two rooms, import a different valid plan, undo the replacement, import again and reload, re-import the original export, then attempt a malformed import. The malformed file produced an error without replacing the current plan. Imported plans were also verified in local storage after reload.

The file adapter rejects files over 256 KB before reading them and delegates all content to the strict version 1 snapshot parser. The dedicated import-undo action is intentionally one step and retires after the next plan edit; M5 adds separate general history. Desktop import feedback and the three-action mobile header were visually reviewed. Axe reported no tested A/AA violations on the landing, populated studio, or import-error states.

## M5 editing-history evidence

The focused Git-ignored browser report contains 19 passing checks against the production build. The review covered initially disabled controls, button and keyboard undo/redo, native text-input shortcut preservation, redo invalidation, one-step pointer-drag undo, general and dedicated import undo, malformed-file recovery, persistence after undo, history reset on reload, export contents, and 320/390 px layouts with 44 px history targets. It observed no console errors, uncaught page errors, external requests, or reviewed axe A/AA violations. Desktop, mobile, import-error, and landing screenshots were reviewed.

The pure editor reducer caps each history stack at 50 entries, excludes selection-only changes, clears redo after a new edit, and coalesces updates sharing a drag key. History is memory-only; undone or redone plans continue to use the existing local-save effect. Browser review also exposed and verified a fix for stale inspector name drafts after rename undo/redo.

## Blockers and open decisions

- Target APK intake and target-specific behavior remain blocked. No target-parity requirement is approved.
- The project license remains `TBD`; no public release or open-source claim is authorized by this web work.
- Product name and brand clearance remain `TBD`. "Open Architect" is a working repository name.
- Backend, accounts, telemetry, and target-vendor services are out of scope for the current slice.

## Pull requests

- [#3](https://github.com/SynergyFlowLabs/open-architect/pull/3) — installed the initial 30-skill collection; merged 2026-11-04.
- [#4](https://github.com/SynergyFlowLabs/open-architect/pull/4) — Next.js foundation and local-first room studio; merged 2026-11-04.
- [#5](https://github.com/SynergyFlowLabs/open-architect/pull/5) — M3 browser review, accessible-name corrections, and SVG direction controls; merged 2026-11-04.
- [#6](https://github.com/SynergyFlowLabs/open-architect/pull/6) — M4 validated plan import, non-destructive errors, and one-step undo; merged 2026-11-04.

## Update protocol

Update this file at every milestone. Commit and push coherent changes on the active Arena branch. After a few completed tasks or one usable vertical slice, open a pull request, review its checks and merge state, and merge it as requested by the maintainer.
