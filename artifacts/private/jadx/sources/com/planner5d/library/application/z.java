package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class z implements dagger.internal.h<com.planner5d.library.services.service.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f148337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.f1> f148338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.t> f148339c;

    public z(i iVar, ij.c<com.planner5d.library.services.utility.f1> cVar, ij.c<com.planner5d.library.services.utility.t> cVar2) {
        this.f148337a = iVar;
        this.f148338b = cVar;
        this.f148339c = cVar2;
    }

    public static z a(i iVar, ij.c<com.planner5d.library.services.utility.f1> cVar, ij.c<com.planner5d.library.services.utility.t> cVar2) {
        return new z(iVar, cVar, cVar2);
    }

    public static com.planner5d.library.services.service.b c(i iVar, com.planner5d.library.services.utility.f1 f1Var, com.planner5d.library.services.utility.t tVar) {
        return (com.planner5d.library.services.service.b) dagger.internal.p.f(iVar.u(f1Var, tVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.services.service.b get() {
        return c(this.f148337a, this.f148338b.get(), this.f148339c.get());
    }
}
