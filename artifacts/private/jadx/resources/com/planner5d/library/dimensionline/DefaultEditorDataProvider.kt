package com.planner5d.library.dimensionline

import com.planner5d.library.dimensionline.item.Item
import com.planner5d.library.dimensionline.item.ItemWall

class DefaultEditorDataProvider : EditorDataProvider {

	private val walls = mutableListOf<ItemWall>()
	private val items = mutableListOf<Item>()
	var itemsMovedSinceLastRender: Boolean = false
	
	fun setItemsOnActiveFloor(items: List<Item>) {
		walls.clear()
		this.items.clear()
		items.forEach { 
			if (it is ItemWall) {
				walls.add(it)
			} else {
				this.items.add(it)
			}
		}
	}

	override fun getAllWallsOnActiveFloor(): List<ItemWall> = walls

	override fun getAllItemsOnActiveFloor(): List<Item> = items
	
	override fun haveItemsMovedSinceLastRender(): Boolean = itemsMovedSinceLastRender

}