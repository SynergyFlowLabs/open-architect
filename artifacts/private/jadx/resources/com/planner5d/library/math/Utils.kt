package com.planner5d.library.math

import klipper.Clipper
import klipper.IntPoint
import klipper.Path
import kotlin.math.*

fun normalizeAngle(angle:Float) : Float = angle.rem(360f)
	.let { round((if (it >= 0) 360f else 0f) - it) }
	.let { if (it == 360f) 0f else it }

fun isZero(value:Float, roundingError:Float = 0.000001f): Boolean = abs(value) <= roundingError

/** multiply by this to convert from radians to degrees  */
fun toDegrees(radians:Double) : Double = radians * (180.0 / PI)

/** multiply by this to convert from degrees to radians  */
fun toRadians(degrees:Double) : Double = degrees * (PI / 180.0)

fun clamp(value:Double, minimum:Double, maximum:Double) : Double = max(minimum, min(maximum, value))

fun clamp(value:Float, minimum:Float, maximum:Float) : Float = max(minimum, min(maximum, value))

fun <T> clipper(executor: Clipper.() -> T) : T {
	val clipper = Clipper()
	return executor(clipper).apply {
		clipper.clear()
	}
}

fun Path.clipperToArray() : FloatArray {
	val result = FloatArray(size * 2)
	var i = 0
	iterator().forEach {
		result[i++] = it.x.toFloat()
		result[i++] = it.y.toFloat()
	}
	return result
}

fun epsilonEquals(first: Float, second: Float, epsilon: Float): Boolean {
	return abs(first - second) <= epsilon
}

fun FloatArray.clipperToPath() : Path {
	val path = Path()
	var i = 0
	while (i < size) {
		path.add(IntPoint(get(i).toLong(), get(i + 1).toLong()))
		i += 2
	}
	return path
}