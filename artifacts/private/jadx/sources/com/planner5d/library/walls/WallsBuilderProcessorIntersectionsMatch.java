package com.planner5d.library.walls;

import com.planner5d.library.math.c;
import com.planner5d.library.math.k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class WallsBuilderProcessorIntersectionsMatch implements WallsBuilderProcessor {
    @Override // com.planner5d.library.walls.WallsBuilderProcessor
    public void process(@Nullable WallsBuilderStateWall wallsBuilderStateWall, @NotNull WallsBuilderStateWall center, @Nullable WallsBuilderStateWall wallsBuilderStateWall2, @NotNull k temp) {
        Intrinsics.checkNotNullParameter(center, "center");
        Intrinsics.checkNotNullParameter(temp, "temp");
        if (wallsBuilderStateWall != null) {
            if (Intrinsics.areEqual(wallsBuilderStateWall.getInfo$com_planner5d_library_android_1_3_4_release().getTop().c(), wallsBuilderStateWall.getInfoDefault$com_planner5d_library_android_1_3_4_release().getTop().c()) || Intrinsics.areEqual(center.getInfo$com_planner5d_library_android_1_3_4_release().getTop().e(), center.getInfoDefault$com_planner5d_library_android_1_3_4_release().getTop().e())) {
                wallsBuilderStateWall.setNew$com_planner5d_library_android_1_3_4_release(new c(wallsBuilderStateWall.getInfo$com_planner5d_library_android_1_3_4_release().getTop().e(), wallsBuilderStateWall.getInfoDefault$com_planner5d_library_android_1_3_4_release().getTop().c()), wallsBuilderStateWall.getInfo$com_planner5d_library_android_1_3_4_release().getBottom());
                center.setNew$com_planner5d_library_android_1_3_4_release(new c(center.getInfoDefault$com_planner5d_library_android_1_3_4_release().getTop().e(), center.getInfo$com_planner5d_library_android_1_3_4_release().getTop().c()), center.getInfo$com_planner5d_library_android_1_3_4_release().getBottom());
            }
        }
    }
}
