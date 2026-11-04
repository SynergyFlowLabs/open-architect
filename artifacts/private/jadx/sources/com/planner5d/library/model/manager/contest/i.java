package com.planner5d.library.model.manager.contest;

import android.app.Application;
import com.planner5d.library.model.manager.config.p;
import com.planner5d.library.model.manager.project.d0;
import com.planner5d.library.modules.user.user.w;
import com.planner5d.library.services.g0;
import com.planner5d.library.services.utility.p0;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@r
@dagger.internal.e
@s("javax.inject.Singleton")
public final class i implements dagger.internal.h<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.api.requests.c> f191149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<Application> f191150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<p0> f191151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<p> f191152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<d0> f191153e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<w> f191154f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<g0> f191155g;

    public i(ij.c<com.planner5d.library.api.requests.c> cVar, ij.c<Application> cVar2, ij.c<p0> cVar3, ij.c<p> cVar4, ij.c<d0> cVar5, ij.c<w> cVar6, ij.c<g0> cVar7) {
        this.f191149a = cVar;
        this.f191150b = cVar2;
        this.f191151c = cVar3;
        this.f191152d = cVar4;
        this.f191153e = cVar5;
        this.f191154f = cVar6;
        this.f191155g = cVar7;
    }

    public static i a(ij.c<com.planner5d.library.api.requests.c> cVar, ij.c<Application> cVar2, ij.c<p0> cVar3, ij.c<p> cVar4, ij.c<d0> cVar5, ij.c<w> cVar6, ij.c<g0> cVar7) {
        return new i(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7);
    }

    public static g c(com.planner5d.library.api.requests.c cVar, Application application, p0 p0Var, p pVar, d0 d0Var, w wVar, g0 g0Var) {
        return new g(cVar, application, p0Var, pVar, d0Var, wVar, g0Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c(this.f191149a.get(), this.f191150b.get(), this.f191151c.get(), this.f191152d.get(), this.f191153e.get(), this.f191154f.get(), this.f191155g.get());
    }
}
