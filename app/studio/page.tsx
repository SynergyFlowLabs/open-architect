import type { Metadata } from "next";
import Link from "next/link";
import { Wordmark } from "@/components/brand";

export const metadata: Metadata = {
  title: "Studio",
};

export default function StudioPage() {
  return (
    <>
      <header className="studio-header page-frame">
        <Wordmark />
        <Link className="text-link" href="/">
          Back to project
        </Link>
      </header>
      <main className="studio-foundation page-frame" id="main-content">
        <p className="section-label">Studio foundation</p>
        <h1>Room planner</h1>
        <p>
          The interactive editor is the next vertical slice in the current delivery plan.
        </p>
      </main>
    </>
  );
}
