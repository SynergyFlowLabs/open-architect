package com.planner5d.library.dimensionline.raycasting

import com.planner5d.library.dimensionline.dimensions.Rectangle2D
import com.planner5d.library.math.Vector2

class RaycastingRectangle(
	override var position: Vector2,
	override var size: Vector2,
	override var angle: Float, // in Radians
	override val reference: RaycastingTarget?
) : Rectangle2D, TargetShape