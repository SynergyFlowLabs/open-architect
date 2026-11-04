package com.planner5d.library.dimensionline.raycasting.hit

class HitsCollector {
	private var hits = mutableListOf<HitInfo>()
	fun get(): List<HitInfo> = hits
	fun addHits(additional: List<HitInfo>) {
		hits.addAll(additional)
	}

	fun removeNonOrthogonal(hits: List<HitInfo>): List<HitInfo> {
		return hits.filter { hit: HitInfo -> hit.orthogonal }
	}

	fun replaceHits(hits: List<HitInfo>) {
		val dimensions = mutableMapOf<String, HitInfo>()
		(this.hits + hits).forEach { hit ->
			hit.reference?.getPuid()?.let {
				dimensions[it] = hit
			}
		}
		this.hits = dimensions.values.toMutableList()
	}
}