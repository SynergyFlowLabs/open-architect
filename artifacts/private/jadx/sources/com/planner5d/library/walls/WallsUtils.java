package com.planner5d.library.walls;

import com.planner5d.library.math.k;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class WallsUtils {
    private static final float EPSILON = 1.0E-5f;

    @NotNull
    public static final WallsUtils INSTANCE = new WallsUtils();

    @NotNull
    private static final k temp0 = new k();

    @NotNull
    private static final k temp1 = new k();

    private WallsUtils() {
    }

    private final boolean compareWallPoints(Wall wall, boolean z10, Wall wall2, boolean z11, k kVar, k kVar2) {
        return wall.getPoint(kVar, true, z10).q(wall2.getPoint(kVar2, true, z11), EPSILON);
    }

    public final void addPoint(@NotNull List<k> path, @NotNull k point) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(point, "point");
        if (path.isEmpty() || path.get(path.size() - 1) != point) {
            path.add(point);
        }
    }

    public final boolean areConnected(@Nullable WallsInfoWall wallsInfoWall, @Nullable WallsInfoWall wallsInfoWall2) {
        return (wallsInfoWall == null || wallsInfoWall2 == null || !compareWallPoints(wallsInfoWall.getWall(), true, wallsInfoWall2.getWall(), false, temp0, temp1)) ? false : true;
    }

    public final boolean isClosedLoop(@NotNull Wall[] list) {
        Intrinsics.checkNotNullParameter(list, "list");
        return list.length > 1 && isClosedLoop((Wall) ArraysKt.first(list), (Wall) ArraysKt.last(list));
    }

    public final boolean isTheSameWall(@Nullable WallsInfoWall wallsInfoWall, @Nullable WallsInfoWall wallsInfoWall2) {
        if (wallsInfoWall != null && wallsInfoWall2 != null) {
            Wall wall = wallsInfoWall.getWall();
            Wall wall2 = wallsInfoWall2.getWall();
            k kVar = temp0;
            k kVar2 = temp1;
            if (compareWallPoints(wall, true, wall2, false, kVar, kVar2) && compareWallPoints(wallsInfoWall.getWall(), false, wallsInfoWall2.getWall(), true, kVar, kVar2)) {
                return true;
            }
            if (compareWallPoints(wallsInfoWall.getWall(), true, wallsInfoWall2.getWall(), true, kVar, kVar2) && compareWallPoints(wallsInfoWall.getWall(), false, wallsInfoWall2.getWall(), false, kVar, kVar2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean isWallJointPointsMatching(@NotNull WallsInfoWall previous, @NotNull WallsInfoWall current) {
        Intrinsics.checkNotNullParameter(previous, "previous");
        Intrinsics.checkNotNullParameter(current, "current");
        if (previous.getEnd().length != current.getStart().length) {
            return false;
        }
        int length = previous.getEnd().length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!previous.getEnd()[i10].e().q(current.getStart()[i10].e(), EPSILON) || !previous.getEnd()[i10].c().q(current.getStart()[i10].c(), EPSILON)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isClosedLoop(@NotNull WallsInfoWall[] list) {
        Intrinsics.checkNotNullParameter(list, "list");
        return list.length > 1 && isClosedLoop(((WallsInfoWall) ArraysKt.first(list)).getWall(), ((WallsInfoWall) ArraysKt.last(list)).getWall());
    }

    private final boolean isClosedLoop(Wall wall, Wall wall2) {
        return compareWallPoints(wall, true, wall2, false, new k(), new k());
    }
}
