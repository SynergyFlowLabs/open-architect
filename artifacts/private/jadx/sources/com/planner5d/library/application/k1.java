package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class k1 implements dagger.internal.h<com.planner5d.library.model.manager.w2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.n> f142592b;

    public k1(i iVar, ij.c<com.planner5d.library.model.manager.config.n> cVar) {
        this.f142591a = iVar;
        this.f142592b = cVar;
    }

    public static k1 a(i iVar, ij.c<com.planner5d.library.model.manager.config.n> cVar) {
        return new k1(iVar, cVar);
    }

    public static com.planner5d.library.model.manager.w2 c(i iVar, com.planner5d.library.model.manager.config.n nVar) {
        return (com.planner5d.library.model.manager.w2) dagger.internal.p.f(iVar.g0(nVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.w2 get() {
        return c(this.f142591a, this.f142592b.get());
    }
}
