package com.planner5d.library.wizard.factory

import com.planner5d.library.wizard.model.WizardRoom
import com.planner5d.library.math.Vector2
import com.planner5d.library.wizard.WizardRoomBuilder
import com.planner5d.library.wizard.model.WizardWallColor

class TetrisRoomFactory(private val builder: WizardRoomBuilder) : RoomFactory {

	override fun create(): WizardRoom {
		val w0 = builder.addWall(Vector2(0f, 0f), Vector2(150f, 0f), WizardWallColor.Yellow)
			.addWindow("126", 75, 85)
		val w1 = builder.addWall(Vector2(150f, 0f), Vector2(150f, -100f), WizardWallColor.Purple)
		val w2 = builder.addWall(Vector2(150f, -100f), Vector2(350f, -100f))
		val w3 = builder.addWall(Vector2(350f, -100f), Vector2(350f, 0f), WizardWallColor.Purple)
		val w4 = builder.addWall(Vector2(350f, 0f), Vector2(500f, 0f), WizardWallColor.Green)
			.addWindow("126", 75, 85)
		val w5 = builder.addWall(Vector2(500f, 0f), Vector2(500f, 400f), WizardWallColor.Blue)
		val w6 = builder.addWall(Vector2(500f, 400f), Vector2(0f, 400f))
			.addDoor("122", 400, 0)
		val w7 = builder.addWall(Vector2(0f, 400f), Vector2(0f, 0f), WizardWallColor.Blue)

		return builder.addConstraint(w0, w6, 150, 600, WizardWallColor.Blue)
			.addConstraint(w1, w7, 90, 300, WizardWallColor.Yellow)
			.addConstraint(w3, w5, 90, 300, WizardWallColor.Green)
			.addConstraint(w0, w2, 60, 200, WizardWallColor.Purple)
			.build()
	}

}