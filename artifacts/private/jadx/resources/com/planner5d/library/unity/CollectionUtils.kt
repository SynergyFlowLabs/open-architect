package com.planner5d.library.unity

import com.planner5d.library.math.Vertex
import com.planner5d.library.walls.WallsInfoWall
import com.planner5d.library.walls.Wall

/**
 * Utility class for collections to easier build collections
 */
object CollectionUtils {

	fun list() : MutableList<Any> = mutableListOf()

	fun immutableList(list: MutableList<Any>) : List<Any> = list

	fun listAdd(list: MutableList<Any>, item: Any) {
		list.add(item)
	}

	fun listAddWall(list: MutableList<Any>, item: Wall) {
		list.add(item)
	}

	fun listLength(list: List<Any>) : Int = list.size

	fun <T> listGet(list: List<T>, n:Int) : T? = list[n]

	fun listGetElement(list: List<Any?>, index: Int) = list[index]

	fun listGetWallsInfoWall(list: List<WallsInfoWall>, n: Int) : WallsInfoWall? = listGet(list, n)

	fun listGetUnityRoomWall(list: List<UnityRoomWall>, n: Int) : UnityRoomWall? = listGet(list, n)

	fun listGetVertex(list: List<Vertex>, n: Int) : Vertex? = listGet(list, n)

	fun floatArray(size: Int) : FloatArray = kotlin.FloatArray(size)

	fun setFloat(array: FloatArray, idx: Int, item: Float) {
		array[idx] = item;
	}
	fun getFloat(array: FloatArray, idx: Int) : Float {
		return array[idx];
	}
	fun floatArraySize(array: FloatArray) : Int = array.size;

	fun listGetUnityMesh(list: List<UnityMesh>, n: Int) : UnityMesh? = listGet(list, n)
}
