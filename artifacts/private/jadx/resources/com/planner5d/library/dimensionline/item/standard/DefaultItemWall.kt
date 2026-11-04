package com.planner5d.library.dimensionline.item.standard

import com.planner5d.library.dimensionline.item.ItemWall
import com.planner5d.library.math.Vector2
import com.planner5d.library.math.Vector3
import com.planner5d.library.walls.WallsInfoWall

open class DefaultItemWall(
	puid: String, position: Vector3, rotation: Vector3, scale: Vector3, size: Vector3, 
	private val hidden: Boolean, private val thickness: Float, private val info: WallsInfoWall
) : DefaultItem(puid, position, rotation, scale, size), ItemWall {
	
	override fun isHidden(): Boolean = hidden

	override fun getStart(side: ItemWall.WallSide?): Vector2 = when (side) {
		ItemWall.WallSide.InLine -> info.bottom.end
		ItemWall.WallSide.OutLine -> info.top.start
		null -> info.middle.start
	}
	
	override fun getEnd(side: ItemWall.WallSide?): Vector2 = when (side) {
		ItemWall.WallSide.InLine -> info.bottom.start
		ItemWall.WallSide.OutLine -> info.top.end
		null -> info.middle.end
	}

	override fun getThickness(): Float = thickness

}
