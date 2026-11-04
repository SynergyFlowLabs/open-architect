package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class g1 implements dagger.internal.h<com.planner5d.library.legal.model.manager.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142546a;

    public g1(i iVar) {
        this.f142546a = iVar;
    }

    public static g1 a(i iVar) {
        return new g1(iVar);
    }

    public static com.planner5d.library.legal.model.manager.a c(i iVar) {
        return (com.planner5d.library.legal.model.manager.a) dagger.internal.p.f(iVar.c0());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.legal.model.manager.a get() {
        return c(this.f142546a);
    }
}
