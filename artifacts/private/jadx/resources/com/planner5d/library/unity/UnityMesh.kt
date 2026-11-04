package com.planner5d.library.unity

import com.planner5d.library.math.Vertex
import com.planner5d.library.mesh.Mesh

class UnityMesh : Mesh {

	val vertices = mutableListOf<Vertex>()

	fun add(vertex: Vertex) = apply {
		vertices.add(Vertex(vertex.position, vertex.normal, vertex.uv))
	}

	override fun addTriangle(v0: Vertex, v1: Vertex, v2: Vertex) {
		vertices.add(v0)
		vertices.add(v1)
		vertices.add(v2)
	}

}