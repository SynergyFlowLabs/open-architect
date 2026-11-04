package com.planner5d.planner5d;

/* JADX INFO: loaded from: classes13.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class q0 implements dagger.internal.h<ce.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n0 f264811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.smartwizard.interactor.g> f264812b;

    public q0(n0 n0Var, ij.c<com.planner5d.library.smartwizard.interactor.g> cVar) {
        this.f264811a = n0Var;
        this.f264812b = cVar;
    }

    public static q0 a(n0 n0Var, ij.c<com.planner5d.library.smartwizard.interactor.g> cVar) {
        return new q0(n0Var, cVar);
    }

    public static ce.c c(n0 n0Var, com.planner5d.library.smartwizard.interactor.g gVar) {
        return (ce.c) dagger.internal.p.f(n0Var.c(gVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ce.c get() {
        return c(this.f264811a, this.f264812b.get());
    }
}
