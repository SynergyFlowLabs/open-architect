package com.planner5d.library.walls

import com.planner5d.library.math.LineSegment
import com.planner5d.library.math.Vector2

/**
 * Update new top line, if it intersects with end side of previous or start side of next line
 */
class WallsBuilderProcessorSideIntersections : WallsBuilderProcessor {

	override fun process(
		previous: WallsBuilderStateWall?, center: WallsBuilderStateWall, next: WallsBuilderStateWall?, temp: Vector2
	) {
		var topEnd = center.info.top.end
		var topStart = center.info.top.start
		if (previous != null && previous.infoDefault.top.end == previous.info.top.end) {
			val intersection = previous.info.end[0].intersectionSegmentWithLine(center.infoDefault.top)
			if (intersection !== LineSegment.INTERSECTION_NONE) {
				topStart = intersection
			}
		}
		if (next != null && next.infoDefault.top.start == next.info.top.start) {
			val intersection = next.info.start[0].intersectionSegmentWithLine(center.infoDefault.top)
			if (intersection !== LineSegment.INTERSECTION_NONE) {
				topEnd = intersection
			}
		}
		if (
			(topEnd != center.info.top.end || topStart != center.info.top.start) &&
			!(temp.set(topEnd).sub(topStart).nor().isCollinearOpposite(center.info.top.direction))
		) {
			center.setNew(LineSegment(topStart, topEnd), center.info.bottom)
		}
	}

}
