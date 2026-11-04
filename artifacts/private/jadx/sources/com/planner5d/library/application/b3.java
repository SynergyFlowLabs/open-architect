package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class b3 implements dagger.internal.h<le.g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.interactor.m> f142470b;

    public b3(i iVar, ij.c<com.planner5d.library.interactor.m> cVar) {
        this.f142469a = iVar;
        this.f142470b = cVar;
    }

    public static b3 a(i iVar, ij.c<com.planner5d.library.interactor.m> cVar) {
        return new b3(iVar, cVar);
    }

    public static le.g c(i iVar, com.planner5d.library.interactor.m mVar) {
        return (le.g) dagger.internal.p.f(iVar.a1(mVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public le.g get() {
        return c(this.f142469a, this.f142470b.get());
    }
}
