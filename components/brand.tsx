import Link from "next/link";

export function BrandMark({ size = 36 }: { size?: number }) {
  return (
    <svg
      aria-hidden="true"
      className="brand-mark"
      height={size}
      viewBox="0 0 40 40"
      width={size}
    >
      <path d="M4 4h32v32H4zM4 19h15M19 4v23M13 19v17M19 27h17" />
      <path className="brand-mark-accent" d="M24 9h6v5h-6zM8 24h3v7H8z" />
    </svg>
  );
}

export function Wordmark({ inverse = false }: { inverse?: boolean }) {
  return (
    <Link className={`wordmark${inverse ? " wordmark-inverse" : ""}`} href="/">
      <BrandMark />
      <span>Open Architect</span>
    </Link>
  );
}

export function PlanIllustration() {
  return (
    <figure className="hero-plan">
      <svg
        aria-labelledby="hero-plan-title hero-plan-description"
        role="img"
        viewBox="0 0 640 500"
      >
        <title id="hero-plan-title">An original example room plan</title>
        <desc id="hero-plan-description">
          A studio, kitchen, reading nook, and courtyard arranged on a measured grid.
        </desc>
        <defs>
          <pattern height="25" id="hero-grid" patternUnits="userSpaceOnUse" width="25">
            <path d="M25 0H0V25" fill="none" stroke="currentColor" strokeWidth="0.7" />
          </pattern>
        </defs>
        <rect className="hero-plan-paper" height="500" width="640" />
        <rect className="hero-plan-grid" height="500" width="640" fill="url(#hero-grid)" />
        <g className="hero-room hero-room-main">
          <path d="M100 75H350V275H100z" />
          <text x="124" y="112">STUDIO</text>
          <text className="hero-plan-measure" x="124" y="139">5.0 × 4.0 m</text>
        </g>
        <g className="hero-room hero-room-secondary">
          <path d="M350 75H540V210H350z" />
          <text x="374" y="112">KITCHEN</text>
          <text className="hero-plan-measure" x="374" y="139">3.8 × 2.7 m</text>
        </g>
        <g className="hero-room hero-room-quiet">
          <path d="M100 275H275V425H100z" />
          <text x="124" y="312">READING</text>
          <text className="hero-plan-measure" x="124" y="339">3.5 × 3.0 m</text>
        </g>
        <g className="hero-courtyard">
          <path d="M305 245H540V425H305z" />
          <path d="M335 395c30-55 55-55 85 0s55 55 85 0" fill="none" />
          <text x="329" y="282">COURTYARD</text>
        </g>
        <path className="hero-plan-door" d="M275 390h35M275 390a35 35 0 0 1 35-35M350 175h30M350 175a30 30 0 0 0 30 30" />
        <g className="hero-plan-scale">
          <path d="M100 460h100M100 454v12M150 454v12M200 454v12" />
          <text x="214" y="465">2 m</text>
        </g>
      </svg>
      <figcaption>
        <span>Concept plan 01</span>
        <span>20.0 m² studio</span>
      </figcaption>
    </figure>
  );
}
