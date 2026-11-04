package com.planner5d.library.dimensionline.raycasting

import com.planner5d.library.dimensionline.item.Item
import com.planner5d.library.dimensionline.item.ItemHoleInTheWall
import com.planner5d.library.dimensionline.item.ItemWall
import com.planner5d.library.math.Vector2

class RaycastingTargetListWall {

	fun rebuild(collection: List<Item>, item: ItemHoleInTheWall): List<TargetShape> {
		val wall = item.getWall() ?: return emptyList()
		val rotatedDirection = getWallDirection(wall).rotate90(1)
		val wallWidth = wall.getThickness()
		val endPoint1 = wall.getEnd()
		val endPoint2 = wall.getEnd().add(Vector2(rotatedDirection).scl(-wallWidth))
		val startPoint1 = wall.getStart()
		val startPoint2 = wall.getStart().add(Vector2(rotatedDirection).scl(-wallWidth))
		return getTargetsFromWall(collection, item) +
			RaycastingSegment(endPoint1, endPoint2, wall) +
			RaycastingSegment(startPoint1, startPoint2, wall)

	}
	
	private fun getWallDirection(wall: ItemWall): Vector2 = wall.getStart().sub(wall.getEnd()).nor()

	private fun getTargetsFromWall(
		collection: List<Item>, item: ItemHoleInTheWall
	): List<RaycastingRectangle> = collection
		.filter { it is ItemHoleInTheWall && it.getWall() == item.getWall() && it != item }
		.map { RaycastingUtils.getBBox(it) }

}
