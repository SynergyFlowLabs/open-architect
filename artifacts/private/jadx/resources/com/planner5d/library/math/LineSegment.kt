package com.planner5d.library.math

import kotlin.math.cos

/**
 * Class for easier work with line segments (and in some cases lines)
 *
 * @param start point of line segment
 * @param end point of line segment
 */
class LineSegment(start: Vector2, end: Vector2) {

	companion object {

		/**
		 * Value used to inform that there is no intersection
		 *
		 * ! Use === for comparison on Kotlin
		 */
		val INTERSECTION_NONE = Vector2()

		/**
		 * Create path of line segments from supplied points
		 *
		 * @param points points from which line will be formed
		 *
		 * @return path from line segments
		 */
		fun path(vararg points: Vector2) : Array<LineSegment> =
			Array(points.size - 1) { LineSegment(points[it], points[it + 1]) }


		/**
		 * Project point onto vector, also limit projection length
		 */
		fun project(point: Vector2, vector: Vector2, min:Float, max:Float) : Float =
			clamp(project(point, vector), min, max)

		/**
		 * Project point onto vector
		 */
		fun project(point: Vector2, vector: Vector2) : Float = cos(vector.angleRad(point)) * point.len()

		fun project(point: Vector2, lineStart: Vector2, lineEnd: Vector2): Float {
			return project(
				Vector2(point).sub(lineStart), Vector2(
					lineEnd
				).sub(lineStart))
		}

		/** Intersects the two lines and returns the intersection point in intersection.
		 *
		 * @param p1 first point of the first line
		 * @param p2 second point of the first line
		 * @param p3 first point of the second line
		 * @param p4 second point of the second line
		 *
		 * @return intersection or INTERSECTION_NONE
		 */
		fun intersectLines(p1: Vector2, p2: Vector2, p3: Vector2, p4: Vector2) : Vector2 {
			val x2SubX1 = p2.x - p1.x
			val y2SubY1 = p2.y - p1.y
			val x4SubX3 = p4.x - p3.x
			val y4SubY3 = p4.y - p3.y
			val d = y4SubY3 * x2SubX1 - x4SubX3 * y2SubY1
			if (d == 0f) {
				return INTERSECTION_NONE
			}
			return Vector2(x2SubX1, y2SubY1).scl((x4SubX3 * (p1.y - p3.y) - y4SubY3 * (p1.x - p3.x)) / d)
				.add(p1)
		}

		/**
		 * Intersects the two line segments and returns the intersection point in intersection.
		 *
		 * @param p1 first point of the first line segment
		 * @param p2 second point of the first line segment
		 * @param p3 first point of the second line segment
		 * @param p4 second point of the second line segment
		 *
		 * @return intersection or INTERSECTION_NONE
		 */
		fun intersectSegments(p1: Vector2, p2: Vector2, p3: Vector2, p4: Vector2) : Vector2 {
			val x2SubX1 = p2.x - p1.x
			val y2SubY1 = p2.y - p1.y
			val x4SubX3 = p4.x - p3.x
			val y4SubY3 = p4.y - p3.y
			val d = y4SubY3 * x2SubX1 - x4SubX3 * y2SubY1
			if (d == 0f) {
				return INTERSECTION_NONE
			}
			val yd = p1.y - p3.y
			val xd = p1.x - p3.x
			val ua = (x4SubX3 * yd - y4SubY3 * xd) / d
			if (ua < 0 || ua > 1) {
				return INTERSECTION_NONE
			}
			val ub = (x2SubX1 * yd - y2SubY1 * xd) / d
			if (ub < 0 || ub > 1) {
				return INTERSECTION_NONE
			}
			return Vector2(
				p1.x + x2SubX1 * ua,
				p1.y + y2SubY1 * ua
			)
		}

		fun clamp(value:Float, min:Float, max:Float) : Float {
			if (value < min) return min
			return if (value > max) max else value
		}

	}

	/**
	 * Start point of line segment
	 */
	val start = Vector2(start)

	/**
	 * End point of line segment
	 */
	val end = Vector2(end)

	/**
	 * Line segment direction (normalized)
	 */
	val direction: Vector2 = Vector2(
		end
	).sub(start).nor()

	/**
	 * Line segment length
	 */
	val length:Float = start.dst(end)

	/**
	 * Create copy of other line segment
	 *
	 * @param line other segment
	 */
	constructor(line:LineSegment) : this(line.start, line.end)

	override fun toString() = "LineSegment($start -> $end, direction=$direction length=$length)"

	/**
	 * Returns this line and other line intersection point or INTERSECTION_NONE
	 *
	 * @param line other line
	 *
	 * @return intersection point or INTERSECTION_NONE
	 */
	fun intersectionWithLine(line:LineSegment) : Vector2 =
		intersectLines(start, end, line.start, line.end)

	/**
	 * Returns this segment and other line intersection point or INTERSECTION_NONE
	 *
	 * @param line other line
	 *
	 * @return intersection point or INTERSECTION_NONE
	 */
	fun intersectionSegmentWithLine(line: LineSegment) : Vector2 {
		val intersection = intersectionWithLine(line)
		if (intersection !== INTERSECTION_NONE) {
			val direction = Vector2(intersection).sub(start)
			if (direction.len() <= length && this.direction.hasSameDirection(direction)) {
				return intersection
			}
		}
		return INTERSECTION_NONE
	}

	/**
	 * Returns this segment and other segment intersection point or INTERSECTION_NONE
	 *
	 * @param segment other line
	 *
	 * @return intersection point or INTERSECTION_NONE
	 */
	fun intersectionWithSegment(segment:LineSegment) : Vector2 =
		intersectSegments(start, end, segment.start, segment.end)

	/**
	 * Project point onto line segment
	 *
	 * @param point to project
	 *
	 * @return projection
	 */
	fun project(point: Vector2) : Float = project(point, true)

	/**
	 * Project point onto line segment
	 *
	 * @param point to project
	 * @param clamp if true it will clamp value to projection that is on segment
	 *
	 * @return projection
	 */
	fun project(point: Vector2, clamp:Boolean) : Float {
		val projection = project(point, start, end)
		return if (clamp) clamp(projection, 0f, length) else projection
	}

}
