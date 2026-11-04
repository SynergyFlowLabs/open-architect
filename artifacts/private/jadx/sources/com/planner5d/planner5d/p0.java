package com.planner5d.planner5d;

/* JADX INFO: loaded from: classes13.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class p0 implements dagger.internal.h<ce.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n0 f264541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.smartwizard.interactor.e> f264542b;

    public p0(n0 n0Var, ij.c<com.planner5d.library.smartwizard.interactor.e> cVar) {
        this.f264541a = n0Var;
        this.f264542b = cVar;
    }

    public static p0 a(n0 n0Var, ij.c<com.planner5d.library.smartwizard.interactor.e> cVar) {
        return new p0(n0Var, cVar);
    }

    public static ce.b c(n0 n0Var, com.planner5d.library.smartwizard.interactor.e eVar) {
        return (ce.b) dagger.internal.p.f(n0Var.b(eVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ce.b get() {
        return c(this.f264541a, this.f264542b.get());
    }
}
