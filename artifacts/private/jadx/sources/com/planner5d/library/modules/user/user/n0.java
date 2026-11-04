package com.planner5d.library.modules.user.user;

/* JADX INFO: loaded from: classes9.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class n0 implements dagger.internal.h<m0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.api.requests.c> f223212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f223213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<t> f223214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.c1> f223215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.statistics.b0> f223216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.crashreporting.l> f223217f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.l> f223218g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.p> f223219h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.project.d0> f223220i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.initialization.r> f223221j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.i1> f223222k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.i> f223223l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.auth.r> f223224m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.j> f223225n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.z> f223226o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.g0> f223227p;

    public n0(ij.c<com.planner5d.library.api.requests.c> cVar, ij.c<com.planner5d.library.application.b> cVar2, ij.c<t> cVar3, ij.c<com.planner5d.library.model.manager.c1> cVar4, ij.c<com.planner5d.library.model.manager.statistics.b0> cVar5, ij.c<com.planner5d.library.model.manager.crashreporting.l> cVar6, ij.c<com.planner5d.library.model.manager.l> cVar7, ij.c<com.planner5d.library.model.manager.config.p> cVar8, ij.c<com.planner5d.library.model.manager.project.d0> cVar9, ij.c<com.planner5d.library.model.manager.initialization.r> cVar10, ij.c<com.planner5d.library.model.manager.i1> cVar11, ij.c<com.planner5d.library.model.manager.builtin.i> cVar12, ij.c<com.planner5d.library.modules.user.auth.r> cVar13, ij.c<com.planner5d.library.model.manager.config.j> cVar14, ij.c<com.planner5d.library.services.z> cVar15, ij.c<com.planner5d.library.model.manager.builtin.g0> cVar16) {
        this.f223212a = cVar;
        this.f223213b = cVar2;
        this.f223214c = cVar3;
        this.f223215d = cVar4;
        this.f223216e = cVar5;
        this.f223217f = cVar6;
        this.f223218g = cVar7;
        this.f223219h = cVar8;
        this.f223220i = cVar9;
        this.f223221j = cVar10;
        this.f223222k = cVar11;
        this.f223223l = cVar12;
        this.f223224m = cVar13;
        this.f223225n = cVar14;
        this.f223226o = cVar15;
        this.f223227p = cVar16;
    }

    public static n0 a(ij.c<com.planner5d.library.api.requests.c> cVar, ij.c<com.planner5d.library.application.b> cVar2, ij.c<t> cVar3, ij.c<com.planner5d.library.model.manager.c1> cVar4, ij.c<com.planner5d.library.model.manager.statistics.b0> cVar5, ij.c<com.planner5d.library.model.manager.crashreporting.l> cVar6, ij.c<com.planner5d.library.model.manager.l> cVar7, ij.c<com.planner5d.library.model.manager.config.p> cVar8, ij.c<com.planner5d.library.model.manager.project.d0> cVar9, ij.c<com.planner5d.library.model.manager.initialization.r> cVar10, ij.c<com.planner5d.library.model.manager.i1> cVar11, ij.c<com.planner5d.library.model.manager.builtin.i> cVar12, ij.c<com.planner5d.library.modules.user.auth.r> cVar13, ij.c<com.planner5d.library.model.manager.config.j> cVar14, ij.c<com.planner5d.library.services.z> cVar15, ij.c<com.planner5d.library.model.manager.builtin.g0> cVar16) {
        return new n0(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15, cVar16);
    }

    public static m0 c(com.planner5d.library.api.requests.c cVar, com.planner5d.library.application.b bVar, fg.e<t> eVar, com.planner5d.library.model.manager.c1 c1Var, fg.e<com.planner5d.library.model.manager.statistics.b0> eVar2, fg.e<com.planner5d.library.model.manager.crashreporting.l> eVar3, fg.e<com.planner5d.library.model.manager.l> eVar4, com.planner5d.library.model.manager.config.p pVar, com.planner5d.library.model.manager.project.d0 d0Var, com.planner5d.library.model.manager.initialization.r rVar, com.planner5d.library.model.manager.i1 i1Var, com.planner5d.library.model.manager.builtin.i iVar, com.planner5d.library.modules.user.auth.r rVar2, com.planner5d.library.model.manager.config.j jVar, com.planner5d.library.services.z zVar, com.planner5d.library.model.manager.builtin.g0 g0Var) {
        return new m0(cVar, bVar, eVar, c1Var, eVar2, eVar3, eVar4, pVar, d0Var, rVar, i1Var, iVar, rVar2, jVar, zVar, g0Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m0 get() {
        return c(this.f223212a.get(), this.f223213b.get(), dagger.internal.g.a(this.f223214c), this.f223215d.get(), dagger.internal.g.a(this.f223216e), dagger.internal.g.a(this.f223217f), dagger.internal.g.a(this.f223218g), this.f223219h.get(), this.f223220i.get(), this.f223221j.get(), this.f223222k.get(), this.f223223l.get(), this.f223224m.get(), this.f223225n.get(), this.f223226o.get(), this.f223227p.get());
    }
}
