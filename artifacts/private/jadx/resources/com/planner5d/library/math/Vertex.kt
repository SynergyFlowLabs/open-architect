package com.planner5d.library.math

import kotlin.jvm.JvmField

class Vertex() {

	@JvmField
	val position = Vector3()

	@JvmField
	val normal = Vector3(0f, 1f, 0f)

	@JvmField
	val uv = Vector2()

	constructor(position:Vector3, normal:Vector3, uv:Vector2) : this() {
		this.position.set(position)
		this.normal.set(normal)
		this.uv.set(uv)
	}

	fun setPosition(x:Float, y:Float, z:Float) = apply {
		position.set(x, y, z)
	}

	fun setPosition(pos: Vector3) = apply {
		position.set(pos)
	}

	fun setNormal(x:Float, y:Float, z:Float) = apply {
		normal.set(x, y, z)
	}

	fun setNormal(nor: Vector3) = apply {
		normal.set(nor)
	}

	fun setUV(u:Float, v:Float) = apply {
		uv.set(u, v)
	}

}