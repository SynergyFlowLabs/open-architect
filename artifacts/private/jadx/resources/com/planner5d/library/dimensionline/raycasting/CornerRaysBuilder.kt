package com.planner5d.library.dimensionline.raycasting

import com.planner5d.library.dimensionline.dimensions.Rectangle2D
import com.planner5d.library.math.Ray
import com.planner5d.library.math.Vector2

class CornerRaysBuilder {
	fun getRays(rect: Rectangle2D): List<Ray> {
		val points: List<Vector2> = listOf(
			Vector2(rect.size.x / 2, rect.size.y / 2).rotateRad(rect.angle),
			Vector2(-rect.size.x / 2, rect.size.y / 2).rotateRad(rect.angle),
			Vector2(rect.size.x / 2, -rect.size.y / 2).rotateRad(rect.angle),
			Vector2(-rect.size.x / 2, -rect.size.y / 2).rotateRad(rect.angle)
		)
		val minXPoint = points.fold(Vector2(Float.MIN_VALUE, 0f)) { 
			max: Vector2, cur: Vector2 -> (if (cur.x > max.x) cur else max) 
		}
		val maxXPoint = points.fold(Vector2(Float.MAX_VALUE, 0f)) { 
			max: Vector2, cur: Vector2 -> (if (cur.x < max.x) cur else max) 
		}
		val minYPoint = points.fold(Vector2(0f, Float.MIN_VALUE)) { 
			max: Vector2, cur: Vector2 -> (if (cur.y > max.y) cur else max) 
		}
		val maxYPoint = points.fold(Vector2(0f, Float.MAX_VALUE)) { 
			max: Vector2, cur: Vector2 -> (if (cur.y < max.y) cur else max) 
		}
		return listOf(
			Ray(minXPoint.add(rect.position), Vector2(1f, 0f)),
			Ray(maxXPoint.add(rect.position), Vector2(-1f, 0f)),
			Ray(minYPoint.add(rect.position), Vector2(0f, 1f)),
			Ray(maxYPoint.add(rect.position), Vector2(0f, -1f))
		)
	}
}