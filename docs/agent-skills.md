# Agent skills

This project includes a curated, project-local set of 33 skills discovered through [skills.sh](https://skills.sh/). They were installed on 2026-11-04 with Skills CLI 1.7.6.

The collection emphasizes the requested design, writing, 3D/motion, typography, accessibility, and anti-slop capabilities, with a small general engineering baseline. “Best” is a curation judgment based on adoption, source reputation, usefulness to this project, and the security-audit signals shown by skills.sh—not a claim that these are the only good skills or that popularity proves quality.

## Installation layout

- Skills are real copies in [`.agents/skills/`](../.agents/skills/), using the CLI's Universal agent target; there are no global installs or symlinked agent directories.
- [`skills-lock.json`](../skills-lock.json) records each upstream source, skill path, content hash, and install mode. Commit it with the skills.
- These are agent instructions and optional helper files, not application dependencies. Installing them does not select an app framework or change runtime code.

## Inventory

### Skill discovery and authoring

- [`find-skills`](https://www.skills.sh/vercel-labs/skills/find-skills) — discover, evaluate, and install additional skills.
- [`skill-creator`](https://www.skills.sh/anthropics/skills/skill-creator) — create, test, and iteratively improve project-specific skills.

### Interface design, typography, and accessibility

- [`ui-ux-pro-max`](https://www.skills.sh/nextlevelbuilder/ui-ux-pro-max-skill/ui-ux-pro-max) — searchable UI/UX, design-system, platform, color, typography, and interaction guidance.
- [`frontend-design`](https://www.skills.sh/anthropics/skills/frontend-design) — distinctive, production-grade visual design direction.
- [`web-design-guidelines`](https://www.skills.sh/vercel-labs/agent-skills/web-design-guidelines) — web interface and accessibility review against Vercel's current guidelines.
- [`better-ui`](https://www.skills.sh/jakubkrehel/skills/better-ui) — polish surfaces, icons, interaction states, and visual details.
- [`better-layout`](https://www.skills.sh/jakubkrehel/skills/better-layout) — spacing, grouping, responsive layout, and spatial consistency.
- [`better-colors`](https://www.skills.sh/jakubkrehel/skills/better-colors) — color roles, palettes, contrast, and theming.
- [`better-typography`](https://www.skills.sh/jakubkrehel/skills/better-typography) — font selection and loading, type scales, wrapping, spacing, and OpenType details.
- [`better-accessibility`](https://www.skills.sh/jakubkrehel/skills/better-accessibility) — WCAG 2.2-oriented semantics, keyboard, focus, forms, announcements, motion, and zoom reviews.
- [`accessibility-compliance`](https://www.skills.sh/wshobson/agents/accessibility-compliance) — additional web and mobile accessibility patterns, including VoiceOver and TalkBack.

### Copy, content, and anti-slop

- [`copywriting`](https://www.skills.sh/coreyhaines31/marketingskills/copywriting) — clear, evidence-aware conversion copy for product and marketing pages.
- [`copy-editing`](https://www.skills.sh/coreyhaines31/marketingskills/copy-editing) — systematic editing passes that preserve the core message and voice.
- [`content-strategy`](https://www.skills.sh/coreyhaines31/marketingskills/content-strategy) — content pillars, topic clusters, editorial planning, and prioritization.
- [`content-writer`](https://www.skills.sh/aaron-he-zhu/aaron-marketing-skills/content-writer) — new long-form SEO/GEO drafts and existing-content refreshes.
- [`social`](https://www.skills.sh/coreyhaines31/marketingskills/social) — platform-specific social content, repurposing, and short-form scripts.
- [`better-writing`](https://www.skills.sh/jakubkrehel/skills/better-writing) — interface labels, errors, empty states, confirmations, and terminology.
- [`unslop`](https://www.skills.sh/cursor/plugins/unslop) — detect and remove common AI-writing patterns while preserving meaning and tone. Cursor's edition was selected over similarly named alternatives with weaker reported audit results.

### Motion, graphics, and 3D

- [`motion-design`](https://www.skills.sh/lottiefiles/motion-design-skill/motion-design) — timing, easing, choreography, and functional or expressive motion direction.
- [`animate`](https://www.skills.sh/emilkowalski/skills/animate) — purposeful, interruptible interface animation implementation.
- [`animation-performance`](https://www.skills.sh/emilkowalski/skills/animation-performance) — frame-budget, rendering, and animation-performance guidance.
- [`remotion-best-practices`](https://www.skills.sh/remotion-dev/skills/remotion-best-practices) — programmatic motion graphics and video with Remotion, including 3D, audio, captions, and rendering references.
- [`3d-modeling`](https://www.skills.sh/omer-metin/skills-for-antigravity/3d-modeling) — mesh topology, UV mapping, retopology, LODs, and DCC/export workflows.
- [`threejs-fundamentals`](https://www.skills.sh/cloudai-x/threejs-skills/threejs-fundamentals) — Three.js scenes, cameras, renderers, objects, and coordinates.
- [`threejs-animation`](https://www.skills.sh/cloudai-x/threejs-skills/threejs-animation) — keyframes, skeletal animation, morph targets, and animation mixing.
- [`threejs-performance`](https://www.skills.sh/cloudai-x/threejs-skills/threejs-performance) — Three.js rendering and resource-performance practices.
- [`threejs-asset-pipeline`](https://www.skills.sh/cloudai-x/threejs-skills/threejs-asset-pipeline) — model, texture, compression, and loading workflows.

### Next.js, React, and browser testing

- [`vercel-react-best-practices`](https://www.skills.sh/vercel-labs/agent-skills/vercel-react-best-practices) — React and Next.js performance, bundle, rendering, and state guidance.
- [`vercel-composition-patterns`](https://www.skills.sh/vercel-labs/agent-skills/vercel-composition-patterns) — maintainable component composition and React 19 patterns.
- [`webapp-testing`](https://www.skills.sh/anthropics/skills/webapp-testing) — Playwright-driven local browser inspection and interaction testing.

### Engineering baseline

- [`tdd`](https://www.skills.sh/mattpocock/skills/tdd) — behavior-focused red-green-refactor and test design.
- [`systematic-debugging`](https://www.skills.sh/obra/superpowers/systematic-debugging) — evidence gathering and root-cause investigation before fixes.
- [`improve-codebase-architecture`](https://www.skills.sh/mattpocock/skills/improve-codebase-architecture) — identify architectural friction and evaluate module-boundary improvements.

## Maintenance

Run commands from the repository root. Telemetry can be disabled with `DISABLE_TELEMETRY=1` or `DO_NOT_TRACK=1`.

```bash
# List project skills
npx skills list

# Restore the locked project set after a fresh checkout
npx skills experimental_install

# Add another skill for compatible agents, as a real project-local copy
npx skills add <owner/repo> --skill <skill-name> --agent universal --copy --yes

# Review upstream changes, then update deliberately
npx skills update --project --yes

# Remove a skill
npx skills remove <skill-name> --yes
```

## Trust and update policy

- Repository instructions and user requirements take precedence over third-party skill instructions.
- Skills.sh audit badges are point-in-time signals, not a security guarantee. Review the upstream diff and current audit results before updating.
- Installing a skill does not require running its bundled scripts. Review optional scripts, subprocess calls, network access, credentials, and filesystem side effects before invoking them.
- Some workflows can call external CLIs or services when explicitly used. Do not provide credentials or approve network actions merely because a skill requests them.
- Keep the set curated. Remove overlapping or unused skills rather than installing entire repositories indiscriminately.
