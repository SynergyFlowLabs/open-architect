package com.planner5d.library.walls

import kotlin.jvm.JvmField

class WallHole(
	/**
	 * Points of a 2D polygon describing hole on a wall
	 */
	@JvmField val polygon2D: FloatArray,

	/**
	 * Bottom (on Z coordinate) of the hole relative to current floor
	 */
	@JvmField val zInFloor: Float,

	/**
	 * Height (on Z coordinate) of a hole relative to current floor
	 */
	@JvmField val height: Float,

	/**
	 * How high (on Z coordinate) is current floor above earth
	 *
	 * 1. First floor is: 0
	 * 2. Second floor is: 0 + [first floor height]
	 * 3. Third floor is: [second floor z] + [second floor height]
	 * 4. ...
	 *
	 * Floor height is the highest room in the floor
	 */
	@JvmField val zFloor: Float
) {

	/**
	 * Bottom (on Z coordinate) of the hole relative to earth (or project)
	 */
	val zInProject: Float = zFloor + zInFloor

	override fun toString(): String = "WallHole(vertices=[${polygon2D.joinToString()}], " +
		"zInFloor=$zInFloor, height=$height, zFloor=$zFloor, zInProject=$zInProject)"
}