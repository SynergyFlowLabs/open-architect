package com.planner5d.library.uploadplan.view;

import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.statistics.events.e4;
import com.planner5d.library.model.manager.t1;

/* JADX INFO: loaded from: classes11.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class a1 implements dagger.internal.h<y0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f230884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<b2> f230885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t0> f230886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f230887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<ke.b> f230888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<e4> f230889f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<ke.e> f230890g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<t1> f230891h;

    public a1(ij.c<com.planner5d.library.application.b> cVar, ij.c<b2> cVar2, ij.c<com.planner5d.library.modules.user.user.t0> cVar3, ij.c<com.planner5d.library.modules.user.user.t> cVar4, ij.c<ke.b> cVar5, ij.c<e4> cVar6, ij.c<ke.e> cVar7, ij.c<t1> cVar8) {
        this.f230884a = cVar;
        this.f230885b = cVar2;
        this.f230886c = cVar3;
        this.f230887d = cVar4;
        this.f230888e = cVar5;
        this.f230889f = cVar6;
        this.f230890g = cVar7;
        this.f230891h = cVar8;
    }

    public static a1 a(ij.c<com.planner5d.library.application.b> cVar, ij.c<b2> cVar2, ij.c<com.planner5d.library.modules.user.user.t0> cVar3, ij.c<com.planner5d.library.modules.user.user.t> cVar4, ij.c<ke.b> cVar5, ij.c<e4> cVar6, ij.c<ke.e> cVar7, ij.c<t1> cVar8) {
        return new a1(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8);
    }

    public static y0 c(com.planner5d.library.application.b bVar, b2 b2Var, com.planner5d.library.modules.user.user.t0 t0Var, com.planner5d.library.modules.user.user.t tVar, ke.b bVar2, e4 e4Var, ke.e eVar, t1 t1Var) {
        return new y0(bVar, b2Var, t0Var, tVar, bVar2, e4Var, eVar, t1Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public y0 get() {
        return c(this.f230884a.get(), this.f230885b.get(), this.f230886c.get(), this.f230887d.get(), this.f230888e.get(), this.f230889f.get(), this.f230890g.get(), this.f230891h.get());
    }
}
