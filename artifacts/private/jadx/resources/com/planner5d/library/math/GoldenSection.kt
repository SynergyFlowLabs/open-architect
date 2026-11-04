package com.planner5d.library.math

import kotlin.math.abs
import kotlin.math.sqrt

class GoldenSection {

	private val PHI_RATIO = 2 / (1 + sqrt(5f))

	fun minimize(
		unimodalFunction: (x: Float) -> Float, left: Float, right: Float, tolerance: Float, limitIterations: Int
	): Float {
		var iteration = 0
		var x1 = right - calculateInternalPointShift(left, right)
		var x2 = left + calculateInternalPointShift(left, right)
		// Initial bounds
		var f1 = unimodalFunction(x1)
		var f2 = unimodalFunction(x2)
		// Store initial values
		val initialFuncLeft = unimodalFunction(left)
		val initialFuncRight = unimodalFunction(right)
		val initialLeft = left
		val initialRight = right
		var rightTemp = right
		var leftTemp = left
		while (++iteration < limitIterations && abs(rightTemp - leftTemp) > tolerance) {
			if (f2 > f1) {
				rightTemp = x2
				x2 = x1
				f2 = f1
				x1 = rightTemp - calculateInternalPointShift(leftTemp, rightTemp)
				f1 = unimodalFunction(x1)
			} else {
				leftTemp = x1
				x1 = x2
				f1 = f2
				x2 = leftTemp + calculateInternalPointShift(leftTemp, rightTemp)
				f2 = unimodalFunction(x2)
			}
		}
		var argMin = 0.5f * (rightTemp + leftTemp)
		val minimum = 0.5f * (f1 + f2)
		if (f2.isNaN() || f1.isNaN() || iteration == limitIterations) {
			return argMin
		}
		if (initialFuncLeft < minimum) {
			argMin = initialLeft
		} else if (initialFuncRight < minimum) {
			argMin = initialRight
		}
		return argMin
	}

	private fun calculateInternalPointShift(left: Float, right: Float): Float {
		return PHI_RATIO * (right - left)
	}
}