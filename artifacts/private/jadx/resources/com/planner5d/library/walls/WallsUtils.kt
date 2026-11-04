package com.planner5d.library.walls

import com.planner5d.library.math.Vector2

object WallsUtils {

	private const val EPSILON = 0.00001f
	private val temp0 = Vector2()
	private val temp1 = Vector2()

	fun isClosedLoop(list: Array<Wall>): Boolean =
		list.size > 1 && isClosedLoop(list.first(), list.last())

	fun isClosedLoop(list: Array<WallsInfoWall>): Boolean = list.size > 1 &&
		isClosedLoop(list.first().wall, list.last().wall)

	fun isWallJointPointsMatching(previous: WallsInfoWall, current: WallsInfoWall): Boolean {
		if (previous.end.size != current.start.size) {
			return false
		}
		for (i in 0 until previous.end.size) {
			if (!previous.end[i].start.epsilonEquals(current.start[i].start, EPSILON) ||
				!previous.end[i].end.epsilonEquals(current.start[i].end, EPSILON)
			) {
				return false
			}
		}
		return true
	}

	fun addPoint(path: MutableList<Vector2>, point: Vector2) {
		if (path.isEmpty() || path[path.size - 1] !== point) {
			path.add(point)
		}
	}

	fun areConnected(start: WallsInfoWall?, end: WallsInfoWall?): Boolean =
		start != null && end != null && compareWallPoints(start.wall, true, end.wall, false, temp0, temp1)

	fun isTheSameWall(first: WallsInfoWall?, second: WallsInfoWall?): Boolean =
		first != null && second != null && (
			(compareWallPoints(first.wall, true, second.wall, false, temp0, temp1) &&
				compareWallPoints(first.wall, false, second.wall, true, temp0, temp1)) ||
				(compareWallPoints(first.wall, true, second.wall, true, temp0, temp1) &&
					compareWallPoints(first.wall, false, second.wall, false, temp0, temp1))
			)

	/**
	 * Because of issues in Windows 2 new instances of Vector2 are created for computations
	 */
	private fun isClosedLoop(start: Wall, end: Wall): Boolean =
		compareWallPoints(start, true, end, false, Vector2(), Vector2())

	private fun compareWallPoints(
		first: Wall, firstStartPoint: Boolean, second: Wall, secondStartPoint: Boolean,
		temp0: Vector2, temp1: Vector2
	) : Boolean	= first
		.getPoint(temp0, true, firstStartPoint).epsilonEquals(second.getPoint(temp1, true, secondStartPoint), EPSILON)

}
