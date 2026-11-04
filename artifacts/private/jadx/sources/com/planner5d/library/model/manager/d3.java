package com.planner5d.library.model.manager;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class d3 implements dagger.internal.h<c3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.p> f191256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.y0> f191257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.api.requests.c> f191258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.c2> f191259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.j> f191260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f191261f;

    public d3(ij.c<com.planner5d.library.model.manager.config.p> cVar, ij.c<com.planner5d.library.model.manager.builtin.y0> cVar2, ij.c<com.planner5d.library.api.requests.c> cVar3, ij.c<com.planner5d.library.services.utility.c2> cVar4, ij.c<com.planner5d.library.model.manager.config.j> cVar5, ij.c<com.planner5d.library.modules.user.user.t> cVar6) {
        this.f191256a = cVar;
        this.f191257b = cVar2;
        this.f191258c = cVar3;
        this.f191259d = cVar4;
        this.f191260e = cVar5;
        this.f191261f = cVar6;
    }

    public static d3 a(ij.c<com.planner5d.library.model.manager.config.p> cVar, ij.c<com.planner5d.library.model.manager.builtin.y0> cVar2, ij.c<com.planner5d.library.api.requests.c> cVar3, ij.c<com.planner5d.library.services.utility.c2> cVar4, ij.c<com.planner5d.library.model.manager.config.j> cVar5, ij.c<com.planner5d.library.modules.user.user.t> cVar6) {
        return new d3(cVar, cVar2, cVar3, cVar4, cVar5, cVar6);
    }

    public static c3 c(com.planner5d.library.model.manager.config.p pVar, com.planner5d.library.model.manager.builtin.y0 y0Var, com.planner5d.library.api.requests.c cVar, com.planner5d.library.services.utility.c2 c2Var, com.planner5d.library.model.manager.config.j jVar, com.planner5d.library.modules.user.user.t tVar) {
        return new c3(pVar, y0Var, cVar, c2Var, jVar, tVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c3 get() {
        return c(this.f191256a.get(), this.f191257b.get(), this.f191258c.get(), this.f191259d.get(), this.f191260e.get(), this.f191261f.get());
    }
}
