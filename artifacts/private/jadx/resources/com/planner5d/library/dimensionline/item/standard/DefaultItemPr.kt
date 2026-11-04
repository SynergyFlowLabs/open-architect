package com.planner5d.library.dimensionline.item.standard

import com.planner5d.library.dimensionline.item.ItemPr
import com.planner5d.library.math.Vector3

class DefaultItemPr(puid: String, position: Vector3, rotation: Vector3, scale: Vector3, size: Vector3) : 
	DefaultItem(puid, position, rotation, scale, size), ItemPr