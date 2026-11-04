package com.planner5d.library.modules.user.user;

/* JADX INFO: loaded from: classes9.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class h1 implements dagger.internal.h<g1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<t> f223149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.api.requests.c> f223150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f223151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.j> f223152d;

    public h1(ij.c<t> cVar, ij.c<com.planner5d.library.api.requests.c> cVar2, ij.c<com.planner5d.library.application.b> cVar3, ij.c<com.planner5d.library.model.manager.config.j> cVar4) {
        this.f223149a = cVar;
        this.f223150b = cVar2;
        this.f223151c = cVar3;
        this.f223152d = cVar4;
    }

    public static h1 a(ij.c<t> cVar, ij.c<com.planner5d.library.api.requests.c> cVar2, ij.c<com.planner5d.library.application.b> cVar3, ij.c<com.planner5d.library.model.manager.config.j> cVar4) {
        return new h1(cVar, cVar2, cVar3, cVar4);
    }

    public static g1 c(fg.e<t> eVar, com.planner5d.library.api.requests.c cVar, com.planner5d.library.application.b bVar, com.planner5d.library.model.manager.config.j jVar) {
        return new g1(eVar, cVar, bVar, jVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g1 get() {
        return c(dagger.internal.g.a(this.f223149a), this.f223150b.get(), this.f223151c.get(), this.f223152d.get());
    }
}
