package com.planner5d.library.wizard

import com.planner5d.library.math.Vector2
import com.planner5d.library.wizard.model.WizardDoorWindow
import com.planner5d.library.wizard.model.WizardRoomWall

class WizardWallBuilder(private val wall: WizardRoomWall) : WallConstructionBuilder {

	private val items = mutableListOf<WizardDoorWindow>()

	override fun addDoor(id: String, position: Int, height: Int): WallConstructionBuilder {
		items.add(
			WizardDoorWindow(
				id, Vector2(wall.end).sub(wall.start).setLength(position.toFloat()).add(wall.start),
				height.toFloat(), true, wall
			)
		)
		return this
	}

	override fun addWindow(id: String, position: Int, height: Int): WallConstructionBuilder {
		items.add(
			WizardDoorWindow(
				id, Vector2(wall.end).sub(wall.start).setLength(position.toFloat()).add(wall.start),
				height.toFloat(), false, wall
			)
		)
		return this
	}

	override fun getWall(): WizardRoomWall = wall

	override fun getItems(): List<WizardDoorWindow> = items
}