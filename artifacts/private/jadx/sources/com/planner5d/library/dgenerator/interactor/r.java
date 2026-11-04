package com.planner5d.library.dgenerator.interactor;

import com.planner5d.library.services.utility.f1;
import com.planner5d.library.services.utility.t;
import com.planner5d.library.services.utility.z2;
import dagger.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@dagger.internal.r
@dagger.internal.e
@s
public final class r implements dagger.internal.h<p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f160548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<nb.g> f160549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.d> f160550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.database.manager.a> f160551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.dgenerator.data.a> f160552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<z2> f160553f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<f1> f160554g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<t> f160555h;

    public r(ij.c<com.planner5d.library.application.b> cVar, ij.c<nb.g> cVar2, ij.c<com.planner5d.library.model.manager.config.d> cVar3, ij.c<com.planner5d.library.database.manager.a> cVar4, ij.c<com.planner5d.library.dgenerator.data.a> cVar5, ij.c<z2> cVar6, ij.c<f1> cVar7, ij.c<t> cVar8) {
        this.f160548a = cVar;
        this.f160549b = cVar2;
        this.f160550c = cVar3;
        this.f160551d = cVar4;
        this.f160552e = cVar5;
        this.f160553f = cVar6;
        this.f160554g = cVar7;
        this.f160555h = cVar8;
    }

    public static r a(ij.c<com.planner5d.library.application.b> cVar, ij.c<nb.g> cVar2, ij.c<com.planner5d.library.model.manager.config.d> cVar3, ij.c<com.planner5d.library.database.manager.a> cVar4, ij.c<com.planner5d.library.dgenerator.data.a> cVar5, ij.c<z2> cVar6, ij.c<f1> cVar7, ij.c<t> cVar8) {
        return new r(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8);
    }

    public static p c(com.planner5d.library.application.b bVar, nb.g gVar, com.planner5d.library.model.manager.config.d dVar, com.planner5d.library.database.manager.a aVar, com.planner5d.library.dgenerator.data.a aVar2, z2 z2Var, f1 f1Var, t tVar) {
        return new p(bVar, gVar, dVar, aVar, aVar2, z2Var, f1Var, tVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p get() {
        return c(this.f160548a.get(), this.f160549b.get(), this.f160550c.get(), this.f160551d.get(), this.f160552e.get(), this.f160553f.get(), this.f160554g.get(), this.f160555h.get());
    }
}
