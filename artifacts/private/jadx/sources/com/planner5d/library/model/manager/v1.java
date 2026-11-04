package com.planner5d.library.model.manager;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class v1 implements dagger.internal.h<t1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.api.requests.c> f222345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f222346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.d> f222347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f222348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<c1> f222349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.crashreporting.l> f222350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.j> f222351g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.g3> f222352h;

    public v1(ij.c<com.planner5d.library.api.requests.c> cVar, ij.c<com.planner5d.library.modules.user.user.t> cVar2, ij.c<com.planner5d.library.application.d> cVar3, ij.c<com.planner5d.library.application.b> cVar4, ij.c<c1> cVar5, ij.c<com.planner5d.library.model.manager.crashreporting.l> cVar6, ij.c<com.planner5d.library.model.manager.config.j> cVar7, ij.c<com.planner5d.library.services.utility.g3> cVar8) {
        this.f222345a = cVar;
        this.f222346b = cVar2;
        this.f222347c = cVar3;
        this.f222348d = cVar4;
        this.f222349e = cVar5;
        this.f222350f = cVar6;
        this.f222351g = cVar7;
        this.f222352h = cVar8;
    }

    public static v1 a(ij.c<com.planner5d.library.api.requests.c> cVar, ij.c<com.planner5d.library.modules.user.user.t> cVar2, ij.c<com.planner5d.library.application.d> cVar3, ij.c<com.planner5d.library.application.b> cVar4, ij.c<c1> cVar5, ij.c<com.planner5d.library.model.manager.crashreporting.l> cVar6, ij.c<com.planner5d.library.model.manager.config.j> cVar7, ij.c<com.planner5d.library.services.utility.g3> cVar8) {
        return new v1(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8);
    }

    public static t1 c(com.planner5d.library.api.requests.c cVar, fg.e<com.planner5d.library.modules.user.user.t> eVar, com.planner5d.library.application.d dVar, com.planner5d.library.application.b bVar, c1 c1Var, fg.e<com.planner5d.library.model.manager.crashreporting.l> eVar2, fg.e<com.planner5d.library.model.manager.config.j> eVar3, com.planner5d.library.services.utility.g3 g3Var) {
        return new t1(cVar, eVar, dVar, bVar, c1Var, eVar2, eVar3, g3Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t1 get() {
        return c(this.f222345a.get(), dagger.internal.g.a(this.f222346b), this.f222347c.get(), this.f222348d.get(), this.f222349e.get(), dagger.internal.g.a(this.f222350f), dagger.internal.g.a(this.f222351g), this.f222352h.get());
    }
}
