package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class h0 implements dagger.internal.h<com.planner5d.library.services.licensing.a<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<d> f142553b;

    public h0(i iVar, ij.c<d> cVar) {
        this.f142552a = iVar;
        this.f142553b = cVar;
    }

    public static h0 a(i iVar, ij.c<d> cVar) {
        return new h0(iVar, cVar);
    }

    public static com.planner5d.library.services.licensing.a<?> c(i iVar, d dVar) {
        return (com.planner5d.library.services.licensing.a) dagger.internal.p.f(iVar.C(dVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.services.licensing.a<?> get() {
        return c(this.f142552a, this.f142553b.get());
    }
}
