package com.planner5d.library.mesh;

import com.planner5d.library.math.n;
import com.planner5d.library.walls.WallsInfoWall;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class k implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final WallsInfoWall f180515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f180516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f180517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.math.m f180518d;

    public k(@NotNull WallsInfoWall wallInfo, float f10, float f11) {
        Intrinsics.checkNotNullParameter(wallInfo, "wallInfo");
        this.f180515a = wallInfo;
        this.f180516b = f10;
        this.f180517c = f11;
        this.f180518d = new com.planner5d.library.math.m(0.0f, 0.0f, 0.0f, 7, null);
    }

    @Override // com.planner5d.library.mesh.f
    public void a(@NotNull e mesh) {
        Intrinsics.checkNotNullParameter(mesh, "mesh");
        float f10 = this.f180516b;
        float f11 = this.f180517c + f10;
        float f12 = this.f180515a.getBottom().e().f180480a;
        float f13 = this.f180515a.getBottom().c().f180480a;
        float f14 = this.f180515a.getBottom().e().f180481b;
        float f15 = this.f180515a.getBottom().c().f180481b;
        n nVar = new n();
        n nVar2 = new n();
        n nVar3 = new n();
        n nVar4 = new n();
        com.planner5d.library.math.m mVar = new com.planner5d.library.math.m(0.0f, 0.0f, 0.0f, 7, null);
        com.planner5d.library.math.c cVar = new com.planner5d.library.math.c(new com.planner5d.library.math.k(f12, f14), new com.planner5d.library.math.k(f13, f15));
        com.planner5d.library.math.k kVarO = new com.planner5d.library.math.k(cVar.b()).O(-1);
        com.planner5d.library.math.k kVarY = cVar.b().O(-1).Y(f11);
        mVar.y0(kVarO.f180480a, 0.0f, kVarO.f180481b);
        n nVarD = nVar.b(mVar).d(this.f180518d.y0(f12, f10, f14));
        float f16 = kVarY.f180480a;
        com.planner5d.library.math.m mVar2 = nVar.f180485a;
        nVarD.e(f16 + mVar2.f180482a, kVarY.f180481b + mVar2.f180484c);
        n nVarD2 = nVar2.b(mVar).d(this.f180518d.y0(f13, f10, f15));
        float f17 = kVarY.f180480a;
        com.planner5d.library.math.m mVar3 = nVar2.f180485a;
        nVarD2.e(f17 + mVar3.f180482a, kVarY.f180481b + mVar3.f180484c);
        n nVarD3 = nVar3.b(mVar).d(this.f180518d.y0(f12, f11, f14));
        com.planner5d.library.math.m mVar4 = nVar3.f180485a;
        nVarD3.e(mVar4.f180482a, mVar4.f180484c);
        n nVarD4 = nVar4.b(mVar).d(this.f180518d.y0(f13, f11, f15));
        com.planner5d.library.math.m mVar5 = nVar4.f180485a;
        nVarD4.e(mVar5.f180482a, mVar5.f180484c);
        mesh.a(nVar, nVar3, nVar4);
        mesh.a(nVar4, nVar2, nVar);
    }
}
