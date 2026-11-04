package com.planner5d.library.wizard.model

import com.planner5d.library.math.Vector2
import com.planner5d.library.wizard.RoomBuilderUtils

class WizardRoom(
	val walls: List<WizardRoomWall>, val constraints: List<WizardRoomWallConstraint>,
	val windowsAndDoors: List<WizardDoorWindow>
) {

	private val vectorTemp = Vector2()

	init {
		calculateConstraints()
	}

	private fun calculateConstraints() {
		constraints.iterator().forEach { constraint ->
			val main = getMainChangingWallForConstraint(constraint)
			main?.let {
				val opposite = getOppositeWall(main) ?: return@let
				val wallsBetweenCount = countWallsBetween(main, opposite)
				constraint.tieConstraint(
					main,
					opposite,
					wallsBetweenCount.first <= wallsBetweenCount.second
				)
			}
		}
	}

	fun getSetOfNeighbours(wall: WizardRoomWall) = mutableSetOf<WizardRoomWall>().apply {
		walls.iterator().forEach {
			if (it.hasPoint(wall.start) || it.hasPoint(wall.end)) {
				add(it)
			}
		}
	}

	fun getMainChangingWallForConstraint(constraint: WizardRoomWallConstraint): WizardRoomWall? =
		getSetOfNeighbours(constraint.wall0).intersect(getSetOfNeighbours(constraint.wall1))
			.firstOrNull()

	fun findAllParallelWallsForWall(wall: WizardRoomWall) = mutableSetOf<WizardRoomWall>().apply {
		walls.iterator().forEach {
			if (it.direction.isOnLine(wall.direction)) {
				add(it)
			}
			remove(wall)
		}
	}

	fun getOppositeWall(wall: WizardRoomWall): WizardRoomWall? {
		return if (
			wall.direction == vectorTemp.set(0f, 1f) || wall.direction == vectorTemp.set(0f, -1f)
		) {
			// horizontal
			findAllParallelWallsForWall(wall).maxByOrNull {
				RoomBuilderUtils.intersection(wall.start.y, wall.end.y, it.start.y, it.end.y)
			}
		} else {
			// vertical (we're ignoring the possibility of non-orthogonal walls for now)
			findAllParallelWallsForWall(wall).maxByOrNull {
				RoomBuilderUtils.intersection(wall.start.x, wall.end.x, it.start.x, it.end.x)
			}
		}
	}

	private fun nextWall(wall: WizardRoomWall) = walls.first { it.start == wall.end }

	private fun previousWall(wall: WizardRoomWall) = walls.first { it.end == wall.start }

	private fun countWallsBetween(wall0: WizardRoomWall, wall1: WizardRoomWall): Pair<Int, Int> {
		var fromStart = 0
		var fromEnd = 0
		var nextWall: WizardRoomWall = wall0
		while (nextWall != wall1) {
			fromEnd++
			nextWall = nextWall(nextWall)
		}
		nextWall = wall0
		while (nextWall != wall1) {
			fromStart++
			nextWall = previousWall(nextWall)
		}
		return fromStart to fromEnd
	}
}