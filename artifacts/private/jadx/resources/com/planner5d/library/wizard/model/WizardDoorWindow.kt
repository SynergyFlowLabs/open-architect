package com.planner5d.library.wizard.model

import com.planner5d.library.math.Vector2

data class WizardDoorWindow(
	val id: String, val position: Vector2, val elevation: Float, val isDoor: Boolean,
	val wall: WizardRoomWall
)