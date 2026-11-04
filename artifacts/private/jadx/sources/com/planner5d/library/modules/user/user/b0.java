package com.planner5d.library.modules.user.user;

/* JADX INFO: loaded from: classes9.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class b0 implements dagger.internal.h<z> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.api.requests.c> f222977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.y0> f222978b;

    public b0(ij.c<com.planner5d.library.api.requests.c> cVar, ij.c<com.planner5d.library.model.manager.y0> cVar2) {
        this.f222977a = cVar;
        this.f222978b = cVar2;
    }

    public static b0 a(ij.c<com.planner5d.library.api.requests.c> cVar, ij.c<com.planner5d.library.model.manager.y0> cVar2) {
        return new b0(cVar, cVar2);
    }

    public static z c(com.planner5d.library.api.requests.c cVar, com.planner5d.library.model.manager.y0 y0Var) {
        return new z(cVar, y0Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public z get() {
        return c(this.f222977a.get(), this.f222978b.get());
    }
}
