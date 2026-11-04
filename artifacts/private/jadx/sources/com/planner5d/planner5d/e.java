package com.planner5d.planner5d;

import com.planner5d.library.services.utility.f1;

/* JADX INFO: loaded from: classes12.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class e implements dagger.internal.h<com.planner5d.library.model.manager.statistics.customerio.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f258925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f258926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.w> f258927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.u0> f258928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.e0> f258929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<f1> f258930f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.t> f258931g;

    public e(b bVar, ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.modules.user.user.w> cVar2, ij.c<com.planner5d.library.modules.user.user.u0> cVar3, ij.c<com.planner5d.library.services.e0> cVar4, ij.c<f1> cVar5, ij.c<com.planner5d.library.services.utility.t> cVar6) {
        this.f258925a = bVar;
        this.f258926b = cVar;
        this.f258927c = cVar2;
        this.f258928d = cVar3;
        this.f258929e = cVar4;
        this.f258930f = cVar5;
        this.f258931g = cVar6;
    }

    public static e a(b bVar, ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.modules.user.user.w> cVar2, ij.c<com.planner5d.library.modules.user.user.u0> cVar3, ij.c<com.planner5d.library.services.e0> cVar4, ij.c<f1> cVar5, ij.c<com.planner5d.library.services.utility.t> cVar6) {
        return new e(bVar, cVar, cVar2, cVar3, cVar4, cVar5, cVar6);
    }

    public static com.planner5d.library.model.manager.statistics.customerio.c c(b bVar, com.planner5d.library.application.b bVar2, com.planner5d.library.modules.user.user.w wVar, com.planner5d.library.modules.user.user.u0 u0Var, com.planner5d.library.services.e0 e0Var, f1 f1Var, com.planner5d.library.services.utility.t tVar) {
        return (com.planner5d.library.model.manager.statistics.customerio.c) dagger.internal.p.f(bVar.d(bVar2, wVar, u0Var, e0Var, f1Var, tVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.statistics.customerio.c get() {
        return c(this.f258925a, this.f258926b.get(), this.f258927c.get(), this.f258928d.get(), this.f258929e.get(), this.f258930f.get(), this.f258931g.get());
    }
}
