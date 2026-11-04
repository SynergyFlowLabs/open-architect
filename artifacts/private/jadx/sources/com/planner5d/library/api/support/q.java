package com.planner5d.library.api.support;

import android.app.Application;
import com.planner5d.library.model.manager.e1;
import com.planner5d.library.modules.user.user.w;
import com.planner5d.library.services.e0;
import com.planner5d.library.services.utility.p0;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@s
public final class q implements dagger.internal.h<p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<w> f142428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.p> f142429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<p0> f142430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.api.b> f142431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<Application> f142432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<e1> f142433f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<e0> f142434g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<l> f142435h;

    public q(ij.c<w> cVar, ij.c<com.planner5d.library.model.manager.config.p> cVar2, ij.c<p0> cVar3, ij.c<com.planner5d.library.api.b> cVar4, ij.c<Application> cVar5, ij.c<e1> cVar6, ij.c<e0> cVar7, ij.c<l> cVar8) {
        this.f142428a = cVar;
        this.f142429b = cVar2;
        this.f142430c = cVar3;
        this.f142431d = cVar4;
        this.f142432e = cVar5;
        this.f142433f = cVar6;
        this.f142434g = cVar7;
        this.f142435h = cVar8;
    }

    public static q a(ij.c<w> cVar, ij.c<com.planner5d.library.model.manager.config.p> cVar2, ij.c<p0> cVar3, ij.c<com.planner5d.library.api.b> cVar4, ij.c<Application> cVar5, ij.c<e1> cVar6, ij.c<e0> cVar7, ij.c<l> cVar8) {
        return new q(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8);
    }

    public static p c(fg.e<w> eVar, com.planner5d.library.model.manager.config.p pVar, p0 p0Var, fg.e<com.planner5d.library.api.b> eVar2, Application application, fg.e<e1> eVar3, e0 e0Var, l lVar) {
        return new p(eVar, pVar, p0Var, eVar2, application, eVar3, e0Var, lVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p get() {
        return c(dagger.internal.g.a(this.f142428a), this.f142429b.get(), this.f142430c.get(), dagger.internal.g.a(this.f142431d), this.f142432e.get(), dagger.internal.g.a(this.f142433f), this.f142434g.get(), this.f142435h.get());
    }
}
