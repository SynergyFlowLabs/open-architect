package com.planner5d.library.mesh

import com.planner5d.library.math.Vector2
import com.planner5d.library.walls.WallHole
import com.planner5d.library.walls.WallsBuilder3D
import com.planner5d.library.walls.WallsInfo
import com.planner5d.library.walls.WallsInfoWall
import kotlin.jvm.JvmField

data class BuildRequestWall(
	val info: WallsInfo, val wall: WallsInfoWall, val holes: List<WallHole>, val part: WallsBuilder3D.WallPart,
	val partCloseTop: WallsBuilder3D.WallPart?, val flooringHeight: Float = 0f
) : MeshBuilderFactory.BuildRequest {

	@JvmField
	protected val origin: Vector2? = info.getOrigin()

	@JvmField
	val hidden: Boolean = info.getHeight() <= 0 || wall.wall.isHidden() || origin == null
}