package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class z0 implements dagger.internal.h<com.planner5d.library.model.manager.performancetracing.e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f148340a;

    public z0(i iVar) {
        this.f148340a = iVar;
    }

    public static z0 a(i iVar) {
        return new z0(iVar);
    }

    public static com.planner5d.library.model.manager.performancetracing.e c(i iVar) {
        return (com.planner5d.library.model.manager.performancetracing.e) dagger.internal.p.f(iVar.U());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.performancetracing.e get() {
        return c(this.f148340a);
    }
}
