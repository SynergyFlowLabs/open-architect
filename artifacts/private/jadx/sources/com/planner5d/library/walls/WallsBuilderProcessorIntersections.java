package com.planner5d.library.walls;

import com.planner5d.library.math.c;
import com.planner5d.library.math.k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class WallsBuilderProcessorIntersections implements WallsBuilderProcessor {
    private final boolean notClosed;

    public WallsBuilderProcessorIntersections(boolean z10) {
        this.notClosed = z10;
    }

    private final boolean canUseNewEnd(c cVar, c cVar2, c cVar3, boolean z10, c cVar4, boolean z11) {
        if (cVar2 == null) {
            if (this.notClosed) {
                return false;
            }
            throw new NullPointerException("Not closed line is missing new end");
        }
        if (!linesIntersect(cVar, cVar2)) {
            return false;
        }
        if (z11) {
            return true;
        }
        if (cVar4.d() > cVar.d()) {
            return false;
        }
        if (z10 && !isLineNotShorter(cVar, cVar3, cVar4) && cVar3.d() <= cVar4.d()) {
            return false;
        }
        return true;
    }

    private final boolean canUseNewStart(c cVar, c cVar2, c cVar3, boolean z10, c cVar4, boolean z11) {
        if (cVar2 == null) {
            if (this.notClosed) {
                return false;
            }
            throw new NullPointerException("Not closed line is missing new start");
        }
        if (!linesIntersect(cVar, cVar2)) {
            return false;
        }
        if (!z10) {
            return true;
        }
        if (cVar3.d() > cVar.d()) {
            return false;
        }
        return z11 || isLineNotShorter(cVar, cVar3, cVar4) || cVar4.d() > cVar3.d();
    }

    private final c createLineUsingIntersections(c cVar, c cVar2, c cVar3, float f10) {
        k kVarE = cVar2.e();
        k kVarE2 = cVar2.e();
        k kVarG = cVar != null ? cVar.g(cVar2) : null;
        if (kVarG == null || kVarG == c.f180466e.b()) {
            kVarG = cVar2.e();
        }
        c cVar4 = new c(kVarE, usePointIfTargetTooFar(kVarE2, kVarG, f10));
        k kVarC = cVar2.c();
        k kVarC2 = cVar2.c();
        k kVarG2 = cVar3 != null ? cVar2.g(cVar3) : null;
        if (kVarG2 == null || kVarG2 == c.f180466e.b()) {
            kVarG2 = cVar2.c();
        }
        c cVar5 = new c(kVarC, usePointIfTargetTooFar(kVarC2, kVarG2, f10));
        boolean zS = cVar4.b().s(cVar2.b());
        boolean zS2 = cVar5.b().s(cVar2.b());
        return new c(canUseNewStart(cVar2, cVar, cVar4, zS, cVar5, zS2) ? cVar4.c() : cVar2.e(), canUseNewEnd(cVar2, cVar3, cVar4, zS, cVar5, zS2) ? cVar5.c() : cVar2.c());
    }

    private final boolean isLineNotShorter(c cVar, c cVar2, c cVar3) {
        return cVar2.d() + cVar3.d() <= cVar.d();
    }

    private final boolean linesIntersect(c cVar, c cVar2) {
        return !cVar.b().x(cVar2.b());
    }

    private final k usePointIfTargetTooFar(k kVar, k kVar2, float f10) {
        return kVar.m(kVar2) > f10 ? kVar : kVar2;
    }

    @Override // com.planner5d.library.walls.WallsBuilderProcessor
    public void process(@Nullable WallsBuilderStateWall wallsBuilderStateWall, @NotNull WallsBuilderStateWall center, @Nullable WallsBuilderStateWall wallsBuilderStateWall2, @NotNull k temp) {
        WallsInfoWall infoDefault$com_planner5d_library_android_1_3_4_release;
        WallsInfoWall infoDefault$com_planner5d_library_android_1_3_4_release2;
        WallsInfoWall infoDefault$com_planner5d_library_android_1_3_4_release3;
        WallsInfoWall infoDefault$com_planner5d_library_android_1_3_4_release4;
        WallsInfoWall infoDefault$com_planner5d_library_android_1_3_4_release5;
        c middle;
        WallsInfoWall infoDefault$com_planner5d_library_android_1_3_4_release6;
        c middle2;
        Intrinsics.checkNotNullParameter(center, "center");
        Intrinsics.checkNotNullParameter(temp, "temp");
        float fD = 0.0f;
        float fMax = Math.max((wallsBuilderStateWall == null || (infoDefault$com_planner5d_library_android_1_3_4_release6 = wallsBuilderStateWall.getInfoDefault$com_planner5d_library_android_1_3_4_release()) == null || (middle2 = infoDefault$com_planner5d_library_android_1_3_4_release6.getMiddle()) == null) ? 0.0f : middle2.d(), center.getInfoDefault$com_planner5d_library_android_1_3_4_release().getMiddle().d());
        if (wallsBuilderStateWall2 != null && (infoDefault$com_planner5d_library_android_1_3_4_release5 = wallsBuilderStateWall2.getInfoDefault$com_planner5d_library_android_1_3_4_release()) != null && (middle = infoDefault$com_planner5d_library_android_1_3_4_release5.getMiddle()) != null) {
            fD = middle.d();
        }
        float fMax2 = Math.max(fMax, fD);
        c bottom = null;
        c cVarCreateLineUsingIntersections = createLineUsingIntersections((wallsBuilderStateWall == null || (infoDefault$com_planner5d_library_android_1_3_4_release4 = wallsBuilderStateWall.getInfoDefault$com_planner5d_library_android_1_3_4_release()) == null) ? null : infoDefault$com_planner5d_library_android_1_3_4_release4.getTop(), center.getInfoDefault$com_planner5d_library_android_1_3_4_release().getTop(), (wallsBuilderStateWall2 == null || (infoDefault$com_planner5d_library_android_1_3_4_release3 = wallsBuilderStateWall2.getInfoDefault$com_planner5d_library_android_1_3_4_release()) == null) ? null : infoDefault$com_planner5d_library_android_1_3_4_release3.getTop(), fMax2);
        c bottom2 = (wallsBuilderStateWall == null || (infoDefault$com_planner5d_library_android_1_3_4_release2 = wallsBuilderStateWall.getInfoDefault$com_planner5d_library_android_1_3_4_release()) == null) ? null : infoDefault$com_planner5d_library_android_1_3_4_release2.getBottom();
        c bottom3 = center.getInfoDefault$com_planner5d_library_android_1_3_4_release().getBottom();
        if (wallsBuilderStateWall2 != null && (infoDefault$com_planner5d_library_android_1_3_4_release = wallsBuilderStateWall2.getInfoDefault$com_planner5d_library_android_1_3_4_release()) != null) {
            bottom = infoDefault$com_planner5d_library_android_1_3_4_release.getBottom();
        }
        center.setNew$com_planner5d_library_android_1_3_4_release(cVarCreateLineUsingIntersections, createLineUsingIntersections(bottom2, bottom3, bottom, fMax2));
    }
}
