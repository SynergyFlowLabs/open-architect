package com.planner5d.library.math

import kotlin.jvm.JvmField
import kotlin.math.abs
import kotlin.math.sqrt

open class Vector3(@JvmField var x: Float = 0f, @JvmField var y: Float = 0f, @JvmField var z: Float = 0f) {

	constructor(vector: Vector3) : this(vector.x, vector.y, vector.z)

	constructor(values: FloatArray) : this(values[0], values[1], values[2])

	open fun set(x: Float, y: Float, z: Float) = apply {
		this.x = x
		this.y = y
		this.z = z
	}

	open fun set(vector: Vector3) = set(vector.x, vector.y, vector.z)

	open fun scl(scalar: Float) = set(x * scalar, y * scalar, z * scalar)

	override fun toString(): String = "[$x:$y:$z]"

	open fun set(values: FloatArray) = set(values[0], values[1], values[2])

	operator fun set(vector: Vector2, z: Float) = set(vector.x, vector.y, z)

	open fun cpy() = Vector3(this)

	open fun add(vector: Vector3) = add(vector.x, vector.y, vector.z)

	open fun add(x: Float, y: Float, z: Float) = set(this.x + x, this.y + y, this.z + z)

	open fun add(values: Float) = set(x + values, y + values, z + values)

	open fun sub(a_vec: Vector3) = sub(a_vec.x, a_vec.y, a_vec.z)

	open fun sub(x: Float, y: Float, z: Float) = set(this.x - x, this.y - y, this.z - z)

	open fun sub(value: Float) = set(x - value, y - value, z - value)

	open fun scl(other: Vector3) = set(x * other.x, y * other.y, z * other.z)

	open fun scl(vx: Float, vy: Float, vz: Float) = set(x * vx, y * vy, z * vz)

	open fun mulAdd(vec: Vector3, scalar: Float) = apply {
		x += vec.x * scalar
		y += vec.y * scalar
		z += vec.z * scalar
	}

	open fun mulAdd(vec: Vector3, mulVec: Vector3) = apply {
		x += vec.x * mulVec.x
		y += vec.y * mulVec.y
		z += vec.z * mulVec.z
	}

	open fun len(x: Float, y: Float, z: Float) = sqrt((x * x + y * y + z * z).toDouble()).toFloat()

	open fun len() = sqrt((x * x + y * y + z * z).toDouble()).toFloat()

	open fun len2(x: Float, y: Float, z: Float) = x * x + y * y + z * z

	open fun len2() = x * x + y * y + z * z

	open fun idt(vector: Vector3) = x == vector.x && y == vector.y && z == vector.z

	open fun dst(x1: Float, y1: Float, z1: Float, x2: Float, y2: Float, z2: Float): Float {
		val a = x2 - x1
		val b = y2 - y1
		val c = z2 - z1
		return sqrt((a * a + b * b + c * c).toDouble()).toFloat()
	}

	open fun dst(vector: Vector3): Float {
		val a = vector.x - x
		val b = vector.y - y
		val c = vector.z - z
		return sqrt((a * a + b * b + c * c).toDouble()).toFloat()
	}

	open fun dst(x: Float, y: Float, z: Float): Float {
		val a = x - this.x
		val b = y - this.y
		val c = z - this.z
		return sqrt((a * a + b * b + c * c).toDouble()).toFloat()
	}

	open fun dst2(x1: Float, y1: Float, z1: Float, x2: Float, y2: Float, z2: Float): Float {
		val a = x2 - x1
		val b = y2 - y1
		val c = z2 - z1
		return a * a + b * b + c * c
	}

	open fun dst2(point: Vector3): Float {
		val a = point.x - x
		val b = point.y - y
		val c = point.z - z
		return a * a + b * b + c * c
	}

	open fun dst2(x: Float, y: Float, z: Float): Float {
		val a = x - this.x
		val b = y - this.y
		val c = z - this.z
		return a * a + b * b + c * c
	}

	open fun nor(): Vector3 {
		val len2 = len2()
		return if (len2 == 0f || len2 == 1f) this else this.scl(1f / sqrt(len2.toDouble()).toFloat())
	}

