package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class a3 implements dagger.internal.h<le.f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.interactor.k> f142451b;

    public a3(i iVar, ij.c<com.planner5d.library.interactor.k> cVar) {
        this.f142450a = iVar;
        this.f142451b = cVar;
    }

    public static a3 a(i iVar, ij.c<com.planner5d.library.interactor.k> cVar) {
        return new a3(iVar, cVar);
    }

    public static le.f c(i iVar, com.planner5d.library.interactor.k kVar) {
        return (le.f) dagger.internal.p.f(iVar.Z0(kVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public le.f get() {
        return c(this.f142450a, this.f142451b.get());
    }
}
