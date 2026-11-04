package com.planner5d.library.wizard

import com.planner5d.library.wizard.model.WizardDoorWindow
import com.planner5d.library.wizard.model.WizardRoomWall

interface WallConstructionBuilder {

	/**
	 * @param id door catalog item id
	 * @param position on line of wall, counting from start of wall
	 * @param height door above ground (or Z)
	 */
	fun addDoor(id: String, position: Int, height: Int): WallConstructionBuilder

	/**
	 * @param id window catalog item id
	 * @param position on line of wall, counting from start of wall
	 * @param height door above ground (or Z)
	 */
	fun addWindow(id: String, position: Int, height: Int): WallConstructionBuilder

	fun getWall(): WizardRoomWall

	fun getItems(): List<WizardDoorWindow>

}