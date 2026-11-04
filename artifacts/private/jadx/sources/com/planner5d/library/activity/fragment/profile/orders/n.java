package com.planner5d.library.activity.fragment.profile.orders;

import android.app.Application;
import com.planner5d.library.model.manager.b4;
import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.modules.user.user.t0;
import com.planner5d.library.services.utility.p0;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
@s
public final class n implements dagger.internal.h<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.payments.j> f134811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<t> f134812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<t0> f134813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<p0> f134814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.d> f134815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<b4> f134816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<Application> f134817g;

    public n(ij.c<com.planner5d.library.model.manager.payments.j> cVar, ij.c<t> cVar2, ij.c<t0> cVar3, ij.c<p0> cVar4, ij.c<com.planner5d.library.application.d> cVar5, ij.c<b4> cVar6, ij.c<Application> cVar7) {
        this.f134811a = cVar;
        this.f134812b = cVar2;
        this.f134813c = cVar3;
        this.f134814d = cVar4;
        this.f134815e = cVar5;
        this.f134816f = cVar6;
        this.f134817g = cVar7;
    }

    public static n a(ij.c<com.planner5d.library.model.manager.payments.j> cVar, ij.c<t> cVar2, ij.c<t0> cVar3, ij.c<p0> cVar4, ij.c<com.planner5d.library.application.d> cVar5, ij.c<b4> cVar6, ij.c<Application> cVar7) {
        return new n(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7);
    }

    public static l c(com.planner5d.library.model.manager.payments.j jVar, t tVar, t0 t0Var, p0 p0Var, com.planner5d.library.application.d dVar, b4 b4Var, Application application) {
        return new l(jVar, tVar, t0Var, p0Var, dVar, b4Var, application);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l get() {
        return c(this.f134811a.get(), this.f134812b.get(), this.f134813c.get(), this.f134814d.get(), this.f134815e.get(), this.f134816f.get(), this.f134817g.get());
    }
}
