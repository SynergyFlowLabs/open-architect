package com.planner5d.library.math

object TessellatorDummy : Tessellator.Implementation {

	val INSTANCE = Tessellator(this)

	override fun tessellate(contours: Array<FloatArray>): FloatArray = mutableListOf<Float>().apply {
		contours.forEach {
			addAll(it.toTypedArray())
		}
	}.toFloatArray()

}