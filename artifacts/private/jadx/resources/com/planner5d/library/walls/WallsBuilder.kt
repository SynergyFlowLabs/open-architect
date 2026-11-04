package com.planner5d.library.walls

/**
 * This class is meant for building walls for single room or ground/path/lawn
 *
 * ! We are using CCW (Counter Clock Wise order) for walls
 *
 * Everything starts in build(*) methods
 *
 * All process of building wall is handled in several stages:
 * #1 creation of WallsBuilderState(...) - it creates standard rectangular walls
 * #2 creation of new walls by intersecting with other walls (processWithIntersections)
 * #3 execution of processors in correct order (they modify walls info using specific rules)
 * #4 creation of WallsInfo from WallsBuilderState
 */
object WallsBuilder {

	private val processors = arrayOf(
		WallsBuilderProcessorIntersectionsMatch(),
		WallsBuilderProcessorSideIntersections(),
		WallsBuilderProcessorSharpCorners(),
		WallsBuilderProcessorCollinear(),
		WallsBuilderProcessorCollinearOpposite(),
		WallsBuilderProcessorHidden()
	)

	/**
	 * @see build(list:Array<Wall>)
	 */
	fun build(wall: Wall): WallsInfo = build(arrayOf(wall))

	/**
	 * @see build(list:Array<Wall>)
	 */
	fun build(list:List<Wall>): WallsInfo = build(list.toTypedArray())

	/**
	 * Build walls information for supplied array of walls
	 *
	 * ! Will automatically detect if walls form open or closed polygon (will build them differently)
	 *
	 * @see build(list:Array<Wall>, notClosed: Boolean) if you do not want automatic closed loop detection
	 *
	 * @param list list walls
	 */
	fun build(list:Array<Wall>): WallsInfo = build(list, !WallsUtils.isClosedLoop(list))

	/**
	 * @see build(list:Array<Wall>, notClosed: Boolean)
	 */
	fun build(list:List<Wall>, notClosed: Boolean): WallsInfo = build(list.toTypedArray(), notClosed)

	/**
	 * Build walls information for supplied array of walls
	 *
	 * @param list list walls
	 * @param notClosed true - use open walls polygon build mode
	 */
	fun build(list:Array<Wall>, notClosed: Boolean): WallsInfo = buildInternal(list, notClosed)

	/**
	 * Build WallsInfo for supplied walls
	 *
	 * @todo preprocess walls by clipping points min, max position values (otherwise they will break due to overflow)
	 *
	 * @param walls
	 *
	 * @return prepared WallsInfo
	 */
	private fun buildInternal(walls:Array<Wall>, notClosed: Boolean): WallsInfo {
		val list:Array<Wall> = removeZeroLengthWalls(walls)
		val state = WallsBuilderState(list, notClosed)
		if (list.size > (if (notClosed) 1 else 2)) {
			processWithIntersections(state)
			process(state, processors)
		}
		return state.build()
	}

	private fun removeZeroLengthWalls(walls:Array<Wall>): Array<Wall> {
		val list:MutableList<Wall> = mutableListOf()
		for (wall in walls) {
			if (!wall.isZero()) {
				list.add(wall)
			}
		}
		return list.toTypedArray()
	}

	/**
	 * Create walls by intersecting them with nearby walls
	 *
	 * @param state
	 */
	private fun processWithIntersections(state: WallsBuilderState) {
		val result:MutableList<WallsBuilderStateWall> = mutableListOf()
		val processorIntersections = WallsBuilderProcessorIntersections(state.notClosed)
		for (position in 0 until state.list.size) {
			val current = WallsBuilderStateWall(state.get(position))
			result.add(current)
			processorIntersections.process(
				state.getPrevious(position), current, state.getNext(position), state.temp
			)
		}
		for (i in 0 until result.size) {
			state.list[i].setNew(result[i])
		}
	}

	/**
	 * Execute processors for all WallsBuilderStateWall from state
	 *
	 * @param state
	 * @param processors ordered list
	 */
	private fun process(state: WallsBuilderState, processors:Array<WallsBuilderProcessor>) {
		for (processor in processors) {
			for (position in 0 until state.list.size) {
				processor.process(
					state.getPrevious(position), state.get(position), state.getNext(position), state.temp
				)
			}
		}
	}

}
