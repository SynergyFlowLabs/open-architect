package com.planner5d.library.mesh

import com.planner5d.library.math.*
import com.planner5d.library.walls.WallsInfoWall

open class MeshBuilderFlooringWall(
    private val wallInfo: WallsInfoWall, private val floorZ: Float,
    private val flooringHeight: Float
) : MeshBuilder {

    private val temp = Vector3()

    override fun build(mesh: Mesh) {
        val y0 = floorZ
        val y1 = floorZ + flooringHeight
        val x0 = wallInfo.bottom.start.x
        val x1 = wallInfo.bottom.end.x
        val z0 = wallInfo.bottom.start.y
        val z1 = wallInfo.bottom.end.y
        val vertex00 = Vertex()
        val vertex10 = Vertex()
        val vertex01 = Vertex()
        val vertex11 = Vertex()
        val normal = Vector3()
        val line = LineSegment(Vector2(x0, z0), Vector2(x1, z1))
        val perpendicular = Vector2(line.direction).rotate90(-1)
        val extension = line.direction.rotate90(-1).setLength(y1)
        normal.set(perpendicular.x, 0f, perpendicular.y)
        vertex00.setNormal(normal).setPosition(temp.set(x0, y0, z0))
            .setUV(extension.x + vertex00.position.x, extension.y + vertex00.position.z)
        vertex10.setNormal(normal).setPosition(temp.set(x1, y0, z1))
            .setUV(extension.x + vertex10.position.x, extension.y + vertex10.position.z)
        vertex01.setNormal(normal).setPosition(temp.set(x0, y1, z0))
            .setUV(vertex01.position.x, vertex01.position.z)
        vertex11.setNormal(normal).setPosition(temp.set(x1, y1, z1))
            .setUV(vertex11.position.x, vertex11.position.z)
        mesh.addTriangle(vertex00, vertex01, vertex11)
        mesh.addTriangle(vertex11, vertex10, vertex00)
    }

}