# Open Architect design system

Status: project-authored direction for the original Next.js foundation. This is not derived from the uninspected target app.

## Review notes

Two local `ui-ux-pro-max` recommendation queries were reviewed. The first returned wedding-oriented colors and script typography and was rejected. The second returned a suitable minimal/Swiss direction, but its generic gold accent and external font pairing were not adopted. The accessible drag alternative and Next.js client-boundary searches were applicable and inform this plan.

## Color

Use hex tokens consistently. Components consume semantic tokens, not primitive values directly.

| Primitive | Value | Semantic jobs |
| --- | --- | --- |
| Ink | `#16324A` | Primary text, dark chrome, strong icon |
| Muted ink | `#52666B` | Secondary text on light surfaces |
| Paper | `#F3F6F4` | Page background |
| Surface | `#FFFFFF` | Panels, inputs, raised workspace |
| Line | `#C7D2CE` | Separators and component boundaries |
| Accent | `#0B6B62` | Primary action, selected outline, focus |
| Accent soft | `#D7EEE6` | Selected background and quiet highlights |

Room fills use separate categorical tokens and always include a border and text label. Selection is also announced in the inspector, so color is never the only state cue.

## Typography

- Display and body use an original system-only stack: `Avenir Next`, `Century Gothic`, `Trebuchet MS`, then `system-ui` fallbacks. No font network request is required.
- Body text starts at 1rem with line-height 1.55 and a 60–75 character measure.
- Display uses `clamp()` with line-height 1.05–1.1 and weight 600. Headings descend by semantic level.
- Interface captions remain at or above 0.8125rem and weight 400. Inputs remain at least 16px on mobile.
- Dimensions, coordinates, and area totals use `font-variant-numeric: tabular-nums`.

## Layout

Landing page:

```text
┌ wordmark ───────────────────── navigation ┐
│                                          │
│ headline + concise copy │ room-plan      │
│ primary studio action   │ illustration   │
│                                          │
├ actual editor capabilities, no fake stats ┤
│ local-first explanation and studio link  │
└ working-name / release-status footer     ─┘
```

Studio:

```text
┌ wordmark / plan title ─── add / export ───┐
│                                          │
│ plan canvas (flexible)  │ inspector      │
│ room list               │ (fixed max)    │
│                                          │
└ keyboard and saving guidance             ─┘
```

The inspector follows the canvas in DOM order on narrow screens. Tracks use `minmax(0, 1fr)`, text containers can shrink, and controls wrap instead of clipping. The plan grid is the memorable visual element; surrounding chrome stays quiet.

## Principles

- Show the subject immediately with an original room-plan illustration, not testimonials, invented metrics, or stock imagery.
- Use one filled primary action per view. Keep secondary actions neutral.
- Prefer Server Components for static content and push client state into the editor leaf.
- Provide visible focus, a skip link, native controls, and a keyboard/numeric alternative to every drag operation.
- Use motion only for direct feedback and only under `prefers-reduced-motion: no-preference`.
- Keep copy plain and specific: "Add room", "Save on this device", and "Export plan". Do not use fabricated social proof or target comparisons.
