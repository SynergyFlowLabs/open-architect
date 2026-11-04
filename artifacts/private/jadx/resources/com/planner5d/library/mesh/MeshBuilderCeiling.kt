package com.planner5d.library.mesh

import com.planner5d.library.math.*
import com.planner5d.library.walls.WallsInfo
import com.planner5d.library.walls.WallsInfoWall


open class MeshBuilderCeiling(
	protected val info: WallsInfo, protected val tessellator: Tessellator, private val roof: Boolean, private val y: Float
) : MeshBuilder {

	override fun build(mesh: Mesh) {
		if (roof) {
			buildMesh(mesh, TesselatorUtils.tesselatePath(tessellator, getTrianglesRoof().toTypedArray()), false)
		}
		buildMesh(mesh, TesselatorUtils.tesselatePath(tessellator, info.getPathClean(WallsInfoWall.Side.Bottom)), true)
	}

	private fun getTrianglesRoof(): List<Vector2> {
		val vector = Vector2()
		val floorPoints = mutableListOf<Vector2>()
		val walls: Array<WallsInfoWall> = info.get()
		for (wall in walls) {
			floorPoints.add(Vector2(vector.set(wall.bottom.start).x, vector.y))
			floorPoints.add(Vector2(vector.set(wall.bottom.end).x, vector.y))
		}
		return floorPoints
	}

	private fun buildMesh(mesh: Mesh, triangles: FloatArray, reverse: Boolean) {
		val normal = Vector3(0f, if (reverse) -1f else 1f, 0f)
		val uScale: Float = if (reverse) -1f else 1f
		val vertex0 = Vertex().setNormal(normal.x, normal.y, normal.z)
		val vertex1 = Vertex().setNormal(normal.x, normal.y, normal.z)
		val vertex2 = Vertex().setNormal(normal.x, normal.y, normal.z)
		for (i in triangles.indices step 6) {
			vertex0.setPosition(triangles[i], y, triangles[i + 1]).setUV(vertex0.position.x * uScale, vertex0.position.z)
			vertex1.setPosition(triangles[i + 2], y, triangles[i + 3]).setUV(vertex1.position.x * uScale, vertex1.position.z)
			vertex2.setPosition(triangles[i + 4], y, triangles[i + 5]).setUV(vertex2.position.x * uScale, vertex2.position.z)
			if (reverse) {
				mesh.addTriangle(vertex2, vertex1, vertex0)
			} else {
				mesh.addTriangle(vertex0, vertex1, vertex2)
			}
		}
	}

}
