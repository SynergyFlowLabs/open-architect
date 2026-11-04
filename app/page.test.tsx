import { render, screen } from "@testing-library/react";
import { describe, expect, it } from "vitest";
import HomePage from "./page";

describe("home page", () => {
  it("offers a clear path into the studio", () => {
    render(<HomePage />);

    expect(
      screen.getByRole("heading", {
        level: 1,
        name: "Give your ideas room to take shape.",
      }),
    ).toBeInTheDocument();
    expect(screen.getByRole("link", { name: "Open the studio" })).toHaveAttribute(
      "href",
      "/studio",
    );
    expect(screen.getByText("No account or uploads required.")).toBeInTheDocument();
  });
});
