package com.planner5d.library.walls

import com.planner5d.library.math.Vector2

/**
 * Simple wall class - mainly used Python projects (AI, Render Tools)
 */
class WallSimple(
	private val start:Vector2, private val end:Vector2,
	private val thickness:Float = 10f, private val height:Float = 270f, private val hidden:Boolean = false,
	private val origin:Vector2 = Vector2(0f, 0f)
) : Wall {

	override fun getHeight() = height

	override fun getWidth() = thickness

	override fun getMinimumWidth() = Wall.MINIMUM_WIDTH

	override fun isZero() = start == end

	override fun isHidden() = hidden

	override fun getPoint(vector:Vector2, globalCoordinates:Boolean, startPoint:Boolean) : Vector2 =
		vector.set(if (startPoint) start else end)

	override fun getOrigin(origin:Vector2) = origin.set(this.origin)

	fun toWall(): Wall = this

	override fun toString() = "WallSimple(w=$thickness h=$height hidden=$hidden start=$start end=$end origin=$origin)"
}