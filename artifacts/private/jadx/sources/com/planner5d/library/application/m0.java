package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class m0 implements dagger.internal.h<com.planner5d.library.model.manager.w1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.managedfiles.a0> f142612b;

    public m0(i iVar, ij.c<com.planner5d.library.model.manager.managedfiles.a0> cVar) {
        this.f142611a = iVar;
        this.f142612b = cVar;
    }

    public static m0 a(i iVar, ij.c<com.planner5d.library.model.manager.managedfiles.a0> cVar) {
        return new m0(iVar, cVar);
    }

    public static com.planner5d.library.model.manager.w1 c(i iVar, com.planner5d.library.model.manager.managedfiles.a0 a0Var) {
        return (com.planner5d.library.model.manager.w1) dagger.internal.p.f(iVar.H(a0Var));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.w1 get() {
        return c(this.f142611a, this.f142612b.get());
    }
}
