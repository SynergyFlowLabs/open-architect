package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class g0 implements dagger.internal.h<com.planner5d.library.model.manager.o1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.n1> f142545b;

    public g0(i iVar, ij.c<com.planner5d.library.model.manager.n1> cVar) {
        this.f142544a = iVar;
        this.f142545b = cVar;
    }

    public static g0 a(i iVar, ij.c<com.planner5d.library.model.manager.n1> cVar) {
        return new g0(iVar, cVar);
    }

    public static com.planner5d.library.model.manager.o1 c(i iVar, com.planner5d.library.model.manager.n1 n1Var) {
        return (com.planner5d.library.model.manager.o1) dagger.internal.p.f(iVar.B(n1Var));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.o1 get() {
        return c(this.f142544a, this.f142545b.get());
    }
}
