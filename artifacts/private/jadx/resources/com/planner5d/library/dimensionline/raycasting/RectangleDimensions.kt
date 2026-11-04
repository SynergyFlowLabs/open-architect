package com.planner5d.library.dimensionline.raycasting

import com.planner5d.library.dimensionline.raycasting.hit.HitInfo
import com.planner5d.library.dimensionline.dimensions.Rectangle2D
import com.planner5d.library.dimensionline.raycasting.hit.HitsCollector
import com.planner5d.library.math.Ray
import com.planner5d.library.math.epsilonEquals
import kotlin.math.PI

class RectangleDimensions {
	private val rayCaster2D: Raycaster2D = Raycaster2D()
	private val sideRaysBuilder: SideRaysBuilder = SideRaysBuilder()
	private val cornerRaysBuilder: CornerRaysBuilder = CornerRaysBuilder()
	
	companion object {

		/**
		 * In degrees
		 */
		private const val EPSILON = 1.1f

	}

	fun cast(rect: Rectangle2D, targets: List<TargetShape>): List<HitInfo> {
		val hits = HitsCollector()
		if (isRectAligned(rect)) {
			hits.addHits(castRays(sideRaysBuilder.getRays(rect), targets))
		} else {
			hits.addHits(hits.removeNonOrthogonal(castRays(cornerRaysBuilder.getRays(rect), targets)))
			hits.replaceHits(castRays(sideRaysBuilder.getRays(rect), targets))
		}
		return hits.get()
	}

	private fun castRays(rays: List<Ray>, targets: List<TargetShape>): List<HitInfo> {
		return rays.mapNotNull { ray -> castRay(ray, targets) }
	}

	private fun castRay(ray: Ray, targets: List<TargetShape>): HitInfo? {
		val hits: List<HitInfo> = targets.mapNotNull { castRayToTarget(ray, it) }
		if (hits.isEmpty()) {
			return null
		}
		return getClosestHit(hits)
	}

	private fun castRayToTarget(ray: Ray, target: TargetShape): HitInfo? {
		return when (target) {
			is RaycastingRectangle -> {
				rayCaster2D.calculateRayRectangleIntersection(ray, target)
			}

			is RaycastingSegment -> {
				rayCaster2D.calculateRaySegmentIntersection(ray, target)
			}

			else -> {
				throw Exception("Unknown cast target type")
			}
		}
	}

	private fun getClosestHit(hits: List<HitInfo>): HitInfo? = hits.minByOrNull { it.distance }

	private fun isRectAligned(rect: Rectangle2D): Boolean {
		return epsilonEquals(((rect.angle % (PI / 2)) / PI).toFloat() * 180, 0f, EPSILON)
	}
}