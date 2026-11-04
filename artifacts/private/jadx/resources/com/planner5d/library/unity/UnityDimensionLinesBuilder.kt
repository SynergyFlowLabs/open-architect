package com.planner5d.library.unity

import com.planner5d.library.dimensionline.DefaultEditorDataProvider
import com.planner5d.library.dimensionline.DefaultRenderingDataFactory
import com.planner5d.library.dimensionline.RenderingData
import com.planner5d.library.dimensionline.RenderingDataFactory
import com.planner5d.library.dimensionline.item.*

class UnityDimensionLinesBuilder {
	
	private val editorDataProvider = DefaultEditorDataProvider()
	private val renderingDataFactory: RenderingDataFactory = DefaultRenderingDataFactory(editorDataProvider)
	
	fun setItemsMovedSinceLastRender(itemsMovedSinceLastRender: Boolean): UnityDimensionLinesBuilder = apply {
		editorDataProvider.itemsMovedSinceLastRender = itemsMovedSinceLastRender
	}
	
	fun setItemsOnActiveFloor(items: List<Item>): UnityDimensionLinesBuilder = apply { 
		editorDataProvider.setItemsOnActiveFloor(items)
	}
	
	fun buildForItem(item: Item): RenderingData = renderingDataFactory.createForItem(item)
	
}