package com.planner5d.library.mesh

import com.planner5d.library.math.RectanglesMerger
import com.planner5d.library.math.Tessellator
import com.planner5d.library.walls.WallHole
import com.planner5d.library.walls.WallsBuilder3D
import com.planner5d.library.walls.WallsInfo
import com.planner5d.library.walls.WallsInfoWall

class MeshBuilderWall(
	private val info: WallsInfo, private val wall: WallsInfoWall,
	private val part: WallsBuilder3D.WallPart, private val partCloseTop: WallsBuilder3D.WallPart?,
	private val holes: List<WallHole>,
	private val tessellator: Tessellator, private val rectanglesMerger: RectanglesMerger,
	private val flooringHeight: Float = 0f
) : MeshBuilder {

	override fun build(mesh: Mesh) {
		WallsBuilder3D(
			info, wall, part, partCloseTop, 1f, holes, tessellator, rectanglesMerger,
			MeshToWallsBuilder3DMeshAdapter(mesh), flooringHeight
		).build()
	}

}
