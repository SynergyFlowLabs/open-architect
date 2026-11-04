package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class o2 implements dagger.internal.h<com.planner5d.library.services.utility.p0.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.t1> f142878b;

    public o2(i iVar, ij.c<com.planner5d.library.model.manager.t1> cVar) {
        this.f142877a = iVar;
        this.f142878b = cVar;
    }

    public static o2 a(i iVar, ij.c<com.planner5d.library.model.manager.t1> cVar) {
        return new o2(iVar, cVar);
    }

    public static com.planner5d.library.services.utility.p0.a c(i iVar, com.planner5d.library.model.manager.t1 t1Var) {
        return (com.planner5d.library.services.utility.p0.a) dagger.internal.p.f(iVar.L0(t1Var));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.services.utility.p0.a get() {
        return c(this.f142877a, this.f142878b.get());
    }
}
