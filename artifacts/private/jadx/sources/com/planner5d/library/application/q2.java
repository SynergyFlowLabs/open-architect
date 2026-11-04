package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class q2 implements dagger.internal.h<na.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f148241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.smartwizard.dimensions.interactor.c> f148242b;

    public q2(i iVar, ij.c<com.planner5d.library.activity.fragment.smartwizard.dimensions.interactor.c> cVar) {
        this.f148241a = iVar;
        this.f148242b = cVar;
    }

    public static q2 a(i iVar, ij.c<com.planner5d.library.activity.fragment.smartwizard.dimensions.interactor.c> cVar) {
        return new q2(iVar, cVar);
    }

    public static na.b c(i iVar, com.planner5d.library.activity.fragment.smartwizard.dimensions.interactor.c cVar) {
        return (na.b) dagger.internal.p.f(iVar.P0(cVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public na.b get() {
        return c(this.f148241a, this.f148242b.get());
    }
}
