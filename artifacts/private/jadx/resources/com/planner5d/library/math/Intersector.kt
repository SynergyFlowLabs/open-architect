package com.planner5d.library.math

import klipper.ClipType
import klipper.Paths
import klipper.PolyType
import klipper.calcArea

/**
 * ! This is port of com.badlogic.gdx.math.Intersector to Kotlin
 */
object Intersector {

	private val temp = Vector2()

	/** Intersects the two lines and returns the intersection point in intersection.
	 *
	 * @param p1 The first point of the first line
	 * @param p2 The second point of the first line
	 * @param p3 The first point of the second line
	 * @param p4 The second point of the second line
	 * @param intersection The intersection point
	 * @return Whether the two lines intersect
	 */
	fun intersectLines(p1: Vector2, p2: Vector2, p3: Vector2, p4: Vector2, intersection: Vector2?): Boolean {
		return intersectLines(p1.x, p1.y, p2.x, p2.y, p3.x, p3.y, p4.x, p4.y, intersection)
	}

	/** Intersects the two lines and returns the intersection point in intersection.
	 * @param intersection The intersection point, or null.
	 * @return Whether the two lines intersect
	 * https://github.com/libgdx/libgdx/blob/c52e126745301b1a2d521e5b4ac1265b254d8564/gdx/src/com/badlogic/gdx/math/Intersector.java#L950
	 */
	fun intersectLines(
		x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float, x4: Float, y4: Float, intersection: Vector2?
	): Boolean {
		val d = (y4 - y3) * (x2 - x1) - (x4 - x3) * (y2 - y1)
		if (d == 0f) return false
		if (intersection != null) {
			val ua = ((x4 - x3) * (y1 - y3) - (y4 - y3) * (x1 - x3)) / d
			intersection.set(x1 + (x2 - x1) * ua, y1 + (y2 - y1) * ua)
		}
		return true
	}

	/** Intersects the two line segments and returns the intersection point in intersection.
	 *
	 * @param p1 The first point of the first line segment
	 * @param p2 The second point of the first line segment
	 * @param p3 The first point of the second line segment
	 * @param p4 The second point of the second line segment
	 * @param intersection The intersection point (optional)
	 * @return Whether the two line segments intersect
	 */
	fun intersectSegments(p1: Vector2, p2: Vector2, p3: Vector2, p4: Vector2, intersection: Vector2?): Boolean {
		return intersectSegments(p1.x, p1.y, p2.x, p2.y, p3.x, p3.y, p4.x, p4.y, intersection)
	}

	/**
	 * @param intersection May be null
	 * https://github.com/libgdx/libgdx/blob/c52e126745301b1a2d521e5b4ac1265b254d8564/gdx/src/com/badlogic/gdx/math/Intersector.java#L1085
	 */
	fun intersectSegments(
		x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float, x4: Float, y4: Float,
		intersection: Vector2?
	): Boolean {
		val d = (y4 - y3) * (x2 - x1) - (x4 - x3) * (y2 - y1)
		if (d == 0f) return false
		val yd = y1 - y3
		val xd = x1 - x3
		val ua = ((x4 - x3) * yd - (y4 - y3) * xd) / d
		if (ua < 0 || ua > 1) return false
		val ub = ((x2 - x1) * yd - (y2 - y1) * xd) / d
		if (ub < 0 || ub > 1) return false
		intersection?.set(x1 + (x2 - x1) * ua, y1 + (y2 - y1) * ua)
		return true
	}

	/** Returns the distance between the given segment and point.
	 * https://github.com/libgdx/libgdx/blob/c52e126745301b1a2d521e5b4ac1265b254d8564/gdx/src/com/badlogic/gdx/math/Intersector.java#L259
	 * */
	fun distanceSegmentPoint(start: Vector2, end: Vector2, point: Vector2): Float =
		nearestSegmentPoint(start, end, point, temp).dst(point)

