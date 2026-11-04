package com.planner5d.library.walls;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class WallsBuilder {

    @NotNull
    public static final WallsBuilder INSTANCE = new WallsBuilder();

    @NotNull
    private static final WallsBuilderProcessor[] processors = {new WallsBuilderProcessorIntersectionsMatch(), new WallsBuilderProcessorSideIntersections(), new WallsBuilderProcessorSharpCorners(), new WallsBuilderProcessorCollinear(), new WallsBuilderProcessorCollinearOpposite(), new WallsBuilderProcessorHidden()};

    private WallsBuilder() {
    }

    private final WallsInfo buildInternal(Wall[] wallArr, boolean z10) {
        Wall[] wallArrRemoveZeroLengthWalls = removeZeroLengthWalls(wallArr);
        WallsBuilderState wallsBuilderState = new WallsBuilderState(wallArrRemoveZeroLengthWalls, z10);
        if (wallArrRemoveZeroLengthWalls.length > (z10 ? 1 : 2)) {
            processWithIntersections(wallsBuilderState);
            process(wallsBuilderState, processors);
        }
        return wallsBuilderState.build$com_planner5d_library_android_1_3_4_release();
    }

    private final void process(WallsBuilderState wallsBuilderState, WallsBuilderProcessor[] wallsBuilderProcessorArr) {
        for (WallsBuilderProcessor wallsBuilderProcessor : wallsBuilderProcessorArr) {
            int length = wallsBuilderState.getList$com_planner5d_library_android_1_3_4_release().length;
            for (int i10 = 0; i10 < length; i10++) {
                wallsBuilderProcessor.process(wallsBuilderState.getPrevious$com_planner5d_library_android_1_3_4_release(i10), wallsBuilderState.get$com_planner5d_library_android_1_3_4_release(i10), wallsBuilderState.getNext$com_planner5d_library_android_1_3_4_release(i10), wallsBuilderState.getTemp$com_planner5d_library_android_1_3_4_release());
            }
        }
    }

    private final void processWithIntersections(WallsBuilderState wallsBuilderState) {
        ArrayList arrayList = new ArrayList();
        WallsBuilderProcessorIntersections wallsBuilderProcessorIntersections = new WallsBuilderProcessorIntersections(wallsBuilderState.getNotClosed$com_planner5d_library_android_1_3_4_release());
        int length = wallsBuilderState.getList$com_planner5d_library_android_1_3_4_release().length;
        for (int i10 = 0; i10 < length; i10++) {
            WallsBuilderStateWall wallsBuilderStateWall = new WallsBuilderStateWall(wallsBuilderState.get$com_planner5d_library_android_1_3_4_release(i10));
            arrayList.add(wallsBuilderStateWall);
            wallsBuilderProcessorIntersections.process(wallsBuilderState.getPrevious$com_planner5d_library_android_1_3_4_release(i10), wallsBuilderStateWall, wallsBuilderState.getNext$com_planner5d_library_android_1_3_4_release(i10), wallsBuilderState.getTemp$com_planner5d_library_android_1_3_4_release());
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            wallsBuilderState.getList$com_planner5d_library_android_1_3_4_release()[i11].setNew$com_planner5d_library_android_1_3_4_release((WallsBuilderStateWall) arrayList.get(i11));
        }
    }

    private final Wall[] removeZeroLengthWalls(Wall[] wallArr) {
        ArrayList arrayList = new ArrayList();
        for (Wall wall : wallArr) {
            if (!wall.isZero()) {
                arrayList.add(wall);
            }
        }
        Object[] array = arrayList.toArray(new Wall[0]);
        if (array != null) {
            return (Wall[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @NotNull
    public final WallsInfo build(@NotNull Wall wall) {
        Intrinsics.checkNotNullParameter(wall, "wall");
        return build(new Wall[]{wall});
    }

    @NotNull
    public final WallsInfo build(@NotNull List<? extends Wall> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        Object[] array = list.toArray(new Wall[0]);
        if (array != null) {
            return build((Wall[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @NotNull
    public final WallsInfo build(@NotNull Wall[] list) {
        Intrinsics.checkNotNullParameter(list, "list");
        return build(list, !WallsUtils.INSTANCE.isClosedLoop(list));
    }

    @NotNull
    public final WallsInfo build(@NotNull List<? extends Wall> list, boolean z10) {
        Intrinsics.checkNotNullParameter(list, "list");
        Object[] array = list.toArray(new Wall[0]);
        if (array != null) {
            return build((Wall[]) array, z10);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @NotNull
    public final WallsInfo build(@NotNull Wall[] list, boolean z10) {
        Intrinsics.checkNotNullParameter(list, "list");
        return buildInternal(list, z10);
    }
}
