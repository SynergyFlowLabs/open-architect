package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class l2 implements dagger.internal.h<le.o> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.interactor.n0> f142603b;

    public l2(i iVar, ij.c<com.planner5d.library.interactor.n0> cVar) {
        this.f142602a = iVar;
        this.f142603b = cVar;
    }

    public static l2 a(i iVar, ij.c<com.planner5d.library.interactor.n0> cVar) {
        return new l2(iVar, cVar);
    }

    public static le.o c(i iVar, com.planner5d.library.interactor.n0 n0Var) {
        return (le.o) dagger.internal.p.f(iVar.I0(n0Var));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public le.o get() {
        return c(this.f142602a, this.f142603b.get());
    }
}
