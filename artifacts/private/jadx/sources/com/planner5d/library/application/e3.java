package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class e3 implements dagger.internal.h<le.l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.interactor.h0> f142529b;

    public e3(i iVar, ij.c<com.planner5d.library.interactor.h0> cVar) {
        this.f142528a = iVar;
        this.f142529b = cVar;
    }

    public static e3 a(i iVar, ij.c<com.planner5d.library.interactor.h0> cVar) {
        return new e3(iVar, cVar);
    }

    public static le.l c(i iVar, com.planner5d.library.interactor.h0 h0Var) {
        return (le.l) dagger.internal.p.f(iVar.d1(h0Var));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public le.l get() {
        return c(this.f142528a, this.f142529b.get());
    }
}
