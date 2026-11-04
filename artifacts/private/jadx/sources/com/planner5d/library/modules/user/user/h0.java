package com.planner5d.library.modules.user.user;

import com.planner5d.library.services.utility.z2;

/* JADX INFO: loaded from: classes9.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class h0 implements dagger.internal.h<g0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.f1> f223143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.t> f223144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<z2> f223145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.p> f223146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.payments.j> f223147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<w> f223148f;

    public h0(ij.c<com.planner5d.library.services.utility.f1> cVar, ij.c<com.planner5d.library.services.utility.t> cVar2, ij.c<z2> cVar3, ij.c<com.planner5d.library.model.manager.config.p> cVar4, ij.c<com.planner5d.library.model.manager.payments.j> cVar5, ij.c<w> cVar6) {
        this.f223143a = cVar;
        this.f223144b = cVar2;
        this.f223145c = cVar3;
        this.f223146d = cVar4;
        this.f223147e = cVar5;
        this.f223148f = cVar6;
    }

    public static h0 a(ij.c<com.planner5d.library.services.utility.f1> cVar, ij.c<com.planner5d.library.services.utility.t> cVar2, ij.c<z2> cVar3, ij.c<com.planner5d.library.model.manager.config.p> cVar4, ij.c<com.planner5d.library.model.manager.payments.j> cVar5, ij.c<w> cVar6) {
        return new h0(cVar, cVar2, cVar3, cVar4, cVar5, cVar6);
    }

    public static g0 c(com.planner5d.library.services.utility.f1 f1Var, com.planner5d.library.services.utility.t tVar, z2 z2Var, com.planner5d.library.model.manager.config.p pVar, com.planner5d.library.model.manager.payments.j jVar, w wVar) {
        return new g0(f1Var, tVar, z2Var, pVar, jVar, wVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g0 get() {
        return c(this.f223143a.get(), this.f223144b.get(), this.f223145c.get(), this.f223146d.get(), this.f223147e.get(), this.f223148f.get());
    }
}
