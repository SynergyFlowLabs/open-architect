package com.planner5d.library.dimensionline.item.filter

import com.planner5d.library.dimensionline.item.Item

class ItemFilterSmallHeight(private val heightLimitInCm: Float = 3f) : ItemFilter {

	override fun check(item: Item): Boolean = item.getSize().z >= heightLimitInCm

}