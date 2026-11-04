package com.planner5d.library.dimensionline.dimensions

import com.planner5d.library.math.Vector2

interface Rectangle2D {
	var position: Vector2
	var size: Vector2

	/**
	 * In radians
	 */
	var angle: Float
}