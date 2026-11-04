package com.planner5d.library.unity

object PrimitiveUtils {

	fun isNull(value: Float?): Boolean = value === null

	fun getValue(value: Float?): Float = getValue(value, 0f)

	fun getValue(value: Float?, default: Float): Float = value ?: default

}