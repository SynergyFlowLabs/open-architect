package com.planner5d.library.interactor;

import com.planner5d.library.model.manager.b2;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class o0 implements dagger.internal.h<n0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.favorite.a> f180244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<b2> f180245b;

    public o0(ij.c<com.planner5d.library.model.manager.favorite.a> cVar, ij.c<b2> cVar2) {
        this.f180244a = cVar;
        this.f180245b = cVar2;
    }

    public static o0 a(ij.c<com.planner5d.library.model.manager.favorite.a> cVar, ij.c<b2> cVar2) {
        return new o0(cVar, cVar2);
    }

    public static n0 c(com.planner5d.library.model.manager.favorite.a aVar, b2 b2Var) {
        return new n0(aVar, b2Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public n0 get() {
        return c(this.f180244a.get(), this.f180245b.get());
    }
}
