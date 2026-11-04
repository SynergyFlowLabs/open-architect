package com.planner5d.library.dimensionline.raycasting

import com.planner5d.library.dimensionline.EditorDataProvider
import com.planner5d.library.dimensionline.item.*
import com.planner5d.library.dimensionline.item.filter.ItemFilter

class RaycastingTargetListNs(
	private val editor: EditorDataProvider
) {

	private val filters = mutableListOf<ItemFilter>()
	fun rebuild(items: List<Item>): List<TargetShape> =
		collectItemBoxes(items) + collectWallSegments()

	fun addFilter(filter: ItemFilter): RaycastingTargetListNs {
		filters.add(filter)
		return this
	}

	private fun collectItemBoxes(items: List<Item>): List<RaycastingRectangle> {
		val filteredList: List<Item> = filterObjects(items)
		val targets = mutableListOf<RaycastingRectangle>()
		filteredList.forEach { addItem(targets, it) }
		return targets
	}

	private fun addItem(targets: MutableList<RaycastingRectangle>, item: Item) {
		targets.add(RaycastingUtils.getBBox(item))
	}

	private fun filterObjects(items: List<Item>): List<Item> = items.filter { item: Item ->
		(item is ItemNs || item is ItemPr) && filters.all { filter -> filter.check(item) }
	}

	private fun collectWallSegments(): List<RaycastingSegment> =
		editor.getAllWallsOnActiveFloor().flatMap { getWallSegment(it) }

	private fun getWallSegment(wall: ItemWall): List<RaycastingSegment> {
		if (wall.isHidden()) {
			return emptyList()
		}
		return listOf(
			getWallSegmentByKey(wall, ItemWall.WallSide.InLine),
			getWallSegmentByKey(wall, ItemWall.WallSide.OutLine)
		)
	}

	private fun getWallSegmentByKey(wall: ItemWall, key: ItemWall.WallSide): RaycastingSegment {
		return RaycastingSegment(
			wall.getStart(key),
			wall.getEnd(key),
			wall as RaycastingTarget
		)
	}
}