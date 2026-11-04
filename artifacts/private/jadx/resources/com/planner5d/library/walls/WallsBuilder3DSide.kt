package com.planner5d.library.walls

import com.planner5d.library.math.*
import kotlin.jvm.JvmField
import kotlin.math.max
import kotlin.math.min

class WallsBuilder3DSide {

	@JvmField
	val bottom: SideInfo

	@JvmField
	val top: SideInfo

	constructor(
		info: WallsInfo, wall: WallsInfoWall, holes: List<WallHole>, tessellator: Tessellator,
		rectanglesMerger: RectanglesMerger
	) {
		val holesOnTarget = mutableListOf<FloatArray>()
		val middle = wall.middle
		val target = LineSegment(
			Vector2(middle.direction).scl(max(middle.project(wall.top.start), middle.project(wall.bottom.start)))
				.add(middle.start),
			Vector2(middle.direction).scl(min(middle.project(wall.top.end), middle.project(wall.bottom.end)))
				.add(middle.start)
		)
		val origin = wall.wall.getOrigin(Vector2())
		val height = info.getHeight()
		for (holeInfo in holes) {
			val hole = getHolePolygon(target, origin, holeInfo, height)
			if (hole.isNotEmpty()) {
				holesOnTarget.add(hole)
			}
		}
		if (holesOnTarget.size > 1) {
			rectanglesMerger.mergeOverlapping(holesOnTarget).let {
				holesOnTarget.clear()
				holesOnTarget.addAll(it)
			}
		}
		bottom = SideInfo(wall, WallsInfoWall.Side.Bottom, height, target, holesOnTarget, tessellator)
		top = SideInfo(wall, WallsInfoWall.Side.Top, height, target, holesOnTarget, tessellator)
	}

	override fun equals(other: Any?): Boolean =
		other is WallsBuilder3DSide && top == other.top && bottom == other.bottom

	override fun toString() = "WallsBuilder3DSide(bottom=$bottom top=$top)"

	private fun getHolePolygon(target: LineSegment, origin: Vector2, hole: WallHole, height: Float): FloatArray {
		val bottom = clamp(hole.zInFloor, 0f, height)
		val top = clamp(hole.zInFloor + hole.height, 0f, height)
		if (top > bottom) {
			val vertices = hole.polygon2D
			var start = 0f
			var end = 0f
			var value: Float
			val temp = Vector2()
			for (i in 0 until 8 step 2) {
				value = target.project(temp.set(vertices[i], vertices[i + 1]).sub(origin), false)
				if (i == 0) {
					start = value
					end = value
				} else {
					start = start.coerceAtMost(value)
					end = end.coerceAtLeast(value)
				}
			}
			if (start < target.length && end >= 0 && start != end) {
				start = clamp(start, 0f, target.length)
				end = clamp(end, 0f, target.length)
				return floatArrayOf(start, bottom, start, top, end, top, end, bottom)
			}
		}
		return floatArrayOf()
	}

	class SideInfo {

		@JvmField
		val faces: FloatArray

		@JvmField
		val holes: Array<FloatArray>

		internal constructor(
			wall: WallsInfoWall, side: WallsInfoWall.Side, height: Float, target: LineSegment,
			holesOnTarget: List<FloatArray>, tessellator: Tessellator
		) {
			val segment = wall.getTopOrBottom(side)
			val length = segment.length
			this.holes = projectHolesToSide(holesOnTarget, segment.project(target.start))
			faces = tessellator.tessellate(
				floatArrayOf(0f, 0f, 0f, height, length, height, length, 0f), holes, side != WallsInfoWall.Side.Bottom
			)
		}

		override fun toString() = "SideInfo(faces=$faces holes=$holes)"

		private fun projectHolesToSide(holesOnTarget: List<FloatArray>, offset: Float): Array<FloatArray> =
			Array(holesOnTarget.size) {
				val holeOnTarget = holesOnTarget[it]
				val hole = FloatArray(holeOnTarget.size)
				var i = 0
				while (i < hole.size) {
					hole[i] = holeOnTarget[i] + offset
					hole[i + 1] = holeOnTarget[i + 1]
					i += 2
				}
				hole
			}

		override fun equals(other: Any?): Boolean {
			if (other is SideInfo) {
				return faces.contentEquals(other.faces) && arraysEqual(holes, other.holes)
			}
			return false
		}

		private fun arraysEqual(a: Array<FloatArray>, b: Array<FloatArray>): Boolean {
			if (a.size == b.size) {
				return false
			}
			for (i in a.indices) {
				if (!a[i].contentEquals(b[i])) {
					return false
				}
			}
			return true
		}

	}

}
