package com.planner5d.library.engine.libgdx.rendering.model.builder;

import com.planner5d.library.walls.WallsBuilder3D;
import com.planner5d.library.walls.WallsInfoWall;
import dc.l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements dc.d<com.planner5d.library.engine.libgdx.rendering.model.d> {
    @Override // dc.d
    @NotNull
    public dc.a<com.planner5d.library.engine.libgdx.rendering.model.d> a(boolean z10, @NotNull com.planner5d.library.math.k size) {
        Intrinsics.checkNotNullParameter(size, "size");
        return new c(z10, size);
    }

    @Override // dc.d
    @NotNull
    public dc.f<com.planner5d.library.engine.libgdx.rendering.model.d> b() {
        return new f();
    }

    @Override // dc.d
    @NotNull
    public dc.i<com.planner5d.library.engine.libgdx.rendering.model.d> c(@NotNull com.planner5d.library.engine.util.math.b bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        return new h(bounds);
    }

    @Override // dc.d
    @NotNull
    public dc.k<com.planner5d.library.engine.libgdx.rendering.model.d> d(int i10, float f10) {
        return new j(i10, f10);
    }

    @Override // dc.d
    @NotNull
    public dc.j<com.planner5d.library.engine.libgdx.rendering.model.d> e(@NotNull com.planner5d.library.math.k size) {
        Intrinsics.checkNotNullParameter(size, "size");
        return new i(size);
    }

    @Override // dc.d
    @NotNull
    public dc.g<com.planner5d.library.engine.libgdx.rendering.model.d> f() {
        return new g();
    }

    @Override // dc.d
    @NotNull
    public l<com.planner5d.library.engine.libgdx.rendering.model.d> g(@NotNull WallsBuilder3D.WallPart part, @NotNull WallsInfoWall wall) {
        Intrinsics.checkNotNullParameter(part, "part");
        Intrinsics.checkNotNullParameter(wall, "wall");
        return new k(part, wall);
    }

    @Override // dc.d
    @NotNull
    public dc.b<com.planner5d.library.engine.libgdx.rendering.model.d> h() {
        return new d();
    }
}
