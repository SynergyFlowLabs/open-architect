package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class h1 implements dagger.internal.h<com.planner5d.library.model.manager.project.m0.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142554a;

    public h1(i iVar) {
        this.f142554a = iVar;
    }

    public static h1 a(i iVar) {
        return new h1(iVar);
    }

    public static com.planner5d.library.model.manager.project.m0.a c(i iVar) {
        return (com.planner5d.library.model.manager.project.m0.a) dagger.internal.p.f(iVar.d0());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.project.m0.a get() {
        return c(this.f142554a);
    }
}
