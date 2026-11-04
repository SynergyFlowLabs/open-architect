package com.planner5d.library.walls;

import com.planner5d.library.math.c;
import com.planner5d.library.math.k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class WallsBuilderProcessorSideIntersections implements WallsBuilderProcessor {
    @Override // com.planner5d.library.walls.WallsBuilderProcessor
    public void process(@Nullable WallsBuilderStateWall wallsBuilderStateWall, @NotNull WallsBuilderStateWall center, @Nullable WallsBuilderStateWall wallsBuilderStateWall2, @NotNull k temp) {
        k kVarF;
        k kVarF2;
        Intrinsics.checkNotNullParameter(center, "center");
        Intrinsics.checkNotNullParameter(temp, "temp");
        k kVarC = center.getInfo$com_planner5d_library_android_1_3_4_release().getTop().c();
        k kVarE = center.getInfo$com_planner5d_library_android_1_3_4_release().getTop().e();
        if (wallsBuilderStateWall != null && Intrinsics.areEqual(wallsBuilderStateWall.getInfoDefault$com_planner5d_library_android_1_3_4_release().getTop().c(), wallsBuilderStateWall.getInfo$com_planner5d_library_android_1_3_4_release().getTop().c()) && (kVarF2 = wallsBuilderStateWall.getInfo$com_planner5d_library_android_1_3_4_release().getEnd()[0].f(center.getInfoDefault$com_planner5d_library_android_1_3_4_release().getTop())) != c.f180466e.b()) {
            kVarE = kVarF2;
        }
        if (wallsBuilderStateWall2 != null && Intrinsics.areEqual(wallsBuilderStateWall2.getInfoDefault$com_planner5d_library_android_1_3_4_release().getTop().e(), wallsBuilderStateWall2.getInfo$com_planner5d_library_android_1_3_4_release().getTop().e()) && (kVarF = wallsBuilderStateWall2.getInfo$com_planner5d_library_android_1_3_4_release().getStart()[0].f(center.getInfoDefault$com_planner5d_library_android_1_3_4_release().getTop())) != c.f180466e.b()) {
            kVarC = kVarF;
        }
        if ((Intrinsics.areEqual(kVarC, center.getInfo$com_planner5d_library_android_1_3_4_release().getTop().c()) && Intrinsics.areEqual(kVarE, center.getInfo$com_planner5d_library_android_1_3_4_release().getTop().e())) || temp.V(kVarC).c0(kVarE).M().v(center.getInfo$com_planner5d_library_android_1_3_4_release().getTop().b())) {
            return;
        }
        center.setNew$com_planner5d_library_android_1_3_4_release(new c(kVarE, kVarC), center.getInfo$com_planner5d_library_android_1_3_4_release().getBottom());
    }
}
