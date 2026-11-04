package com.planner5d.library.walls

import com.planner5d.library.math.Vector2
import com.planner5d.library.math.LineSegment

/**
 * Single wall build state, used for building WallsInfoWall
 *
 * This object has info field in which there will be new
 */
class WallsBuilderStateWall {

	/**
	 * New wall info
	 */
	internal var info: WallsInfoWall

	/**
	 * Default wall info (it should not be modified)
	 */
	internal val infoDefault: WallsInfoWall

	internal constructor(info: WallsBuilderStateWall) {
		infoDefault = info.infoDefault
		this.info = WallsInfoWall(info.info)
	}

	internal constructor(info: WallsInfoWall) {
		infoDefault = WallsInfoWall(info)
		this.info = createNew(info.top, info.bottom, info.start, info.end)
	}

	internal fun setNew(info:WallsBuilderStateWall) : WallsBuilderStateWall =
		setNew(info.info.top, info.info.bottom, info.info.start, info.info.end)

	internal fun setNew(top:LineSegment, bottom:LineSegment) : WallsBuilderStateWall = setNew(
		top, bottom, LineSegment.path(bottom.start, top.start), LineSegment.path(bottom.end, top.end)
	)

	internal fun setNew(
		top: LineSegment, bottom: LineSegment, start:Array<LineSegment>, end:Array<LineSegment>
	) : WallsBuilderStateWall = apply {
		info = createNew(top, bottom, start, end)
	}

	internal fun setNewEnd(bottomEnd: Vector2, topEnd: Vector2, corner: Vector2?) {
		val top = LineSegment(info.top.start, topEnd)
		val bottom = LineSegment(info.bottom.start, bottomEnd)
		corner?.takeIf { it != topEnd && it != bottomEnd }?.let {
			setNew(top, bottom, info.start, LineSegment.path(bottomEnd, it, topEnd))
		} ?: setNew(top, bottom, info.start, LineSegment.path(bottom.end, top.end))
	}

	internal fun setNewStart(bottomStart: Vector2, topStart: Vector2, corner: Vector2?) {
		val top = LineSegment(topStart, info.top.end)
		val bottom = LineSegment(bottomStart, info.bottom.end)
		corner?.takeIf { it != topStart  && it != bottomStart }?.let {
			setNew(top, bottom, LineSegment.path(bottomStart, it, topStart), info.end)
		} ?: setNew(top, bottom, LineSegment.path(bottom.start, top.start), info.end)
	}

	private fun createNew(
		top: LineSegment, bottom: LineSegment, start:Array<LineSegment>, end:Array<LineSegment>
	) = WallsInfoWall(infoDefault.wall, top, infoDefault.middle, bottom, start, end)

}
