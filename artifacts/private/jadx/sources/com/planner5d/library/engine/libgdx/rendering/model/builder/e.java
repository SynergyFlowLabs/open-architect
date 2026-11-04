package com.planner5d.library.engine.libgdx.rendering.model.builder;

import com.planner5d.library.math.m;
import com.planner5d.library.math.n;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements dc.e<com.planner5d.library.engine.libgdx.rendering.model.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.badlogic.gdx.graphics.g3d.utils.g f160910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.badlogic.gdx.graphics.g3d.utils.g.a[] f160911b;

    public e(@NotNull com.badlogic.gdx.graphics.g3d.utils.g builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f160910a = builder;
        this.f160911b = new com.badlogic.gdx.graphics.g3d.utils.g.a[]{new com.badlogic.gdx.graphics.g3d.utils.g.a(), new com.badlogic.gdx.graphics.g3d.utils.g.a(), new com.badlogic.gdx.graphics.g3d.utils.g.a()};
    }

    private final com.badlogic.gdx.graphics.g3d.utils.g.a b(com.badlogic.gdx.graphics.g3d.utils.g.a aVar, n nVar) {
        com.badlogic.gdx.graphics.g3d.utils.g.a aVarH = aVar.h(gc.d.d(nVar.f180485a.f180482a), gc.d.d(nVar.f180485a.f180483b), gc.d.d(nVar.f180485a.f180484c));
        m mVar = nVar.f180486b;
        return aVarH.f(mVar.f180482a, mVar.f180483b, mVar.f180484c).j(gc.d.d(nVar.f180487c.f180480a), gc.d.d(nVar.f180487c.f180481b));
    }

    @Override // dc.e
    public void a(@NotNull n v10, @NotNull n v11, @NotNull n v12) {
        Intrinsics.checkNotNullParameter(v10, "v0");
        Intrinsics.checkNotNullParameter(v11, "v1");
        Intrinsics.checkNotNullParameter(v12, "v2");
        this.f160910a.e0(b(this.f160911b[0], v10), b(this.f160911b[1], v11), b(this.f160911b[2], v12));
    }
}
