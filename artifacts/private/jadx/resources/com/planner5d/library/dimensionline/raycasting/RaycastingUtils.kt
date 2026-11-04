package com.planner5d.library.dimensionline.raycasting

import com.planner5d.library.dimensionline.item.Item
import com.planner5d.library.dimensionline.item.ItemNs
import com.planner5d.library.math.Vector2
import com.planner5d.library.math.Vector3
import kotlin.math.PI
import kotlin.math.abs

object RaycastingUtils {

	fun getBBox(item: Item): RaycastingRectangle {
		val box: BoundingBox = BoundingBoxGetter.getBoundingBox(item)
		var width: Float = box.size.x
		var height: Float = box.size.y
		if (item is ItemNs) {
			val scale = item.getScale()
			width *= abs(scale.x)
			height *= abs(scale.y)
		}
		val angle: Float = item.getRotationAngle().y
		val rotation: Double = (angle / 180) * PI
		val position: Vector3 = item.getPosition()
		return RaycastingRectangle(Vector2(position.x, position.y), Vector2(box.size), rotation.toFloat(), item)
	}

}
