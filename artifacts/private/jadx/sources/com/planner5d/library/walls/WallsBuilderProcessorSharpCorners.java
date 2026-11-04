package com.planner5d.library.walls;

import com.planner5d.library.math.c;
import com.planner5d.library.math.j;
import com.planner5d.library.math.k;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class WallsBuilderProcessorSharpCorners implements WallsBuilderProcessor {

    @NotNull
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getCutOffDistance(@NotNull WallsBuilderStateWall... walls) {
            WallsBuilderStateWall wallsBuilderStateWall;
            Intrinsics.checkNotNullParameter(walls, "walls");
            if (walls.length != 0) {
                wallsBuilderStateWall = walls[0];
                int lastIndex = ArraysKt.getLastIndex(walls);
                if (lastIndex != 0) {
                    float width = wallsBuilderStateWall.getInfo$com_planner5d_library_android_1_3_4_release().getWall().getWidth();
                    int i10 = 1;
                    if (1 <= lastIndex) {
                        while (true) {
                            WallsBuilderStateWall wallsBuilderStateWall2 = walls[i10];
                            float width2 = wallsBuilderStateWall2.getInfo$com_planner5d_library_android_1_3_4_release().getWall().getWidth();
                            if (Float.compare(width, width2) < 0) {
                                wallsBuilderStateWall = wallsBuilderStateWall2;
                                width = width2;
                            }
                            if (i10 == lastIndex) {
                                break;
                            }
                            i10++;
                        }
                    }
                }
            } else {
                wallsBuilderStateWall = null;
            }
            if (wallsBuilderStateWall != null) {
                return wallsBuilderStateWall.getInfo$com_planner5d_library_android_1_3_4_release().getWall().getWidth() - wallsBuilderStateWall.getInfo$com_planner5d_library_android_1_3_4_release().getWall().getMinimumWidth();
            }
            return 0.0f;
        }

        private Companion() {
        }
    }

    private static final class CutOffEdge {

        @Nullable
        private final k corner;

        @NotNull
        private final c cut;

        @NotNull
        private final k end;

        @NotNull
        private final k start;

        public CutOffEdge(@NotNull k start, @NotNull k end, @Nullable k kVar) {
            Intrinsics.checkNotNullParameter(start, "start");
            Intrinsics.checkNotNullParameter(end, "end");
            this.start = start;
            this.end = end;
            this.corner = kVar;
            this.cut = new c(start, end);
        }

        @Nullable
        public final k getCorner() {
            return this.corner;
        }

        @NotNull
        public final c getCut() {
            return this.cut;
        }

        @NotNull
        public final k getEnd() {
            return this.end;
        }

        @NotNull
        public final k getStart() {
            return this.start;
        }
    }

    static {
        int i10 = 4 | 0;
    }

    private final void applyCutOffNextMain(WallsBuilderStateWall wallsBuilderStateWall, WallsBuilderStateWall wallsBuilderStateWall2, WallsInfoWall.Side side, CutOffEdge cutOffEdge) {
        c topOrBottom = wallsBuilderStateWall2.getInfo$com_planner5d_library_android_1_3_4_release().getTopOrBottom(side.opposite());
        c topOrBottom2 = wallsBuilderStateWall.getInfo$com_planner5d_library_android_1_3_4_release().getTopOrBottom(side.opposite());
        if (side == WallsInfoWall.Side.Bottom) {
            wallsBuilderStateWall.setNewEnd$com_planner5d_library_android_1_3_4_release(cutOffEdge.getEnd(), clipSideAtCut(cutOffEdge.getCut(), topOrBottom2, topOrBottom2.c()), cutOffEdge.getCorner());
            wallsBuilderStateWall2.setNewStart$com_planner5d_library_android_1_3_4_release(cutOffEdge.getStart(), clipSideAtCut(cutOffEdge.getCut(), topOrBottom, topOrBottom.e()), cutOffEdge.getCorner());
        } else {
            wallsBuilderStateWall.setNewEnd$com_planner5d_library_android_1_3_4_release(clipSideAtCut(cutOffEdge.getCut(), topOrBottom2, topOrBottom2.c()), cutOffEdge.getEnd(), cutOffEdge.getCorner());
            wallsBuilderStateWall2.setNewStart$com_planner5d_library_android_1_3_4_release(clipSideAtCut(cutOffEdge.getCut(), topOrBottom, topOrBottom.e()), cutOffEdge.getStart(), cutOffEdge.getCorner());
        }
    }

    private final void applyCutOffPreviousMain(WallsBuilderStateWall wallsBuilderStateWall, WallsBuilderStateWall wallsBuilderStateWall2, WallsInfoWall.Side side, CutOffEdge cutOffEdge) {
        c topOrBottom = wallsBuilderStateWall2.getInfo$com_planner5d_library_android_1_3_4_release().getTopOrBottom(side.opposite());
        c topOrBottom2 = wallsBuilderStateWall.getInfo$com_planner5d_library_android_1_3_4_release().getTopOrBottom(side.opposite());
        if (side == WallsInfoWall.Side.Bottom) {
            wallsBuilderStateWall.setNewEnd$com_planner5d_library_android_1_3_4_release(cutOffEdge.getStart(), clipSideAtCut(cutOffEdge.getCut(), topOrBottom2, topOrBottom2.c()), cutOffEdge.getCorner());
            wallsBuilderStateWall2.setNewStart$com_planner5d_library_android_1_3_4_release(cutOffEdge.getEnd(), clipSideAtCut(cutOffEdge.getCut(), topOrBottom, topOrBottom.e()), cutOffEdge.getCorner());
        } else {
            wallsBuilderStateWall.setNewEnd$com_planner5d_library_android_1_3_4_release(clipSideAtCut(cutOffEdge.getCut(), topOrBottom2, topOrBottom2.c()), cutOffEdge.getStart(), cutOffEdge.getCorner());
            wallsBuilderStateWall2.setNewStart$com_planner5d_library_android_1_3_4_release(clipSideAtCut(cutOffEdge.getCut(), topOrBottom, topOrBottom.e()), cutOffEdge.getEnd(), cutOffEdge.getCorner());
        }
    }

    private final k clipSideAtCut(c cVar, c cVar2, k kVar) {
        k kVar2 = new k(kVar);
        k kVarH = cVar.h(cVar2);
        if (kVarH != c.f180466e.b()) {
            kVar2.V(kVarH);
        }
        return kVar2;
    }

    private final float computeCutOffOffset(c cVar, k kVar, c cVar2, float f10) {
        k kVarG = cVar.g(cVar2);
        return kVarG != c.f180466e.b() ? Math.min(f10, kVar.m(kVarG)) : f10;
    }

    private final k createCorner(k kVar, c cVar, k kVar2, k kVar3, c... cVarArr) {
        Object next;
        c cVar2 = new c(kVar2, kVar3);
        ArrayList arrayList = new ArrayList(cVarArr.length);
        for (c cVar3 : cVarArr) {
            arrayList.add(cVar.g(cVar3));
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            k kVar4 = (k) next;
            if (cVar2.b().s(kVar.V(kVar4).c0(kVar2)) && cVar2.b().r(kVar.V(kVar4).c0(kVar3))) {
                break;
            }
        }
        k kVar5 = (k) next;
        return kVar5 == null ? new k(kVar3) : kVar5;
    }

    private final c createCutOffLine(c cVar, k kVar, k kVar2) {
        return new c(kVar, kVar2.V(cVar.b()).O(1).b(kVar));
    }

    private final void cutOff(WallsBuilderStateWall wallsBuilderStateWall, WallsBuilderStateWall wallsBuilderStateWall2, k kVar, WallsInfoWall.Side side, float f10) {
        c topOrBottom = wallsBuilderStateWall.getInfoDefault$com_planner5d_library_android_1_3_4_release().getTopOrBottom(side);
        c topOrBottom2 = wallsBuilderStateWall2.getInfoDefault$com_planner5d_library_android_1_3_4_release().getTopOrBottom(side);
        if (Intrinsics.areEqual(getMain(topOrBottom, topOrBottom2), topOrBottom)) {
            applyCutOffPreviousMain(wallsBuilderStateWall, wallsBuilderStateWall2, side, cutOffPreviousMain(topOrBottom, wallsBuilderStateWall.getInfoDefault$com_planner5d_library_android_1_3_4_release().getTopOrBottom(side.opposite()), topOrBottom2, wallsBuilderStateWall2.getInfoDefault$com_planner5d_library_android_1_3_4_release().getTopOrBottom(side.opposite()), f10, kVar));
        } else {
            applyCutOffNextMain(wallsBuilderStateWall, wallsBuilderStateWall2, side, cutOffNextMain(topOrBottom, wallsBuilderStateWall.getInfoDefault$com_planner5d_library_android_1_3_4_release().getTopOrBottom(side.opposite()), topOrBottom2, wallsBuilderStateWall2.getInfoDefault$com_planner5d_library_android_1_3_4_release().getTopOrBottom(side.opposite()), f10, kVar));
        }
    }

    private final CutOffEdge cutOffNextMain(c cVar, c cVar2, c cVar3, c cVar4, float f10, k kVar) {
        k kVarB = new k(cVar3.b()).R(-computeCutOffOffset(cVar3, cVar3.e(), cVar3, f10)).b(cVar3.e());
        c cVarCreateCutOffLine = createCutOffLine(cVar3, kVarB, kVar);
        k kVarG = cVarCreateCutOffLine.g(cVar);
        return new CutOffEdge(kVarB, kVarG, createCorner(kVar, cVarCreateCutOffLine, kVarB, kVarG, cVar2, cVar4));
    }

    private final CutOffEdge cutOffPreviousMain(c cVar, c cVar2, c cVar3, c cVar4, float f10, k kVar) {
        k kVarB = new k(cVar.b()).R(computeCutOffOffset(cVar, cVar.c(), cVar3, f10)).b(cVar.c());
        c cVarCreateCutOffLine = createCutOffLine(cVar, kVarB, kVar);
        k kVarG = cVarCreateCutOffLine.g(cVar3);
        return new CutOffEdge(kVarB, kVarG, createCorner(kVar, cVarCreateCutOffLine, kVarB, kVarG, cVar4, cVar2));
    }

    private final int distanceToAngle(int i10, int i11) {
        int i12 = i10 % i11;
        return Math.min(i12, i11 - i12);
    }

    static /* synthetic */ int distanceToAngle$default(WallsBuilderProcessorSharpCorners wallsBuilderProcessorSharpCorners, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 90;
        }
        return wallsBuilderProcessorSharpCorners.distanceToAngle(i10, i11);
    }

    private final WallsInfoWall.Side getCutOffSide(WallsBuilderStateWall wallsBuilderStateWall, WallsBuilderStateWall wallsBuilderStateWall2, float f10) {
        WallsInfoWall.Side sideOpposite;
        if (wallsBuilderStateWall.getInfoDefault$com_planner5d_library_android_1_3_4_release().getMiddle().b().x(wallsBuilderStateWall2.getInfoDefault$com_planner5d_library_android_1_3_4_release().getMiddle().b())) {
            return null;
        }
        WallsInfoWall.Side innerSide = getInnerSide(wallsBuilderStateWall, wallsBuilderStateWall2);
        if (innerSide == null || (sideOpposite = innerSide.opposite()) == null) {
            return null;
        }
        if (!Intrinsics.areEqual(wallsBuilderStateWall.getInfo$com_planner5d_library_android_1_3_4_release().getTopOrBottom(sideOpposite).c(), wallsBuilderStateWall2.getInfo$com_planner5d_library_android_1_3_4_release().getTopOrBottom(sideOpposite).e()) || wallsBuilderStateWall.getInfo$com_planner5d_library_android_1_3_4_release().getTopOrBottom(sideOpposite).c().m(wallsBuilderStateWall.getInfoDefault$com_planner5d_library_android_1_3_4_release().getTopOrBottom(sideOpposite).c()) > f10 || wallsBuilderStateWall2.getInfo$com_planner5d_library_android_1_3_4_release().getTopOrBottom(sideOpposite).e().m(wallsBuilderStateWall2.getInfoDefault$com_planner5d_library_android_1_3_4_release().getTopOrBottom(sideOpposite).e()) > f10) {
            return sideOpposite;
        }
        return null;
    }

    private final WallsInfoWall.Side getInnerSide(WallsBuilderStateWall wallsBuilderStateWall, WallsBuilderStateWall wallsBuilderStateWall2) {
        float fI = j.i(new k(wallsBuilderStateWall.getInfoDefault$com_planner5d_library_android_1_3_4_release().getMiddle().b()).R(-1.0f).d(wallsBuilderStateWall2.getInfoDefault$com_planner5d_library_android_1_3_4_release().getMiddle().b()));
        c cVar = new c(wallsBuilderStateWall.getInfoDefault$com_planner5d_library_android_1_3_4_release().getTop().c(), wallsBuilderStateWall2.getInfoDefault$com_planner5d_library_android_1_3_4_release().getTop().e());
        k kVarG = cVar.g(wallsBuilderStateWall.getInfoDefault$com_planner5d_library_android_1_3_4_release().getBottom());
        c.a aVar = c.f180466e;
        WallsInfoWall.Side sideOpposite = (kVarG == aVar.b() || cVar.g(wallsBuilderStateWall2.getInfoDefault$com_planner5d_library_android_1_3_4_release().getBottom()) == aVar.b()) ? WallsInfoWall.Side.Top : WallsInfoWall.Side.Bottom;
        if (wallsBuilderStateWall.getInfoDefault$com_planner5d_library_android_1_3_4_release().getTopOrBottom(sideOpposite.opposite()).h(wallsBuilderStateWall2.getInfoDefault$com_planner5d_library_android_1_3_4_release().getTopOrBottom(sideOpposite.opposite())) != aVar.b()) {
            sideOpposite = sideOpposite.opposite();
        }
        if ((0.0f > fI || fI >= 45.0f) && (315.0f >= fI || fI >= 360.0f)) {
            return null;
        }
        return sideOpposite;
    }

    private final c getMain(c cVar, c cVar2) {
        return distanceToAngle$default(this, (int) cVar.b().c(), 0, 2, null) <= distanceToAngle$default(this, (int) cVar2.b().c(), 0, 2, null) ? cVar : cVar2;
    }

    private final boolean isValid(c[] cVarArr, c[] cVarArr2, float f10) {
        if (cVarArr.length == 1 && cVarArr2.length == 1) {
            return true;
        }
        for (c cVar : cVarArr2) {
            for (c cVar2 : cVarArr) {
                if ((cVar2.e().q(cVar.e(), f10) || cVar2.e().q(cVar.c(), f10)) && (cVar2.c().q(cVar.e(), f10) || cVar2.c().q(cVar.c(), f10))) {
                    return true;
                }
            }
        }
        return false;
    }

    static /* synthetic */ boolean isValid$default(WallsBuilderProcessorSharpCorners wallsBuilderProcessorSharpCorners, c[] cVarArr, c[] cVarArr2, float f10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f10 = 0.01f;
        }
        return wallsBuilderProcessorSharpCorners.isValid(cVarArr, cVarArr2, f10);
    }

    private final boolean isValidCutOff(WallsBuilderStateWall wallsBuilderStateWall, WallsBuilderStateWall wallsBuilderStateWall2, WallsInfoWall.Side side) {
        Object next;
        if (isValid$default(this, wallsBuilderStateWall.getInfo$com_planner5d_library_android_1_3_4_release().getEnd(), wallsBuilderStateWall2.getInfo$com_planner5d_library_android_1_3_4_release().getStart(), 0.0f, 4, null)) {
            return true;
        }
        k kVarC0 = new k(wallsBuilderStateWall.getInfo$com_planner5d_library_android_1_3_4_release().getTopOrBottom(side).c()).c0(wallsBuilderStateWall2.getInfo$com_planner5d_library_android_1_3_4_release().getTopOrBottom(side).e());
        c[][] cVarArr = {wallsBuilderStateWall.getInfo$com_planner5d_library_android_1_3_4_release().getEnd(), wallsBuilderStateWall2.getInfo$com_planner5d_library_android_1_3_4_release().getStart()};
        int i10 = 5 & 2;
        ArrayList arrayList = new ArrayList(2);
        for (int i11 = 0; i11 < 2; i11++) {
            c[] cVarArr2 = cVarArr[i11];
            arrayList.add(cVarArr2[(cVarArr2.length <= 1 || side != WallsInfoWall.Side.Top) ? (char) 0 : (char) 1]);
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((c) next).b().x(kVarC0));
        return next == null;
    }

    @Override // com.planner5d.library.walls.WallsBuilderProcessor
    public void process(@Nullable WallsBuilderStateWall wallsBuilderStateWall, @NotNull WallsBuilderStateWall center, @Nullable WallsBuilderStateWall wallsBuilderStateWall2, @NotNull k temp) {
        float cutOffDistance;
        WallsInfoWall.Side cutOffSide;
        Intrinsics.checkNotNullParameter(center, "center");
        Intrinsics.checkNotNullParameter(temp, "temp");
        Companion companion = Companion;
        if (wallsBuilderStateWall != null && (cutOffSide = getCutOffSide(wallsBuilderStateWall, center, (cutOffDistance = companion.getCutOffDistance(wallsBuilderStateWall, center)))) != null) {
            cutOff(wallsBuilderStateWall, center, temp, cutOffSide, cutOffDistance);
            if (!isValidCutOff(wallsBuilderStateWall, center, cutOffSide)) {
                cutOff(wallsBuilderStateWall, center, temp, cutOffSide.opposite(), cutOffDistance);
            }
        }
    }
}
