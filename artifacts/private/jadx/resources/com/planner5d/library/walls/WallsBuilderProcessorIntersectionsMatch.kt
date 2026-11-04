package com.planner5d.library.walls

import com.planner5d.library.math.LineSegment
import com.planner5d.library.math.Vector2

/**
 * Make sure that top point of previous and center wall is at same places
 *
 * It is used to fix issue when there are there one wall goes out through start or end side of wall, in similar cases:
 * Thin wall (~30°), thick wall (0°), thin wall (~-30°)
 *
 * ! This processor should be used after intersections processor because this processor only checks
 * and fixes top side of wall if it has one of points at default location
 */
class WallsBuilderProcessorIntersectionsMatch : WallsBuilderProcessor {

	override fun process(
		previous: WallsBuilderStateWall?, center: WallsBuilderStateWall, next: WallsBuilderStateWall?, temp: Vector2
	) {
		if (
			previous != null &&
			(previous.info.top.end == previous.infoDefault.top.end || center.info.top.start == center.infoDefault.top.start)
		) {
			previous.setNew(LineSegment(previous.info.top.start, previous.infoDefault.top.end), previous.info.bottom)
			center.setNew(LineSegment(center.infoDefault.top.start, center.info.top.end), center.info.bottom)
		}
	}

}