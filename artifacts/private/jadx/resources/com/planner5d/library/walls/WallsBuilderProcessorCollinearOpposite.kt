package com.planner5d.library.walls

import com.planner5d.library.math.Vector2

/**
 * Processor that handles collinear opposite walls and properly extends them
 */
class WallsBuilderProcessorCollinearOpposite : WallsBuilderProcessor {

	override fun process(
		previous: WallsBuilderStateWall?, center: WallsBuilderStateWall, next:WallsBuilderStateWall?, temp: Vector2
	) {
		previous?.let { process(it, center, temp) }
		next?.let { process(center, it, temp) }
	}

	/**
	 * We simply extends both previous and next walls (if they are collinear opposite)
	 *
	 * Walls are extend to cut off distance (from sharp corners processor)
	 *
	 * @param previous
	 * @param next
	 */
	private fun process(previous:WallsBuilderStateWall, next:WallsBuilderStateWall, temp: Vector2) {
		if (previous.info.middle.direction.isCollinearOpposite(next.info.middle.direction)) {
			val offset = WallsBuilderProcessorSharpCorners.getCutOffDistance(previous, next)
			temp.set(previous.infoDefault.middle.direction).scl(offset)
			previous.setNewEnd(
				Vector2(previous.infoDefault.bottom.end).add(temp),
				Vector2(previous.infoDefault.top.end).add(temp), null
			)
			temp.set(next.infoDefault.middle.direction).scl(-offset)
			next.setNewStart(
				Vector2(next.infoDefault.bottom.start).add(temp),
				Vector2(next.infoDefault.top.start).add(temp), null
			)
		}
	}

}
