package com.planner5d.library.walls;

import com.planner5d.library.math.c;
import com.planner5d.library.math.e;
import com.planner5d.library.math.h;
import com.planner5d.library.math.k;
import com.planner5d.library.math.l;
import com.planner5d.library.math.m;
import com.planner5d.library.math.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public class WallsBuilder3D {

    @f
    @NotNull
    protected final WallsBuilder3DMesh builder;
    private final float coordinate3DScale;
    private final float flooringHeight;

    @f
    public final boolean hidden;

    @NotNull
    private final List<WallHole> holes;

    @f
    @NotNull
    protected final WallsInfo info;

    @f
    @Nullable
    protected final k origin;

    @NotNull
    private final WallPart part;

    @Nullable
    private final WallPart partCloseTop;

    @NotNull
    private final e rectanglesMerger;

    @NotNull
    private final h tessellator;

    @NotNull
    private final WallsInfoWall wall;

    public enum WallPart {
        All,
        AllExceptSides,
        SideOutdoor,
        SideIndoor,
        CloseStart,
        CloseEnd,
        CloseTop
    }

    public WallsBuilder3D(@NotNull WallsInfo info, @NotNull WallsInfoWall wall, @NotNull WallPart part, @Nullable WallPart wallPart, float f10, @NotNull List<WallHole> holes, @NotNull h tessellator, @NotNull e rectanglesMerger, @NotNull WallsBuilder3DMesh builder, float f11) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(wall, "wall");
        Intrinsics.checkNotNullParameter(part, "part");
        Intrinsics.checkNotNullParameter(holes, "holes");
        Intrinsics.checkNotNullParameter(tessellator, "tessellator");
        Intrinsics.checkNotNullParameter(rectanglesMerger, "rectanglesMerger");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.info = info;
        this.wall = wall;
        this.part = part;
        this.partCloseTop = wallPart;
        this.coordinate3DScale = f10;
        this.holes = holes;
        this.tessellator = tessellator;
        this.rectanglesMerger = rectanglesMerger;
        this.builder = builder;
        this.flooringHeight = f11;
        k origin = info.getOrigin();
        this.origin = origin;
        this.hidden = info.getHeight() <= 0.0f || wall.getWall().isHidden() || origin == null;
    }

    private final void buildWallCloseTriangle(n nVar, n nVar2, n nVar3, boolean z10) {
        if (z10) {
            buildWallCloseTriangle(nVar3, nVar2, nVar, false);
        } else {
            this.builder.buildClose(nVar, nVar2, nVar3);
        }
    }

    private final float[][] buildWallHolesClose(n[] nVarArr, WallsBuilder3DSide wallsBuilder3DSide) {
        char c10;
        char c11;
        WallsBuilder3DSide wallsBuilder3DSide2 = wallsBuilder3DSide;
        c bottom = this.wall.getBottom();
        c top = this.wall.getTop();
        float f10 = to3DScale(this.info.getHeight());
        float f11 = to3DScale(this.flooringHeight);
        int length = wallsBuilder3DSide2.top.holes.length;
        int i10 = 0;
        ArrayList arrayList = null;
        while (i10 < length) {
            float[] fArr = wallsBuilder3DSide2.top.holes[i10];
            float[] fArr2 = wallsBuilder3DSide2.bottom.holes[i10];
            if (fArr.length == fArr2.length) {
                k[] kVarArr = {new k(), new k(), new k(), new k()};
                k kVar = new k();
                m mVar = new m(0.0f, 0.0f, 0.0f, 7, null);
                int i11 = 0;
                while (i11 < fArr.length) {
                    int i12 = length;
                    int i13 = i11 + 1;
                    k[] kVarArr2 = kVarArr;
                    kVarArr[0].U(fArr[i11], fArr[i13]);
                    kVarArr2[1].U(fArr2[i11], fArr2[i13]);
                    if (i11 == fArr.length - 2) {
                        c10 = 2;
                        c11 = 3;
                        kVarArr2[2].U(fArr[0], fArr[1]);
                        kVarArr2[3].U(fArr2[0], fArr2[1]);
                    } else {
                        c10 = 2;
                        c11 = 3;
                        int i14 = i11 + 2;
                        int i15 = i11 + 3;
                        kVarArr2[2].U(fArr[i14], fArr[i15]);
                        kVarArr2[3].U(fArr2[i14], fArr2[i15]);
                    }
                    k kVar2 = kVarArr2[c10];
                    k kVarU = kVar.U(kVar2.f180480a, kVar2.f180481b);
                    k kVar3 = kVarArr2[0];
                    kVarU.b0(kVar3.f180480a, kVar3.f180481b).M().O(-1);
                    mVar.y0(kVar.f180480a * top.b().f180480a, kVar.f180481b, top.b().f180481b * kVar.f180480a);
                    setVertexProjection(nVarArr[0], top, kVarArr2[0], mVar);
                    setVertexProjection(nVarArr[1], bottom, kVarArr2[1], mVar);
                    setVertexProjection(nVarArr[c10], top, kVarArr2[c10], mVar);
                    setVertexProjection(nVarArr[c11], bottom, kVarArr2[c11], mVar);
                    float[] fArrEvaluateAreHoleCloseIsOnTopEdge = evaluateAreHoleCloseIsOnTopEdge(nVarArr, f10);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    if (fArrEvaluateAreHoleCloseIsOnTopEdge != null) {
                        arrayList.add(fArrEvaluateAreHoleCloseIsOnTopEdge);
                    } else if (!isHoleCloseIsOnTheFloor(nVarArr, f11)) {
                        this.builder.buildClose(nVarArr[c11], nVarArr[1], nVarArr[0]);
                        this.builder.buildClose(nVarArr[c10], nVarArr[c11], nVarArr[0]);
                    }
                    i11 += 2;
                    nVarArr = nVarArr;
                    length = i12;
                    kVarArr = kVarArr2;
                }
            }
            i10++;
            wallsBuilder3DSide2 = wallsBuilder3DSide;
            length = length;
        }
        if (arrayList == null) {
            return null;
        }
        Object[] array = arrayList.toArray(new float[0][]);
        if (array != null) {
            return (float[][]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    private final void buildWallSide(n[] nVarArr, WallsBuilder3DSide wallsBuilder3DSide, boolean z10, c cVar, c cVar2) {
        WallsInfoWall wallsInfoWall = this.wall;
        c bottom = z10 ? wallsInfoWall.getBottom() : wallsInfoWall.getTop();
        float f10 = to3DScale(bottom.d());
        WallPart wallPart = this.part;
        if (wallPart == WallPart.All || ((wallPart == WallPart.SideOutdoor && z10) || (wallPart == WallPart.SideIndoor && !z10))) {
            buildWallSidePlane(nVarArr, wallsBuilder3DSide, z10, bottom);
        }
        buildWallSideExtension(nVarArr, z10, true, f10, cVar);
        buildWallSideExtension(nVarArr, z10, false, f10, cVar2);
    }

    private final void buildWallSideExtension(n[] nVarArr, boolean z10, boolean z11, float f10, c cVar) {
        float f11;
        float f12;
        if (cVar == null || cVar.d() <= 0.0f) {
            return;
        }
        k kVar = to3DScale(new k(cVar.e()));
        k kVar2 = to3DScale(new k(cVar.c()));
        k kVarO = new k(cVar.b()).O(z11 ? 1 : -1);
        float f13 = to3DScale(this.info.getHeight());
        float f14 = to3DScale(cVar.d());
        for (n nVar : nVarArr) {
            nVar.f180486b.y0(kVarO.f180480a, 0.0f, kVarO.f180481b);
        }
        if (z10) {
            f12 = z11 ? f10 : 0.0f;
            f11 = (f14 * (z11 ? 1 : -1)) + f12;
        } else {
            float f15 = z11 ? 0.0f : f10;
            float f16 = f15 + (f14 * (z11 ? -1 : 1));
            f11 = f15;
            f12 = f16;
        }
        nVarArr[0].f180485a.y0(kVar2.f180480a, f13, kVar2.f180481b);
        float f17 = -f13;
        nVarArr[0].f180487c.U(f11, f17);
        nVarArr[1].f180485a.y0(kVar.f180480a, f13, kVar.f180481b);
        nVarArr[1].f180487c.U(f12, f17);
        nVarArr[2].f180485a.y0(kVar.f180480a, 0.0f, kVar.f180481b);
        nVarArr[2].f180487c.U(f12, 0.0f);
        nVarArr[3].f180485a.y0(kVar2.f180480a, 0.0f, kVar2.f180481b);
        nVarArr[3].f180487c.U(f11, 0.0f);
        buildWallSideExtensionTriangle(nVarArr[0], nVarArr[1], nVarArr[2], z10, !z11);
        buildWallSideExtensionTriangle(nVarArr[0], nVarArr[2], nVarArr[3], z10, !z11);
    }

    private final void buildWallSideExtensionTriangle(n nVar, n nVar2, n nVar3, boolean z10, boolean z11) {
        if (z11) {
            buildWallSideExtensionTriangle(nVar3, nVar2, nVar, z10, false);
        } else {
            this.builder.buildSide(nVar, nVar2, nVar3, z10);
        }
    }

    private final float[] evaluateAreHoleCloseIsOnTopEdge(n[] nVarArr, float f10) {
        for (n nVar : nVarArr) {
            if (nVar.f180485a.f180483b < ((double) f10) - 0.001d) {
                return null;
            }
        }
        m mVar = nVarArr[3].f180485a;
        float f11 = mVar.f180482a;
        float f12 = mVar.f180484c;
        m mVar2 = nVarArr[1].f180485a;
        float f13 = mVar2.f180482a;
        float f14 = mVar2.f180484c;
        m mVar3 = nVarArr[0].f180485a;
        float f15 = mVar3.f180482a;
        float f16 = mVar3.f180484c;
        m mVar4 = nVarArr[2].f180485a;
        return new float[]{f11, f12, f13, f14, f15, f16, mVar4.f180482a, mVar4.f180484c};
    }

    private final boolean isHoleCloseIsOnTheFloor(n[] nVarArr, float f10) {
        for (n nVar : nVarArr) {
            if (nVar.f180485a.f180483b > ((double) f10) + 0.001d) {
                return false;
            }
        }
        return true;
    }

    private final void setVertexProjection(n nVar, c cVar, k kVar, m mVar) {
        float f10 = to3DScale(kVar.f180480a);
        nVar.f180487c.U(0.0f, 0.0f);
        nVar.f180486b.A0(mVar);
        nVar.f180485a.y0(to3DScale(cVar.e().f180480a) + (cVar.b().f180480a * f10), to3DScale(kVar.f180481b), to3DScale(cVar.e().f180481b) + (f10 * cVar.b().f180481b));
    }

    private final float to3DScale(float f10) {
        return f10 * this.coordinate3DScale;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0066  */
    @Nullable
    public final WallsBuilder3DSide build() {
        float[][] fArrBuildWallHolesClose;
        WallPart wallPart;
        if (this.hidden) {
            return null;
        }
        n[] nVarArr = {new n(), new n(), new n(), new n()};
        WallsBuilder3DSide wallsBuilder3DSide = new WallsBuilder3DSide(this.info, this.wall, this.holes, this.tessellator, this.rectanglesMerger);
        WallPart wallPart2 = this.part;
        WallPart wallPart3 = WallPart.All;
        boolean z10 = wallPart2 == wallPart3 || wallPart2 == WallPart.AllExceptSides;
        if (z10) {
            float[][] fArr = wallsBuilder3DSide.top.holes;
            if ((fArr.length == 0) || fArr.length != wallsBuilder3DSide.bottom.holes.length) {
                fArrBuildWallHolesClose = null;
            } else {
                fArrBuildWallHolesClose = buildWallHolesClose(nVarArr, wallsBuilder3DSide);
            }
        } else {
            fArrBuildWallHolesClose = null;
        }
        if (z10 && this.partCloseTop == WallPart.CloseTop) {
            buildTop(nVarArr, fArrBuildWallHolesClose);
        }
        WallsInfoWall previous = this.info.getPrevious(this.wall);
        c[] cVarArr = {null, null, null, null};
        if (z10 || (wallPart = this.part) == WallPart.CloseStart || wallPart == WallPart.CloseEnd) {
            if (previous == null || previous.getWall().isHidden() || previous.getWall().getWidth() < this.wall.getWall().getWidth() || previous.getMiddle().b().v(this.wall.getMiddle().b()) || !WallsUtils.INSTANCE.isWallJointPointsMatching(previous, this.wall)) {
                WallPart wallPart4 = this.part;
                if (wallPart4 == wallPart3 || wallPart4 == WallPart.CloseStart) {
                    c[] start = this.wall.getStart();
                    buildWallClose(nVarArr, true, (c[]) Arrays.copyOf(start, start.length));
                }
            } else if (this.wall.getStart().length > 1 && this.part != WallPart.CloseStart) {
                cVarArr[0] = this.wall.getStart()[0];
                cVarArr[1] = this.wall.getStart()[1];
            }
            WallsInfoWall next = this.info.getNext(this.wall);
            if (next == null || next.getWall().isHidden() || next.getWall().getWidth() < this.wall.getWall().getWidth() || next.getMiddle().b().v(this.wall.getMiddle().b())) {
                WallPart wallPart5 = this.part;
                if (wallPart5 == wallPart3 || wallPart5 == WallPart.CloseEnd) {
                    c[] end = this.wall.getEnd();
                    buildWallClose(nVarArr, false, (c[]) Arrays.copyOf(end, end.length));
                }
            } else if (this.wall.getEnd().length > 1 && this.part != WallPart.CloseEnd) {
                cVarArr[2] = this.wall.getEnd()[0];
                cVarArr[3] = this.wall.getEnd()[1];
            }
        }
        buildWallSide(nVarArr, wallsBuilder3DSide, true, cVarArr[0], cVarArr[2]);
        buildWallSide(nVarArr, wallsBuilder3DSide, false, cVarArr[1], cVarArr[3]);
        return wallsBuilder3DSide;
    }

    protected void buildTop(@NotNull n[] temp, @Nullable float[][] fArr) {
        float[] fArrH;
        Intrinsics.checkNotNullParameter(temp, "temp");
        k[] path = this.wall.getPath();
        for (k kVar : path) {
            to3DScale(kVar);
        }
        if (fArr == null || (fArrH = this.tessellator.g(l.a(path), fArr, false)) == null) {
            fArrH = this.tessellator.h(path, false);
        }
        float f10 = to3DScale(this.info.getHeight());
        temp[0].f180486b.y0(0.0f, 1.0f, 0.0f);
        temp[1].f180486b.y0(0.0f, 1.0f, 0.0f);
        temp[2].f180486b.y0(0.0f, 1.0f, 0.0f);
        for (int i10 = 0; i10 < fArrH.length; i10 += 6) {
            temp[0].f180485a.y0(fArrH[i10], f10, fArrH[i10 + 1]);
            temp[1].f180485a.y0(fArrH[i10 + 2], f10, fArrH[i10 + 3]);
            temp[2].f180485a.y0(fArrH[i10 + 4], f10, fArrH[i10 + 5]);
            this.builder.buildClose(temp[0], temp[1], temp[2]);
        }
    }

    protected void buildWallClose(@NotNull n[] temp, boolean z10, @NotNull c... segments) {
        Intrinsics.checkNotNullParameter(temp, "temp");
        Intrinsics.checkNotNullParameter(segments, "segments");
        for (c cVar : segments) {
            k kVar = to3DScale(new k(cVar.e()));
            k kVar2 = to3DScale(new k(cVar.c()));
            k kVarO = new k(cVar.b()).O(z10 ? 1 : -1);
            float f10 = to3DScale(this.info.getHeight());
            for (n nVar : temp) {
                nVar.f180486b.y0(kVarO.f180480a, 0.0f, kVarO.f180481b);
            }
            temp[0].f180485a.y0(kVar2.f180480a, f10, kVar2.f180481b);
            temp[1].f180485a.y0(kVar.f180480a, f10, kVar.f180481b);
            temp[2].f180485a.y0(kVar.f180480a, 0.0f, kVar.f180481b);
            temp[3].f180485a.y0(kVar2.f180480a, 0.0f, kVar2.f180481b);
            buildWallCloseTriangle(temp[0], temp[1], temp[2], !z10);
            buildWallCloseTriangle(temp[0], temp[2], temp[3], !z10);
        }
    }

    protected void buildWallSidePlane(@NotNull n[] temp, @NotNull WallsBuilder3DSide infoSide, boolean z10, @NotNull c line) {
        Intrinsics.checkNotNullParameter(temp, "temp");
        Intrinsics.checkNotNullParameter(infoSide, "infoSide");
        Intrinsics.checkNotNullParameter(line, "line");
        k kVar = new k(line.b());
        k kVar2 = to3DScale(new k(line.e()));
        float f10 = to3DScale(line.d());
        float[] fArr = (z10 ? infoSide.bottom : infoSide.top).faces;
        int i10 = 1;
        k kVarO = new k(line.b()).O(z10 ? -1 : 1);
        m mVar = new m(kVarO.f180480a, 0.0f, kVarO.f180481b);
        int i11 = 0;
        temp[0].f180486b.A0(mVar);
        temp[1].f180486b.A0(mVar);
        temp[2].f180486b.A0(mVar);
        int i12 = 0;
        while (i12 < fArr.length) {
            int i13 = i11;
            while (i13 < 3) {
                int i14 = (i13 * 2) + i12;
                float f11 = to3DScale(fArr[i14]);
                float f12 = to3DScale(fArr[i14 + i10]);
                int i15 = i10;
                temp[i13].f180487c.U(z10 ? f10 - f11 : f11, -f12);
                temp[i13].f180485a.y0(kVar2.f180480a + (kVar.f180480a * f11), f12, kVar2.f180481b + (f11 * kVar.f180481b));
                i13++;
                i10 = i15;
                i11 = i11;
            }
            int i16 = i10;
            int i17 = i11;
            this.builder.buildSide(temp[i17], temp[i16], temp[2], z10);
            i12 += 6;
            i10 = i16;
            i11 = i17;
        }
    }

    @NotNull
    public String toString() {
        return "WallsBuilder3D(holes=" + this.holes + ')';
    }

    private final k to3DScale(k kVar) {
        return kVar.R(this.coordinate3DScale);
    }

    public /* synthetic */ WallsBuilder3D(WallsInfo wallsInfo, WallsInfoWall wallsInfoWall, WallPart wallPart, WallPart wallPart2, float f10, List list, h hVar, e eVar, WallsBuilder3DMesh wallsBuilder3DMesh, float f11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(wallsInfo, wallsInfoWall, wallPart, wallPart2, f10, list, hVar, eVar, wallsBuilder3DMesh, (i10 & 512) != 0 ? 0.0f : f11);
    }
}
