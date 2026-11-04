package com.planner5d.library.dimensionline.dimensions

import com.planner5d.library.dimensionline.item.Item
import com.planner5d.library.math.LineSegment
import com.planner5d.library.math.Vector2

class RenderingDataCollector {
	val linesAndLengths = mutableListOf<DimensionLine>()
	val highlightedItems = mutableSetOf<Item>()

	fun markItemForHighlighting(item: Item, highlight: Boolean) {
		if (highlight) {
			highlightedItems.add(item)
		} else {
			highlightedItems.remove(item)
		}
	}

	fun drawLine(lengthOfLineToDisplay: Float, start: Vector2, end: Vector2) {
		linesAndLengths.add(DimensionLine(LineSegment(start, end), lengthOfLineToDisplay))
	}

	fun clear() {
		linesAndLengths.clear()
		highlightedItems.clear()
	}
}