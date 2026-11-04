package com.planner5d.library.dimensionline

import com.planner5d.library.dimensionline.item.Item
import com.planner5d.library.dimensionline.RenderingData

interface RenderingDataFactory {

	fun createForItem(item: Item): RenderingData

}