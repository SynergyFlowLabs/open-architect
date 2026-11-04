package com.planner5d.library.math

/**
 * @todo remove this and replace with RectanglesMergerKlipper - as RectanglesMergerJts (used in Android) is not needed
 */
interface RectanglesMerger {

	fun mergeOverlapping(rectangles:List<FloatArray>) : List<FloatArray>

}