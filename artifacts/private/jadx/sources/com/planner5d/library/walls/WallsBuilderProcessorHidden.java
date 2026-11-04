package com.planner5d.library.walls;

import com.planner5d.library.math.c;
import com.planner5d.library.math.k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class WallsBuilderProcessorHidden implements WallsBuilderProcessor {
    private final void createDefaultEnd(WallsBuilderStateWall wallsBuilderStateWall, WallsBuilderStateWall wallsBuilderStateWall2) {
        int angle = getAngle(wallsBuilderStateWall, wallsBuilderStateWall2);
        if (isNeededAngle(angle)) {
            c cVar = new c(wallsBuilderStateWall.getInfo$com_planner5d_library_android_1_3_4_release().getTop().e(), new k(wallsBuilderStateWall.getInfoDefault$com_planner5d_library_android_1_3_4_release().getTop().c()).b(new k(wallsBuilderStateWall.getInfo$com_planner5d_library_android_1_3_4_release().getMiddle().b()).R((angle == 90 ? 1 : -1) * 5)));
            c bottom = wallsBuilderStateWall.getInfo$com_planner5d_library_android_1_3_4_release().getBottom();
            c[] start = wallsBuilderStateWall.getInfo$com_planner5d_library_android_1_3_4_release().getStart();
            c.a aVar = c.f180466e;
            wallsBuilderStateWall.setNew$com_planner5d_library_android_1_3_4_release(cVar, bottom, start, aVar.e(wallsBuilderStateWall.getInfo$com_planner5d_library_android_1_3_4_release().getBottom().c(), cVar.c()));
            c cVar2 = new c(cVar.c(), wallsBuilderStateWall2.getInfo$com_planner5d_library_android_1_3_4_release().getBottom().c());
            wallsBuilderStateWall2.setNew$com_planner5d_library_android_1_3_4_release(wallsBuilderStateWall2.getInfo$com_planner5d_library_android_1_3_4_release().getTop(), cVar2, aVar.e(cVar2.e(), wallsBuilderStateWall2.getInfo$com_planner5d_library_android_1_3_4_release().getTop().e()), wallsBuilderStateWall2.getInfo$com_planner5d_library_android_1_3_4_release().getEnd());
        }
    }

    private final void createDefaultStart(WallsBuilderStateWall wallsBuilderStateWall, WallsBuilderStateWall wallsBuilderStateWall2) {
        int angle = getAngle(wallsBuilderStateWall, wallsBuilderStateWall2);
        if (isNeededAngle(angle)) {
            c cVar = new c(new k(wallsBuilderStateWall2.getInfoDefault$com_planner5d_library_android_1_3_4_release().getTop().e()).b(new k(wallsBuilderStateWall2.getInfo$com_planner5d_library_android_1_3_4_release().getMiddle().b()).R((angle == 90 ? -1 : 1) * 5)), wallsBuilderStateWall2.getInfo$com_planner5d_library_android_1_3_4_release().getTop().c());
            c bottom = wallsBuilderStateWall2.getInfo$com_planner5d_library_android_1_3_4_release().getBottom();
            c.a aVar = c.f180466e;
            wallsBuilderStateWall2.setNew$com_planner5d_library_android_1_3_4_release(cVar, bottom, aVar.e(wallsBuilderStateWall2.getInfo$com_planner5d_library_android_1_3_4_release().getBottom().e(), cVar.e()), wallsBuilderStateWall2.getInfo$com_planner5d_library_android_1_3_4_release().getEnd());
            c cVar2 = new c(wallsBuilderStateWall.getInfo$com_planner5d_library_android_1_3_4_release().getBottom().e(), cVar.e());
            wallsBuilderStateWall.setNew$com_planner5d_library_android_1_3_4_release(wallsBuilderStateWall.getInfo$com_planner5d_library_android_1_3_4_release().getTop(), cVar2, wallsBuilderStateWall.getInfo$com_planner5d_library_android_1_3_4_release().getStart(), aVar.e(cVar2.c(), wallsBuilderStateWall.getInfo$com_planner5d_library_android_1_3_4_release().getTop().c()));
        }
    }

    private final int getAngle(WallsBuilderStateWall wallsBuilderStateWall, WallsBuilderStateWall wallsBuilderStateWall2) {
        return (int) Math.rint(wallsBuilderStateWall.getInfo$com_planner5d_library_android_1_3_4_release().getMiddle().b().d(wallsBuilderStateWall2.getInfo$com_planner5d_library_android_1_3_4_release().getMiddle().b()));
    }

    private final boolean isNeededAngle(int i10) {
        return i10 % 90 == 0 && i10 % 180 != 0;
    }

    @Override // com.planner5d.library.walls.WallsBuilderProcessor
    public void process(@Nullable WallsBuilderStateWall wallsBuilderStateWall, @NotNull WallsBuilderStateWall center, @Nullable WallsBuilderStateWall wallsBuilderStateWall2, @NotNull k temp) {
        Intrinsics.checkNotNullParameter(center, "center");
        Intrinsics.checkNotNullParameter(temp, "temp");
        if (wallsBuilderStateWall != null) {
            if (wallsBuilderStateWall.getInfo$com_planner5d_library_android_1_3_4_release().getWall().isHidden()) {
                if (!center.getInfo$com_planner5d_library_android_1_3_4_release().getWall().isHidden()) {
                    createDefaultStart(wallsBuilderStateWall, center);
                }
            } else if (center.getInfo$com_planner5d_library_android_1_3_4_release().getWall().isHidden()) {
                createDefaultEnd(wallsBuilderStateWall, center);
            }
        }
        if (wallsBuilderStateWall2 != null) {
            if (center.getInfo$com_planner5d_library_android_1_3_4_release().getWall().isHidden()) {
                if (wallsBuilderStateWall2.getInfo$com_planner5d_library_android_1_3_4_release().getWall().isHidden()) {
                    return;
                }
                createDefaultStart(center, wallsBuilderStateWall2);
            } else if (wallsBuilderStateWall2.getInfo$com_planner5d_library_android_1_3_4_release().getWall().isHidden()) {
                createDefaultEnd(center, wallsBuilderStateWall2);
            }
        }
    }
}
