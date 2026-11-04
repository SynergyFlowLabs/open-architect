package com.planner5d.library.walls

import com.planner5d.library.math.LineSegment
import com.planner5d.library.math.Vector2

/**
 * Single wall info
 *
 * Wall described here is formed like this:
 * • →  top   → •
 * ↑            ↑
 * start      end
 * ↑            ↑
 * • → bottom → •
 *
 *
 * top: top.start → top.end (wall inner side)
 * bottom: bottom.start → bottom.end (wall outer side)
 * start: bottom.start → start[0] → ... → start[N] → top.start (wall start side)
 * end: bottom.end → end[0] → ... → end[N] → top.end (wall end side)
 *
 * When walls are in a string (for example for a room or partition) they will be in CCW order (Counter Clock Wise)
 */
open class WallsInfoWall {

	/**
	 * Line between start and end point of ItemWall
	 */
	val middle: LineSegment

	/**
	 * Start side of wall (can be made of several line segments)
	 */
	val start:Array<LineSegment>

	/**
	 * Top side of wall (this is also inside part of wall)
	 */
	val top: LineSegment

	/**
	 * End side of wall (can be made of several line segments)
	 */
	val end:Array<LineSegment>

	/**
	 * Bottom side of wall (this is also outside part of wall)
	 */
	val bottom: LineSegment

	/**
	 * Wall for which this info is used
	 */
	val wall: Wall

	enum class Side {

		Top, Bottom, Start, End;

		fun opposite() : Side = when (this) {
			Top -> Bottom
			Bottom -> Top
			Start -> End
			End -> Start
		}

	}

	constructor(
		wall: Wall, top: LineSegment, middle: LineSegment, bottom: LineSegment,
		start:Array<LineSegment>, end:Array<LineSegment>
	) {
		this.wall = wall
		this.top = top
		this.middle = middle
		this.bottom = bottom
		this.start = start
		this.end = end
	}

	constructor(info: WallsInfoWall) : this(info.wall, info.top, info.middle, info.bottom)

	constructor (wall: Wall) {
		val minimumWidth = wall.getMinimumWidth().toFloat()
		this.wall = wall
		middle = LineSegment(wall.getPoint(Vector2(), false, true), wall.getPoint(Vector2(), false, false))
		val perpendicular: Vector2 = Vector2(middle.direction).rotate90(1)
		val temp: Vector2 = Vector2(perpendicular).scl(wall.getWidth() - minimumWidth)
		top = LineSegment(Vector2(middle.start).add(temp), temp.add(middle.end))
		bottom = LineSegment(Vector2(middle.start).add(temp.set(perpendicular).scl(-minimumWidth)), temp.add(middle.end))
		start = LineSegment.path(bottom.start, top.start)
		end = LineSegment.path(bottom.end, top.end)
	}

	/**
	 * Create wall info and create side lines by using top / bottom walls start / end points
	 *
	 * @param wall
	 * @param top
	 * @param middle
	 * @param bottom
	 */
	constructor(wall: Wall, top: LineSegment, middle: LineSegment, bottom: LineSegment) : this(
		wall, top, middle, bottom,
		LineSegment.path(bottom.start, top.start), LineSegment.path(bottom.end, top.end)
	)

	override fun toString() = "WallsInfoWall(" +
		"w=$wall top=$top middle=$middle bottom=$bottom start=${start.joinToString()} end=${end.joinToString()})"

	fun getPath() : Array<Vector2> {
		val path:MutableList<Vector2> = mutableListOf()
		for (segment in start) {
			path.add(Vector2(segment.start))
		}
		path.add(Vector2(top.start))
		for (i in end.size - 1 downTo 0) {
			path.add(Vector2(end[i].end))
		}
		path.add(Vector2(bottom.end))
		path.add(Vector2(bottom.start))
		return path.toTypedArray()
	}

	fun getPolygonPoints(offsetWithOrigin:Boolean): FloatArray {
		val path = getPath()
		val points = FloatArray((path.size - 1) * 2)
		val origin = Vector2()
		if (offsetWithOrigin) {
			wall.getOrigin(origin)
		}
		for (i in 0 .. path.size - 2) {
			points[i * 2] = path[i].add(origin).x
			points[i * 2 + 1] = path[i].y
		}
		return points
	}

	fun getStartOrEnd(side:Side) : Array<LineSegment> = if (side == Side.Start) start else end

	fun getTopOrBottom(side:Side) : LineSegment = if (side == Side.Top) top else bottom

}
