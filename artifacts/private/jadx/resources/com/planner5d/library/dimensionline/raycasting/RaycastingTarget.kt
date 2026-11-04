package com.planner5d.library.dimensionline.raycasting

import com.planner5d.library.math.Vector3

interface RaycastingTarget {
	fun getPuid(): String
	fun getScale(): Vector3
}