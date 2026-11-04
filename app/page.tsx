import Link from "next/link";
import { PlanIllustration, Wordmark } from "@/components/brand";

const capabilities = [
  {
    title: "Add a room",
    description: "Start with a rectangular space and a name that makes sense to you.",
  },
  {
    title: "Adjust the proportions",
    description: "Edit width, depth, and position in metres with immediate visual feedback.",
  },
  {
    title: "Move without a mouse",
    description: "Use the position fields or direction buttons as an alternative to dragging.",
  },
  {
    title: "Keep your draft",
    description: "Save in your browser, then export or re-import the plan as JSON when you want a copy.",
  },
];

export default function HomePage() {
  return (
    <>
      <header className="site-header page-frame">
        <Wordmark />
        <nav aria-label="Main navigation" className="site-nav">
          <Link href="/studio">Studio</Link>
          <a href="#principles">Principles</a>
        </nav>
      </header>

      <main id="main-content">
        <section className="hero page-frame">
          <div className="hero-copy">
            <h1>Give your ideas room to take shape.</h1>
            <p className="hero-intro">
              Sketch rooms, adjust their proportions, and keep every plan on your own
              device. Open Architect is an original, local-first design workspace.
            </p>
            <div className="hero-actions">
              <Link className="button button-primary" href="/studio">
                Open the studio
              </Link>
              <a className="button button-secondary" href="#workflow">
                See how it works
              </a>
            </div>
            <p className="hero-note">No account or uploads required.</p>
          </div>
          <PlanIllustration />
        </section>

        <section className="workflow page-frame" id="workflow">
          <div className="section-heading">
            <h2>From empty grid to workable draft.</h2>
            <p>
              The first studio slice focuses on the essentials you can use and test today.
            </p>
          </div>
          <div className="capability-list">
            {capabilities.map((capability) => (
              <article key={capability.title}>
                <h3>{capability.title}</h3>
                <p>{capability.description}</p>
              </article>
            ))}
          </div>
        </section>

        <section className="principles" id="principles">
          <div className="principles-inner page-frame">
            <div>
              <h2>Your plan stays yours.</h2>
              <p>
                The studio stores drafts in this browser. There is no account, analytics,
                or project-owned server behind the scenes. Export a plan to keep a
                separate copy.
              </p>
            </div>
            <Link className="button button-on-dark" href="/studio">
              Start a local plan
            </Link>
          </div>
        </section>
      </main>

      <footer className="site-footer page-frame">
        <p>Open Architect is a working name for an independent project.</p>
        <p>Early web foundation. Target-specific workflows remain unverified.</p>
      </footer>
    </>
  );
}
