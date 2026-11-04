package com.planner5d.library.wizard.factory

import com.planner5d.library.wizard.model.WizardRoom
import com.planner5d.library.math.Vector2
import com.planner5d.library.wizard.WizardRoomBuilder
import com.planner5d.library.wizard.model.WizardWallColor

class ShovelRoomFactory(private val builder: WizardRoomBuilder) : RoomFactory {

	override fun create(): WizardRoom {
		val w0 = builder.addWall(Vector2(10f, 23f), Vector2(147f, -93f)).addWindow("s/2012", 87, 70)
		val w1 = builder.addWall(Vector2(147f, -93f), Vector2(373f, -93f)).addWindow("s/2012", 111, 70)
		val w2 = builder.addWall(Vector2(373f, -93f), Vector2(510f, 23f)).addWindow("s/2012", 87, 70)
		val w3 = builder.addWall(Vector2(510f, 23f), Vector2(510f, 310f), WizardWallColor.Blue)
		val w4 = builder.addWall(Vector2(510f, 310f), Vector2(10f, 310f)).addDoor("122", 400, 0)
		val w5 = builder.addWall(Vector2(10f, 310f), Vector2(10f, 23f), WizardWallColor.Blue)

		return builder.addConstraint(w0, w4, 120, 600, WizardWallColor.Blue)
			.build()
	}

}