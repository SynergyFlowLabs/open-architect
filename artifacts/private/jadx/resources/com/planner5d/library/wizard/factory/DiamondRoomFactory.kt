package com.planner5d.library.wizard.factory

import com.planner5d.library.wizard.model.WizardRoom
import com.planner5d.library.math.Vector2
import com.planner5d.library.wizard.WizardRoomBuilder
import com.planner5d.library.wizard.model.WizardWallColor

class DiamondRoomFactory(private val builder: WizardRoomBuilder) : RoomFactory {

	override fun create(): WizardRoom {
		val w0 = builder.addWall(Vector2(0f, 0f), Vector2(337f, 0f), WizardWallColor.Yellow)
			.addWindow("210", 168, 85)
		val w1 = builder.addWall(Vector2(337f, 0f), Vector2(500f, 153f))
		val w2 = builder.addWall(Vector2(500f, 153f), Vector2(500f, 500f))
		val w3 = builder.addWall(Vector2(500f, 500f), Vector2(0f, 500f), WizardWallColor.Orange)
			.addDoor("122", 400, 0)
		val w4 = builder.addWall(Vector2(0f, 500f), Vector2(0f, 0f), WizardWallColor.Blue)

		return builder.addConstraint(w0, w3, 250, 600, WizardWallColor.Blue)
			.addConstraint(w2, w4, 430, 680, WizardWallColor.Orange)
			.addConstraint(w1, w4, 269, 518, WizardWallColor.Yellow)
			.build()
	}

}