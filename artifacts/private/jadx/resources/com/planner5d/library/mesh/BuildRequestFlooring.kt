package com.planner5d.library.mesh

import com.planner5d.library.walls.WallsInfo

/**
 * @param info
 * @param y
 * @param fistFloor if true not include flooring (part that is visible if you look from bottom of the room)
 */
data class BuildRequestFlooring(val info: WallsInfo, val y: Float, val fistFloor: Boolean) : MeshBuilderFactory.BuildRequest