	/** Returns a point on the segment nearest to the specified point.  */
	fun nearestSegmentPoint(start: Vector2, end: Vector2, point: Vector2, nearest: Vector2): Vector2 {
		val length2 = start.dst2(end)
		if (length2 == 0f) return nearest.set(start)
		val t = ((point.x - start.x) * (end.x - start.x) + (point.y - start.y) * (end.y - start.y)) / length2
		if (t < 0) return nearest.set(start)
		return if (t > 1) nearest.set(end) else nearest.set(
			start.x + t * (end.x - start.x),
			start.y + t * (end.y - start.y)
		)
	}

	/** Returns true if the lines of the specified poygons intersect.
	 * https://github.com/libgdx/libgdx/blob/c52e126745301b1a2d521e5b4ac1265b254d8564/gdx/src/com/badlogic/gdx/math/Intersector.java#L224
	 * */
	fun intersectPolygonEdges(polygon1: FloatArray, polygon2: FloatArray): Boolean {
		val last1 = polygon1.size - 2
		val last2 = polygon2.size - 2
		var x1 = polygon1[last1]
		var y1 = polygon1[last1 + 1]
		var i = 0
		while (i <= last1) {
			val x2 = polygon1[i]
			val y2 = polygon1[i + 1]
			var x3 = polygon2[last2]
			var y3 = polygon2[last2 + 1]
			var j = 0
			while (j <= last2) {
				val x4 = polygon2[j]
				val y4 = polygon2[j + 1]
				if (intersectSegments(x1, y1, x2, y2, x3, y3, x4, y4, null)) return true
				x3 = x4
				y3 = y4
				j += 2
			}
			x1 = x2
			y1 = y2
			i += 2
		}
		return false
	}

	/** Returns true if the specified point is in the polygon.
	 * @param offset Starting polygon index.
	 * @param count Number of array indices to use after offset.
	 * https://github.com/libgdx/libgdx/blob/c52e126745301b1a2d521e5b4ac1265b254d8564/gdx/src/com/badlogic/gdx/math/Intersector.java#L129
	 */
	fun isPointInPolygon(polygon: FloatArray, offset: Int, count: Int, x: Float, y: Float): Boolean {
		var oddNodes = false
		val sx = polygon[offset]
		val sy = polygon[offset + 1]
		var y1 = sy
		var yi = offset + 3
		val n = offset + count
		while (yi < n) {
			val y2 = polygon[yi]
			if ((y2 < y && y1 >= y) || (y1 < y && y2 >= y)) {
				val x2 = polygon[yi - 1]
				if (x2 + (y - y2) / (y1 - y2) * (polygon[yi - 3] - x2) < x) oddNodes = !oddNodes
			}
			y1 = y2
			yi += 2
		}
		if (sy < y && y1 >= y || y1 < y && sy >= y) {
			if (sx + (y - sy) / (y1 - sy) * (polygon[yi - 3] - sx) < x) oddNodes = !oddNodes
		}
		return oddNodes
	}

	/** Returns true if the specified polygons intersect
	 * https://github.com/libgdx/libgdx/blob/c52e126745301b1a2d521e5b4ac1265b254d8564/gdx/src/com/badlogic/gdx/math/Intersector.java#L216
	 * */
	fun intersectPolygons(polygon1: FloatArray, polygon2: FloatArray): Boolean {
		if (isPointInPolygon(polygon1, 0, polygon1.size, polygon2[0], polygon2[1])) return true
		if (isPointInPolygon(polygon2, 0, polygon2.size, polygon1[0], polygon1[1])) return true
		return intersectPolygonEdges(polygon1, polygon2)
	}

	fun isOverlapping(polygonA:FloatArray, polygonB:FloatArray) : Boolean = clipper {
		val result = Paths()
		addPath(polygonA.clipperToPath(), PolyType.Subject, true)
		addPath(polygonB.clipperToPath(), PolyType.Clip, true)
		execute(ClipType.Intersection, result)
		result.sumOf { it.calcArea() } > 0
	}

}