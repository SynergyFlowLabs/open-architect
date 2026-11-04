package com.planner5d.library.unity

import com.planner5d.library.math.*
import com.planner5d.library.mesh.Mesh
import com.planner5d.library.mesh.MeshBuilderFlooringWall
import com.planner5d.library.walls.*

class UnityRoomBuilder(private val tessellator: Tessellator, private val holes: List<WallHole>) {

	fun build(info: WallsInfo, floorZ: Float, partCloseTop: WallsBuilder3D.WallPart?) : UnityRoom =
		UnityRoom(buildFloor(info), info.get().map { buildWall(info, it, floorZ, partCloseTop) })

	private fun buildFloor(info: WallsInfo) : FloatArray =
		tessellator.tessellate(info.getPath(WallsInfoWall.Side.Bottom).map { Vector2(it) }.toTypedArray(), true)

	fun buildFloorWalls(info: WallsInfo, floorZ: Float, partCloseTop: WallsBuilder3D.WallPart?, flooringHeight: Float) : List<UnityMesh> =
		info.get().map{ buildFlooringWall(it, flooringHeight) }

	private fun buildFlooringWall(wall: WallsInfoWall, flooringHeight: Float) : UnityMesh {
		val mesh = UnityMesh()
		MeshBuilderFlooringWall(wall, 0f, flooringHeight).build(mesh)
		return mesh
	}

	private fun buildWall(
		info: WallsInfo, wall: WallsInfoWall, floorZ: Float, partCloseTop: WallsBuilder3D.WallPart?
	) : UnityRoomWall = Builder().also {
		WallsBuilder3D(
			info, wall, WallsBuilder3D.WallPart.All, partCloseTop, 1f, getHolesOnWall(wall, floorZ), tessellator,
			RectanglesMergerKlipper, it
		).build()
	}.wall

	private fun getHolesOnWall(wall: WallsInfoWall, floorZ: Float) : List<WallHole> = holes.filter {
		(it.zInProject + it.height) > floorZ && it.zInProject < floorZ + wall.wall.getHeight() &&
		Intersector.intersectPolygons(wall.getPolygonPoints(true), it.polygon2D)
	}

	private class Builder(val wall: UnityRoomWall = UnityRoomWall()) : WallsBuilder3DMesh {

		override fun buildClose(v0: Vertex, v1: Vertex, v2: Vertex) {
			wall.close.add(v0).add(v1).add(v2)
		}

		override fun buildSide(v0: Vertex, v1: Vertex, v2: Vertex, outside: Boolean) {
			(if (outside) wall.outdoor else wall.indoor).add(v0).add(v1).add(v2)
		}

	}

}