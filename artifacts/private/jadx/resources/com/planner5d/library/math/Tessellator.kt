package com.planner5d.library.math

class Tessellator(private val implementation:Implementation) {

	interface Implementation {

		fun tessellate(contours:Array<FloatArray>) : FloatArray

	}

	/**
	 * Tessellate polygon
	 *
	 * @param polygon points of polygon
	 * @param CCW true if output winding should be CCW, otherwise it will be CW
	 *
	 * @return triangles
	 */
	fun tessellate(polygon:Array<Vector2>, CCW:Boolean) : FloatArray {
		val points = FloatArray(polygon.size * 2)
		var i = 0
		while (i < polygon.size) {
			points[i * 2] = polygon[i].x
			points[i * 2 + 1] = polygon[i].y
			i++
		}
		return tessellate(points, CCW)
	}

	/**
	 * Tessellate polygon
	 *
	 * @param polygon points of polygon
	 * @param CCW true if output winding should be CCW, otherwise it will be CW
	 *
	 * @return triangles
	 */
	fun tessellate(polygon:FloatArray, CCW:Boolean) : FloatArray = tessellate(polygon, emptyArray(), CCW)

	/**
	 * Tessellate polygon, with polygon holes
	 *
	 * @param polygon points of polygon
	 * @param holes points of holes in polygon
	 * @param CCW true if output winding should be CCW, otherwise it will be CW
	 *
	 * @return triangles
	 */
	fun tessellate(polygon:FloatArray, holes:Array<FloatArray>, CCW:Boolean) : FloatArray {
		setPolygonWinding(polygon, false)
		val data = mutableListOf(polygon)
		for (hole in holes) {
			if (hole.isNotEmpty()) {
				setPolygonWinding(hole, true)
				data.add(hole)
			}
		}
		return tessellate(data.toTypedArray(), CCW)
	}

	/**
	 * Tessellate polygon contours
	 *
	 * ! Supply polygon borders in CW order
	 * ! Supply holes in CCW order
	 *
	 * @param contours points of contours
	 * @param CCW true if output winding should be CCW, otherwise it will be CW
	 *
	 * @return triangles
	 */
	fun tessellate(contours:Array<FloatArray>?, CCW:Boolean) : FloatArray{
		if (contours == null || contours.isEmpty()) {
			return FloatArray(0)
		}
		return setTrianglesWinding(implementation.tessellate(contours), CCW)
	}

	fun setPolygonWinding(points:FloatArray, CCW:Boolean) {
		setPolygonWinding(points, CCW, 0, points.size)
	}

	private fun setTrianglesWinding(points:FloatArray, CCW:Boolean) : FloatArray {
		var i = 0
		while (i < points.size) {
			setPolygonWinding(points, CCW, i, 6)
			i += 6
		}
		return points
	}

	private fun setPolygonWinding(points:FloatArray, CCW:Boolean, offset:Int, length:Int) {
		if (points.isNotEmpty()) {
			if (isPolygonWindingCW(points, offset, length)) {
				if (CCW) {
					reversePolygonWinding(points, offset, length);
				}
			} else if (!CCW) {
				reversePolygonWinding(points, offset, length);
			}
		}
	}

	private fun reversePolygonWinding(points:FloatArray, offset:Int, length:Int) {
		val pointsTemp = FloatArray(length) { points[offset + it] }
		var ii = 0
		var i = pointsTemp.size - 2;
		while (i >= 0) {
			points[offset + ii++] = pointsTemp[i]
			points[offset + ii++] = pointsTemp[i + 1]
			i -= 2
		}
	}

	private fun isPolygonWindingCW(points:FloatArray, offset:Int, length:Int) : Boolean {
		var total = 0f
		var i = offset
		while (i < offset + length - 2) {
			total += (points[i + 2] - points[i]) * (points[i + 3] + points[i + 1])
			i += 2
		}
		total += (points[offset] - points[offset + length - 2]) * (points[offset + length - 1] + points[offset + 1])
		return total > 0
	}

}