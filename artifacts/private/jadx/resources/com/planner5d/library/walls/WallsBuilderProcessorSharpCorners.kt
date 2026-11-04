package com.planner5d.library.walls

import com.planner5d.library.math.Vector2
import com.planner5d.library.math.LineSegment
import com.planner5d.library.math.normalizeAngle
import kotlin.math.min

/**
 * Create cut off sharp corners (where walls intersection is too far)
 *
 * Here were wall start and / or end can be split into multiple segments
 */
class WallsBuilderProcessorSharpCorners : WallsBuilderProcessor {

	companion object {

		/**
		 * Get cut off distance for supplied walls
		 *
		 * @param walls
		 */
		fun getCutOffDistance(vararg walls:WallsBuilderStateWall) : Float =
			walls.maxByOrNull { it.info.wall.getWidth() }
				?.let { it.info.wall.getWidth() - it.info.wall.getMinimumWidth() } ?: 0f

	}

	/**
	 * Cut off corner between previous and center walls
	 *
	 * @param previous
	 * @param center
	 * @param next not used here
	 * @param temp
	 */
	override fun process(
		previous:WallsBuilderStateWall?, center:WallsBuilderStateWall, next:WallsBuilderStateWall?, temp: Vector2
	) {
		val cutOffDistance = getCutOffDistance(previous ?: return, center)
		getCutOffSide(previous, center, cutOffDistance)?.let {
			cutOff(previous, center, temp, it, cutOffDistance)
			if (!isValidCutOff(previous, center, it)) {
				cutOff(previous, center, temp, it.opposite(), cutOffDistance)
			}
		}
	}

	/**
	 * Cut off wall on supplied side
	 *
	 * @param previous
	 * @param next
	 * @param temp
	 * @param cutOffSide side that will be cut off
	 * @param cutOffDistance distance at which to cut off
	 */
	private fun cutOff(
		previous:WallsBuilderStateWall, next:WallsBuilderStateWall, temp: Vector2,
		cutOffSide:WallsInfoWall.Side, cutOffDistance:Float
	) {
		val previousSide = previous.infoDefault.getTopOrBottom(cutOffSide)
		val nextSide = next.infoDefault.getTopOrBottom(cutOffSide)
		val main = getMain(previousSide, nextSide)
		if (main == previousSide) {
			cutOffPreviousMain(
				previousSide, previous.infoDefault.getTopOrBottom(cutOffSide.opposite()),
				nextSide, next.infoDefault.getTopOrBottom(cutOffSide.opposite()),
				cutOffDistance, temp
			).let {
				applyCutOffPreviousMain(previous, next, cutOffSide, it)
			}
		} else {
			cutOffNextMain(
				previousSide, previous.infoDefault.getTopOrBottom(cutOffSide.opposite()),
				nextSide, next.infoDefault.getTopOrBottom(cutOffSide.opposite()),
				cutOffDistance, temp
			).let {
				applyCutOffNextMain(previous, next, cutOffSide, it)
			}
		}
	}

	/**
	 * Apply cut off edge, when main wall is previous
	 *
	 * @param previous
	 * @param next
	 * @param side outer side
	 * @param edge cut off edge
	 */
	private fun applyCutOffPreviousMain(
		previous:WallsBuilderStateWall, next:WallsBuilderStateWall,
		side:WallsInfoWall.Side, edge:CutOffEdge
	) {
		val nextOpposite = next.info.getTopOrBottom(side.opposite())
		val previousOpposite = previous.info.getTopOrBottom(side.opposite())
		if (side == WallsInfoWall.Side.Bottom) {
			previous.setNewEnd(edge.start, clipSideAtCut(edge.cut, previousOpposite, previousOpposite.end), edge.corner)
			next.setNewStart(edge.end, clipSideAtCut(edge.cut, nextOpposite, nextOpposite.start), edge.corner)
		} else {
			previous.setNewEnd(clipSideAtCut(edge.cut, previousOpposite, previousOpposite.end), edge.start, edge.corner)
			next.setNewStart(clipSideAtCut(edge.cut, nextOpposite, nextOpposite.start), edge.end, edge.corner)
		}
	}

	/**
	 * Apply cut off edge, when main wall is next
	 *
	 * @param previous
	 * @param next
	 * @param side outer side
	 * @param edge cut off edge
	 */
	private fun applyCutOffNextMain(
		previous:WallsBuilderStateWall, next:WallsBuilderStateWall,
		side:WallsInfoWall.Side, edge:CutOffEdge
	) {
		val nextOpposite = next.info.getTopOrBottom(side.opposite())
		val previousOpposite = previous.info.getTopOrBottom(side.opposite())
		if (side == WallsInfoWall.Side.Bottom) {
			previous.setNewEnd(edge.end, clipSideAtCut(edge.cut, previousOpposite, previousOpposite.end), edge.corner)
			next.setNewStart(edge.start, clipSideAtCut(edge.cut, nextOpposite, nextOpposite.start), edge.corner)
		} else {
			previous.setNewEnd(clipSideAtCut(edge.cut, previousOpposite, previousOpposite.end), edge.end, edge.corner)
			next.setNewStart(clipSideAtCut(edge.cut, nextOpposite, nextOpposite.start), edge.start, edge.corner)
		}
	}

