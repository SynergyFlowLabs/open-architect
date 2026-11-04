package com.planner5d.library.activity.helper;

import com.planner5d.library.model.manager.v4;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
public final class d2 implements fg.g<b2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<u> f136740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<i0> f136741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<v4> f136742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.t1> f136743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f136744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.y0> f136745f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.statistics.b0> f136746g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.synchronization.i> f136747h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.n> f136748i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.j> f136749j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.g1> f136750k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.c2> f136751l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ij.c<com.planner5d.library.widget.s1> f136752m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.j2> f136753n;

    public d2(ij.c<u> cVar, ij.c<i0> cVar2, ij.c<v4> cVar3, ij.c<com.planner5d.library.model.manager.t1> cVar4, ij.c<com.planner5d.library.modules.user.user.t> cVar5, ij.c<com.planner5d.library.modules.user.user.y0> cVar6, ij.c<com.planner5d.library.model.manager.statistics.b0> cVar7, ij.c<com.planner5d.library.model.manager.synchronization.i> cVar8, ij.c<com.planner5d.library.model.manager.builtin.n> cVar9, ij.c<com.planner5d.library.model.manager.config.j> cVar10, ij.c<com.planner5d.library.modules.user.user.g1> cVar11, ij.c<com.planner5d.library.services.utility.c2> cVar12, ij.c<com.planner5d.library.widget.s1> cVar13, ij.c<com.planner5d.library.model.manager.j2> cVar14) {
        this.f136740a = cVar;
        this.f136741b = cVar2;
        this.f136742c = cVar3;
        this.f136743d = cVar4;
        this.f136744e = cVar5;
        this.f136745f = cVar6;
        this.f136746g = cVar7;
        this.f136747h = cVar8;
        this.f136748i = cVar9;
        this.f136749j = cVar10;
        this.f136750k = cVar11;
        this.f136751l = cVar12;
        this.f136752m = cVar13;
        this.f136753n = cVar14;
    }

    public static fg.g<b2> a(ij.c<u> cVar, ij.c<i0> cVar2, ij.c<v4> cVar3, ij.c<com.planner5d.library.model.manager.t1> cVar4, ij.c<com.planner5d.library.modules.user.user.t> cVar5, ij.c<com.planner5d.library.modules.user.user.y0> cVar6, ij.c<com.planner5d.library.model.manager.statistics.b0> cVar7, ij.c<com.planner5d.library.model.manager.synchronization.i> cVar8, ij.c<com.planner5d.library.model.manager.builtin.n> cVar9, ij.c<com.planner5d.library.model.manager.config.j> cVar10, ij.c<com.planner5d.library.modules.user.user.g1> cVar11, ij.c<com.planner5d.library.services.utility.c2> cVar12, ij.c<com.planner5d.library.widget.s1> cVar13, ij.c<com.planner5d.library.model.manager.j2> cVar14) {
        return new d2(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14);
    }

    @dagger.internal.j("com.planner5d.library.activity.helper.MainCardboardContent.notificationManager")
    public static void c(b2 b2Var, com.planner5d.library.model.manager.j2 j2Var) {
        b2Var.f136699s = j2Var;
    }

    @dagger.internal.j("com.planner5d.library.activity.helper.MainCardboardContent.tutorialManager")
    public static void d(b2 b2Var, com.planner5d.library.widget.s1 s1Var) {
        b2Var.f136698o = s1Var;
    }

    @Override // fg.g
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void injectMembers(b2 b2Var) {
        d.d(b2Var, this.f136740a.get());
        d.e(b2Var, this.f136741b.get());
        d.j(b2Var, this.f136742c.get());
        d.f(b2Var, dagger.internal.g.a(this.f136743d));
        d.l(b2Var, this.f136744e.get());
        d.m(b2Var, this.f136745f.get());
        d.i(b2Var, this.f136746g.get());
        d.k(b2Var, this.f136747h.get());
        d.b(b2Var, this.f136748i.get());
        d.c(b2Var, this.f136749j.get());
        d.n(b2Var, this.f136750k.get());
        d.h(b2Var, this.f136751l.get());
        d(b2Var, this.f136752m.get());
        c(b2Var, this.f136753n.get());
    }
}
