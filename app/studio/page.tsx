import type { Metadata } from "next";
import { Wordmark } from "@/components/brand";
import { RoomPlanner } from "@/components/planner/room-planner";

export const metadata: Metadata = {
  title: "Studio",
  description: "Draft and export a local room plan in your browser.",
};

export default function StudioPage() {
  return <RoomPlanner brand={<Wordmark />} />;
}
