package com.planner5d.library.mesh

import com.planner5d.library.math.RectanglesMerger
import com.planner5d.library.math.Tessellator

class MeshBuilderFactoryDefault(
	private val tessellator: Tessellator, private val rectanglesMerger: RectanglesMerger
) : MeshBuilderFactory {

	override fun create(request: MeshBuilderFactory.BuildRequest): MeshBuilder = when (request) {
		is BuildRequestWall -> MeshBuilderWall(
			request.info, request.wall, request.part, request.partCloseTop, request.holes,
			tessellator, rectanglesMerger, request.flooringHeight
		)
		is BuildRequestCeiling -> MeshBuilderCeiling(request.info, tessellator, request.roof, request.y)
		is BuildRequestFlooring -> MeshBuilderFlooring(request.info, tessellator, request.fistFloor, request.y)
		is BuildRequestFlooringWall -> MeshBuilderFlooringWall(
			request.wallInfo, request.floorZ, request.flooringHeight
		)

		else -> throw NotImplementedError("Unsupported build request: ${request::class.qualifiedName}")
	}
}
