package com.planner5d.library.mesh

import com.planner5d.library.math.Vertex

interface Mesh {

	fun addTriangle(v0: Vertex, v1: Vertex, v2: Vertex)
}