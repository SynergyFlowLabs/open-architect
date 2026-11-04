package com.planner5d.library.walls

import com.planner5d.library.math.*
import kotlin.jvm.JvmField

open class WallsBuilder3D(
	@JvmField protected val info: WallsInfo, private val wall: WallsInfoWall,
	private val part: WallPart, private val partCloseTop: WallPart?, private val coordinate3DScale: Float,
	private val holes: List<WallHole>, private val tessellator: Tessellator, private val rectanglesMerger: RectanglesMerger,
	@JvmField protected val builder: WallsBuilder3DMesh, private val flooringHeight: Float = 0f
) {

	enum class WallPart { All, AllExceptSides, SideOutdoor, SideIndoor, CloseStart, CloseEnd, CloseTop }

	@JvmField
	protected val origin: Vector2? = info.getOrigin()

	@JvmField
	val hidden: Boolean = info.getHeight() <= 0 || wall.wall.isHidden() || origin == null

	override fun toString() = "WallsBuilder3D(holes=$holes)"

	fun build(): WallsBuilder3DSide? {
		if (hidden) {
			return null
		}
		val temp = arrayOf(Vertex(), Vertex(), Vertex(), Vertex())
		val info = WallsBuilder3DSide(this.info, wall, holes, tessellator, rectanglesMerger)
		val buildPartsGeneric = part == WallPart.All || part == WallPart.AllExceptSides
		// Processing the holes first because the top edge will require them too.
		val holesOnTopEdge =
			if (buildPartsGeneric && info.top.holes.isNotEmpty() && info.top.holes.size == info.bottom.holes.size) {
				buildWallHolesClose(temp, info)
			} else null
		if (buildPartsGeneric && partCloseTop == WallPart.CloseTop) {
			buildTop(temp, holesOnTopEdge)
		}
		val previous = this.info.getPrevious(wall)
		val extensions = arrayOf<LineSegment?>(null, null, null, null)
		if (buildPartsGeneric || part == WallPart.CloseStart || part == WallPart.CloseEnd) {
			if (
				previous == null || previous.wall.isHidden() || previous.wall.getWidth() < wall.wall.getWidth() ||
				previous.middle.direction.isCollinearOpposite(wall.middle.direction) ||
				!WallsUtils.isWallJointPointsMatching(previous, wall)
			) {
				if (part == WallPart.All || part == WallPart.CloseStart) {
					buildWallClose(temp, true, *wall.start)
				}
			} else if (wall.start.size > 1 && part != WallPart.CloseStart) {
				extensions[0] = wall.start[0]
				extensions[1] = wall.start[1]
			}
			val next = this.info.getNext(wall)
			if (
				next == null || next.wall.isHidden() || next.wall.getWidth() < wall.wall.getWidth() ||
				next.middle.direction.isCollinearOpposite(wall.middle.direction)
			) {
				if (part == WallPart.All || part == WallPart.CloseEnd) {
					buildWallClose(temp, false, *wall.end)
				}
			} else if (wall.end.size > 1 && part != WallPart.CloseEnd) {
				extensions[2] = wall.end[0]
				extensions[3] = wall.end[1]
			}
		}
		buildWallSide(temp, info, true, extensions[0], extensions[2])
		buildWallSide(temp, info, false, extensions[1], extensions[3])
		return info
	}

	protected open fun buildTop(temp: Array<Vertex>, holesOnTopEdge: Array<FloatArray>?) {
		val path = wall.getPath()
		for (point in path) {
			to3DScale(point)
		}
		val triangles = holesOnTopEdge?.let {
			tessellator.tessellate(path.toFloatArray(), it, false)
		} ?: tessellator.tessellate(path, false)
		val height = to3DScale(info.getHeight())
		temp[0].normal.set(0f, 1f, 0f)
		temp[1].normal.set(0f, 1f, 0f)
		temp[2].normal.set(0f, 1f, 0f)
		var i = 0
		while (i < triangles.size) {
			temp[0].position.set(triangles[i], height, triangles[i + 1])
			temp[1].position.set(triangles[i + 2], height, triangles[i + 3])
			temp[2].position.set(triangles[i + 4], height, triangles[i + 5])
			builder.buildClose(temp[0], temp[1], temp[2])
			i += 6
		}
	}

	private fun buildWallHolesClose(vertexes: Array<Vertex>, info: WallsBuilder3DSide): Array<FloatArray>? {
		val outdoor = wall.bottom
		val indoor = wall.top
		val height = to3DScale(this.info.getHeight())
		val flooringHeight = to3DScale(flooringHeight)
		var holesOnTopEdge: MutableList<FloatArray>? = null
		for (i in info.top.holes.indices) {
			val holeIndoor = info.top.holes[i]
			val holeOutdoor = info.bottom.holes[i]
			if (holeIndoor.size != holeOutdoor.size) {
				continue
			}
			val points = arrayOf(Vector2(), Vector2(), Vector2(), Vector2())
			val temp = Vector2()
			val normal = Vector3()
			var ii = 0
			while (ii < holeIndoor.size) {
				points[0].set(holeIndoor[ii], holeIndoor[ii + 1])
				points[1].set(holeOutdoor[ii], holeOutdoor[ii + 1])
				if (ii == holeIndoor.size - 2) {
					points[2].set(holeIndoor[0], holeIndoor[1])
					points[3].set(holeOutdoor[0], holeOutdoor[1])
				} else {
					points[2].set(holeIndoor[ii + 2], holeIndoor[ii + 3])
					points[3].set(holeOutdoor[ii + 2], holeOutdoor[ii + 3])
				}
				temp.set(points[2].x, points[2].y).sub(points[0].x, points[0].y).nor().rotate90(-1)
				normal.set(temp.x * indoor.direction.x, temp.y, temp.x * indoor.direction.y)
				setVertexProjection(vertexes[0], indoor, points[0], normal)
				setVertexProjection(vertexes[1], outdoor, points[1], normal)
				setVertexProjection(vertexes[2], indoor, points[2], normal)
				setVertexProjection(vertexes[3], outdoor, points[3], normal)

				evaluateAreHoleCloseIsOnTopEdge(vertexes, height).let { holeCloseNearEdge ->
					holesOnTopEdge = holesOnTopEdge ?: mutableListOf()
					if (holeCloseNearEdge != null) {
						holesOnTopEdge?.add(holeCloseNearEdge)
					} else if (!isHoleCloseIsOnTheFloor(vertexes, flooringHeight)) {
						// do not build hole close if it's placed near the top or bottom of the wall
						builder.buildClose(vertexes[3], vertexes[1], vertexes[0])
						builder.buildClose(vertexes[2], vertexes[3], vertexes[0])
					} else {
						null
					}
				}
				ii += 2
			}
		}
		return holesOnTopEdge?.toTypedArray()
	}

	private fun setVertexProjection(vertex: Vertex, line: LineSegment, point: Vector2, normal: Vector3) {
		val x = to3DScale(point.x)
		vertex.uv.set(0f, 0f)
		vertex.normal.set(normal)
		vertex.position.set(
			to3DScale(line.start.x) + (x * line.direction.x),
			to3DScale(point.y),
			to3DScale(line.start.y) + (x * line.direction.y)
		)
	}

	protected open fun buildWallClose(temp: Array<Vertex>, startSide: Boolean, vararg segments: LineSegment) {
		for (segment in segments) {
			val start = to3DScale(Vector2(segment.start))
			val end = to3DScale(Vector2(segment.end))
			val normal = Vector2(segment.direction).rotate90(if (startSide) 1 else -1)
			val height = to3DScale(info.getHeight())
			for (vertex in temp) {
				vertex.normal.set(normal.x, 0f, normal.y)
			}
			temp[0].position.set(end.x, height, end.y)
			temp[1].position.set(start.x, height, start.y)
			temp[2].position.set(start.x, 0f, start.y)
			temp[3].position.set(end.x, 0f, end.y)
			buildWallCloseTriangle(temp[0], temp[1], temp[2], !startSide)
			buildWallCloseTriangle(temp[0], temp[2], temp[3], !startSide)
		}
	}

	private fun buildWallCloseTriangle(v0: Vertex, v1: Vertex, v2: Vertex, invertOrder: Boolean) {
		if (invertOrder) {
			buildWallCloseTriangle(v2, v1, v0, false)
		} else {
			builder.buildClose(v0, v1, v2)
		}
	}

	protected open fun buildWallSidePlane(
		temp: Array<Vertex>, infoSide: WallsBuilder3DSide, outer: Boolean, line: LineSegment
	) {
		val direction = Vector2(line.direction)
		val start = to3DScale(Vector2(line.start))
		val sideLength = to3DScale(line.length)
		var x: Float
		var y: Float
		val triangles = (if (outer) infoSide.bottom else infoSide.top).faces
		val vectorPerpendicular = Vector2(line.direction).rotate90(if (outer) -1 else 1)
		val normal = Vector3(vectorPerpendicular.x, 0f, vectorPerpendicular.y)
		temp[0].normal.set(normal)
		temp[1].normal.set(normal)
		temp[2].normal.set(normal)
		var i = 0
		var ii: Int
		while (i < triangles.size) {
			ii = 0
			while (ii < 3) {
				x = to3DScale(triangles[i + ii * 2])
				y = to3DScale(triangles[i + ii * 2 + 1])
				temp[ii].uv.set(if (outer) sideLength - x else x, -y)
				temp[ii].position.set(start.x + (x * direction.x), y, start.y + (x * direction.y))
				ii++
			}
			builder.buildSide(temp[0], temp[1], temp[2], outer)
			i += 6
		}
	}

	private fun buildWallSide(
		temp: Array<Vertex>, infoSide: WallsBuilder3DSide, outer: Boolean, edgeStart: LineSegment?, edgeEnd: LineSegment?
	) {
		val line = if (outer) wall.bottom else wall.top
		val sideLength = to3DScale(line.length)
		if (part == WallPart.All || (part == WallPart.SideOutdoor && outer) || (part == WallPart.SideIndoor && !outer)) {
			buildWallSidePlane(temp, infoSide, outer, line)
		}
		buildWallSideExtension(temp, outer, true, sideLength, edgeStart)
		buildWallSideExtension(temp, outer, false, sideLength, edgeEnd)
	}

	private fun buildWallSideExtension(
		temp: Array<Vertex>, outer: Boolean, startSide: Boolean, sideLength: Float, extension: LineSegment?
	) {
		if (extension == null || extension.length <= 0) {
			return
		}
		val start = to3DScale(Vector2(extension.start))
		val end = to3DScale(Vector2(extension.end))
		val normal = Vector2(extension.direction).rotate90(if (startSide) 1 else -1)
		val height = to3DScale(info.getHeight())
		val length = to3DScale(extension.length)
		for (vertex in temp) {
			vertex.normal.set(normal.x, 0f, normal.y)
		}
		val startU: Float
		val endU: Float
		if (outer) {
			startU = if (startSide) sideLength else 0f
			endU = startU + length * (if (startSide) 1 else -1)
		} else {
			endU = if (startSide) 0f else sideLength
			startU = endU + length * (if (startSide) -1 else 1)
		}
		temp[0].position.set(end.x, height, end.y)
		temp[0].uv.set(endU, -height)
		temp[1].position.set(start.x, height, start.y)
		temp[1].uv.set(startU, -height)
		temp[2].position.set(start.x, 0f, start.y)
		temp[2].uv.set(startU, 0f)
		temp[3].position.set(end.x, 0f, end.y)
		temp[3].uv.set(endU, 0f)
		buildWallSideExtensionTriangle(temp[0], temp[1], temp[2], outer, !startSide)
		buildWallSideExtensionTriangle(temp[0], temp[2], temp[3], outer, !startSide)
	}

	private fun buildWallSideExtensionTriangle(v0: Vertex, v1: Vertex, v2: Vertex, outer: Boolean, invert: Boolean) {
		if (invert) {
			buildWallSideExtensionTriangle(v2, v1, v0, outer, false)
		} else {
			builder.buildSide(v0, v1, v2, outer)
		}
	}

	private fun evaluateAreHoleCloseIsOnTopEdge(vertexes: Array<Vertex>, wallHeight: Float): FloatArray? {
		// Trying to find horizontal planes - meaning all y coordinates of their vertices are equal (very close to equal).
		// Planes of interest are the ones laying on the top edge of the wall.
		for (vertex in vertexes) {
			// Using this comparison instead of equalities to tackle float errors.
			if (vertex.position.y < wallHeight - 0.001) {
				return null
			}
		}
		return floatArrayOf(
			vertexes[3].position.x, vertexes[3].position.z,
			vertexes[1].position.x, vertexes[1].position.z,
			vertexes[0].position.x, vertexes[0].position.z,
			vertexes[2].position.x, vertexes[2].position.z,
		)
	}

	private fun isHoleCloseIsOnTheFloor(vertexes: Array<Vertex>, flooringHeight: Float): Boolean {
		for (vertex in vertexes) {
			if (vertex.position.y > flooringHeight + 0.001) {
				return false
			}
		}
		return true
	}

	private fun to3DScale(value: Float): Float = value * coordinate3DScale

	private fun to3DScale(value: Vector2): Vector2 = value.scl(coordinate3DScale)

}
