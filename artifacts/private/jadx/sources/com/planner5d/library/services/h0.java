package com.planner5d.library.services;

import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.statistics.events.l3;
import com.planner5d.library.model.manager.y0;
import com.planner5d.library.services.utility.f1;

/* JADX INFO: loaded from: classes10.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class h0 implements dagger.internal.h<g0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.project.d0> f224343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<f1> f224344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<b2> f224345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<y0> f224346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<l3> f224347e;

    public h0(ij.c<com.planner5d.library.model.manager.project.d0> cVar, ij.c<f1> cVar2, ij.c<b2> cVar3, ij.c<y0> cVar4, ij.c<l3> cVar5) {
        this.f224343a = cVar;
        this.f224344b = cVar2;
        this.f224345c = cVar3;
        this.f224346d = cVar4;
        this.f224347e = cVar5;
    }

    public static h0 a(ij.c<com.planner5d.library.model.manager.project.d0> cVar, ij.c<f1> cVar2, ij.c<b2> cVar3, ij.c<y0> cVar4, ij.c<l3> cVar5) {
        return new h0(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static g0 c(com.planner5d.library.model.manager.project.d0 d0Var, f1 f1Var, b2 b2Var, y0 y0Var, l3 l3Var) {
        return new g0(d0Var, f1Var, b2Var, y0Var, l3Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g0 get() {
        return c(this.f224343a.get(), this.f224344b.get(), this.f224345c.get(), this.f224346d.get(), this.f224347e.get());
    }
}
