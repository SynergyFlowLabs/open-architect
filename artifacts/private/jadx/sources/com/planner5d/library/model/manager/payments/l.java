package com.planner5d.library.model.manager.payments;

import android.app.Application;
import com.planner5d.library.model.manager.q2;
import com.planner5d.library.model.manager.u1;
import com.planner5d.library.modules.user.user.u0;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.f1;
import com.planner5d.library.services.utility.p0;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class l implements dagger.internal.h<j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f192521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.h> f192522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<p0> f192523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.payments.paymentmethod.e> f192524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.payments.paymentmethod.i> f192525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<p> f192526f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<r> f192527g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<c2> f192528h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<e> f192529i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ij.c<q2> f192530j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ij.c<v> f192531k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.w> f192532l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ij.c<com.planner5d.library.api.requests.c> f192533m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ij.c<u0> f192534n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ij.c<u1> f192535o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ij.c<f1> f192536p;

    public l(ij.c<Application> cVar, ij.c<com.planner5d.library.model.manager.h> cVar2, ij.c<p0> cVar3, ij.c<com.planner5d.library.model.payments.paymentmethod.e> cVar4, ij.c<com.planner5d.library.model.payments.paymentmethod.i> cVar5, ij.c<p> cVar6, ij.c<r> cVar7, ij.c<c2> cVar8, ij.c<e> cVar9, ij.c<q2> cVar10, ij.c<v> cVar11, ij.c<com.planner5d.library.modules.user.user.w> cVar12, ij.c<com.planner5d.library.api.requests.c> cVar13, ij.c<u0> cVar14, ij.c<u1> cVar15, ij.c<f1> cVar16) {
        this.f192521a = cVar;
        this.f192522b = cVar2;
        this.f192523c = cVar3;
        this.f192524d = cVar4;
        this.f192525e = cVar5;
        this.f192526f = cVar6;
        this.f192527g = cVar7;
        this.f192528h = cVar8;
        this.f192529i = cVar9;
        this.f192530j = cVar10;
        this.f192531k = cVar11;
        this.f192532l = cVar12;
        this.f192533m = cVar13;
        this.f192534n = cVar14;
        this.f192535o = cVar15;
        this.f192536p = cVar16;
    }

    public static l a(ij.c<Application> cVar, ij.c<com.planner5d.library.model.manager.h> cVar2, ij.c<p0> cVar3, ij.c<com.planner5d.library.model.payments.paymentmethod.e> cVar4, ij.c<com.planner5d.library.model.payments.paymentmethod.i> cVar5, ij.c<p> cVar6, ij.c<r> cVar7, ij.c<c2> cVar8, ij.c<e> cVar9, ij.c<q2> cVar10, ij.c<v> cVar11, ij.c<com.planner5d.library.modules.user.user.w> cVar12, ij.c<com.planner5d.library.api.requests.c> cVar13, ij.c<u0> cVar14, ij.c<u1> cVar15, ij.c<f1> cVar16) {
        return new l(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15, cVar16);
    }

    public static j c(Application application, fg.e<com.planner5d.library.model.manager.h> eVar, p0 p0Var, fg.e<com.planner5d.library.model.payments.paymentmethod.e> eVar2, fg.e<com.planner5d.library.model.payments.paymentmethod.i> eVar3, fg.e<p> eVar4, fg.e<r> eVar5, c2 c2Var, e eVar6, q2 q2Var, v vVar, fg.e<com.planner5d.library.modules.user.user.w> eVar7, com.planner5d.library.api.requests.c cVar, u0 u0Var, u1 u1Var, f1 f1Var) {
        return new j(application, eVar, p0Var, eVar2, eVar3, eVar4, eVar5, c2Var, eVar6, q2Var, vVar, eVar7, cVar, u0Var, u1Var, f1Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        return c(this.f192521a.get(), dagger.internal.g.a(this.f192522b), this.f192523c.get(), dagger.internal.g.a(this.f192524d), dagger.internal.g.a(this.f192525e), dagger.internal.g.a(this.f192526f), dagger.internal.g.a(this.f192527g), this.f192528h.get(), this.f192529i.get(), this.f192530j.get(), this.f192531k.get(), dagger.internal.g.a(this.f192532l), this.f192533m.get(), this.f192534n.get(), this.f192535o.get(), this.f192536p.get());
    }
}
