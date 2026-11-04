package com.planner5d.library.math

import kotlin.jvm.JvmField
import kotlin.math.*

/**
 * Encapsulates a 2D vector. Allows chaining methods by returning a reference to itself
 *
 * ! This is port of com.badlogic.gdx.math.Vector2 to Kotlin
 *
 * Constructs a vector with the given components
 * @param x The x-component
 * @param y The y-component
 */
open class Vector2(@JvmField var x: Float, @JvmField var y: Float) {

	/** Constructs a new vector at (0,0)  */
	constructor() : this(0f, 0f)

	/** Constructs a vector from the given vector
	 * @param v The vector
	 */
	constructor(v: Vector2) : this(v.x, v.y)

	open fun len(): Float = sqrt(x * x + y * y.toDouble()).toFloat()

	open fun len2(): Float = x * x + y * y

	open fun set(v: Vector2): Vector2 = set(v.x, v.y)

	/** Sets the components of this vector
	 * @param x The x-component
	 * @param y The y-component
	 * @return This vector for chaining
	 */
	open fun set(x: Float, y: Float): Vector2 {
		this.x = x
		this.y = y
		return this
	}

	open fun sub(v: Vector2): Vector2 = sub(v.x, v.y)

	/** Substracts the other vector from this vector.
	 * @param x The x-component of the other vector
	 * @param y The y-component of the other vector
	 * @return This vector for chaining
	 */
	open fun sub(x: Float, y: Float): Vector2 = add(-x, -y)

	open fun nor(): Vector2 {
		val len = len()
		if (len != 0f) {
			x /= len
			y /= len
		}
		return this
	}

	open fun add(v: Vector2): Vector2 = add(v.x, v.y)

	/** Adds the given components to this vector
	 * @param x The x-component
	 * @param y The y-component
	 * @return This vector for chaining
	 */
	open fun add(x: Float, y: Float): Vector2 {
		this.x += x
		this.y += y
		return this
	}

	open fun dot(v: Vector2): Float = dot(v.x, v.y)

	open fun dot(ox: Float, oy: Float): Float = x * ox + y * oy

	open fun scl(scalar: Float): Vector2 = scl(scalar, scalar)

	/** Multiplies this vector by a scalar
	 * @return This vector for chaining
	 */
	open fun scl(x: Float, y: Float): Vector2 {
		this.x *= x
		this.y *= y
		return this
	}

	open fun scl(v: Vector2): Vector2 = scl(v.x, v.y)

	open fun mulAdd(vec: Vector2, scalar: Float): Vector2 = add(vec.x * scalar, vec.y * scalar)

	open fun mulAdd(vec: Vector2, mulVec: Vector2): Vector2 = add(vec.x * mulVec.x, vec.y * mulVec.y)

	open fun dst(v: Vector2): Float = dst(v.x, v.y)

	/** @param x The x-component of the other vector
	 * @param y The y-component of the other vector
	 * @return the distance between this and the other vector
	 */
	open fun dst(x: Float, y: Float): Float {
		val x_d = x - this.x
		val y_d = y - this.y
		return sqrt(x_d * x_d + y_d * y_d.toDouble()).toFloat()
	}

	open fun dst2(v: Vector2): Float = dst2(v.x, v.y)

	/** @param x The x-component of the other vector
	 * @param y The y-component of the other vector
	 * @return the squared distance between this and the other vector
	 */
	open fun dst2(x: Float, y: Float): Float {
		val x_d = x - this.x
		val y_d = y - this.y
		return x_d * x_d + y_d * y_d
	}

	open fun limit(limit: Float): Vector2 {
		return limit2(limit * limit)
	}

	open fun limit2(limit2: Float): Vector2 {
		val len2 = len2()
		return if (len2 > limit2) scl(sqrt(limit2 / len2.toDouble()).toFloat()) else this
	}

	open fun clamp(min: Float, max: Float): Vector2 {
		val len2 = len2()
		if (len2 == 0f) return this
		val max2 = max * max
		if (len2 > max2) return scl(sqrt(max2 / len2.toDouble()).toFloat())
		val min2 = min * min
		return if (len2 < min2) scl(sqrt(min2 / len2.toDouble()).toFloat()) else this
	}

	open fun setLength(len: Float): Vector2 = setLength2(len * len)

	open fun setLength2(len2: Float): Vector2 {
		val oldLen2 = len2()
		return if (oldLen2 == 0f || oldLen2 == len2) this else scl(sqrt(len2 / oldLen2.toDouble()).toFloat())
	}

	override fun toString(): String = "[$x:$y]"

	/** Calculates the 2D cross product between this and the given vector.
	 * @param v the other vector
	 * @return the cross product
	 */
	open fun crs(v: Vector2): Float = x * v.y - y * v.x

	/** Calculates the 2D cross product between this and the given vector.
	 * @param x the x-coordinate of the other vector
	 * @param y the y-coordinate of the other vector
	 * @return the cross product
	 */
	open fun crs(x: Float, y: Float): Float = this.x * y - this.y * x

	/** @return the angle in degrees of this vector (point) relative to the x-axis. Angles are towards the positive y-axis (typically
	 * counter-clockwise) and between 0 and 360.
	 */
	open fun angle(): Float {
		var angle: Float = toDegrees(atan2(y.toDouble(), x.toDouble())).toFloat()
		if (angle < 0) {
			angle += 360f
		}
		return angle
	}

	/** @return the angle in degrees of this vector (point) relative to the given vector. Angles are towards the positive y-axis
	 * (typically counter-clockwise.) between -180 and +180
	 */
	open fun angle(reference: Vector2): Float =
		toDegrees(atan2(crs(reference).toDouble(), dot(reference).toDouble())).toFloat()

