package com.planner5d.library.wizard.factory

import com.planner5d.library.wizard.model.WizardRoom

interface RoomFactory {

	fun create(): WizardRoom
}