package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class p1 implements dagger.internal.h<le.k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.interactor.f0> f142894b;

    public p1(i iVar, ij.c<com.planner5d.library.interactor.f0> cVar) {
        this.f142893a = iVar;
        this.f142894b = cVar;
    }

    public static p1 a(i iVar, ij.c<com.planner5d.library.interactor.f0> cVar) {
        return new p1(iVar, cVar);
    }

    public static le.k c(i iVar, com.planner5d.library.interactor.f0 f0Var) {
        return (le.k) dagger.internal.p.f(iVar.l0(f0Var));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public le.k get() {
        return c(this.f142893a, this.f142894b.get());
    }
}
