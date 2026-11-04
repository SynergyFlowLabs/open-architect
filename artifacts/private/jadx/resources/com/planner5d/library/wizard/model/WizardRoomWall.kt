package com.planner5d.library.wizard.model

import com.planner5d.library.math.Vector2
import com.planner5d.library.walls.Wall

class WizardRoomWall(
    val start: Vector2, val end: Vector2, val color: WizardWallColor?, val number: Int,
    val width: Float?
) : Wall {

    val direction = Vector2(end).sub(start).nor()

    private var constraint: WizardRoomWallConstraint? = null

    fun hasPoint(point: Vector2): Boolean {
        return point == start || point == end
    }

    fun setConstraint(constraint: WizardRoomWallConstraint?) {
        this.constraint = constraint
    }

    override fun getHeight() = 270f

    override fun getWidth() = width ?: 10f

    override fun getMinimumWidth() = Wall.MINIMUM_WIDTH

    override fun isZero() = start == end

    override fun isHidden() = false

    override fun getPoint(
        vector: Vector2, globalCoordinates: Boolean, startPoint: Boolean
    ): Vector2 = vector.set(if (startPoint) start else end)

    override fun getOrigin(origin: Vector2) = origin.set(0f, 0f)
}