package com.planner5d.library.dimensionline.raycasting

import com.planner5d.library.dimensionline.item.Item
import com.planner5d.library.math.Vector2
import com.planner5d.library.math.Vector3

object BoundingBoxGetter {
	fun getBoundingBox(item: Item): BoundingBox {
		val position: Vector3 = item.getPosition()
		val size: Vector3 = item.getSize()
		return BoundingBox(Vector2(position.x, position.y), Vector2(size.x, size.y))
	}
}