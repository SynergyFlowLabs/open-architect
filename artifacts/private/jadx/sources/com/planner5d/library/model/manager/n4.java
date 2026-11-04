package com.planner5d.library.model.manager;

import android.app.Application;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class n4 implements dagger.internal.h<m4> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f192206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.payments.j> f192207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.helper.l0> f192208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.payments.m> f192209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.w> f192210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t0> f192211f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<h> f192212g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<w> f192213h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<c2> f192214i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.f1> f192215j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.statistics.d0> f192216k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.attributes.c> f192217l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.statistics.events.r3> f192218m;

    public n4(ij.c<Application> cVar, ij.c<com.planner5d.library.model.manager.payments.j> cVar2, ij.c<com.planner5d.library.activity.helper.l0> cVar3, ij.c<com.planner5d.library.model.manager.payments.m> cVar4, ij.c<com.planner5d.library.modules.user.user.w> cVar5, ij.c<com.planner5d.library.modules.user.user.t0> cVar6, ij.c<h> cVar7, ij.c<w> cVar8, ij.c<c2> cVar9, ij.c<com.planner5d.library.services.utility.f1> cVar10, ij.c<com.planner5d.library.model.manager.statistics.d0> cVar11, ij.c<com.planner5d.library.model.manager.config.attributes.c> cVar12, ij.c<com.planner5d.library.model.manager.statistics.events.r3> cVar13) {
        this.f192206a = cVar;
        this.f192207b = cVar2;
        this.f192208c = cVar3;
        this.f192209d = cVar4;
        this.f192210e = cVar5;
        this.f192211f = cVar6;
        this.f192212g = cVar7;
        this.f192213h = cVar8;
        this.f192214i = cVar9;
        this.f192215j = cVar10;
        this.f192216k = cVar11;
        this.f192217l = cVar12;
        this.f192218m = cVar13;
    }

    public static n4 a(ij.c<Application> cVar, ij.c<com.planner5d.library.model.manager.payments.j> cVar2, ij.c<com.planner5d.library.activity.helper.l0> cVar3, ij.c<com.planner5d.library.model.manager.payments.m> cVar4, ij.c<com.planner5d.library.modules.user.user.w> cVar5, ij.c<com.planner5d.library.modules.user.user.t0> cVar6, ij.c<h> cVar7, ij.c<w> cVar8, ij.c<c2> cVar9, ij.c<com.planner5d.library.services.utility.f1> cVar10, ij.c<com.planner5d.library.model.manager.statistics.d0> cVar11, ij.c<com.planner5d.library.model.manager.config.attributes.c> cVar12, ij.c<com.planner5d.library.model.manager.statistics.events.r3> cVar13) {
        return new n4(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13);
    }

    public static m4 c(Application application, fg.e<com.planner5d.library.model.manager.payments.j> eVar, fg.e<com.planner5d.library.activity.helper.l0> eVar2, fg.e<com.planner5d.library.model.manager.payments.m> eVar3, fg.e<com.planner5d.library.modules.user.user.w> eVar4, fg.e<com.planner5d.library.modules.user.user.t0> eVar5, fg.e<h> eVar6, fg.e<w> eVar7, fg.e<c2> eVar8, com.planner5d.library.services.utility.f1 f1Var, com.planner5d.library.model.manager.statistics.d0 d0Var, com.planner5d.library.model.manager.config.attributes.c cVar, com.planner5d.library.model.manager.statistics.events.r3 r3Var) {
        return new m4(application, eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, f1Var, d0Var, cVar, r3Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m4 get() {
        return c(this.f192206a.get(), dagger.internal.g.a(this.f192207b), dagger.internal.g.a(this.f192208c), dagger.internal.g.a(this.f192209d), dagger.internal.g.a(this.f192210e), dagger.internal.g.a(this.f192211f), dagger.internal.g.a(this.f192212g), dagger.internal.g.a(this.f192213h), dagger.internal.g.a(this.f192214i), this.f192215j.get(), this.f192216k.get(), this.f192217l.get(), this.f192218m.get());
    }
}
