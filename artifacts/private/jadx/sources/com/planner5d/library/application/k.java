package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class k implements dagger.internal.h<com.planner5d.library.model.manager.initialization.r.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.startup.a> f142588b;

    public k(i iVar, ij.c<com.planner5d.library.activity.fragment.startup.a> cVar) {
        this.f142587a = iVar;
        this.f142588b = cVar;
    }

    public static k a(i iVar, ij.c<com.planner5d.library.activity.fragment.startup.a> cVar) {
        return new k(iVar, cVar);
    }

    public static com.planner5d.library.model.manager.initialization.r.a c(i iVar, com.planner5d.library.activity.fragment.startup.a aVar) {
        return (com.planner5d.library.model.manager.initialization.r.a) dagger.internal.p.f(iVar.f(aVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.initialization.r.a get() {
        return c(this.f142587a, this.f142588b.get());
    }
}
