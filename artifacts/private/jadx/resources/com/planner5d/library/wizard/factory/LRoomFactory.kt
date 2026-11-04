package com.planner5d.library.wizard.factory

import com.planner5d.library.wizard.model.WizardRoom
import com.planner5d.library.math.Vector2
import com.planner5d.library.wizard.WizardRoomBuilder
import com.planner5d.library.wizard.model.WizardWallColor

class LRoomFactory(private val builder: WizardRoomBuilder) : RoomFactory {

	override fun create(): WizardRoom {
		val w0 = builder.addWall(Vector2(0f, 0f), Vector2(290f, 0f), WizardWallColor.Orange)
		val w1 = builder.addWall(Vector2(290f, 0f), Vector2(290f, 210f), WizardWallColor.Blue)
			.addWindow("209", 105, 85)
		val w2 = builder.addWall(Vector2(290f, 210f), Vector2(540f, 210f), WizardWallColor.Purple)
		val w3 = builder.addWall(Vector2(540f, 210f), Vector2(540f, 500f), WizardWallColor.Green)
			.addWindow("209", 140, 85)
		val w4 = builder.addWall(Vector2(540f, 500f), Vector2(0f, 500f))
			.addDoor("122", 400, 0)
		val w5 = builder.addWall(Vector2(0f, 500f), Vector2(0f, 0f), WizardWallColor.Yellow)

		return builder.addConstraint(w2, w0, 170, 300, WizardWallColor.Blue)
			.addConstraint(w1, w5, 150, 400, WizardWallColor.Orange)
			.addConstraint(w0, w4, 320, 600, WizardWallColor.Yellow)
			.addConstraint(w1, w3, 60, 300, WizardWallColor.Purple)
			.addConstraint(w4, w2, 150, 300, WizardWallColor.Green)
			.build()
	}

}