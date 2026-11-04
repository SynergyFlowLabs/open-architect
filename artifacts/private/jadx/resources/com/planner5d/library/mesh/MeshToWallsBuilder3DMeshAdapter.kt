package com.planner5d.library.mesh

import com.planner5d.library.math.Vertex
import com.planner5d.library.walls.WallsBuilder3DMesh

class MeshToWallsBuilder3DMeshAdapter(private val mesh: Mesh) : WallsBuilder3DMesh {

	override fun buildClose(v0: Vertex, v1: Vertex, v2: Vertex) {
		mesh.addTriangle(v0, v1, v2)
	}

	override fun buildSide(v0: Vertex, v1: Vertex, v2: Vertex, outside: Boolean) {
		mesh.addTriangle(v0, v1, v2)
	}

}