package com.planner5d.library.dimensionline.raycasting

import com.planner5d.library.dimensionline.EditorDataProvider
import com.planner5d.library.dimensionline.item.*
import com.planner5d.library.dimensionline.item.filter.ItemFilterLevitating
import com.planner5d.library.dimensionline.item.filter.ItemFilterSmallHeight

class RaycastingTargetsList(private val editor: EditorDataProvider) {
	var targets: List<TargetShape> = emptyList()
	private val targetListWall = RaycastingTargetListWall()
	private val targetListNs = RaycastingTargetListNs(editor)
		.addFilter(ItemFilterSmallHeight()).addFilter(ItemFilterLevitating())

	fun rebuild(item: Item) {
		if (isDoorOrWindow(item)) {
			targets = targetListWall.rebuild(editor.getAllItemsOnActiveFloor(), item as ItemHoleInTheWall)
		} else if (isObjectNsOrPr(item)) {
			targets = targetListNs.rebuild(editor.getAllItemsOnActiveFloor())
		}
	}

	fun removeReferences(items: List<Item>) {
		val ids: List<String> = getIdsToRemove(items)
		targets = targets.filter { target ->
			val targetId: String = target.reference?.getPuid() ?: return@filter false
			!ids.contains(targetId)
		}
	}

	private fun getIdsToRemove(items: List<Item>): List<String> = items.flatMap { item ->
		if (isRoom(item)) {
			(item as ItemRoom).getItems().map { it.getPuid() }
		} else {
			listOf(item.getPuid())
		}
	}


	private fun isDoorOrWindow(item: Item): Boolean = item is ItemWindow

	private fun isObjectNsOrPr(item: Item): Boolean = item is ItemNs || item is ItemPr

	private fun isRoom(item: Item): Boolean = item is ItemRoom
}