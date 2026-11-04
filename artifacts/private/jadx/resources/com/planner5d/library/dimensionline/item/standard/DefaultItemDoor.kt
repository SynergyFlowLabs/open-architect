package com.planner5d.library.dimensionline.item.standard

import com.planner5d.library.dimensionline.item.ItemDoor
import com.planner5d.library.dimensionline.item.ItemWall
import com.planner5d.library.dimensionline.item.ItemWindow
import com.planner5d.library.math.Vector3

class DefaultItemDoor(
	puid: String, position: Vector3, rotation: Vector3, scale: Vector3, size: Vector3, wall: ItemWall?
) : DefaultItemWindow(puid, position, rotation, scale, size, wall), ItemDoor