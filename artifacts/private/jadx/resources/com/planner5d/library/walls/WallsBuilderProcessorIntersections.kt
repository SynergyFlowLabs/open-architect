package com.planner5d.library.walls

import com.planner5d.library.math.LineSegment
import com.planner5d.library.math.Vector2
import kotlin.math.max

/**
 * Create wall by using intersections of old line and previous / next walls
 *
 * It will try to create new wall by using intersection of previous, current, next wall top, then bottom sides,
 * After new walls are create it will check if it can be used (it does not go further than maxDistance)
 */
class WallsBuilderProcessorIntersections(private val notClosed: Boolean) : WallsBuilderProcessor {

	override fun process(
		previous: WallsBuilderStateWall?, center: WallsBuilderStateWall, next: WallsBuilderStateWall?, temp: Vector2
	) {
		val maxDistance = max(
			max(previous?.infoDefault?.middle?.length ?: 0f, center.infoDefault.middle.length),
			next?.infoDefault?.middle?.length ?: 0f
		)
		center.setNew(
			createLineUsingIntersections(
				previous?.infoDefault?.top, center.infoDefault.top, next?.infoDefault?.top, maxDistance
			),
			createLineUsingIntersections(
				previous?.infoDefault?.bottom, center.infoDefault.bottom, next?.infoDefault?.bottom, maxDistance
			)
		)
	}

	/**
	 * Create new line by using intersections of old line and previous / next lines
	 *
	 * This method makes sure that new line will point to same direction, so new line can be:
	 * #1 can be shorter, but in this case new start / end point will not flip line around
	 * #2 can be longer to start and / or end (unlimited how much longer)
	 *
	 * New line is made of two points:
	 * - Start point: intersection of old line and previous line or old line start point
	 * - End point: intersection of old line and next line or old line end point
	 *
	 * @param previous - previous line
	 * @param line - old line
	 * @param next - next line
	 * @param maxDistance - limits how far intersection can be
	 *
	 * @return new line (in some cases it can have same points as old one)
	 */
	private fun createLineUsingIntersections(
		previous: LineSegment?, line:LineSegment, next: LineSegment?, maxDistance:Float
	): LineSegment {
		val start = LineSegment(
			line.start, usePointIfTargetTooFar(
				line.start,
				previous?.intersectionWithLine(line)
					.let { if (it === null || it === LineSegment.INTERSECTION_NONE) line.start else it },
				maxDistance
			)
		)
		val end = LineSegment(
			line.end,
			usePointIfTargetTooFar(
				line.end,
				next?.let { line.intersectionWithLine(it) }
					.let { if (it == null || it === LineSegment.INTERSECTION_NONE) line.end else it },
				maxDistance
			)
		)
		val startSameDirection = start.direction.hasSameDirection(line.direction)
		val endSameDirection = end.direction.hasSameDirection(line.direction)
		return LineSegment(
			if (canUseNewStart(line, previous, start, startSameDirection, end, endSameDirection)) start.end else line.start,
			if (canUseNewEnd(line, next, start, startSameDirection, end, endSameDirection)) end.end else line.end
		)
	}

	/**
	 * If point is too far from target return point
	 *
	 * @param point
	 * @param target
	 * @param maxDistance - maximum distance allowed
	 *
	 * @return point if target is further than max distance, otherwise target
	 */
	private fun usePointIfTargetTooFar(point: Vector2, target: Vector2, maxDistance:Float) : Vector2 =
		if (point.dst(target) > maxDistance) point else target

	/**
	 * Checks if lines do intersect
	 *
	 * @param line0
	 * @param line1
	 *
	 * @return true if lines intersect
	 */
	private fun linesIntersect(line0: LineSegment, line1: LineSegment) =
		!line0.direction.isOnLine(line1.direction)

	/**
	 * Checks if line is not shorter than start and end
	 *
	 * @param line
	 * @param start
	 * @param end
	 *
	 * @return true if line is not shorter than start and end
	 */
	private fun isLineNotShorter(line: LineSegment, start: LineSegment, end: LineSegment) =
		start.length + end.length <= line.length

	/**
	 * Checks if new start point can be used
	 *
	 * @param line old line
	 * @param previous previous line
	 * @param start line from old line start point to new start point
	 * @param startSameDirection true if start line points to same direction as old line
	 * @param end line from old line end point to new end point
	 * @param endSameDirection true if end line points to same direction as old line
	 *
	 * @return true if it can be used
	 */
	private fun canUseNewStart(
		line: LineSegment, previous: LineSegment?,
		start: LineSegment, startSameDirection:Boolean, end: LineSegment, endSameDirection:Boolean
	): Boolean {
		if (previous === null) {
			if (notClosed) {
				return false
			}
			throw NullPointerException("Not closed line is missing new start")
		}
		if (!linesIntersect(line, previous)) {
			return false
		}
		if (!startSameDirection) {
			return true
		}
		if (start.length > line.length) {
			return false
		}
		if (endSameDirection) {
			return true
		}
		if (isLineNotShorter(line, start, end)) {
			return true
		}
		return end.length > start.length
	}

	/**
	 * Checks if new end point can be used
	 *
	 * @param line old line
	 * @param next next line
	 * @param start line from old line start point to new start point
	 * @param startSameDirection true if start line points to same direction as old line
	 * @param end line from old line end point to new end point
	 * @param endSameDirection true if end line points to same direction as old line
	 *
	 * @return true if it can be used
	 */
	private fun canUseNewEnd(
		line: LineSegment, next: LineSegment?,
		start: LineSegment, startSameDirection:Boolean, end: LineSegment, endSameDirection:Boolean
	): Boolean {
		if (next === null) {
			if (notClosed) {
				return false
			}
			throw NullPointerException("Not closed line is missing new end")
		}
		if (!linesIntersect(line, next)) {
			return false
		}
		if (endSameDirection) {
			return true
		}
		if (end.length > line.length) {
			return false
		}
		if (!startSameDirection) {
			return true
		}
		if (isLineNotShorter(line, start, end)) {
			return true
		}
		return start.length > end.length
	}

}
