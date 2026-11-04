package com.planner5d.planner5d;

import com.planner5d.library.model.manager.c1;
import com.planner5d.library.model.manager.t1;

/* JADX INFO: loaded from: classes12.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class c implements dagger.internal.h<com.planner5d.library.model.manager.statistics.appsflyer.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f258916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f258917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.contest.view.vote.a> f258918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<c1> f258919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<t1> f258920e;

    public c(b bVar, ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.contest.view.vote.a> cVar2, ij.c<c1> cVar3, ij.c<t1> cVar4) {
        this.f258916a = bVar;
        this.f258917b = cVar;
        this.f258918c = cVar2;
        this.f258919d = cVar3;
        this.f258920e = cVar4;
    }

    public static c a(b bVar, ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.contest.view.vote.a> cVar2, ij.c<c1> cVar3, ij.c<t1> cVar4) {
        return new c(bVar, cVar, cVar2, cVar3, cVar4);
    }

    public static com.planner5d.library.model.manager.statistics.appsflyer.d c(b bVar, com.planner5d.library.application.b bVar2, com.planner5d.library.contest.view.vote.a aVar, c1 c1Var, t1 t1Var) {
        return (com.planner5d.library.model.manager.statistics.appsflyer.d) dagger.internal.p.f(bVar.b(bVar2, aVar, c1Var, t1Var));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.statistics.appsflyer.d get() {
        return c(this.f258916a, this.f258917b.get(), this.f258918c.get(), this.f258919d.get(), this.f258920e.get());
    }
}
