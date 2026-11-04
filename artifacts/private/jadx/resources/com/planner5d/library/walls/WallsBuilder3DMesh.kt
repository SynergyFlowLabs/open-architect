package com.planner5d.library.walls

import com.planner5d.library.math.Vertex

interface WallsBuilder3DMesh {

	fun buildClose(v0:Vertex, v1:Vertex, v2:Vertex)

	fun buildSide(v0:Vertex, v1:Vertex, v2:Vertex, outside: Boolean)

}