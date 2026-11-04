package com.planner5d.library.mesh

interface MeshBuilderFactory {
	interface BuildRequest

	fun create(request: BuildRequest): MeshBuilder
}