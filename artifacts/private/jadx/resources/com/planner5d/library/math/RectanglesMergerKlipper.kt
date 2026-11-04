package com.planner5d.library.math

import klipper.*

object RectanglesMergerKlipper : RectanglesMerger {

	override fun mergeOverlapping(rectangles:List<FloatArray>) : List<FloatArray> {
		if (rectangles.size <= 1) {
			return rectangles
		}
		return clipper {
			val temp = Paths()
			val result = Paths()
			result.add(rectangles.first().clipperToPath())
			for (i in 1 until rectangles.size) {
				clear()
				addPaths(result, PolyType.Subject, true)
				addPath(rectangles[i].clipperToPath(), PolyType.Clip, true)
				execute(ClipType.Union, temp)
				result.clear()
				result.addAll(temp)
			}
			result.map { it.clipperToArray() }
		}
	}

}