package com.planner5d.library.uploadplan.application;

/* JADX INFO: loaded from: classes11.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class m implements dagger.internal.h<le.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f230728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.interactor.a> f230729b;

    public m(h hVar, ij.c<com.planner5d.library.interactor.a> cVar) {
        this.f230728a = hVar;
        this.f230729b = cVar;
    }

    public static m a(h hVar, ij.c<com.planner5d.library.interactor.a> cVar) {
        return new m(hVar, cVar);
    }

    public static le.a c(h hVar, com.planner5d.library.interactor.a aVar) {
        return (le.a) dagger.internal.p.f(hVar.e(aVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public le.a get() {
        return c(this.f230728a, this.f230729b.get());
    }
}
