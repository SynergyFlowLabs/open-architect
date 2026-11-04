package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class d0 implements dagger.internal.h<le.e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.interactor.i> f142490b;

    public d0(i iVar, ij.c<com.planner5d.library.interactor.i> cVar) {
        this.f142489a = iVar;
        this.f142490b = cVar;
    }

    public static d0 a(i iVar, ij.c<com.planner5d.library.interactor.i> cVar) {
        return new d0(iVar, cVar);
    }

    public static le.e c(i iVar, com.planner5d.library.interactor.i iVar2) {
        return (le.e) dagger.internal.p.f(iVar.y(iVar2));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public le.e get() {
        return c(this.f142489a, this.f142490b.get());
    }
}
