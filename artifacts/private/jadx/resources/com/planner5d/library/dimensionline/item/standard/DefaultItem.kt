package com.planner5d.library.dimensionline.item.standard

import com.planner5d.library.dimensionline.item.Item
import com.planner5d.library.math.Vector3

abstract class DefaultItem(
	private val puid: String, private val position: Vector3, private val rotation: Vector3, private val scale: Vector3, 
	private val size: Vector3
) : Item {
	
	override fun getPosition(): Vector3 = position

	override fun getRotationAngle(): Vector3 = rotation

	override fun getSize(): Vector3 = size

	override fun getPuid(): String = puid

	override fun getScale(): Vector3 = scale

}