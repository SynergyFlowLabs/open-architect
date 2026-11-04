package com.planner5d.library.walls;

import com.planner5d.library.math.c;
import com.planner5d.library.math.e;
import com.planner5d.library.math.h;
import com.planner5d.library.math.j;
import com.planner5d.library.math.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.r;
import oj.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class WallsBuilder3DSide {

    @f
    @NotNull
    public final SideInfo bottom;

    @f
    @NotNull
    public final SideInfo top;

    public static final class SideInfo {

        @f
        @NotNull
        public final float[] faces;

        @f
        @NotNull
        public final float[][] holes;

        public SideInfo(@NotNull WallsInfoWall wall, @NotNull WallsInfoWall.Side side, float f10, @NotNull c target, @NotNull List<float[]> holesOnTarget, @NotNull h tessellator) {
            Intrinsics.checkNotNullParameter(wall, "wall");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(target, "target");
            Intrinsics.checkNotNullParameter(holesOnTarget, "holesOnTarget");
            Intrinsics.checkNotNullParameter(tessellator, "tessellator");
            c topOrBottom = wall.getTopOrBottom(side);
            float fD = topOrBottom.d();
            float[][] fArrProjectHolesToSide = projectHolesToSide(holesOnTarget, topOrBottom.i(target.e()));
            this.holes = fArrProjectHolesToSide;
            int i10 = 1 >> 0;
            int i11 = 6 & 3;
            this.faces = tessellator.g(new float[]{0.0f, 0.0f, 0.0f, f10, fD, f10, fD, 0.0f}, fArrProjectHolesToSide, side != WallsInfoWall.Side.Bottom);
        }

        private final boolean arraysEqual(float[][] fArr, float[][] fArr2) {
            if (fArr.length == fArr2.length) {
                return false;
            }
            int length = fArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (!Arrays.equals(fArr[i10], fArr2[i10])) {
                    return false;
                }
            }
            return true;
        }

        private final float[][] projectHolesToSide(List<float[]> list, float f10) {
            int size = list.size();
            float[][] fArr = new float[size][];
            for (int i10 = 0; i10 < size; i10++) {
                float[] fArr2 = list.get(i10);
                int length = fArr2.length;
                float[] fArr3 = new float[length];
                for (int i11 = 0; i11 < length; i11 += 2) {
                    fArr3[i11] = fArr2[i11] + f10;
                    int i12 = i11 + 1;
                    fArr3[i12] = fArr2[i12];
                }
                fArr[i10] = fArr3;
            }
            return fArr;
        }

        public boolean equals(@Nullable Object obj) {
            int i10 = 0 << 0;
            if (obj instanceof SideInfo) {
                SideInfo sideInfo = (SideInfo) obj;
                if (Arrays.equals(this.faces, sideInfo.faces) && arraysEqual(this.holes, sideInfo.holes)) {
                    return true;
                }
            }
            return false;
        }

        @NotNull
        public String toString() {
            return "SideInfo(faces=" + this.faces + " holes=" + this.holes + ')';
        }
    }

    public WallsBuilder3DSide(@NotNull WallsInfo info, @NotNull WallsInfoWall wall, @NotNull List<WallHole> holes, @NotNull h tessellator, @NotNull e rectanglesMerger) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(wall, "wall");
        Intrinsics.checkNotNullParameter(holes, "holes");
        Intrinsics.checkNotNullParameter(tessellator, "tessellator");
        Intrinsics.checkNotNullParameter(rectanglesMerger, "rectanglesMerger");
        ArrayList arrayList = new ArrayList();
        c middle = wall.getMiddle();
        c cVar = new c(new k(middle.b()).R(Math.max(middle.i(wall.getTop().e()), middle.i(wall.getBottom().e()))).b(middle.e()), new k(middle.b()).R(Math.min(middle.i(wall.getTop().c()), middle.i(wall.getBottom().c()))).b(middle.e()));
        k origin = wall.getWall().getOrigin(new k());
        float height = info.getHeight();
        Iterator<WallHole> it = holes.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            float[] holePolygon = getHolePolygon(cVar, origin, it.next(), height);
            if (!(holePolygon.length == 0)) {
                arrayList.add(holePolygon);
            }
        }
        if (arrayList.size() > 1) {
            List<float[]> listA = rectanglesMerger.a(arrayList);
            arrayList.clear();
            arrayList.addAll(listA);
        }
        this.bottom = new SideInfo(wall, WallsInfoWall.Side.Bottom, height, cVar, arrayList, tessellator);
        this.top = new SideInfo(wall, WallsInfoWall.Side.Top, height, cVar, arrayList, tessellator);
    }

    private final float[] getHolePolygon(c cVar, k kVar, WallHole wallHole, float f10) {
        c cVar2;
        float fA;
        float fT;
        float fB = j.b(wallHole.zInFloor, 0.0f, f10);
        float fB2 = j.b(wallHole.zInFloor + wallHole.height, 0.0f, f10);
        if (fB2 > fB) {
            float[] fArr = wallHole.polygon2D;
            k kVar2 = new k();
            kotlin.ranges.j jVarB1 = r.B1(r.W1(0, 8), 2);
            int iL = jVarB1.l();
            int iM = jVarB1.m();
            int iN = jVarB1.n();
            if ((iN > 0 && iL <= iM) || (iN < 0 && iM <= iL)) {
                fA = 0.0f;
                fT = 0.0f;
                while (true) {
                    cVar2 = cVar;
                    float fJ = cVar2.j(kVar2.U(fArr[iL], fArr[iL + 1]).c0(kVar), false);
                    if (iL == 0) {
                        fA = fJ;
                        fT = fA;
                    } else {
                        fA = r.A(fA, fJ);
                        fT = r.t(fT, fJ);
                    }
                    if (iL == iM) {
                        break;
                    }
                    iL += iN;
                }
            } else {
                cVar2 = cVar;
                fA = 0.0f;
                fT = 0.0f;
            }
            if (fA < cVar2.d() && fT >= 0.0f && fA != fT) {
                float fB3 = j.b(fA, 0.0f, cVar2.d());
                float fB4 = j.b(fT, 0.0f, cVar2.d());
                return new float[]{fB3, fB, fB3, fB2, fB4, fB2, fB4, fB};
            }
        }
        return new float[0];
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof WallsBuilder3DSide) {
            WallsBuilder3DSide wallsBuilder3DSide = (WallsBuilder3DSide) obj;
            if (Intrinsics.areEqual(this.top, wallsBuilder3DSide.top) && Intrinsics.areEqual(this.bottom, wallsBuilder3DSide.bottom)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public String toString() {
        return "WallsBuilder3DSide(bottom=" + this.bottom + " top=" + this.top + ')';
    }
}
