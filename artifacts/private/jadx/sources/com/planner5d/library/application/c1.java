package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class c1 implements dagger.internal.h<le.h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.interactor.p> f142477b;

    public c1(i iVar, ij.c<com.planner5d.library.interactor.p> cVar) {
        this.f142476a = iVar;
        this.f142477b = cVar;
    }

    public static c1 a(i iVar, ij.c<com.planner5d.library.interactor.p> cVar) {
        return new c1(iVar, cVar);
    }

    public static le.h c(i iVar, com.planner5d.library.interactor.p pVar) {
        return (le.h) dagger.internal.p.f(iVar.Y(pVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public le.h get() {
        return c(this.f142476a, this.f142477b.get());
    }
}
