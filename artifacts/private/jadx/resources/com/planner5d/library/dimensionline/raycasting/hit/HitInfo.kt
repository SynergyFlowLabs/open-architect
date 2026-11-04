package com.planner5d.library.dimensionline.raycasting.hit

import com.planner5d.library.dimensionline.raycasting.RaycastingTarget
import com.planner5d.library.math.Vector2

data class HitInfo(
	val origin: Vector2,
	val point: Vector2,
	val distance: Float,
	val targetAngle: Float,
	val orthogonal: Boolean,
	val reference: RaycastingTarget?
)