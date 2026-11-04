package com.planner5d.library.wizard

import com.planner5d.library.math.Vector2
import com.planner5d.library.wizard.model.WizardDoorWindow
import com.planner5d.library.wizard.model.WizardRoom
import com.planner5d.library.wizard.model.WizardRoomWall
import com.planner5d.library.wizard.model.WizardRoomWallConstraint
import com.planner5d.library.wizard.model.WizardWallColor

class WizardRoomBuilder {

	private val wallsConstructions: MutableList<WallConstructionBuilder> = mutableListOf()
	private val constraints: MutableList<WizardRoomWallConstraint> = mutableListOf()


	fun reset() {
		wallsConstructions.clear()
		constraints.clear()
	}

	fun addWall(
		start: Vector2, end: Vector2, color: WizardWallColor? = null
	): WallConstructionBuilder {
		val wallConstruction =
			WizardWallBuilder(WizardRoomWall(start, end, color, wallsConstructions.size, null))
		wallsConstructions.add(wallConstruction)
		return wallConstruction
	}

	fun addConstraint(
		wall1: WallConstructionBuilder, wall2: WallConstructionBuilder, distanceMinimum: Int,
		distanceMaximum: Int, color: WizardWallColor
	): WizardRoomBuilder {
		constraints.add(
			WizardRoomWallConstraint(
				wall1.getWall(), wall2.getWall(), distanceMinimum, distanceMaximum, color
			)
		)
		return this
	}

	fun build(): WizardRoom {
		val walls: MutableList<WizardRoomWall> = mutableListOf()
		val doorsAndWindows: MutableList<WizardDoorWindow> = mutableListOf()
		val constraintList = constraints.toList()

		wallsConstructions.iterator().forEach {
			walls.add(it.getWall())
			doorsAndWindows.addAll(it.getItems())
		}
		reset()

		return WizardRoom(walls, constraintList, doorsAndWindows)
	}
}