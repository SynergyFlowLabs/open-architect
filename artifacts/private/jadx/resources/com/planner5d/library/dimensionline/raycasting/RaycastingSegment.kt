package com.planner5d.library.dimensionline.raycasting


import com.planner5d.library.math.Vector2

class RaycastingSegment(
	val start: Vector2, val end: Vector2, override val reference: RaycastingTarget?
) : TargetShape