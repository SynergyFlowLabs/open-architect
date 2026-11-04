package com.planner5d.library.dimensionline.raycasting

import com.planner5d.library.dimensionline.raycasting.hit.AxisAlignedRectangleHitInfo
import com.planner5d.library.dimensionline.raycasting.hit.HitInfo
import com.planner5d.library.math.Ray
import com.planner5d.library.math.Vector2
import com.planner5d.library.math.epsilonEquals
import kotlin.math.PI
import kotlin.math.abs
import kotlin.math.acos
import kotlin.math.atan2
import kotlin.math.max
import kotlin.math.min

class Raycaster2D {
	
	private val EPSILON = 1.1f // in degrees

	/**
	 * @note keep in mind, that order of points does matter, ray direction and segment direction should produce
	 * negative cross product
	 */
	fun calculateRaySegmentIntersection(ray: Ray, segment: RaycastingSegment): HitInfo? {
		val segmentDirection = Vector2(segment.end).sub(segment.start)
		val determinant = ray.direction.x * -segmentDirection.y + segmentDirection.x * ray.direction.y
		if (determinant < 0) {
			val segmentParameter = (
				(segment.start.x - ray.origin.x) * -segmentDirection.y - -segmentDirection.x * (segment.start.y - ray.origin.y)
			) / determinant
			val rayParameter =
				(ray.direction.x * (segment.start.y - ray.origin.y) - (segment.start.x - ray.origin.x) * ray.direction.y) /
					determinant

			if (segmentParameter >= 0 && rayParameter >= 0 && rayParameter <= 1) {
				val intersectionPoint = Vector2(ray.origin).add(Vector2(ray.direction).scl(segmentParameter))
				val dot = ray.direction.dot(segmentDirection)
				val angle = normalizeAngle(acos(dot / segmentDirection.len()))
				return HitInfo(
					ray.origin, intersectionPoint, segmentParameter, angle, epsilonEquals(angle, 90f, EPSILON), segment.reference
				)
			}
		}

		return null
	}

	fun calculateRayRectangleIntersection(ray: Ray, rectangle: RaycastingRectangle): HitInfo? {
		val localRay = ray.transform(Vector2(rectangle.position).scl(-1f), -rectangle.angle)
		val result = rayCastAxisAlignedRectangle(localRay, rectangle.size.x, rectangle.size.y) ?: return null
		return HitInfo(
			ray.origin, Vector2(ray.origin).add(Vector2(ray.direction).scl(result.enterParameter)),
			result.enterParameter, result.angleToTarget,
			epsilonEquals(result.angleToTarget, 90f, EPSILON),
			rectangle.reference
		)
	}

	private fun rayCastAxisAlignedRectangle(ray: Ray, width: Float, height: Float): AxisAlignedRectangleHitInfo? {
		val tXmin = getTx(ray, -width / 2)
		val tXmax = getTx(ray, width / 2)
		val tYmin = getTy(ray, -height / 2)
		val tYmax = getTy(ray, height / 2)

		val tEnter = max(min(tXmin, tXmax), min(tYmin, tYmax))
		val tExit = min(max(tXmin, tXmax), max(tYmin, tYmax))

		val hit = tExit >= tEnter && tExit >= 0 && tEnter >= 0
		if (!hit) {
			return null
		}

		val angle = if (tEnter == tXmin || tEnter == tXmax) {
			atan2(ray.direction.x, ray.direction.y)
		} else {
			atan2(ray.direction.y, ray.direction.x)
		}

		return AxisAlignedRectangleHitInfo(tEnter, normalizeAngle(angle))
	}

	private fun normalizeAngle(angle: Float): Float = ((abs(angle % PI) / PI) * 180).toFloat()

	private fun getTx(ray: Ray, x: Float): Float = (x - ray.origin.x) / ray.direction.x

	private fun getTy(ray: Ray, y: Float): Float = (y - ray.origin.y) / ray.direction.y
}