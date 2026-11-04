package com.planner5d.planner5d;

import com.planner5d.library.model.manager.h4;

/* JADX INFO: loaded from: classes13.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class k implements dagger.internal.h<com.planner5d.library.model.manager.statistics.i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f258962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.statistics.appsflyer.d> f258963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.statistics.customerio.c> f258964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<h4> f258965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.j> f258966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.statistics.f> f258967f;

    public k(b bVar, ij.c<com.planner5d.library.model.manager.statistics.appsflyer.d> cVar, ij.c<com.planner5d.library.model.manager.statistics.customerio.c> cVar2, ij.c<h4> cVar3, ij.c<com.planner5d.library.model.manager.config.j> cVar4, ij.c<com.planner5d.library.model.manager.statistics.f> cVar5) {
        this.f258962a = bVar;
        this.f258963b = cVar;
        this.f258964c = cVar2;
        this.f258965d = cVar3;
        this.f258966e = cVar4;
        this.f258967f = cVar5;
    }

    public static k a(b bVar, ij.c<com.planner5d.library.model.manager.statistics.appsflyer.d> cVar, ij.c<com.planner5d.library.model.manager.statistics.customerio.c> cVar2, ij.c<h4> cVar3, ij.c<com.planner5d.library.model.manager.config.j> cVar4, ij.c<com.planner5d.library.model.manager.statistics.f> cVar5) {
        return new k(bVar, cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static com.planner5d.library.model.manager.statistics.i c(b bVar, fg.e<com.planner5d.library.model.manager.statistics.appsflyer.d> eVar, fg.e<com.planner5d.library.model.manager.statistics.customerio.c> eVar2, fg.e<h4> eVar3, fg.e<com.planner5d.library.model.manager.config.j> eVar4, fg.e<com.planner5d.library.model.manager.statistics.f> eVar5) {
        return (com.planner5d.library.model.manager.statistics.i) dagger.internal.p.f(bVar.k(eVar, eVar2, eVar3, eVar4, eVar5));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.statistics.i get() {
        return c(this.f258962a, dagger.internal.g.a(this.f258963b), dagger.internal.g.a(this.f258964c), dagger.internal.g.a(this.f258965d), dagger.internal.g.a(this.f258966e), dagger.internal.g.a(this.f258967f));
    }
}
