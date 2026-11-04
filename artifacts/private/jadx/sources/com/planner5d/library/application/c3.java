package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class c3 implements dagger.internal.h<le.i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.interactor.s> f142480b;

    public c3(i iVar, ij.c<com.planner5d.library.interactor.s> cVar) {
        this.f142479a = iVar;
        this.f142480b = cVar;
    }

    public static c3 a(i iVar, ij.c<com.planner5d.library.interactor.s> cVar) {
        return new c3(iVar, cVar);
    }

    public static le.i c(i iVar, com.planner5d.library.interactor.s sVar) {
        return (le.i) dagger.internal.p.f(iVar.b1(sVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public le.i get() {
        return c(this.f142479a, this.f142480b.get());
    }
}
