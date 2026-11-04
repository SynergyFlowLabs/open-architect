package com.planner5d.library.walls;

import com.planner5d.library.math.c;
import com.planner5d.library.math.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class WallsInfo {
    private final boolean closed;

    @Nullable
    private Float height;

    @NotNull
    private final WallsInfoWall[] list;

    @Nullable
    private Wall wall;

    public WallsInfo(@NotNull WallsInfoWall[] list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.list = list;
        this.wall = list.length == 0 ? null : list[0].getWall();
        this.closed = WallsUtils.INSTANCE.isClosedLoop(list);
    }

    private final void addPathWallBottom(List<k> list, WallsInfoWall wallsInfoWall, WallsInfoWall wallsInfoWall2) {
        if (wallsInfoWall.getEnd().length > 1 && !Intrinsics.areEqual(wallsInfoWall.getBottom().c(), wallsInfoWall2.getBottom().e())) {
            addPoint(list, ((c) ArraysKt.first(wallsInfoWall.getEnd())).e());
            addPoint(list, ((c) ArraysKt.first(wallsInfoWall2.getStart())).e());
        }
        addPoint(list, wallsInfoWall2.getBottom().e());
        addPoint(list, wallsInfoWall2.getBottom().c());
    }

    private final void addPathWallTop(List<k> list, WallsInfoWall wallsInfoWall, WallsInfoWall wallsInfoWall2) {
        if (wallsInfoWall.getEnd().length > 1 && !Intrinsics.areEqual(wallsInfoWall.getTop().c(), wallsInfoWall2.getTop().e())) {
            addPoint(list, ((c) ArraysKt.last(wallsInfoWall.getEnd())).c());
            addPoint(list, ((c) ArraysKt.last(wallsInfoWall2.getStart())).c());
        }
        addPoint(list, wallsInfoWall2.getTop().e());
        addPoint(list, wallsInfoWall2.getTop().c());
    }

    private final void addPoint(List<k> list, k kVar) {
        if (!list.isEmpty() && Intrinsics.areEqual(list.get(list.size() - 1), kVar)) {
            return;
        }
        list.add(kVar);
    }

    public static /* synthetic */ k[] getPathClean$default(WallsInfo wallsInfo, WallsInfoWall.Side side, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            side = WallsInfoWall.Side.Bottom;
        }
        return wallsInfo.getPathClean(side);
    }

    private final WallsInfoWall getWithDelta(WallsInfoWall wallsInfoWall, int i10) {
        Integer numValueOf;
        WallsInfoWall[] wallsInfoWallArr = this.list;
        if (wallsInfoWallArr.length > 1 && wallsInfoWall != null) {
            int length = wallsInfoWallArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    numValueOf = null;
                    break;
                }
                if (Intrinsics.areEqual(this.list[i11], wallsInfoWall)) {
                    numValueOf = Integer.valueOf(i11);
                    break;
                }
                i11++;
            }
            if (numValueOf == null) {
                return null;
            }
            int iIntValue = numValueOf.intValue() + i10;
            Integer numValueOf2 = Integer.valueOf(iIntValue);
            if (iIntValue < 0) {
                numValueOf2 = Integer.valueOf(this.list.length - 1);
                if (!this.closed) {
                    return null;
                }
            } else if (iIntValue >= this.list.length) {
                numValueOf2 = 0;
                if (!this.closed) {
                    return null;
                }
            }
            return this.list[numValueOf2.intValue()];
        }
        return null;
    }

    @NotNull
    public final WallsInfoWall[] get() {
        return this.list;
    }

    public final float getHeight() {
        Float f10 = this.height;
        if (f10 != null) {
            return f10.floatValue();
        }
        Wall wall = this.wall;
        Float fValueOf = Float.valueOf(wall != null ? wall.getHeight() : 0.0f);
        this.height = fValueOf;
        return fValueOf.floatValue();
    }

    @NotNull
    public final List<WallsInfoWall> getList() {
        return ArraysKt.toList(this.list);
    }

    @Nullable
    public final WallsInfoWall getNext(@NotNull WallsInfoWall wall) {
        Intrinsics.checkNotNullParameter(wall, "wall");
        return getWithDelta(wall, 1);
    }

    @Nullable
    public final k getOrigin() {
        Wall wall;
        if (this.list.length != 0 && (wall = this.wall) != null) {
            return wall.getOrigin(new k());
        }
        return null;
    }

    @NotNull
    public final k[] getPath(@NotNull WallsInfoWall.Side side) {
        Intrinsics.checkNotNullParameter(side, "side");
        ArrayList arrayList = new ArrayList();
        WallsInfoWall[] wallsInfoWallArr = this.list;
        if (wallsInfoWallArr.length > 2) {
            for (WallsInfoWall wallsInfoWall : wallsInfoWallArr) {
                WallsInfoWall previous = getPrevious(wallsInfoWall);
                if (previous != null) {
                    if (side == WallsInfoWall.Side.Top) {
                        addPathWallTop(arrayList, previous, wallsInfoWall);
                    } else {
                        addPathWallBottom(arrayList, previous, wallsInfoWall);
                    }
                }
            }
        }
        Object[] array = arrayList.toArray(new k[0]);
        if (array != null) {
            return (k[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @NotNull
    public final k[] getPathClean(@NotNull WallsInfoWall.Side side) {
        Intrinsics.checkNotNullParameter(side, "side");
        ArrayList arrayList = new ArrayList();
        for (WallsInfoWall wallsInfoWall : this.list) {
            WallsUtils wallsUtils = WallsUtils.INSTANCE;
            if (wallsUtils.areConnected(getNext(wallsInfoWall), wallsInfoWall) && wallsUtils.areConnected(wallsInfoWall, getPrevious(wallsInfoWall)) && !wallsUtils.isTheSameWall(wallsInfoWall, getNext(wallsInfoWall)) && !wallsUtils.isTheSameWall(wallsInfoWall, getPrevious(wallsInfoWall))) {
                if (side == WallsInfoWall.Side.Top) {
                    wallsUtils.addPoint(arrayList, wallsInfoWall.getTop().e());
                    wallsUtils.addPoint(arrayList, wallsInfoWall.getTop().c());
                } else {
                    wallsUtils.addPoint(arrayList, wallsInfoWall.getBottom().e());
                    wallsUtils.addPoint(arrayList, wallsInfoWall.getBottom().c());
                }
            }
        }
        Object[] array = arrayList.toArray(new k[0]);
        if (array != null) {
            return (k[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @Nullable
    public final WallsInfoWall getPrevious(@NotNull WallsInfoWall wall) {
        Intrinsics.checkNotNullParameter(wall, "wall");
        return getWithDelta(wall, -1);
    }

    @NotNull
    public String toString() {
        return "WallsInfo(list=" + ArraysKt.joinToString$default(this.list, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null) + " wall=" + this.wall + " height=" + this.height;
    }

    @Nullable
    public final WallsInfoWall get(@NotNull Wall wall) {
        Intrinsics.checkNotNullParameter(wall, "wall");
        for (WallsInfoWall wallsInfoWall : this.list) {
            if (Intrinsics.areEqual(wallsInfoWall.getWall(), wall)) {
                return wallsInfoWall;
            }
        }
        return null;
    }
}
