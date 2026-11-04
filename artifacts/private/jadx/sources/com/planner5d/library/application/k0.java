package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class k0 implements dagger.internal.h<com.planner5d.library.model.manager.u1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.t1> f142590b;

    public k0(i iVar, ij.c<com.planner5d.library.model.manager.t1> cVar) {
        this.f142589a = iVar;
        this.f142590b = cVar;
    }

    public static k0 a(i iVar, ij.c<com.planner5d.library.model.manager.t1> cVar) {
        return new k0(iVar, cVar);
    }

    public static com.planner5d.library.model.manager.u1 c(i iVar, com.planner5d.library.model.manager.t1 t1Var) {
        return (com.planner5d.library.model.manager.u1) dagger.internal.p.f(iVar.F(t1Var));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.u1 get() {
        return c(this.f142589a, this.f142590b.get());
    }
}
