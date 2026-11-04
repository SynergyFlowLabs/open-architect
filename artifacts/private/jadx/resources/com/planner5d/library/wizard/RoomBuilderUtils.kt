package com.planner5d.library.wizard

import kotlin.math.abs

object RoomBuilderUtils {
	/**
	 * Calculate the length of intersection of two line segments defined by the 1D coordinates of their points
	 *
	 * @param x1, x2 - coordinates of the first segment
	 * @param x3, x4 - coordinates of the second segment
	 */
	fun intersection(x1: Float, x2: Float, x3: Float, x4: Float): Float {
		if (x1 == x2 || x3 == x4) {
			return 0f
		}
		val a: Float
		val b: Float
		val c: Float
		val d: Float
		if (x2 > x1) {
			a = x1
			b = x2
		} else {
			a = x2
			b = x1
		}

		if (x4 > x3) {
			c = x3
			d = x4
		} else {
			c = x4
			d = x3
		}

		if (a >= d || c >= b) {
			return 0f
		}

		return if (a <= c) {
			abs(b - c)
		} else {
			abs(a - d)
		}
	}
}