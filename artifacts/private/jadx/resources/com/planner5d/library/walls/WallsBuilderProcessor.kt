package com.planner5d.library.walls

import com.planner5d.library.math.Vector2

interface WallsBuilderProcessor {

	fun process(
		previous: WallsBuilderStateWall?, center: WallsBuilderStateWall, next: WallsBuilderStateWall?, temp: Vector2
	)

}
