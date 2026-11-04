package com.planner5d.library.walls

import com.planner5d.library.math.Vector2

/**
 * Single ItemRoom, ItemGround or ItemPartition walls info
 */
class WallsInfo internal constructor(private val list: Array<WallsInfoWall>) {

	private var height: Float? = null
	private var wall: Wall? = if (list.isEmpty()) null else list[0].wall
	private val closed = WallsUtils.isClosedLoop(list)

	override fun toString() = "WallsInfo(list=${list.joinToString()} wall=$wall height=$height"

	fun getHeight(): Float {
		var height = this.height
		if (height == null) {
			height = wall?.getHeight() ?: 0f
			this.height = height
			return height
		}
		return height
	}

	fun getOrigin(): Vector2? = if (list.isEmpty()) null else wall?.getOrigin(Vector2())

	fun get(): Array<WallsInfoWall> = list

	fun getList(): List<WallsInfoWall> = list.toList()

	fun get(wall: Wall): WallsInfoWall? {
		for (info in list) {
			if (info.wall == wall) {
				return info
			}
		}
		return null
	}

	fun getPrevious(wall: WallsInfoWall): WallsInfoWall? = getWithDelta(wall, -1)

	fun getNext(wall: WallsInfoWall): WallsInfoWall? = getWithDelta(wall, 1)

	private fun getWithDelta(wall: WallsInfoWall?, delta: Int): WallsInfoWall? {
		if (list.size <= 1 || wall == null) {
			return null
		}
		var position: Int? = null
		for (i in 0 until list.size) {
			if (list[i] == wall) {
				position = i
				break
			}
		}
		if (position == null) {
			return null
		}
		position += delta
		if (position < 0) {
			position = list.size - 1
			if (!closed) {
				return null
			}
		} else if (position >= list.size) {
			position = 0
			if (!closed) {
				return null
			}
		}
		return list[position]
	}

	fun getPath(side: WallsInfoWall.Side): Array<Vector2> {
		val path: MutableList<Vector2> = mutableListOf()
		if (list.size > 2) {
			for (wall in list) {
				getPrevious(wall)?.let {
					if (side == WallsInfoWall.Side.Top) {
						addPathWallTop(path, it, wall)
					} else {
						addPathWallBottom(path, it, wall)
					}
				}
			}
		}
		return path.toTypedArray()
	}

	fun getPathClean(side: WallsInfoWall.Side = WallsInfoWall.Side.Bottom): Array<Vector2> {
		val path: MutableList<Vector2> = ArrayList()
		for (wallsInfoWall in list) {
			if (WallsUtils.areConnected(getNext(wallsInfoWall), wallsInfoWall) &&
				WallsUtils.areConnected(wallsInfoWall, getPrevious(wallsInfoWall))
			) {
				if (WallsUtils.isTheSameWall(wallsInfoWall, getNext(wallsInfoWall)) ||
					WallsUtils.isTheSameWall(wallsInfoWall, getPrevious(wallsInfoWall))
				) {
					continue
				}
				if (side == WallsInfoWall.Side.Top) {
					WallsUtils.addPoint(path, wallsInfoWall.top.start)
					WallsUtils.addPoint(path, wallsInfoWall.top.end)
				} else {
					WallsUtils.addPoint(path, wallsInfoWall.bottom.start)
					WallsUtils.addPoint(path, wallsInfoWall.bottom.end)
				}
			}
		}
		return path.toTypedArray()
	}

	private fun addPathWallTop(path: MutableList<Vector2>, previous: WallsInfoWall, wall: WallsInfoWall) {
		if (previous.end.size > 1 && previous.top.end != wall.top.start) {
			addPoint(path, previous.end.last().end)
			addPoint(path, wall.start.last().end)
		}
		addPoint(path, wall.top.start)
		addPoint(path, wall.top.end)
	}

	private fun addPathWallBottom(path: MutableList<Vector2>, previous: WallsInfoWall, wall: WallsInfoWall) {
		if (previous.end.size > 1 && previous.bottom.end != wall.bottom.start) {
			addPoint(path, previous.end.first().start)
			addPoint(path, wall.start.first().start)
		}
		addPoint(path, wall.bottom.start)
		addPoint(path, wall.bottom.end)
	}

	private fun addPoint(path: MutableList<Vector2>, point: Vector2) {
		if (path.isEmpty() || path[path.size - 1] != point) {
			path.add(point)
		}
	}

}
