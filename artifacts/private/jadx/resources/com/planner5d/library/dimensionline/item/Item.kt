package com.planner5d.library.dimensionline.item

import com.planner5d.library.dimensionline.raycasting.RaycastingTarget
import com.planner5d.library.math.Vector3

interface Item : RaycastingTarget {

	/**
	 * @return position in global coordinates
	 */
	fun getPosition(): Vector3

	/**
	 * @return rotation angle in degrees along X, Y and Z axis
	 */
	fun getRotationAngle(): Vector3

	fun getSize(): Vector3

}