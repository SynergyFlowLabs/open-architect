package com.planner5d.library.wizard.model

class WizardRoomWallConstraint(
	val wall0: WizardRoomWall, val wall1: WizardRoomWall, val distanceMinimum: Int,
	val distanceMaximum: Int, val color: WizardWallColor
) {

	lateinit var mainWall: WizardRoomWall
	lateinit var relatedWall: WizardRoomWall
	var growMainToEnd: Boolean = false

	fun tieConstraint(mainWall: WizardRoomWall, relatedWall: WizardRoomWall, growMainToEnd: Boolean) {
		this.mainWall = mainWall
		this.relatedWall = relatedWall
		this.growMainToEnd = growMainToEnd
		mainWall.setConstraint(this)
	}
}