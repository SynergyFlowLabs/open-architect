package com.planner5d.library.mesh

import com.planner5d.library.walls.WallsInfo

/**
 * @param info
 * @param y
 * @param roof if true will also include roof (part that is visible if you look from above room)
 */
data class BuildRequestCeiling(val info: WallsInfo, val y: Float, val roof: Boolean) : MeshBuilderFactory.BuildRequest
