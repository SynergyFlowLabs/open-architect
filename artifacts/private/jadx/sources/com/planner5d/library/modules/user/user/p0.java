package com.planner5d.library.modules.user.user;

/* JADX INFO: loaded from: classes9.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class p0 implements dagger.internal.h<o0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<t0> f223246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.api.requests.c> f223247b;

    public p0(ij.c<t0> cVar, ij.c<com.planner5d.library.api.requests.c> cVar2) {
        this.f223246a = cVar;
        this.f223247b = cVar2;
    }

    public static p0 a(ij.c<t0> cVar, ij.c<com.planner5d.library.api.requests.c> cVar2) {
        return new p0(cVar, cVar2);
    }

    public static o0 c(t0 t0Var, com.planner5d.library.api.requests.c cVar) {
        return new o0(t0Var, cVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public o0 get() {
        return c(this.f223246a.get(), this.f223247b.get());
    }
}
