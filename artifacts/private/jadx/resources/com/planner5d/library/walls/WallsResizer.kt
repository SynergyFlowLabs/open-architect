package com.planner5d.library.walls

import com.planner5d.library.math.GoldenSection
import com.planner5d.library.math.Vector2
import kotlin.math.abs
import kotlin.math.max

class WallsResizer {

	enum class Side { Left, Center, Right }

	private val delta = 100f
	private val tolerance = 0.0001f
	private val maxIterations = 100
	private val goldenSection: GoldenSection = GoldenSection()

	fun calcSizeAdjustment(wall: Wall, walls: WallsInfo, desiredLength: Float, resizeSide: Int): Float? {
		val temp0 = Vector2()
		val temp1 = Vector2()
		val initialLength = walls.get(wall)?.top?.length ?: return null
		val adjustedTolerance = tolerance + (tolerance * (desiredLength + initialLength) / 1000)
		val desiredLengthTemp = max(
			desiredLength, calculateMinPossibleInlineLength(wall, walls, resizeSide, initialLength, temp0, temp1)
		)
		val initialDelta = desiredLengthTemp - initialLength
		var leftBound = initialDelta - delta
		val rightBound = initialDelta + delta
		if (initialLength + leftBound < 0) {
			leftBound = -initialLength
		}

		return try {
			goldenSection.minimize(
				{ shift: Float ->
					calculateInlineLengthError(
						desiredLengthTemp, createTripleWallChain(wall, walls, shift, resizeSide, temp0, temp1)
					)
				}, leftBound, rightBound, adjustedTolerance, maxIterations
			)
		} catch (ignored: Exception) {
			null
		}
	}

	private fun createTripleWallChain(
		wall: Wall, walls: WallsInfo, shift: Float, resizeSide: Int, wallStart: Vector2, wallEnd: Vector2
	): Array<Wall> {
		wall.getPoint(wallStart, false, true)
		wall.getPoint(wallEnd, false, false)
		var shiftPrev = shift / 2
		var shiftNext = shiftPrev
		if (resizeSide == Side.Left.ordinal) {
			shiftPrev = 0f
			shiftNext = shift
		} else if (resizeSide == Side.Right.ordinal) {
			shiftPrev = shift
			shiftNext = 0f
		}
		val newStart = extendSegment(wallStart, wallEnd, shiftPrev)
		val newEnd = extendSegment(wallEnd, wallStart, shiftNext)
		val newWall = createBuilderWall(
			newStart, newEnd, wall.getWidth(), wall.isHidden(), wall.getHeight()
		)

		val oldWallInfo = walls.get(wall)
			?: throw RuntimeException("WallResizer wasn't able to build walls chain because the wall is not a part of Walls")
		val prevWall = walls.getPrevious(oldWallInfo)
		val prevWallInfo = prevWall?.let {
			createBuilderWall(
				prevWall.wall.getPoint(Vector2(), false, true), Vector2(newStart), prevWall.wall.getWidth(),
				prevWall.wall.isHidden(), prevWall.wall.getHeight()
			)
		}
		val nextWall = walls.getNext(oldWallInfo)
		val nextWallInfo = nextWall?.let {
			createBuilderWall(
				Vector2(newEnd), nextWall.wall.getPoint(Vector2(), false, false), nextWall.wall.getWidth(),
				nextWall.wall.isHidden(), nextWall.wall.getHeight()
			)
		}
		if (prevWallInfo == null || nextWallInfo == null) {
			throw RuntimeException("WallResizer wasn't able to build walls chain $walls")
		}
		return arrayOf(prevWallInfo, newWall, nextWallInfo)
	}

	private fun extendSegment(start: Vector2, end: Vector2, extension: Float): Vector2 {
		return Vector2(start).add(Vector2(start).sub(Vector2(end)).nor().scl(extension))
	}

	private fun calculateInlineLengthError(desiredLength: Float, threeWallsChain: Array<Wall>): Float {
		val wallsInfo = WallsBuilder.build(threeWallsChain, true)
		try {
			val middleWall = wallsInfo.get()[1]
			return abs(middleWall.top.length - desiredLength)
		} catch (error: Throwable) {
			throw RuntimeException("WallResizer wasn't able to build walls chain ${wallsInfo.get()} $error")
		}
	}

	private fun createBuilderWall(
		start: Vector2, end: Vector2, thickness: Float, isHidden: Boolean = true, height: Float = 270f
	): Wall = WallSimple(start, end, thickness, height, isHidden)

	private fun calculateMinPossibleInlineLength(
		wall: Wall, walls: WallsInfo, resizeType: Int, initialLength: Float, temp0: Vector2,
		temp1: Vector2
	): Float {
		try {
			val builtWalls =
				WallsBuilder.build(createTripleWallChain(wall, walls, -initialLength + 1, resizeType, temp0, temp1), true)
			return builtWalls.get()[1].top.length
		} catch (error: Throwable) {
			throw RuntimeException("WallResizer failed to find minimum length $error")
		}
	}
}