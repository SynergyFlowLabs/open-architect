package com.planner5d.library.walls;

import com.planner5d.library.math.c;
import com.planner5d.library.math.k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class WallsBuilderStateWall {

    @NotNull
    private WallsInfoWall info;

    @NotNull
    private final WallsInfoWall infoDefault;

    public WallsBuilderStateWall(@NotNull WallsBuilderStateWall info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.infoDefault = info.infoDefault;
        this.info = new WallsInfoWall(info.info);
    }

    private final WallsInfoWall createNew(c cVar, c cVar2, c[] cVarArr, c[] cVarArr2) {
        return new WallsInfoWall(this.infoDefault.getWall(), cVar, this.infoDefault.getMiddle(), cVar2, cVarArr, cVarArr2);
    }

    @NotNull
    public final WallsInfoWall getInfo$com_planner5d_library_android_1_3_4_release() {
        return this.info;
    }

    @NotNull
    public final WallsInfoWall getInfoDefault$com_planner5d_library_android_1_3_4_release() {
        return this.infoDefault;
    }

    public final void setInfo$com_planner5d_library_android_1_3_4_release(@NotNull WallsInfoWall wallsInfoWall) {
        Intrinsics.checkNotNullParameter(wallsInfoWall, "<set-?>");
        this.info = wallsInfoWall;
    }

    @NotNull
    public final WallsBuilderStateWall setNew$com_planner5d_library_android_1_3_4_release(@NotNull WallsBuilderStateWall info) {
        Intrinsics.checkNotNullParameter(info, "info");
        return setNew$com_planner5d_library_android_1_3_4_release(info.info.getTop(), info.info.getBottom(), info.info.getStart(), info.info.getEnd());
    }

    public final void setNewEnd$com_planner5d_library_android_1_3_4_release(@NotNull k bottomEnd, @NotNull k topEnd, @Nullable k kVar) {
        Intrinsics.checkNotNullParameter(bottomEnd, "bottomEnd");
        Intrinsics.checkNotNullParameter(topEnd, "topEnd");
        c cVar = new c(this.info.getTop().e(), topEnd);
        c cVar2 = new c(this.info.getBottom().e(), bottomEnd);
        if (kVar != null) {
            if (Intrinsics.areEqual(kVar, topEnd) || Intrinsics.areEqual(kVar, bottomEnd)) {
                kVar = null;
            }
            if (kVar != null && setNew$com_planner5d_library_android_1_3_4_release(cVar, cVar2, this.info.getStart(), c.f180466e.e(bottomEnd, kVar, topEnd)) != null) {
                return;
            }
        }
        setNew$com_planner5d_library_android_1_3_4_release(cVar, cVar2, this.info.getStart(), c.f180466e.e(cVar2.c(), cVar.c()));
    }

    public final void setNewStart$com_planner5d_library_android_1_3_4_release(@NotNull k bottomStart, @NotNull k topStart, @Nullable k kVar) {
        Intrinsics.checkNotNullParameter(bottomStart, "bottomStart");
        Intrinsics.checkNotNullParameter(topStart, "topStart");
        c cVar = new c(topStart, this.info.getTop().c());
        c cVar2 = new c(bottomStart, this.info.getBottom().c());
        if (kVar != null) {
            if (Intrinsics.areEqual(kVar, topStart) || Intrinsics.areEqual(kVar, bottomStart)) {
                kVar = null;
            }
            if (kVar != null && setNew$com_planner5d_library_android_1_3_4_release(cVar, cVar2, c.f180466e.e(bottomStart, kVar, topStart), this.info.getEnd()) != null) {
                return;
            }
        }
        setNew$com_planner5d_library_android_1_3_4_release(cVar, cVar2, c.f180466e.e(cVar2.e(), cVar.e()), this.info.getEnd());
    }

    @NotNull
    public final WallsBuilderStateWall setNew$com_planner5d_library_android_1_3_4_release(@NotNull c top, @NotNull c bottom) {
        Intrinsics.checkNotNullParameter(top, "top");
        Intrinsics.checkNotNullParameter(bottom, "bottom");
        c.a aVar = c.f180466e;
        return setNew$com_planner5d_library_android_1_3_4_release(top, bottom, aVar.e(bottom.e(), top.e()), aVar.e(bottom.c(), top.c()));
    }

    public WallsBuilderStateWall(@NotNull WallsInfoWall info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.infoDefault = new WallsInfoWall(info);
        this.info = createNew(info.getTop(), info.getBottom(), info.getStart(), info.getEnd());
    }

    @NotNull
    public final WallsBuilderStateWall setNew$com_planner5d_library_android_1_3_4_release(@NotNull c top, @NotNull c bottom, @NotNull c[] start, @NotNull c[] end) {
        Intrinsics.checkNotNullParameter(top, "top");
        Intrinsics.checkNotNullParameter(bottom, "bottom");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        this.info = createNew(top, bottom, start, end);
        return this;
    }
}
