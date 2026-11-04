package com.planner5d.library.dimensionline.item

import com.planner5d.library.math.Vector2

interface ItemWall : Item {

	fun isHidden(): Boolean

	/**
	 * @param side if null, return global coordinates of the start point
	 * @return global coordinates of the start point
	 */
	fun getStart(side: WallSide? = null): Vector2

	/**
	 * @param side if null, return global coordinates of the end point
	 * @return global coordinates of the end point
	 */
	fun getEnd(side: WallSide? = null): Vector2

	fun getThickness(): Float

	/**
	 * IMPORTANT:
	 * the order of points is influencing hit detection:
	 * start and end points of the wall sides should follow clockwise movement
	 * Outline                                     Outline
	 *  start                                        end
	 *   *------->---------------------------->-------*
	 *   |                                            |
	 *   * start                                  end *
	 *   |                                            |
	 *   *-------<----------------------------<-------*
	 * Inline                                       Inline
	 *  end                                         start
	 */
	enum class WallSide {
		InLine, OutLine
	}
}