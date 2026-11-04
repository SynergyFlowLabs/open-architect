package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class c0 implements dagger.internal.h<le.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.interactor.g> f142475b;

    public c0(i iVar, ij.c<com.planner5d.library.interactor.g> cVar) {
        this.f142474a = iVar;
        this.f142475b = cVar;
    }

    public static c0 a(i iVar, ij.c<com.planner5d.library.interactor.g> cVar) {
        return new c0(iVar, cVar);
    }

    public static le.d c(i iVar, com.planner5d.library.interactor.g gVar) {
        return (le.d) dagger.internal.p.f(iVar.x(gVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public le.d get() {
        return c(this.f142474a, this.f142475b.get());
    }
}
