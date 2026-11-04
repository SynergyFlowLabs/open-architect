package com.planner5d.library.dimensionline.item.filter

import com.planner5d.library.dimensionline.item.Item

class ItemFilterLevitating(private val zLimitInCm: Float = 3f) : ItemFilter {

	override fun check(item: Item): Boolean = item.getPosition().z <= zLimitInCm

}