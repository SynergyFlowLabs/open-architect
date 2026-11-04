package com.planner5d.library.mesh

import com.planner5d.library.walls.WallsInfoWall

data class BuildRequestFlooringWall(
    val wallInfo: WallsInfoWall, val floorZ: Float, val flooringHeight: Float
) : MeshBuilderFactory.BuildRequest