	/**
	 * Clip line at cut if it intersects with it
	 *
	 * @param cut
	 * @param line
	 * @param lineEnd
	 *
	 * @return new lineEnd (clipped or not it will be new Vector2)
	 */
	private fun clipSideAtCut(cut:LineSegment, line:LineSegment, lineEnd: Vector2) : Vector2 =
		Vector2(lineEnd).apply {
			cut.intersectionWithSegment(line).let {
				if (it !== LineSegment.INTERSECTION_NONE) {
					set(it)
				}
			}
		}

	/**
	 * Compute cut off offset from mainPoint on main line
	 *
	 * We use distance from intersection with other line and clip it to maxOffset
	 *
	 * @param main line on which to compute offset
	 * @param mainPoint start point for main point
	 * @param other other line, only used for intersection
	 * @param maxOffset
	 *
	 * @return cut off offset (will be clipped to 0 .. maxOffset)
	 */
	private fun computeCutOffOffset(
		main:LineSegment, mainPoint: Vector2, other:LineSegment, maxOffset:Float
	) : Float = main.intersectionWithLine(other).let {
		if (it !== LineSegment.INTERSECTION_NONE) min(maxOffset, mainPoint.dst(it)) else maxOffset
	}

	/**
	 * Create a cut off line
	 *
	 * @param line
	 * @param start point where cut off line will be
	 * @param temp
	 *
	 * @return cut off line
	 */
	private fun createCutOffLine(line:LineSegment, start: Vector2, temp: Vector2) =
		LineSegment(start, temp.set(line.direction).rotate90(1).add(start))

	private fun createCorner(
		temp: Vector2, cut:LineSegment, start: Vector2, end: Vector2, vararg lines:LineSegment
	) : Vector2 {
		val cutLimit = LineSegment(start, end)
		return lines.map { cut.intersectionWithLine(it) }.firstOrNull {
			cutLimit.direction.hasSameDirection(temp.set(it).sub(start)) &&
			cutLimit.direction.hasOppositeDirection(temp.set(it).sub(end))
		} ?: Vector2(end)
	}

	/**
	 * Cut off corner when previous wall is main
	 *
	 * So cut off will be done on previous side, with distance cutOffDistance
	 *
	 * @param previous wall outer side
	 * @param previousOpposite side opposite to previous
	 * @param next wall outer side
	 * @param nextOpposite side opposite to next
	 * @param cutOffDistance distance for cut off
	 * @param temp
	 *
	 * @return cut off edge
	 */
	private fun cutOffPreviousMain(
		previous:LineSegment, previousOpposite:LineSegment, next:LineSegment, nextOpposite:LineSegment,
		cutOffDistance:Float, temp: Vector2
	) : CutOffEdge {
		val start = Vector2(previous.direction)
			.scl(computeCutOffOffset(previous, previous.end, next, cutOffDistance))
			.add(previous.end)
		val cut = createCutOffLine(previous, start, temp)
		val end = cut.intersectionWithLine(next)
		return CutOffEdge(start, end, createCorner(temp, cut, start, end, nextOpposite, previousOpposite))
	}

	/**
	 * Cut off corner when next wall is main
	 *
	 * So cut off will be done on next side, with distance cutOffDistance
	 *
	 * @param previous wall outer side
	 * @param previousOpposite side opposite to previous
	 * @param next wall outer side
	 * @param nextOpposite side opposite to next
	 * @param cutOffDistance distance for cut off
	 * @param temp
	 *
	 * @return cut off edge
	 */
	private fun cutOffNextMain(
		previous:LineSegment, previousOpposite:LineSegment, next:LineSegment, nextOpposite:LineSegment,
		cutOffDistance:Float, temp: Vector2
	) : CutOffEdge {
		val start = Vector2(next.direction)
			.scl(-computeCutOffOffset(next, next.start, next, cutOffDistance))
			.add(next.start)
		val cut = createCutOffLine(next, start, temp)
		val end = cut.intersectionWithLine(previous)
		return CutOffEdge(start, end, createCorner(temp, cut, start, end, previousOpposite, nextOpposite))
	}

