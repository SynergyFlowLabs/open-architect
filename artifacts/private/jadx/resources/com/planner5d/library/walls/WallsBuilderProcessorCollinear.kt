package com.planner5d.library.walls

import com.planner5d.library.math.LineSegment
import com.planner5d.library.math.Vector2

/**
 * Processor that handles collinear walls and properly forms their joint
 */
class WallsBuilderProcessorCollinear : WallsBuilderProcessor {

	override fun process(
		previous: WallsBuilderStateWall?, center: WallsBuilderStateWall, next:WallsBuilderStateWall?, temp: Vector2
	) {
		previous?.let { process(it, center) }
		next?.let { process(center, it) }
	}

	/**
	 * We simply form proper joint between previous and next walls (if they are collinear)
	 *
	 * @param previous
	 * @param next
	 */
	private fun process(previous:WallsBuilderStateWall, next:WallsBuilderStateWall) {
		if (previous.info.middle.direction.isCollinear(next.info.middle.direction)) {
			if (next.info.wall.getWidth() > previous.info.wall.getWidth() && next.info.start.size == 1) {
				next.setNew(
					next.info.top, next.info.bottom, split(next.info.start[0], previous.info.wall.getWidth()), next.info.end
				)
			} else if (previous.info.wall.getWidth() > next.info.wall.getWidth() && previous.info.end.size == 1) {
				previous.setNew(
					previous.info.top, previous.info.bottom,
					previous.info.start, split(previous.info.end[0], next.info.wall.getWidth())
				)
			}
		}
	}

	/**
	 * Spilt line segment into one or more
	 *
	 * @param segment to split
	 * @param length at what length to split
	 *
	 * @return array of segments (might be 1 segment if length is outside of supplied segment)
	 */
	private fun split(segment:LineSegment, length:Float) : Array<LineSegment> =
		if (length <= 0 || length >= segment.length) {
			arrayOf(segment)
		} else {
			LineSegment.path(segment.start, Vector2(segment.direction).scl(length).add(segment.start), segment.end)
		}

}
