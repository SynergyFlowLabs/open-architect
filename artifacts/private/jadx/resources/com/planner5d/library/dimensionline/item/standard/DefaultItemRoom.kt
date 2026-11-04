package com.planner5d.library.dimensionline.item.standard

import com.planner5d.library.dimensionline.item.Item
import com.planner5d.library.dimensionline.item.ItemRoom
import com.planner5d.library.dimensionline.item.ItemWall
import com.planner5d.library.math.Vector3

open class DefaultItemRoom(
	puid: String, position: Vector3, rotation: Vector3, scale: Vector3, size: Vector3, private val items: List<ItemWall>
) : DefaultItem(puid, position, rotation, scale, size), ItemRoom {

	override fun getItems(): List<Item> = items

}
