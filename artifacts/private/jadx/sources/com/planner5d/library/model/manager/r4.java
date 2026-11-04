package com.planner5d.library.model.manager;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class r4 implements dagger.internal.h<p4> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.r> f197707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.d> f197708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t0> f197709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<n1> f197710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<v4> f197711e;

    public r4(ij.c<com.planner5d.library.model.manager.config.r> cVar, ij.c<com.planner5d.library.application.d> cVar2, ij.c<com.planner5d.library.modules.user.user.t0> cVar3, ij.c<n1> cVar4, ij.c<v4> cVar5) {
        this.f197707a = cVar;
        this.f197708b = cVar2;
        this.f197709c = cVar3;
        this.f197710d = cVar4;
        this.f197711e = cVar5;
    }

    public static r4 a(ij.c<com.planner5d.library.model.manager.config.r> cVar, ij.c<com.planner5d.library.application.d> cVar2, ij.c<com.planner5d.library.modules.user.user.t0> cVar3, ij.c<n1> cVar4, ij.c<v4> cVar5) {
        return new r4(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static p4 c(com.planner5d.library.model.manager.config.r rVar, com.planner5d.library.application.d dVar, com.planner5d.library.modules.user.user.t0 t0Var, n1 n1Var, v4 v4Var) {
        return new p4(rVar, dVar, t0Var, n1Var, v4Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p4 get() {
        return c(this.f197707a.get(), this.f197708b.get(), this.f197709c.get(), this.f197710d.get(), this.f197711e.get());
    }
}
