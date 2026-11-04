package com.planner5d.library.dimensionline.dimensions

import com.planner5d.library.dimensionline.DefaultRenderingDataFactory
import com.planner5d.library.dimensionline.EditorDataProvider
import com.planner5d.library.dimensionline.RenderingDataFactory

class DimensionLinesFactory {

	fun create(editorDataProvider: EditorDataProvider): RenderingDataFactory = DefaultRenderingDataFactory(editorDataProvider)

}