	/** @return the angle in radians of this vector (point) relative to the x-axis. Angles are towards the positive y-axis.
	 * (typically counter-clockwise)
	 */
	open fun angleRad(): Float = atan2(y.toDouble(), x.toDouble()).toFloat()

	/** @return the angle in radians of this vector (point) relative to the given vector. Angles are towards the positive y-axis.
	 * (typically counter-clockwise.)
	 */
	open fun angleRad(reference: Vector2): Float = atan2(crs(reference).toDouble(), dot(reference).toDouble()).toFloat()

	/** Sets the angle of the vector in degrees relative to the x-axis, towards the positive y-axis (typically counter-clockwise).
	 * @param degrees The angle in degrees to set.
	 */
	open fun setAngle(degrees: Float): Vector2 = setAngleRad(toRadians(degrees.toDouble()).toFloat())

	/** Sets the angle of the vector in radians relative to the x-axis, towards the positive y-axis (typically counter-clockwise).
	 * @param radians The angle in radians to set.
	 */
	open fun setAngleRad(radians: Float): Vector2 {
		set(len(), 0f)
		rotateRad(radians)
		return this
	}

	/** Rotates the Vector2 by the given angle, counter-clockwise assuming the y-axis points up.
	 * @param degrees the angle in degrees
	 */
	open fun rotate(degrees: Float): Vector2 = rotateRad(toRadians(degrees.toDouble()).toFloat())

	/** Rotates the Vector2 by the given angle, counter-clockwise assuming the y-axis points up.
	 * @param radians the angle in radians
	 */
	open fun rotateRad(radians: Float): Vector2 {
		val cos = cos(radians.toDouble()).toFloat()
		val sin = sin(radians.toDouble()).toFloat()
		return set(x * cos - y * sin, x * sin + y * cos)
	}

	open fun rotateRadAroundCenter(radians: Float, center: Vector2): Vector2 {
		val cos = cos(radians.toDouble()).toFloat()
		val sin = sin(radians.toDouble()).toFloat()
		val dx = x - center.x
		val dy = y - center.y
		return set(dx * cos - dy * sin + center.x, dx * sin + dy * cos + center.y)
	}

	/** Rotates the Vector2 by 90 degrees in the specified direction, where >= 0 is counter-clockwise and < 0 is clockwise.  */
	open fun rotate90(dir: Int): Vector2 {
		val x = x
		if (dir >= 0) {
			this.x = -y
			y = x
		} else {
			this.x = y
			y = -x
		}
		return this
	}

	open fun lerp(target: Vector2, alpha: Float): Vector2 {
		val invAlpha = 1.0f - alpha
		x = x * invAlpha + target.x * alpha
		y = y * invAlpha + target.y * alpha
		return this
	}

	open fun isUnit(): Boolean = isUnit(0.000000001f)

	open fun isUnit(margin: Float): Boolean = abs(len2() - 1f) < margin

	open fun isZero(): Boolean = x == 0f && y == 0f

	open fun isZero(margin: Float): Boolean = len2() < margin

	open fun isOnLine(other: Vector2): Boolean = com.planner5d.library.math.isZero(x * other.y - y * other.x)

	open fun isOnLine(other: Vector2, epsilon: Float): Boolean = isZero(x * other.y - y * other.x, epsilon)

	open fun isCollinear(other: Vector2, epsilon: Float): Boolean = isOnLine(other, epsilon) && dot(other) > 0f

	open fun isCollinear(other: Vector2): Boolean = isOnLine(other) && dot(other) > 0f

	open fun isCollinearOpposite(other: Vector2, epsilon: Float): Boolean = isOnLine(other, epsilon) && dot(other) < 0f

	open fun isCollinearOpposite(other: Vector2): Boolean = isOnLine(other) && dot(other) < 0f

	open fun isPerpendicular(vector: Vector2): Boolean = com.planner5d.library.math.isZero(dot(vector))

	open fun isPerpendicular(vector: Vector2, epsilon: Float): Boolean = isZero(dot(vector), epsilon)

	open fun hasSameDirection(vector: Vector2): Boolean = dot(vector) > 0

	open fun hasOppositeDirection(vector: Vector2): Boolean = dot(vector) < 0

	open fun setZero(): Vector2 = set(0f, 0f)

	open fun epsilonEquals(other: Vector2?, epsilon: Float): Boolean {
		if (other == null || abs(other.x - x) > epsilon) {
			return false
		}
		return abs(other.y - y) <= epsilon
	}

	/** Compares this vector with the other vector, using the supplied epsilon for fuzzy equality testing.
	 * @return whether the vectors are the same.
	 */
	open fun epsilonEquals(x: Float, y: Float, epsilon: Float): Boolean =
		if (abs(x - this.x) > epsilon) false else abs(y - this.y) <= epsilon

	override fun equals(other: Any?): Boolean {
		if (this === other) {
			return true
		}
		if (other == null || other !is Vector2) {
			return false
		}
		return x.toBits() == other.x.toBits() && y.toBits() == other.y.toBits()
	}

	override fun hashCode(): Int {
		val prime = 31
		return prime * (prime + x.toBits()) + y.toBits()
	}

}

fun Array<Vector2>.toFloatArray(): FloatArray {
	// We don't use shorter versions of this conversion (with flatMap or fold)
	// because these implementations will require more allocations.
	val floatArray = FloatArray(this.size * 2)
	var shiftedIndex: Int
	for (index in this.indices) {
		shiftedIndex = index * 2
		floatArray[shiftedIndex] = this[index].x
		floatArray[shiftedIndex + 1] = this[index].y
	}
	return floatArray
}
