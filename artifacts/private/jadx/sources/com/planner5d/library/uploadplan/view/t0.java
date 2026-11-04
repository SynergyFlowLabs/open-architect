package com.planner5d.library.uploadplan.view;

import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.f2;
import com.planner5d.library.model.manager.statistics.events.e4;
import com.planner5d.library.model.manager.t1;

/* JADX INFO: loaded from: classes11.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class t0 implements dagger.internal.h<s0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f231165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<e4> f231166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<f2> f231167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.p0> f231168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.k> f231169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<t1> f231170f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<ke.h> f231171g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<ke.f> f231172h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<b2> f231173i;

    public t0(ij.c<com.planner5d.library.application.b> cVar, ij.c<e4> cVar2, ij.c<f2> cVar3, ij.c<com.planner5d.library.services.utility.p0> cVar4, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar5, ij.c<t1> cVar6, ij.c<ke.h> cVar7, ij.c<ke.f> cVar8, ij.c<b2> cVar9) {
        this.f231165a = cVar;
        this.f231166b = cVar2;
        this.f231167c = cVar3;
        this.f231168d = cVar4;
        this.f231169e = cVar5;
        this.f231170f = cVar6;
        this.f231171g = cVar7;
        this.f231172h = cVar8;
        this.f231173i = cVar9;
    }

    public static t0 a(ij.c<com.planner5d.library.application.b> cVar, ij.c<e4> cVar2, ij.c<f2> cVar3, ij.c<com.planner5d.library.services.utility.p0> cVar4, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar5, ij.c<t1> cVar6, ij.c<ke.h> cVar7, ij.c<ke.f> cVar8, ij.c<b2> cVar9) {
        return new t0(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9);
    }

    public static s0 c(com.planner5d.library.application.b bVar, e4 e4Var, f2 f2Var, com.planner5d.library.services.utility.p0 p0Var, com.planner5d.library.activity.fragment.dialog.k kVar, t1 t1Var, ke.h hVar, ke.f fVar, b2 b2Var) {
        return new s0(bVar, e4Var, f2Var, p0Var, kVar, t1Var, hVar, fVar, b2Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public s0 get() {
        return c(this.f231165a.get(), this.f231166b.get(), this.f231167c.get(), this.f231168d.get(), this.f231169e.get(), this.f231170f.get(), this.f231171g.get(), this.f231172h.get(), this.f231173i.get());
    }
}
