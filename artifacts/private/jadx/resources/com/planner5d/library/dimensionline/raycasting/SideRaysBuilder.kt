package com.planner5d.library.dimensionline.raycasting

import com.planner5d.library.dimensionline.dimensions.Rectangle2D
import com.planner5d.library.math.Ray
import com.planner5d.library.math.Vector2


class SideRaysBuilder {
	fun getRays(rect: Rectangle2D): List<Ray> = listOf(
		createSideRay(rect.size.x / 2, 0f, 1f, 0f, rect),
		createSideRay(0f, rect.size.y / 2, 0f, 1f, rect),
		createSideRay(-rect.size.x / 2, 0f, -1f, 0f, rect),
		createSideRay(0f, -rect.size.y / 2, 0f, -1f, rect)
	)

	private fun createSideRay(
		originX: Float, originY: Float, directionX: Float, directionY: Float, rect: Rectangle2D
	): Ray = Ray(
		Vector2(originX, originY).rotateRad(rect.angle).add(rect.position),
		Vector2(directionX, directionY).rotateRad(rect.angle)
	)
}