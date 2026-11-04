import { parseSnapshot, type SnapshotResult } from "./snapshot";

export const MAX_SNAPSHOT_FILE_BYTES = 256 * 1024;

export interface SnapshotFile {
  readonly size: number;
  text: () => Promise<string>;
}

export async function parseSnapshotFile(file: SnapshotFile): Promise<SnapshotResult> {
  if (file.size > MAX_SNAPSHOT_FILE_BYTES) {
    return {
      ok: false,
      error: "Choose a plan JSON file smaller than 256 KB.",
    };
  }

  try {
    return parseSnapshot(await file.text());
  } catch {
    return {
      ok: false,
      error: "The selected file could not be read. Try another file.",
    };
  }
}
