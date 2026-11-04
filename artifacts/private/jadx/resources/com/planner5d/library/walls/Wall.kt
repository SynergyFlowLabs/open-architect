package com.planner5d.library.walls

import com.planner5d.library.math.Vector2

/**
 * Used to pass wall defined in a project
 *
 * This is minimal functionality required for wall builder needs to build walls for a room, partition or ground
 */
interface Wall {

	companion object {
		const val MINIMUM_WIDTH = 5
		const val MAXIMUM_WIDTH = 1000
	}

	/**
	 * How tall is the wall (in Z coordinate  relative to the floor)
	 */
	fun getHeight(): Float

	/**
	 * Width or thickness of a wall
	 *
	 * Thickness of a wall increases to the inside of room
	 */
	fun getWidth(): Float

	/**
	 * Minimum width or thickness of a wall
	 *
	 * For all current projects we have limited at 5 (it cannot be changed easily)
	 */
	fun getMinimumWidth(): Int

	/**
	 * Wall is zero length
	 */
	fun isZero(): Boolean

	/**
	 * Wall is hidden - not shown to users
	 *
	 * Wall will still be used in forming room, partition or ground
	 */
	fun isHidden(): Boolean

	/**
	 * Get start or end point of a wall in 2D space
	 *
	 * @param vector result where to write output (will also be returned)
	 * @param globalCoordinates output coordinates will be relative to origin of wall coordinates
	 * @param startPoint if true - will return start point of wall, if false will return end point of wall
	 */
	fun getPoint(vector: Vector2, globalCoordinates: Boolean, startPoint: Boolean): Vector2

	/**
	 * Get origin of wall coordinates
	 *
	 * From those coordinates wall positions will be computed
	 */
	fun getOrigin(origin: Vector2): Vector2

}