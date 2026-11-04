package com.planner5d.library.services.utility;

/* JADX INFO: loaded from: classes10.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class x implements dagger.internal.h<w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.u1> f229833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<f1> f229834b;

    public x(ij.c<com.planner5d.library.model.manager.u1> cVar, ij.c<f1> cVar2) {
        this.f229833a = cVar;
        this.f229834b = cVar2;
    }

    public static x a(ij.c<com.planner5d.library.model.manager.u1> cVar, ij.c<f1> cVar2) {
        return new x(cVar, cVar2);
    }

    public static w c(com.planner5d.library.model.manager.u1 u1Var, f1 f1Var) {
        return new w(u1Var, f1Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public w get() {
        return c(this.f229833a.get(), this.f229834b.get());
    }
}
