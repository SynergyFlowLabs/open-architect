package com.planner5d.library.dimensionline.item.standard

import com.planner5d.library.dimensionline.item.ItemNs
import com.planner5d.library.math.Vector3

open class DefaultItemNs(puid: String, position: Vector3, rotation: Vector3, scale: Vector3, size: Vector3) : 
	DefaultItem(puid, position, rotation, scale, size), ItemNs