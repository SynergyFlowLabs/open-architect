package com.planner5d.library.activity.fragment.snapshots;

import com.planner5d.library.model.manager.b4;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class o0 implements dagger.internal.h<n0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f136078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<b4> f136079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.j> f136080c;

    public o0(ij.c<com.planner5d.library.modules.user.user.t> cVar, ij.c<b4> cVar2, ij.c<com.planner5d.library.model.manager.config.j> cVar3) {
        this.f136078a = cVar;
        this.f136079b = cVar2;
        this.f136080c = cVar3;
    }

    public static o0 a(ij.c<com.planner5d.library.modules.user.user.t> cVar, ij.c<b4> cVar2, ij.c<com.planner5d.library.model.manager.config.j> cVar3) {
        return new o0(cVar, cVar2, cVar3);
    }

    public static n0 c(com.planner5d.library.modules.user.user.t tVar, b4 b4Var, com.planner5d.library.model.manager.config.j jVar) {
        return new n0(tVar, b4Var, jVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public n0 get() {
        return c(this.f136078a.get(), this.f136079b.get(), this.f136080c.get());
    }
}