	open fun dot(x1: Float, y1: Float, z1: Float, x2: Float, y2: Float, z2: Float) = x1 * x2 + y1 * y2 + z1 * z2

	open fun dot(vector: Vector3) = x * vector.x + y * vector.y + z * vector.z

	open fun dot(x: Float, y: Float, z: Float) = this.x * x + this.y * y + this.z * z

	open fun crs(vector: Vector3) = set(y * vector.z - z * vector.y, z * vector.x - x * vector.z, x * vector.y - y * vector.x)

	open fun crs(x: Float, y: Float, z: Float) = set(this.y * z - this.z * y, this.z * x - this.x * z, this.x * y - this.y * x)

	open fun isUnit() = isUnit(0.000000001f)

	open fun isUnit(margin: Float) = abs(len2() - 1f) < margin

	open fun isZero() = (x == 0f) && (y == 0f) && (z == 0f)

	open fun isZero(margin: Float) = len2() < margin

	open fun isOnLine(other: Vector3, epsilon: Float) =
		len2(y * other.z - z * other.y, z * other.x - x * other.z, x * other.y - y * other.x) <= epsilon

	open fun isOnLine(other: Vector3) = isOnLine(other, 0.000001f)

	open fun isCollinear(other: Vector3, epsilon: Float) = isOnLine(other, epsilon) && hasSameDirection(other)

	open fun isCollinear(other: Vector3) = isOnLine(other) && hasSameDirection(other)

	open fun isCollinearOpposite(other: Vector3, epsilon: Float) = isOnLine(other, epsilon) && hasOppositeDirection(other)

	open fun isCollinearOpposite(other: Vector3) = isOnLine(other) && hasOppositeDirection(other)

	open fun isPerpendicular(vector: Vector3) = isZero(dot(vector))

	open fun isPerpendicular(vector: Vector3, epsilon: Float) = isZero(dot(vector), epsilon)

	open fun hasSameDirection(vector: Vector3) = dot(vector) > 0

	open fun hasOppositeDirection(vector: Vector3) = dot(vector) < 0

	open fun lerp(target: Vector3, alpha: Float) = apply {
		x += alpha * (target.x - x)
		y += alpha * (target.y - y)
		z += alpha * (target.z - z)
	}

	open fun limit(limit: Float) = limit2(limit * limit)

	open fun limit2(limit2: Float) = apply {
		val len2 = len2()
		if (len2 > limit2) {
			scl(sqrt((limit2 / len2).toDouble()).toFloat())
		}
	}

	open fun setLength(len: Float) = setLength2(len * len)

	open fun setLength2(len2: Float): Vector3 {
		val oldLen2 = len2()
		return if ((oldLen2 == 0f || oldLen2 == len2)) this else scl(sqrt((len2 / oldLen2).toDouble()).toFloat())
	}

	open fun clamp(min: Float, max: Float): Vector3 {
		val len2 = len2()
		if (len2 == 0f) return this
		val max2 = max * max
		if (len2 > max2) return scl(sqrt((max2 / len2).toDouble()).toFloat())
		val min2 = min * min
		return if (len2 < min2) scl(sqrt((min2 / len2).toDouble()).toFloat()) else this
	}

	override fun hashCode(): Int {
		val prime = 31
		var result = 1
		result = prime * result + x.toBits()
		result = prime * result + y.toBits()
		result = prime * result + z.toBits()
		return result
	}

	override fun equals(other: Any?): Boolean {
		if (other === this) return true
		if (other == null) return false
		if (other !is Vector3) return false
		return x == other.x && y == other.y && z == other.z
	}

	open fun epsilonEquals(other: Vector3?, epsilon: Float): Boolean {
		if (other == null) return false
		return epsilonEquals(other.x, other.y, other.z, epsilon)
	}


	open fun epsilonEquals(x: Float, y: Float, z: Float, epsilon: Float): Boolean {
		if (abs(x - this.x) > epsilon) return false
		if (abs(y - this.y) > epsilon) return false
		return abs(z - this.z) <= epsilon
	}

	open fun setZero() = set(0f, 0f, 0f)

}