package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class z2 implements dagger.internal.h<le.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f148343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.interactor.c> f148344b;

    public z2(i iVar, ij.c<com.planner5d.library.interactor.c> cVar) {
        this.f148343a = iVar;
        this.f148344b = cVar;
    }

    public static z2 a(i iVar, ij.c<com.planner5d.library.interactor.c> cVar) {
        return new z2(iVar, cVar);
    }

    public static le.b c(i iVar, com.planner5d.library.interactor.c cVar) {
        return (le.b) dagger.internal.p.f(iVar.Y0(cVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public le.b get() {
        return c(this.f148343a, this.f148344b.get());
    }
}
