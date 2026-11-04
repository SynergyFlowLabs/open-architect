package com.planner5d.library.walls;

import com.planner5d.library.math.c;
import com.planner5d.library.math.k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class WallsBuilderProcessorCollinear implements WallsBuilderProcessor {
    private final c[] split(c cVar, float f10) {
        return (f10 <= 0.0f || f10 >= cVar.d()) ? new c[]{cVar} : c.f180466e.e(cVar.e(), new k(cVar.b()).R(f10).b(cVar.e()), cVar.c());
    }

    @Override // com.planner5d.library.walls.WallsBuilderProcessor
    public void process(@Nullable WallsBuilderStateWall wallsBuilderStateWall, @NotNull WallsBuilderStateWall center, @Nullable WallsBuilderStateWall wallsBuilderStateWall2, @NotNull k temp) {
        Intrinsics.checkNotNullParameter(center, "center");
        Intrinsics.checkNotNullParameter(temp, "temp");
        if (wallsBuilderStateWall != null) {
            process(wallsBuilderStateWall, center);
        }
        if (wallsBuilderStateWall2 != null) {
            process(center, wallsBuilderStateWall2);
        }
    }

    private final void process(WallsBuilderStateWall wallsBuilderStateWall, WallsBuilderStateWall wallsBuilderStateWall2) {
        if (wallsBuilderStateWall.getInfo$com_planner5d_library_android_1_3_4_release().getMiddle().b().t(wallsBuilderStateWall2.getInfo$com_planner5d_library_android_1_3_4_release().getMiddle().b())) {
            boolean z10 = false | true;
            if (wallsBuilderStateWall2.getInfo$com_planner5d_library_android_1_3_4_release().getWall().getWidth() > wallsBuilderStateWall.getInfo$com_planner5d_library_android_1_3_4_release().getWall().getWidth() && wallsBuilderStateWall2.getInfo$com_planner5d_library_android_1_3_4_release().getStart().length == 1) {
                wallsBuilderStateWall2.setNew$com_planner5d_library_android_1_3_4_release(wallsBuilderStateWall2.getInfo$com_planner5d_library_android_1_3_4_release().getTop(), wallsBuilderStateWall2.getInfo$com_planner5d_library_android_1_3_4_release().getBottom(), split(wallsBuilderStateWall2.getInfo$com_planner5d_library_android_1_3_4_release().getStart()[0], wallsBuilderStateWall.getInfo$com_planner5d_library_android_1_3_4_release().getWall().getWidth()), wallsBuilderStateWall2.getInfo$com_planner5d_library_android_1_3_4_release().getEnd());
            } else {
                if (wallsBuilderStateWall.getInfo$com_planner5d_library_android_1_3_4_release().getWall().getWidth() <= wallsBuilderStateWall2.getInfo$com_planner5d_library_android_1_3_4_release().getWall().getWidth() || wallsBuilderStateWall.getInfo$com_planner5d_library_android_1_3_4_release().getEnd().length != 1) {
                    return;
                }
                wallsBuilderStateWall.setNew$com_planner5d_library_android_1_3_4_release(wallsBuilderStateWall.getInfo$com_planner5d_library_android_1_3_4_release().getTop(), wallsBuilderStateWall.getInfo$com_planner5d_library_android_1_3_4_release().getBottom(), wallsBuilderStateWall.getInfo$com_planner5d_library_android_1_3_4_release().getStart(), split(wallsBuilderStateWall.getInfo$com_planner5d_library_android_1_3_4_release().getEnd()[0], wallsBuilderStateWall2.getInfo$com_planner5d_library_android_1_3_4_release().getWall().getWidth()));
            }
        }
    }
}
