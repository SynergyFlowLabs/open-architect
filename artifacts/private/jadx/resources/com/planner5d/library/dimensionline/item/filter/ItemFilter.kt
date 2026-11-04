package com.planner5d.library.dimensionline.item.filter

import com.planner5d.library.dimensionline.item.Item

interface ItemFilter {
	fun check(item: Item): Boolean
}