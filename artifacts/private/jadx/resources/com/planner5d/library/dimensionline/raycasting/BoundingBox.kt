package com.planner5d.library.dimensionline.raycasting

import com.planner5d.library.math.Vector2

class BoundingBox(val center: Vector2, val size: Vector2) {
	val minX: Float = center.x - size.x / 2f
	val maxX: Float = center.x + size.x / 2f
	val minY: Float = center.y - size.y / 2f
	val maxY: Float = center.y + size.y / 2f
}