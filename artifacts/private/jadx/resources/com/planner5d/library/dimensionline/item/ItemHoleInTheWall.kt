package com.planner5d.library.dimensionline.item

/**
 * Represents either Window or Door
 */
interface ItemHoleInTheWall : Item {

	fun getWall(): ItemWall?
}