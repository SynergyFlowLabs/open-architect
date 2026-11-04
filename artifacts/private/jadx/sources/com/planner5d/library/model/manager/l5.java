package com.planner5d.library.model.manager;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class l5 implements dagger.internal.h<k5> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.i> f191860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<y0> f191861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.api.requests.c> f191862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f191863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f191864e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.d> f191865f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.v0> f191866g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.n> f191867h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.bitmaploader.d> f191868i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ij.c<t1> f191869j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.w> f191870k;

    public l5(ij.c<com.planner5d.library.model.manager.builtin.i> cVar, ij.c<y0> cVar2, ij.c<com.planner5d.library.api.requests.c> cVar3, ij.c<com.planner5d.library.modules.user.user.t> cVar4, ij.c<com.planner5d.library.application.b> cVar5, ij.c<com.planner5d.library.application.d> cVar6, ij.c<com.planner5d.library.model.manager.builtin.v0> cVar7, ij.c<com.planner5d.library.model.manager.builtin.n> cVar8, ij.c<com.planner5d.library.services.bitmaploader.d> cVar9, ij.c<t1> cVar10, ij.c<com.planner5d.library.services.utility.w> cVar11) {
        this.f191860a = cVar;
        this.f191861b = cVar2;
        this.f191862c = cVar3;
        this.f191863d = cVar4;
        this.f191864e = cVar5;
        this.f191865f = cVar6;
        this.f191866g = cVar7;
        this.f191867h = cVar8;
        this.f191868i = cVar9;
        this.f191869j = cVar10;
        this.f191870k = cVar11;
    }

    public static l5 a(ij.c<com.planner5d.library.model.manager.builtin.i> cVar, ij.c<y0> cVar2, ij.c<com.planner5d.library.api.requests.c> cVar3, ij.c<com.planner5d.library.modules.user.user.t> cVar4, ij.c<com.planner5d.library.application.b> cVar5, ij.c<com.planner5d.library.application.d> cVar6, ij.c<com.planner5d.library.model.manager.builtin.v0> cVar7, ij.c<com.planner5d.library.model.manager.builtin.n> cVar8, ij.c<com.planner5d.library.services.bitmaploader.d> cVar9, ij.c<t1> cVar10, ij.c<com.planner5d.library.services.utility.w> cVar11) {
        return new l5(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11);
    }

    public static k5 c(com.planner5d.library.model.manager.builtin.i iVar, y0 y0Var, com.planner5d.library.api.requests.c cVar, com.planner5d.library.modules.user.user.t tVar, com.planner5d.library.application.b bVar, com.planner5d.library.application.d dVar, com.planner5d.library.model.manager.builtin.v0 v0Var, com.planner5d.library.model.manager.builtin.n nVar, com.planner5d.library.services.bitmaploader.d dVar2, t1 t1Var, com.planner5d.library.services.utility.w wVar) {
        return new k5(iVar, y0Var, cVar, tVar, bVar, dVar, v0Var, nVar, dVar2, t1Var, wVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k5 get() {
        return c(this.f191860a.get(), this.f191861b.get(), this.f191862c.get(), this.f191863d.get(), this.f191864e.get(), this.f191865f.get(), this.f191866g.get(), this.f191867h.get(), this.f191868i.get(), this.f191869j.get(), this.f191870k.get());
    }
}
