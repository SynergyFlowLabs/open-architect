package com.planner5d.library.dimensionline

import com.planner5d.library.dimensionline.item.Item
import com.planner5d.library.dimensionline.item.ItemWall

interface EditorDataProvider {
	fun getAllWallsOnActiveFloor(): List<ItemWall>
	fun getAllItemsOnActiveFloor(): List<Item>
	fun haveItemsMovedSinceLastRender(): Boolean
}