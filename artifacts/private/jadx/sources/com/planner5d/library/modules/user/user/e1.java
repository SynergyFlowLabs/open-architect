package com.planner5d.library.modules.user.user;

import com.planner5d.library.services.utility.c2;

/* JADX INFO: loaded from: classes9.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class e1 implements dagger.internal.h<y0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f223032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.p> f223033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<z0> f223034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<b1> f223035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.d> f223036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<t> f223037f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<b> f223038g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<c2> f223039h;

    public e1(ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.model.manager.config.p> cVar2, ij.c<z0> cVar3, ij.c<b1> cVar4, ij.c<com.planner5d.library.application.d> cVar5, ij.c<t> cVar6, ij.c<b> cVar7, ij.c<c2> cVar8) {
        this.f223032a = cVar;
        this.f223033b = cVar2;
        this.f223034c = cVar3;
        this.f223035d = cVar4;
        this.f223036e = cVar5;
        this.f223037f = cVar6;
        this.f223038g = cVar7;
        this.f223039h = cVar8;
    }

    public static e1 a(ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.model.manager.config.p> cVar2, ij.c<z0> cVar3, ij.c<b1> cVar4, ij.c<com.planner5d.library.application.d> cVar5, ij.c<t> cVar6, ij.c<b> cVar7, ij.c<c2> cVar8) {
        return new e1(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8);
    }

    public static y0 c(com.planner5d.library.application.b bVar, com.planner5d.library.model.manager.config.p pVar, z0 z0Var, b1 b1Var, com.planner5d.library.application.d dVar, fg.e<t> eVar, b bVar2, c2 c2Var) {
        return new y0(bVar, pVar, z0Var, b1Var, dVar, eVar, bVar2, c2Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public y0 get() {
        return c(this.f223032a.get(), this.f223033b.get(), this.f223034c.get(), this.f223035d.get(), this.f223036e.get(), dagger.internal.g.a(this.f223037f), this.f223038g.get(), this.f223039h.get());
    }
}
