package com.planner5d.library.modules.user.user;

/* JADX INFO: loaded from: classes9.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class a1 implements dagger.internal.h<z0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f222954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.p> f222955b;

    public a1(ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.model.manager.config.p> cVar2) {
        this.f222954a = cVar;
        this.f222955b = cVar2;
    }

    public static a1 a(ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.model.manager.config.p> cVar2) {
        return new a1(cVar, cVar2);
    }

    public static z0 c(com.planner5d.library.application.b bVar, com.planner5d.library.model.manager.config.p pVar) {
        return new z0(bVar, pVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public z0 get() {
        return c(this.f222954a.get(), this.f222955b.get());
    }
}
