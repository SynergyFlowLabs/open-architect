package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class r2 implements dagger.internal.h<na.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f148251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.smartwizard.dimensions.interactor.e> f148252b;

    public r2(i iVar, ij.c<com.planner5d.library.activity.fragment.smartwizard.dimensions.interactor.e> cVar) {
        this.f148251a = iVar;
        this.f148252b = cVar;
    }

    public static r2 a(i iVar, ij.c<com.planner5d.library.activity.fragment.smartwizard.dimensions.interactor.e> cVar) {
        return new r2(iVar, cVar);
    }

    public static na.c c(i iVar, com.planner5d.library.activity.fragment.smartwizard.dimensions.interactor.e eVar) {
        return (na.c) dagger.internal.p.f(iVar.Q0(eVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public na.c get() {
        return c(this.f148251a, this.f148252b.get());
    }
}
