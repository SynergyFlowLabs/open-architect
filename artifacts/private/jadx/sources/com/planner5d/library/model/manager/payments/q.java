package com.planner5d.library.model.manager.payments;

import android.app.Application;
import com.planner5d.library.model.manager.e1;
import com.planner5d.library.model.manager.u1;
import com.planner5d.library.services.exceptions.NetworkErrorUtility;
import com.planner5d.library.services.utility.g3;
import com.planner5d.library.services.utility.p0;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class q implements dagger.internal.h<p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f192897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<p0> f192898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<e1> f192899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<u1> f192900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<NetworkErrorUtility> f192901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<e> f192902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.payments.paymentmethod.e> f192903g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<v> f192904h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<r> f192905i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ij.c<g3> f192906j;

    public q(ij.c<Application> cVar, ij.c<p0> cVar2, ij.c<e1> cVar3, ij.c<u1> cVar4, ij.c<NetworkErrorUtility> cVar5, ij.c<e> cVar6, ij.c<com.planner5d.library.model.payments.paymentmethod.e> cVar7, ij.c<v> cVar8, ij.c<r> cVar9, ij.c<g3> cVar10) {
        this.f192897a = cVar;
        this.f192898b = cVar2;
        this.f192899c = cVar3;
        this.f192900d = cVar4;
        this.f192901e = cVar5;
        this.f192902f = cVar6;
        this.f192903g = cVar7;
        this.f192904h = cVar8;
        this.f192905i = cVar9;
        this.f192906j = cVar10;
    }

    public static q a(ij.c<Application> cVar, ij.c<p0> cVar2, ij.c<e1> cVar3, ij.c<u1> cVar4, ij.c<NetworkErrorUtility> cVar5, ij.c<e> cVar6, ij.c<com.planner5d.library.model.payments.paymentmethod.e> cVar7, ij.c<v> cVar8, ij.c<r> cVar9, ij.c<g3> cVar10) {
        return new q(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10);
    }

    public static p c(Application application, p0 p0Var, e1 e1Var, u1 u1Var, NetworkErrorUtility networkErrorUtility, e eVar, fg.e<com.planner5d.library.model.payments.paymentmethod.e> eVar2, v vVar, r rVar, g3 g3Var) {
        return new p(application, p0Var, e1Var, u1Var, networkErrorUtility, eVar, eVar2, vVar, rVar, g3Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p get() {
        return c(this.f192897a.get(), this.f192898b.get(), this.f192899c.get(), this.f192900d.get(), this.f192901e.get(), this.f192902f.get(), dagger.internal.g.a(this.f192903g), this.f192904h.get(), this.f192905i.get(), this.f192906j.get());
    }
}
