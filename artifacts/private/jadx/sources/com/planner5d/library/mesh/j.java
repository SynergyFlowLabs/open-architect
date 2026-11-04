package com.planner5d.library.mesh;

import com.planner5d.library.math.n;
import com.planner5d.library.walls.WallsInfo;
import com.planner5d.library.walls.WallsInfoWall;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class j implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final WallsInfo f180511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.math.h f180512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f180513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f180514d;

    public j(@NotNull WallsInfo info, @NotNull com.planner5d.library.math.h tessellator, boolean z10, float f10) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(tessellator, "tessellator");
        this.f180511a = info;
        this.f180512b = tessellator;
        this.f180513c = z10;
        this.f180514d = f10;
    }

    private final void b(e eVar, float[] fArr, boolean z10) {
        com.planner5d.library.math.m mVar = new com.planner5d.library.math.m(0.0f, z10 ? -1.0f : 1.0f, 0.0f);
        float f10 = z10 ? -1.0f : 1.0f;
        n nVarA = new n().a(mVar.f180482a, mVar.f180483b, mVar.f180484c);
        n nVarA2 = new n().a(mVar.f180482a, mVar.f180483b, mVar.f180484c);
        n nVarA3 = new n().a(mVar.f180482a, mVar.f180483b, mVar.f180484c);
        int i10 = 0;
        int iC = kotlin.internal.n.c(0, fArr.length - 1, 6);
        if (iC >= 0) {
            while (true) {
                n nVarC = nVarA.c(fArr[i10], this.f180514d, fArr[i10 + 1]);
                com.planner5d.library.math.m mVar2 = nVarA.f180485a;
                nVarC.e(mVar2.f180482a * f10, mVar2.f180484c);
                n nVarC2 = nVarA2.c(fArr[i10 + 2], this.f180514d, fArr[i10 + 3]);
                com.planner5d.library.math.m mVar3 = nVarA2.f180485a;
                nVarC2.e(mVar3.f180482a * f10, mVar3.f180484c);
                n nVarC3 = nVarA3.c(fArr[i10 + 4], this.f180514d, fArr[i10 + 5]);
                com.planner5d.library.math.m mVar4 = nVarA3.f180485a;
                nVarC3.e(mVar4.f180482a * f10, mVar4.f180484c);
                if (z10) {
                    eVar.a(nVarA3, nVarA2, nVarA);
                } else {
                    eVar.a(nVarA, nVarA2, nVarA3);
                }
                if (i10 == iC) {
                    break;
                } else {
                    i10 += 6;
                }
            }
        }
    }

    @Override // com.planner5d.library.mesh.f
    public void a(@NotNull e mesh) {
        Intrinsics.checkNotNullParameter(mesh, "mesh");
        b(mesh, com.planner5d.library.math.g.f180476a.a(this.f180512b, this.f180511a.getPathClean(WallsInfoWall.Side.Bottom)), !this.f180513c);
    }

    @NotNull
    protected final WallsInfo c() {
        return this.f180511a;
    }

    @NotNull
    protected final com.planner5d.library.math.h d() {
        return this.f180512b;
    }
}
