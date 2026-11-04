package com.planner5d.library.model.manager;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class f1 implements dagger.internal.h<c1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.i> f191314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.p0> f191315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f191316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.api.requests.c> f191317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.p> f191318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f191319f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.z0> f191320g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.crashreporting.l> f191321h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<sd.b> f191322i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ij.c<t1> f191323j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.t> f191324k;

    public f1(ij.c<com.planner5d.library.model.manager.builtin.i> cVar, ij.c<com.planner5d.library.services.utility.p0> cVar2, ij.c<com.planner5d.library.application.b> cVar3, ij.c<com.planner5d.library.api.requests.c> cVar4, ij.c<com.planner5d.library.model.manager.config.p> cVar5, ij.c<com.planner5d.library.modules.user.user.t> cVar6, ij.c<com.planner5d.library.modules.user.user.z0> cVar7, ij.c<com.planner5d.library.model.manager.crashreporting.l> cVar8, ij.c<sd.b> cVar9, ij.c<t1> cVar10, ij.c<com.planner5d.library.services.utility.t> cVar11) {
        this.f191314a = cVar;
        this.f191315b = cVar2;
        this.f191316c = cVar3;
        this.f191317d = cVar4;
        this.f191318e = cVar5;
        this.f191319f = cVar6;
        this.f191320g = cVar7;
        this.f191321h = cVar8;
        this.f191322i = cVar9;
        this.f191323j = cVar10;
        this.f191324k = cVar11;
    }

    public static f1 a(ij.c<com.planner5d.library.model.manager.builtin.i> cVar, ij.c<com.planner5d.library.services.utility.p0> cVar2, ij.c<com.planner5d.library.application.b> cVar3, ij.c<com.planner5d.library.api.requests.c> cVar4, ij.c<com.planner5d.library.model.manager.config.p> cVar5, ij.c<com.planner5d.library.modules.user.user.t> cVar6, ij.c<com.planner5d.library.modules.user.user.z0> cVar7, ij.c<com.planner5d.library.model.manager.crashreporting.l> cVar8, ij.c<sd.b> cVar9, ij.c<t1> cVar10, ij.c<com.planner5d.library.services.utility.t> cVar11) {
        return new f1(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11);
    }

    public static c1 c(fg.e<com.planner5d.library.model.manager.builtin.i> eVar, fg.e<com.planner5d.library.services.utility.p0> eVar2, com.planner5d.library.application.b bVar, com.planner5d.library.api.requests.c cVar, com.planner5d.library.model.manager.config.p pVar, fg.e<com.planner5d.library.modules.user.user.t> eVar3, com.planner5d.library.modules.user.user.z0 z0Var, fg.e<com.planner5d.library.model.manager.crashreporting.l> eVar4, fg.e<sd.b> eVar5, fg.e<t1> eVar6, com.planner5d.library.services.utility.t tVar) {
        return new c1(eVar, eVar2, bVar, cVar, pVar, eVar3, z0Var, eVar4, eVar5, eVar6, tVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c1 get() {
        return c(dagger.internal.g.a(this.f191314a), dagger.internal.g.a(this.f191315b), this.f191316c.get(), this.f191317d.get(), this.f191318e.get(), dagger.internal.g.a(this.f191319f), this.f191320g.get(), dagger.internal.g.a(this.f191321h), dagger.internal.g.a(this.f191322i), dagger.internal.g.a(this.f191323j), this.f191324k.get());
    }
}