	/**
	 * Detect which side of 2 walls is inner part of corner - top or bottom or null
	 *
	 * @param previous
	 * @param next
	 *
	 * @return inner side of corner top, bottom or null
	 */
	private fun getInnerSide(previous:WallsBuilderStateWall, next:WallsBuilderStateWall) :
		WallsInfoWall.Side? {
		val angle = normalizeAngle(
			Vector2(previous.infoDefault.middle.direction)
				.scl(-1f)
				.angle(next.infoDefault.middle.direction)
		)
		val line = LineSegment(previous.infoDefault.top.end, next.infoDefault.top.start)
		val inner = if (
			line.intersectionWithLine(previous.infoDefault.bottom) !== LineSegment.INTERSECTION_NONE &&
			line.intersectionWithLine(next.infoDefault.bottom) !== LineSegment.INTERSECTION_NONE
		) {
			WallsInfoWall.Side.Bottom
		} else {
			WallsInfoWall.Side.Top
		}.let {
			if (
				previous.infoDefault.getTopOrBottom(it.opposite())
					.intersectionWithSegment(next.infoDefault.getTopOrBottom(it.opposite())) !== LineSegment.INTERSECTION_NONE
			) {
				it.opposite()
			} else {
				it
			}
		}
		return when {
			0 <= angle && angle < 45 -> inner
			315 < angle && angle < 360 -> inner
			else -> null
		}
	}

	/**
	 * Get side to use for cutting off (top or bottom or null)
	 *
	 * @param previous
	 * @param next
	 * @param cutOffDistance
	 *
	 * @return side to cut off top, bottom or null
	 */
	private fun getCutOffSide(
		previous:WallsBuilderStateWall, next:WallsBuilderStateWall, cutOffDistance:Float
	) : WallsInfoWall.Side? {
		if (previous.infoDefault.middle.direction.isOnLine(next.infoDefault.middle.direction)) {
			return null
		}
		val outer = getInnerSide(previous, next)?.opposite() ?: return null
		return if (
			previous.info.getTopOrBottom(outer).end != next.info.getTopOrBottom(outer).start ||
			previous.info.getTopOrBottom(outer).end.dst(previous.infoDefault.getTopOrBottom(outer).end) > cutOffDistance ||
			next.info.getTopOrBottom(outer).start.dst(next.infoDefault.getTopOrBottom(outer).start) > cutOffDistance
		) {
			outer
		} else {
			null
		}
	}

	/**
	 * Check if corner cut off was valid (it is targeted to one specific edge case)
	 *
	 * @param previousEnd previous wall end side
	 * @param nextStart next wall start side
	 *
	 * @return true if cut off was valid
	 */
	private fun isValid(
		previousEnd:Array<LineSegment>, nextStart:Array<LineSegment>, tolerance:Float=0.01f
	) : Boolean {
		if (previousEnd.size == 1 && nextStart.size == 1) {
			return true
		}
		nextStart.forEach {
			bPart -> previousEnd.forEach {
				aPart -> if (
					(aPart.start.epsilonEquals(bPart.start, tolerance) || aPart.start.epsilonEquals(bPart.end, tolerance)) &&
					(aPart.end.epsilonEquals(bPart.start, tolerance) || aPart.end.epsilonEquals(bPart.end, tolerance))
				) {
					return true
				}
			}
		}
		return false
	}

	/**
	 * Used to check one specific edge case whe inner/outer side of wall for cut off is detected bad
	 *
	 * @param previous
	 * @param next
	 * @param cutOffSide
	 *
	 * @return true if cut off is valid
	 */
	private fun isValidCutOff(
		previous:WallsBuilderStateWall, next:WallsBuilderStateWall, cutOffSide:WallsInfoWall.Side
	) : Boolean {
		if (isValid(previous.info.end, next.info.start)) {
			return true
		}
		val direction = Vector2(previous.info.getTopOrBottom(cutOffSide).end)
			.sub(next.info.getTopOrBottom(cutOffSide).start)
		return arrayOf(previous.info.end, next.info.start)
			.map { it[if (it.size > 1 && cutOffSide == WallsInfoWall.Side.Top) 1 else 0] }
			.find { !it.direction.isOnLine(direction) } == null
	}

	/**
	 * Get line segment that is more important when cutting off, and will be used as main
	 *
	 * @param a
	 * @param b
	 *
	 * @return main line segment - a or b
	 */
	private fun getMain(a:LineSegment, b:LineSegment) : LineSegment = if (
		distanceToAngle(a.direction.angle().toInt()) <= distanceToAngle(b.direction.angle().toInt())
	) a else b

	/**
	 * Compute distance to supplied target angle
	 *
	 * @param angle in degrees
	 * @param target angle in degrees
	 *
	 * @return distance to target angle
	 */
	private fun distanceToAngle(angle:Int, target:Int = 90) : Int =
		(angle % target).let { min(it, target - it) }

	/**
	 * Just small class for holding information how to form cut off
	 */
	private class CutOffEdge(val start: Vector2, val end: Vector2, val corner: Vector2?) {

		val cut = LineSegment(start, end)

	}

}
