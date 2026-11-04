package com.planner5d.library.wizard.factory

import com.planner5d.library.wizard.model.WizardRoom
import com.planner5d.library.math.Vector2
import com.planner5d.library.wizard.WizardRoomBuilder
import com.planner5d.library.wizard.model.WizardWallColor

class RectangleRoomFactory(private val builder: WizardRoomBuilder) : RoomFactory {

	override fun create(): WizardRoom {
		val w0 = builder.addWall(Vector2(0f, 0f), Vector2(510f, 0f), WizardWallColor.Orange)
			.addWindow("210", 250, 85)
		val w1 = builder.addWall(Vector2(510f, 0f), Vector2(510f, 300f), WizardWallColor.Blue)
		val w2 = builder.addWall(Vector2(510f, 300f), Vector2(0f, 300f), WizardWallColor.Orange)
			.addDoor("122", 400, 0)
		val w3 = builder.addWall(Vector2(0f, 300f), Vector2(0f, 0f), WizardWallColor.Blue)

		return builder.addConstraint(w0, w2, 200, 600, WizardWallColor.Blue)
			.addConstraint(w1, w3, 250, 600, WizardWallColor.Orange)
			.build()
	}

}