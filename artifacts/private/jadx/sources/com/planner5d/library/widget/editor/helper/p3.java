package com.planner5d.library.widget.editor.helper;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class p3 implements dagger.internal.h<n3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.project.d0> f256663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.project.m0> f256664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.project.h0> f256665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f256666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t0> f256667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.b2> f256668f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.d> f256669g;

    public p3(ij.c<com.planner5d.library.model.manager.project.d0> cVar, ij.c<com.planner5d.library.model.manager.project.m0> cVar2, ij.c<com.planner5d.library.model.manager.project.h0> cVar3, ij.c<com.planner5d.library.modules.user.user.t> cVar4, ij.c<com.planner5d.library.modules.user.user.t0> cVar5, ij.c<com.planner5d.library.model.manager.b2> cVar6, ij.c<com.planner5d.library.application.d> cVar7) {
        this.f256663a = cVar;
        this.f256664b = cVar2;
        this.f256665c = cVar3;
        this.f256666d = cVar4;
        this.f256667e = cVar5;
        this.f256668f = cVar6;
        this.f256669g = cVar7;
    }

    public static p3 a(ij.c<com.planner5d.library.model.manager.project.d0> cVar, ij.c<com.planner5d.library.model.manager.project.m0> cVar2, ij.c<com.planner5d.library.model.manager.project.h0> cVar3, ij.c<com.planner5d.library.modules.user.user.t> cVar4, ij.c<com.planner5d.library.modules.user.user.t0> cVar5, ij.c<com.planner5d.library.model.manager.b2> cVar6, ij.c<com.planner5d.library.application.d> cVar7) {
        return new p3(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7);
    }

    public static n3 c(com.planner5d.library.model.manager.project.d0 d0Var, com.planner5d.library.model.manager.project.m0 m0Var, com.planner5d.library.model.manager.project.h0 h0Var, com.planner5d.library.modules.user.user.t tVar, com.planner5d.library.modules.user.user.t0 t0Var, com.planner5d.library.model.manager.b2 b2Var, com.planner5d.library.application.d dVar) {
        return new n3(d0Var, m0Var, h0Var, tVar, t0Var, b2Var, dVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public n3 get() {
        return c(this.f256663a.get(), this.f256664b.get(), this.f256665c.get(), this.f256666d.get(), this.f256667e.get(), this.f256668f.get(), this.f256669g.get());
    }
}
