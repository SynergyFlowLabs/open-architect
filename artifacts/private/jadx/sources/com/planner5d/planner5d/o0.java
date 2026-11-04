package com.planner5d.planner5d;

/* JADX INFO: loaded from: classes13.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class o0 implements dagger.internal.h<ce.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n0 f264536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.smartwizard.interactor.a> f264537b;

    public o0(n0 n0Var, ij.c<com.planner5d.library.smartwizard.interactor.a> cVar) {
        this.f264536a = n0Var;
        this.f264537b = cVar;
    }

    public static o0 a(n0 n0Var, ij.c<com.planner5d.library.smartwizard.interactor.a> cVar) {
        return new o0(n0Var, cVar);
    }

    public static ce.a c(n0 n0Var, com.planner5d.library.smartwizard.interactor.a aVar) {
        return (ce.a) dagger.internal.p.f(n0Var.a(aVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ce.a get() {
        return c(this.f264536a, this.f264537b.get());
    }
}
