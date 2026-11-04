package com.planner5d.library.activity.helper;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class c1 implements dagger.internal.h<z0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<t0> f136705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.t1> f136706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<le.i> f136707c;

    public c1(ij.c<t0> cVar, ij.c<com.planner5d.library.model.manager.t1> cVar2, ij.c<le.i> cVar3) {
        this.f136705a = cVar;
        this.f136706b = cVar2;
        this.f136707c = cVar3;
    }

    public static c1 a(ij.c<t0> cVar, ij.c<com.planner5d.library.model.manager.t1> cVar2, ij.c<le.i> cVar3) {
        return new c1(cVar, cVar2, cVar3);
    }

    public static z0 c(t0 t0Var, com.planner5d.library.model.manager.t1 t1Var, le.i iVar) {
        return new z0(t0Var, t1Var, iVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public z0 get() {
        return c(this.f136705a.get(), this.f136706b.get(), this.f136707c.get());
    }
}
