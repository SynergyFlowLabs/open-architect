package com.planner5d.library.math

import kotlin.math.cos
import kotlin.math.sin

class Ray(val origin: Vector2, val direction: Vector2) {

	fun transform(translation: Vector2, angle: Float): Ray {
		val translatedOrigin = Vector2(origin.x + translation.x, origin.y + translation.y)
		return Ray(
			Vector2(
				translatedOrigin.x * cos(angle) - translatedOrigin.y * sin(angle),
				translatedOrigin.x * sin(angle) + translatedOrigin.y * cos(angle)
			),
			Vector2(
				direction.x * cos(angle) - direction.y * sin(angle),
				direction.x * sin(angle) + direction.y * cos(angle)
			)
		)
	}
}