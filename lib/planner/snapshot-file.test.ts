import { describe, expect, it, vi } from "vitest";
import { createInitialPlannerState } from "./reducer";
import { serializeSnapshot } from "./snapshot";
import {
  MAX_SNAPSHOT_FILE_BYTES,
  parseSnapshotFile,
  type SnapshotFile,
} from "./snapshot-file";

function file(
  contents: string,
  size = contents.length,
): SnapshotFile & { text: ReturnType<typeof vi.fn> } {
  return {
    size,
    text: vi.fn().mockResolvedValue(contents),
  };
}

describe("parseSnapshotFile", () => {
  it("reads a valid versioned plan file", async () => {
    const state = createInitialPlannerState();
    const input = file(serializeSnapshot(state));

    await expect(parseSnapshotFile(input)).resolves.toEqual({ ok: true, state });
    expect(input.text).toHaveBeenCalledOnce();
  });

  it("rejects an oversized file without reading it", async () => {
    const input = file("not read", MAX_SNAPSHOT_FILE_BYTES + 1);

    await expect(parseSnapshotFile(input)).resolves.toEqual({
      ok: false,
      error: "Choose a plan JSON file smaller than 256 KB.",
    });
    expect(input.text).not.toHaveBeenCalled();
  });

  it("returns a useful error when file reading fails", async () => {
    const input = {
      size: 100,
      text: vi.fn().mockRejectedValue(new Error("read failed")),
    };

    await expect(parseSnapshotFile(input)).resolves.toEqual({
      ok: false,
      error: "The selected file could not be read. Try another file.",
    });
  });

  it("uses snapshot validation for file contents", async () => {
    await expect(parseSnapshotFile(file("{"))).resolves.toEqual({
      ok: false,
      error: "The snapshot is not valid JSON.",
    });
  });
});
