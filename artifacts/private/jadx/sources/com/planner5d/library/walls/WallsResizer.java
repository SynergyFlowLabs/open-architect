package com.planner5d.library.walls;

import com.planner5d.library.math.a;
import com.planner5d.library.math.c;
import com.planner5d.library.math.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class WallsResizer {
    private final float delta = 100.0f;
    private final float tolerance = 1.0E-4f;
    private final int maxIterations = 100;

    @NotNull
    private final a goldenSection = new a();

    public enum Side {
        Left,
        Center,
        Right
    }

    /* JADX INFO: renamed from: com.planner5d.library.walls.WallsResizer$calcSizeAdjustment$1, reason: invalid class name */
    static final class AnonymousClass1 extends l0 implements Function1<Float, Float> {
        final /* synthetic */ float $desiredLengthTemp;
        final /* synthetic */ int $resizeSide;
        final /* synthetic */ k $temp0;
        final /* synthetic */ k $temp1;
        final /* synthetic */ Wall $wall;
        final /* synthetic */ WallsInfo $walls;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(float f10, Wall wall, WallsInfo wallsInfo, int i10, k kVar, k kVar2) {
            super(1);
            this.$desiredLengthTemp = f10;
            this.$wall = wall;
            this.$walls = wallsInfo;
            this.$resizeSide = i10;
            this.$temp0 = kVar;
            this.$temp1 = kVar2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Float invoke(Float f10) {
            return invoke(f10.floatValue());
        }

        @NotNull
        public final Float invoke(float f10) {
            WallsResizer wallsResizer = WallsResizer.this;
            return Float.valueOf(wallsResizer.calculateInlineLengthError(this.$desiredLengthTemp, wallsResizer.createTripleWallChain(this.$wall, this.$walls, f10, this.$resizeSide, this.$temp0, this.$temp1)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float calculateInlineLengthError(float f10, Wall[] wallArr) {
        WallsInfo wallsInfoBuild = WallsBuilder.INSTANCE.build(wallArr, true);
        try {
            return Math.abs(wallsInfoBuild.get()[1].getTop().d() - f10);
        } catch (Throwable th2) {
            throw new RuntimeException("WallResizer wasn't able to build walls chain " + wallsInfoBuild.get() + ' ' + th2);
        }
    }

    private final float calculateMinPossibleInlineLength(Wall wall, WallsInfo wallsInfo, int i10, float f10, k kVar, k kVar2) {
        try {
            return WallsBuilder.INSTANCE.build(createTripleWallChain(wall, wallsInfo, (-f10) + 1, i10, kVar, kVar2), true).get()[1].getTop().d();
        } catch (Throwable th2) {
            throw new RuntimeException("WallResizer failed to find minimum length " + th2);
        }
    }

    private final Wall createBuilderWall(k kVar, k kVar2, float f10, boolean z10, float f11) {
        return new WallSimple(kVar, kVar2, f10, f11, z10, null, 32, null);
    }

    static /* synthetic */ Wall createBuilderWall$default(WallsResizer wallsResizer, k kVar, k kVar2, float f10, boolean z10, float f11, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i10 & 16) != 0) {
            f11 = 270.0f;
        }
        return wallsResizer.createBuilderWall(kVar, kVar2, f10, z11, f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Wall[] createTripleWallChain(Wall wall, WallsInfo wallsInfo, float f10, int i10, k kVar, k kVar2) {
        wall.getPoint(kVar, false, true);
        wall.getPoint(kVar2, false, false);
        float f11 = f10 / 2;
        float f12 = 0.0f;
        if (i10 == Side.Left.ordinal()) {
            f11 = f10;
        } else if (i10 == Side.Right.ordinal()) {
            f11 = 0.0f;
            f12 = f10;
        } else {
            f12 = f11;
        }
        k kVarExtendSegment = extendSegment(kVar, kVar2, f12);
        k kVarExtendSegment2 = extendSegment(kVar2, kVar, f11);
        Wall wallCreateBuilderWall = createBuilderWall(kVarExtendSegment, kVarExtendSegment2, wall.getWidth(), wall.isHidden(), wall.getHeight());
        WallsInfoWall wallsInfoWall = wallsInfo.get(wall);
        if (wallsInfoWall == null) {
            throw new RuntimeException("WallResizer wasn't able to build walls chain because the wall is not a part of Walls");
        }
        WallsInfoWall previous = wallsInfo.getPrevious(wallsInfoWall);
        Wall wallCreateBuilderWall2 = previous != null ? createBuilderWall(previous.getWall().getPoint(new k(), false, true), new k(kVarExtendSegment), previous.getWall().getWidth(), previous.getWall().isHidden(), previous.getWall().getHeight()) : null;
        WallsInfoWall next = wallsInfo.getNext(wallsInfoWall);
        Wall wallCreateBuilderWall3 = next != null ? createBuilderWall(new k(kVarExtendSegment2), next.getWall().getPoint(new k(), false, false), next.getWall().getWidth(), next.getWall().isHidden(), next.getWall().getHeight()) : null;
        if (wallCreateBuilderWall2 != null && wallCreateBuilderWall3 != null) {
            return new Wall[]{wallCreateBuilderWall2, wallCreateBuilderWall, wallCreateBuilderWall3};
        }
        throw new RuntimeException("WallResizer wasn't able to build walls chain " + wallsInfo);
    }

    private final k extendSegment(k kVar, k kVar2, float f10) {
        return new k(kVar).b(new k(kVar).c0(new k(kVar2)).M().R(f10));
    }

    @Nullable
    public final Float calcSizeAdjustment(@NotNull Wall wall, @NotNull WallsInfo walls, float f10, int i10) {
        c top;
        Intrinsics.checkNotNullParameter(wall, "wall");
        Intrinsics.checkNotNullParameter(walls, "walls");
        k kVar = new k();
        k kVar2 = new k();
        WallsInfoWall wallsInfoWall = walls.get(wall);
        if (wallsInfoWall != null && (top = wallsInfoWall.getTop()) != null) {
            float fD = top.d();
            float f11 = this.tolerance;
            float f12 = f11 + (((f10 + fD) * f11) / 1000);
            float fMax = Math.max(f10, calculateMinPossibleInlineLength(wall, walls, i10, fD, kVar, kVar2));
            float f13 = fMax - fD;
            float f14 = this.delta;
            float f15 = f13 - f14;
            float f16 = f13 + f14;
            if (fD + f15 < 0.0f) {
                f15 = -fD;
            }
            try {
                return Float.valueOf(this.goldenSection.b(new AnonymousClass1(fMax, wall, walls, i10, kVar, kVar2), f15, f16, f12, this.maxIterations));
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
