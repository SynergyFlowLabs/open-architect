package com.planner5d.library.unity

import com.planner5d.library.dimensionline.item.*
import com.planner5d.library.dimensionline.item.standard.*
import com.planner5d.library.math.Vector3
import com.planner5d.library.walls.WallsInfoWall

class UnityDimensionLinesItemFactory {
	
	fun createItemPr(puid: String, position: Vector3, rotation: Vector3, scale: Vector3, size: Vector3): ItemPr =
		DefaultItemPr(puid, position, rotation, scale, size)

	fun createItemNs(puid: String, position: Vector3, rotation: Vector3, scale: Vector3, size: Vector3): ItemNs =
		DefaultItemNs(puid, position, rotation, scale, size)

	fun createItemDoor(
		puid: String, position: Vector3, rotation: Vector3, scale: Vector3, size: Vector3, wall: ItemWall?
	): ItemDoor = DefaultItemDoor(puid, position, rotation, scale, size, wall)

	fun createItemWindow(
		puid: String, position: Vector3, rotation: Vector3, scale: Vector3, size: Vector3, wall: ItemWall?
	): ItemWindow = DefaultItemWindow(puid, position, rotation, scale, size, wall)

	fun createItemWall(
		puid: String, position: Vector3, rotation: Vector3, scale: Vector3, size: Vector3,
		hidden: Boolean, thickness: Float, info: WallsInfoWall
	): ItemWall = DefaultItemWall(puid, position, rotation, scale, size, hidden, thickness, info)

	fun createItemRoom(
		puid: String, position: Vector3, rotation: Vector3, scale: Vector3, size: Vector3, items: List<ItemWall>
	): ItemRoom = DefaultItemRoom(puid, position, rotation, scale, size, items)

}
