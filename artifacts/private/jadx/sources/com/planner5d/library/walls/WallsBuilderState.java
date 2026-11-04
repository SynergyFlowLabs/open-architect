package com.planner5d.library.walls;

import com.planner5d.library.math.k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class WallsBuilderState {

    @NotNull
    private final WallsBuilderStateWall[] list;
    private final boolean notClosed;

    @NotNull
    private final k temp;

    public WallsBuilderState(@NotNull Wall[] list, boolean z10) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.notClosed = z10;
        this.temp = new k();
        int length = list.length;
        WallsBuilderStateWall[] wallsBuilderStateWallArr = new WallsBuilderStateWall[length];
        for (int i10 = 0; i10 < length; i10++) {
            wallsBuilderStateWallArr[i10] = new WallsBuilderStateWall(new WallsInfoWall(list[i10]));
        }
        this.list = wallsBuilderStateWallArr;
    }

    private final WallsBuilderStateWall getPositionWithDelta(int i10, int i11) {
        int length = i10 + i11;
        if (length < 0) {
            if (this.notClosed) {
                return null;
            }
            length = this.list.length - 1;
        } else if (length >= this.list.length) {
            if (this.notClosed) {
                return null;
            }
            length = 0;
        }
        return this.list[length];
    }

    @NotNull
    public final WallsInfo build$com_planner5d_library_android_1_3_4_release() {
        int length = this.list.length;
        WallsInfoWall[] wallsInfoWallArr = new WallsInfoWall[length];
        for (int i10 = 0; i10 < length; i10++) {
            wallsInfoWallArr[i10] = this.list[i10].getInfo$com_planner5d_library_android_1_3_4_release();
        }
        return new WallsInfo(wallsInfoWallArr);
    }

    @NotNull
    public final WallsBuilderStateWall get$com_planner5d_library_android_1_3_4_release(int i10) {
        return this.list[i10];
    }

    @NotNull
    public final WallsBuilderStateWall[] getList$com_planner5d_library_android_1_3_4_release() {
        return this.list;
    }

    @Nullable
    public final WallsBuilderStateWall getNext$com_planner5d_library_android_1_3_4_release(int i10) {
        return getPositionWithDelta(i10, 1);
    }

    public final boolean getNotClosed$com_planner5d_library_android_1_3_4_release() {
        return this.notClosed;
    }

    @Nullable
    public final WallsBuilderStateWall getPrevious$com_planner5d_library_android_1_3_4_release(int i10) {
        return getPositionWithDelta(i10, -1);
    }

    @NotNull
    public final k getTemp$com_planner5d_library_android_1_3_4_release() {
        return this.temp;
    }
}
