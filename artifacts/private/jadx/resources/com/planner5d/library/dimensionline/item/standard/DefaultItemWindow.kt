package com.planner5d.library.dimensionline.item.standard

import com.planner5d.library.dimensionline.item.ItemWall
import com.planner5d.library.dimensionline.item.ItemWindow
import com.planner5d.library.math.Vector3

open class DefaultItemWindow(
	puid: String, position: Vector3, rotation: Vector3, scale: Vector3, size: Vector3, private val wall: ItemWall?
) : DefaultItemNs(puid, position, rotation, scale, size), ItemWindow {
		
	override fun getWall(): ItemWall? = wall

}