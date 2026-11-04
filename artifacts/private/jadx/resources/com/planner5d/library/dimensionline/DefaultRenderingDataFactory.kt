package com.planner5d.library.dimensionline

import com.planner5d.library.dimensionline.dimensions.RenderingDataCollector
import com.planner5d.library.dimensionline.raycasting.hit.HitInfo
import com.planner5d.library.dimensionline.item.Item
import com.planner5d.library.dimensionline.item.ItemNs
import com.planner5d.library.dimensionline.item.ItemPr
import com.planner5d.library.dimensionline.raycasting.*

class DefaultRenderingDataFactory(private val editorDataProvider: EditorDataProvider) : RenderingDataFactory {
	
	private val targets: RaycastingTargetsList = RaycastingTargetsList(editorDataProvider)
	private val rectangleDimensions: RectangleDimensions = RectangleDimensions()
	private val renderingDataCollector = RenderingDataCollector()
	private var box: RaycastingRectangle? = null

	override fun createForItem(item: Item): RenderingData {
		renderingDataCollector.clear()
		rebuildTargets(item)
		update(item)
		return RenderingData(
			renderingDataCollector.linesAndLengths,
			renderingDataCollector.highlightedItems.toList()
		)
	}

	private fun rebuildTargets(item: Item) {
		targets.rebuild(item)
		targets.removeReferences(listOf(item))
	}

	private fun update(item: Item) {
		if (!shouldUpdateDimensions(item)) {
			return
		}
		rebuildSourceBox(item)
		updateRaycast()
	}

	private fun clear() {
		targets.targets.forEach {
			val reference = it.reference
			if (reference is Item) {
				renderingDataCollector.markItemForHighlighting(reference, false)
			}
		}
	}

	private fun updateRaycast() {
		val box = box ?: return
		clear()
		val targets: List<TargetShape> = targets.targets
		val hits: List<HitInfo> = rectangleDimensions.cast(box, targets)
		hits.forEach { hit: HitInfo ->
			renderingDataCollector.drawLine(hit.distance, hit.origin, hit.point)
		}
		highlightTargets(hits)
	}

	private fun rebuildSourceBox(item: Item) {
		box = RaycastingUtils.getBBox(item)
	}

	private fun shouldUpdateDimensions(item: Item): Boolean =
		(item is ItemNs || item is ItemPr) && editorDataProvider.haveItemsMovedSinceLastRender()

	private fun highlightTargets(hits: List<HitInfo>) {
		hits.forEach {
			if (it.reference is Item) {
				renderingDataCollector.markItemForHighlighting(it.reference, true)
			}
		}
	}
}