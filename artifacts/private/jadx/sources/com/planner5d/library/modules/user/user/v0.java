package com.planner5d.library.modules.user.user;

import com.planner5d.library.model.manager.m5;
import com.planner5d.library.model.manager.n5;
import com.planner5d.library.model.manager.q2;
import com.planner5d.library.model.manager.w1;
import com.planner5d.library.model.manager.x2;

/* JADX INFO: loaded from: classes9.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class v0 implements dagger.internal.h<t0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.p> f223500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.l> f223501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<x2> f223502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<q2> f223503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<zc.b> f223504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<w> f223505f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<n5> f223506g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<m5> f223507h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.payments.j> f223508i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.payments.p> f223509j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ij.c<g0> f223510k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ij.c<w1> f223511l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.w> f223512m;

    public v0(ij.c<com.planner5d.library.model.manager.config.p> cVar, ij.c<com.planner5d.library.model.manager.builtin.l> cVar2, ij.c<x2> cVar3, ij.c<q2> cVar4, ij.c<zc.b> cVar5, ij.c<w> cVar6, ij.c<n5> cVar7, ij.c<m5> cVar8, ij.c<com.planner5d.library.model.manager.payments.j> cVar9, ij.c<com.planner5d.library.model.manager.payments.p> cVar10, ij.c<g0> cVar11, ij.c<w1> cVar12, ij.c<com.planner5d.library.model.manager.w> cVar13) {
        this.f223500a = cVar;
        this.f223501b = cVar2;
        this.f223502c = cVar3;
        this.f223503d = cVar4;
        this.f223504e = cVar5;
        this.f223505f = cVar6;
        this.f223506g = cVar7;
        this.f223507h = cVar8;
        this.f223508i = cVar9;
        this.f223509j = cVar10;
        this.f223510k = cVar11;
        this.f223511l = cVar12;
        this.f223512m = cVar13;
    }

    public static v0 a(ij.c<com.planner5d.library.model.manager.config.p> cVar, ij.c<com.planner5d.library.model.manager.builtin.l> cVar2, ij.c<x2> cVar3, ij.c<q2> cVar4, ij.c<zc.b> cVar5, ij.c<w> cVar6, ij.c<n5> cVar7, ij.c<m5> cVar8, ij.c<com.planner5d.library.model.manager.payments.j> cVar9, ij.c<com.planner5d.library.model.manager.payments.p> cVar10, ij.c<g0> cVar11, ij.c<w1> cVar12, ij.c<com.planner5d.library.model.manager.w> cVar13) {
        return new v0(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13);
    }

    public static t0 c(com.planner5d.library.model.manager.config.p pVar, com.planner5d.library.model.manager.builtin.l lVar, x2 x2Var, q2 q2Var, zc.b bVar, w wVar, n5 n5Var, m5 m5Var, fg.e<com.planner5d.library.model.manager.payments.j> eVar, fg.e<com.planner5d.library.model.manager.payments.p> eVar2, fg.e<g0> eVar3, fg.e<w1> eVar4, fg.e<com.planner5d.library.model.manager.w> eVar5) {
        return new t0(pVar, lVar, x2Var, q2Var, bVar, wVar, n5Var, m5Var, eVar, eVar2, eVar3, eVar4, eVar5);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t0 get() {
        return c(this.f223500a.get(), this.f223501b.get(), this.f223502c.get(), this.f223503d.get(), this.f223504e.get(), this.f223505f.get(), this.f223506g.get(), this.f223507h.get(), dagger.internal.g.a(this.f223508i), dagger.internal.g.a(this.f223509j), dagger.internal.g.a(this.f223510k), dagger.internal.g.a(this.f223511l), dagger.internal.g.a(this.f223512m));
    }
}
