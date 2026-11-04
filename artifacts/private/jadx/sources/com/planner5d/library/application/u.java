package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class u implements dagger.internal.h<le.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f148280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.interactor.a> f148281b;

    public u(i iVar, ij.c<com.planner5d.library.interactor.a> cVar) {
        this.f148280a = iVar;
        this.f148281b = cVar;
    }

    public static u a(i iVar, ij.c<com.planner5d.library.interactor.a> cVar) {
        return new u(iVar, cVar);
    }

    public static le.a c(i iVar, com.planner5d.library.interactor.a aVar) {
        return (le.a) dagger.internal.p.f(iVar.p(aVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public le.a get() {
        return c(this.f148280a, this.f148281b.get());
    }
}
