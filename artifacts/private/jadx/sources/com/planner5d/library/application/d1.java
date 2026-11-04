package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class d1 implements dagger.internal.h<na.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.smartwizard.dimensions.interactor.a> f142492b;

    public d1(i iVar, ij.c<com.planner5d.library.activity.fragment.smartwizard.dimensions.interactor.a> cVar) {
        this.f142491a = iVar;
        this.f142492b = cVar;
    }

    public static d1 a(i iVar, ij.c<com.planner5d.library.activity.fragment.smartwizard.dimensions.interactor.a> cVar) {
        return new d1(iVar, cVar);
    }

    public static na.a c(i iVar, com.planner5d.library.activity.fragment.smartwizard.dimensions.interactor.a aVar) {
        return (na.a) dagger.internal.p.f(iVar.Z(aVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public na.a get() {
        return c(this.f142491a, this.f142492b.get());
    }
}
