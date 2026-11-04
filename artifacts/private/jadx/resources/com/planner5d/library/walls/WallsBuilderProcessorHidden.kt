package com.planner5d.library.walls

import com.planner5d.library.math.LineSegment
import com.planner5d.library.math.Vector2
import kotlin.math.round

/**
 * Make good looking wall ending if it is near hidden wall and has 90/270 angle with it
 */
class WallsBuilderProcessorHidden : WallsBuilderProcessor {

	override fun process(
		previous: WallsBuilderStateWall?, center: WallsBuilderStateWall, next: WallsBuilderStateWall?, temp: Vector2
	) {
		if (previous != null) {
			if (previous.info.wall.isHidden()) {
				if (!center.info.wall.isHidden()) {
					createDefaultStart(previous, center)
				}
			} else if (center.info.wall.isHidden()) {
				createDefaultEnd(previous, center)
			}
		}
		if (next != null) {
			if (center.info.wall.isHidden()) {
				if (!next.info.wall.isHidden()) {
					createDefaultStart(center, next)
				}
			} else if (next.info.wall.isHidden()) {
				createDefaultEnd(center, next)
			}
		}
	}

	private fun createDefaultEnd(center: WallsBuilderStateWall, next: WallsBuilderStateWall) {
		val angle:Int = getAngle(center, next)
		if (isNeededAngle(angle)) {
			val offset: Vector2 = Vector2(center.info.middle.direction)
				.scl((Wall.MINIMUM_WIDTH * (if (angle == 90) 1 else -1)).toFloat())
			val top = LineSegment(center.info.top.start, Vector2(center.infoDefault.top.end).add(offset))
			center.setNew(top, center.info.bottom, center.info.start, LineSegment.path(center.info.bottom.end, top.end))
			val bottom = LineSegment(top.end, next.info.bottom.end)
			next.setNew(next.info.top, bottom, LineSegment.path(bottom.start, next.info.top.start), next.info.end)
		}
	}

	private fun createDefaultStart(previous: WallsBuilderStateWall, center: WallsBuilderStateWall) {
		val angle:Int = getAngle(previous, center)
		if (isNeededAngle(angle)) {
			val offset: Vector2 = Vector2(center.info.middle.direction)
				.scl((Wall.MINIMUM_WIDTH * (if (angle == 90) -1 else 1)).toFloat())
			val top = LineSegment(Vector2(center.infoDefault.top.start).add(offset), center.info.top.end)
			center.setNew(
				top, center.info.bottom, LineSegment.path(center.info.bottom.start, top.start),
				center.info.end
			)
			val bottom = LineSegment(previous.info.bottom.start, top.start)
			previous.setNew(
				previous.info.top, bottom, previous.info.start, LineSegment.path(bottom.end, previous.info.top.end)
			)
		}
	}

	private fun isNeededAngle(angle:Int) : Boolean = angle % 90 == 0 && angle % 180 != 0

	private fun getAngle(wall0: WallsBuilderStateWall, wall1: WallsBuilderStateWall): Int =
		round(wall0.info.middle.direction.angle(wall1.info.middle.direction)).toInt()

}
