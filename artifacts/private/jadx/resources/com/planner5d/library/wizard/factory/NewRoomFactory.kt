package com.planner5d.library.wizard.factory

import com.planner5d.library.wizard.model.WizardRoom
import com.planner5d.library.math.Vector2
import com.planner5d.library.wizard.WizardRoomBuilder
import com.planner5d.library.wizard.model.WizardWallColor

class NewRoomFactory(private val builder: WizardRoomBuilder) : RoomFactory {

	override fun create(): WizardRoom {
		val w0 = builder.addWall(Vector2(5f, 23f), Vector2(103f, 23f), WizardWallColor.Blue)
		val w1 = builder.addWall(Vector2(103f, 23f), Vector2(192f, -93f)).addWindow("s/2012", 70, 70)
		val w2 = builder.addWall(Vector2(192f, -93f), Vector2(333f, -93f)).addWindow("s/2012", 70, 70)
		val w3 = builder.addWall(Vector2(333f, -93f), Vector2(421f, 23f)).addWindow("s/2012", 70, 70)
		val w4 = builder.addWall(Vector2(421f, 23f), Vector2(518f, 23f), WizardWallColor.Yellow)
		val w5 = builder.addWall(Vector2(518f, 23f), Vector2(518f, 392f), WizardWallColor.Orange)
		val w6 = builder.addWall(Vector2(518f, 392f), Vector2(5f, 392f)).addDoor("122", 400, 0)
		val w7 = builder.addWall(Vector2(5f, 392f), Vector2(5f, 23f), WizardWallColor.Orange)

		return builder.addConstraint(w1, w7, 90, 200, WizardWallColor.Blue)
			.addConstraint(w3, w5, 90, 200, WizardWallColor.Yellow)
			.addConstraint(w6, w0, 300, 500, WizardWallColor.Orange)
			.build()
	}

}