package com.planner5d.library.model.manager;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class q implements dagger.internal.h<p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.favorite.a> f197663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<b2> f197664b;

    public q(ij.c<com.planner5d.library.model.manager.favorite.a> cVar, ij.c<b2> cVar2) {
        this.f197663a = cVar;
        this.f197664b = cVar2;
    }

    public static q a(ij.c<com.planner5d.library.model.manager.favorite.a> cVar, ij.c<b2> cVar2) {
        return new q(cVar, cVar2);
    }

    public static p c(com.planner5d.library.model.manager.favorite.a aVar, b2 b2Var) {
        return new p(aVar, b2Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p get() {
        return c(this.f197663a.get(), this.f197664b.get());
    }
}
