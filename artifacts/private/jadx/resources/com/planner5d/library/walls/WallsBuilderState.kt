package com.planner5d.library.walls

import com.planner5d.library.math.Vector2

class WallsBuilderState internal constructor(list:Array<Wall>, internal val notClosed: Boolean){

	internal val temp = Vector2()
	internal val list = Array(list.size) { WallsBuilderStateWall(WallsInfoWall(list[it])) }

	internal fun getNext(position:Int): WallsBuilderStateWall? = getPositionWithDelta(position, 1)

	internal fun getPrevious(position:Int): WallsBuilderStateWall? = getPositionWithDelta(position, -1)

	internal fun get(position:Int) = list[position]

	private fun getPositionWithDelta(position:Int, delta:Int): WallsBuilderStateWall? {
		var offset:Int = position + delta
		if (offset < 0) {
			if (notClosed) {
				return null
			}
			offset = list.size - 1
		} else if (offset >= list.size) {
			if (notClosed) {
				return null
			}
			offset = 0
		}
		return list[offset]
	}

	internal fun build(): WallsInfo = WallsInfo(Array(list.size) { list[it].info })

}
