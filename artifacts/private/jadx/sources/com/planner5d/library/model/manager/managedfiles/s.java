package com.planner5d.library.model.manager.managedfiles;

import com.planner5d.library.model.manager.builtin.g0;
import com.planner5d.library.model.manager.c1;
import com.planner5d.library.model.manager.k5;
import com.planner5d.library.modules.user.user.t0;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.p0;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class s implements dagger.internal.h<p.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f192064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<y> f192065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.i> f192066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f192067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<t0> f192068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.n> f192069f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<t> f192070g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.p> f192071h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<c1> f192072i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ij.c<p0> f192073j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ij.c<a0> f192074k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ij.c<g0> f192075l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.p> f192076m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ij.c<k5> f192077n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ij.c<c2> f192078o;

    public s(ij.c<com.planner5d.library.application.b> cVar, ij.c<y> cVar2, ij.c<com.planner5d.library.model.manager.builtin.i> cVar3, ij.c<com.planner5d.library.modules.user.user.t> cVar4, ij.c<t0> cVar5, ij.c<com.planner5d.library.model.manager.builtin.n> cVar6, ij.c<t> cVar7, ij.c<com.planner5d.library.model.manager.config.p> cVar8, ij.c<c1> cVar9, ij.c<p0> cVar10, ij.c<a0> cVar11, ij.c<g0> cVar12, ij.c<com.planner5d.library.model.manager.builtin.p> cVar13, ij.c<k5> cVar14, ij.c<c2> cVar15) {
        this.f192064a = cVar;
        this.f192065b = cVar2;
        this.f192066c = cVar3;
        this.f192067d = cVar4;
        this.f192068e = cVar5;
        this.f192069f = cVar6;
        this.f192070g = cVar7;
        this.f192071h = cVar8;
        this.f192072i = cVar9;
        this.f192073j = cVar10;
        this.f192074k = cVar11;
        this.f192075l = cVar12;
        this.f192076m = cVar13;
        this.f192077n = cVar14;
        this.f192078o = cVar15;
    }

    public static s a(ij.c<com.planner5d.library.application.b> cVar, ij.c<y> cVar2, ij.c<com.planner5d.library.model.manager.builtin.i> cVar3, ij.c<com.planner5d.library.modules.user.user.t> cVar4, ij.c<t0> cVar5, ij.c<com.planner5d.library.model.manager.builtin.n> cVar6, ij.c<t> cVar7, ij.c<com.planner5d.library.model.manager.config.p> cVar8, ij.c<c1> cVar9, ij.c<p0> cVar10, ij.c<a0> cVar11, ij.c<g0> cVar12, ij.c<com.planner5d.library.model.manager.builtin.p> cVar13, ij.c<k5> cVar14, ij.c<c2> cVar15) {
        return new s(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15);
    }

    public static p.a c(com.planner5d.library.application.b bVar, y yVar, com.planner5d.library.model.manager.builtin.i iVar, com.planner5d.library.modules.user.user.t tVar, t0 t0Var, com.planner5d.library.model.manager.builtin.n nVar, t tVar2, com.planner5d.library.model.manager.config.p pVar, c1 c1Var, p0 p0Var, a0 a0Var, g0 g0Var, com.planner5d.library.model.manager.builtin.p pVar2, k5 k5Var, c2 c2Var) {
        return new p.a(bVar, yVar, iVar, tVar, t0Var, nVar, tVar2, pVar, c1Var, p0Var, a0Var, g0Var, pVar2, k5Var, c2Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p.a get() {
        return c(this.f192064a.get(), this.f192065b.get(), this.f192066c.get(), this.f192067d.get(), this.f192068e.get(), this.f192069f.get(), this.f192070g.get(), this.f192071h.get(), this.f192072i.get(), this.f192073j.get(), this.f192074k.get(), this.f192075l.get(), this.f192076m.get(), this.f192077n.get(), this.f192078o.get());
    }
}
