package com.planner5d.library.model.manager.project;

import android.app.Application;
import com.planner5d.library.model.manager.q0;
import com.planner5d.library.model.manager.t1;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class i0 implements dagger.internal.h<h0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f193213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<q0> f193214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<t1> f193215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.api.requests.c> f193216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f193217e;

    public i0(ij.c<Application> cVar, ij.c<q0> cVar2, ij.c<t1> cVar3, ij.c<com.planner5d.library.api.requests.c> cVar4, ij.c<com.planner5d.library.modules.user.user.t> cVar5) {
        this.f193213a = cVar;
        this.f193214b = cVar2;
        this.f193215c = cVar3;
        this.f193216d = cVar4;
        this.f193217e = cVar5;
    }

    public static i0 a(ij.c<Application> cVar, ij.c<q0> cVar2, ij.c<t1> cVar3, ij.c<com.planner5d.library.api.requests.c> cVar4, ij.c<com.planner5d.library.modules.user.user.t> cVar5) {
        return new i0(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static h0 c(Application application, q0 q0Var, t1 t1Var, com.planner5d.library.api.requests.c cVar, com.planner5d.library.modules.user.user.t tVar) {
        return new h0(application, q0Var, t1Var, cVar, tVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h0 get() {
        return c(this.f193213a.get(), this.f193214b.get(), this.f193215c.get(), this.f193216d.get(), this.f193217e.get());
    }
}
