package com.planner5d.library.math

object TesselatorUtils {

	/**
	 * Creates plain array of vertices
	 *
	 * @param contours CW for polygon, CCW for its holes
	 *
	 * @return plain array of vertices
	 */
	fun toPlainArray(contours:Array<FloatArray>) : FloatArray {
		var n = 0
		for (contour in contours) {
			n += 1 + contour.size
		}
		val data = FloatArray(n)
		n = 0
		for (contour in contours) {
			data[n++] = contour.size.toFloat()
			for (coordinate in contour) {
				data[n++] = coordinate
			}
		}
		return data
	}

	fun tesselatePath(tessellator: Tessellator, points: Array<Vector2>): FloatArray {
		val pointsLocal = mutableListOf<Float>()
		var last: Vector2? = null
		for (i in points.indices) {
			val point = points[i]
			if (last == null || last != point) {
				pointsLocal.add(point.x)
				pointsLocal.add(point.y)
				last = point
			}
		}
		val triangles: FloatArray = tessellator.tessellate(pointsLocal.toFloatArray(), false)
		pointsLocal.clear()
		return triangles
	}

}
