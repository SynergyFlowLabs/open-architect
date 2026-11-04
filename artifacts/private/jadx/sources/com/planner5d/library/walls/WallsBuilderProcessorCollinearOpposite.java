package com.planner5d.library.walls;

import com.planner5d.library.math.k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class WallsBuilderProcessorCollinearOpposite implements WallsBuilderProcessor {
    @Override // com.planner5d.library.walls.WallsBuilderProcessor
    public void process(@Nullable WallsBuilderStateWall wallsBuilderStateWall, @NotNull WallsBuilderStateWall center, @Nullable WallsBuilderStateWall wallsBuilderStateWall2, @NotNull k temp) {
        Intrinsics.checkNotNullParameter(center, "center");
        Intrinsics.checkNotNullParameter(temp, "temp");
        if (wallsBuilderStateWall != null) {
            process(wallsBuilderStateWall, center, temp);
        }
        if (wallsBuilderStateWall2 != null) {
            process(center, wallsBuilderStateWall2, temp);
        }
    }

    private final void process(WallsBuilderStateWall wallsBuilderStateWall, WallsBuilderStateWall wallsBuilderStateWall2, k kVar) {
        if (wallsBuilderStateWall.getInfo$com_planner5d_library_android_1_3_4_release().getMiddle().b().v(wallsBuilderStateWall2.getInfo$com_planner5d_library_android_1_3_4_release().getMiddle().b())) {
            float cutOffDistance = WallsBuilderProcessorSharpCorners.Companion.getCutOffDistance(wallsBuilderStateWall, wallsBuilderStateWall2);
            kVar.V(wallsBuilderStateWall.getInfoDefault$com_planner5d_library_android_1_3_4_release().getMiddle().b()).R(cutOffDistance);
            wallsBuilderStateWall.setNewEnd$com_planner5d_library_android_1_3_4_release(new k(wallsBuilderStateWall.getInfoDefault$com_planner5d_library_android_1_3_4_release().getBottom().c()).b(kVar), new k(wallsBuilderStateWall.getInfoDefault$com_planner5d_library_android_1_3_4_release().getTop().c()).b(kVar), null);
            kVar.V(wallsBuilderStateWall2.getInfoDefault$com_planner5d_library_android_1_3_4_release().getMiddle().b()).R(-cutOffDistance);
            wallsBuilderStateWall2.setNewStart$com_planner5d_library_android_1_3_4_release(new k(wallsBuilderStateWall2.getInfoDefault$com_planner5d_library_android_1_3_4_release().getBottom().e()).b(kVar), new k(wallsBuilderStateWall2.getInfoDefault$com_planner5d_library_android_1_3_4_release().getTop().e()).b(kVar), null);
        }
    }
}
