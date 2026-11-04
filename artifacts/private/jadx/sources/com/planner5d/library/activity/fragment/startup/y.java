package com.planner5d.library.activity.fragment.startup;

import com.planner5d.library.modules.user.user.m1;
import com.planner5d.library.services.utility.c2;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class y implements dagger.internal.h<x> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f136619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.j> f136620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.initialization.r> f136621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.legal.model.manager.a> f136622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f136623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<a> f136624f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<c2> f136625g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.p> f136626h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.spaces.b> f136627i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ij.c<m1> f136628j;

    public y(ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.model.manager.config.j> cVar2, ij.c<com.planner5d.library.model.manager.initialization.r> cVar3, ij.c<com.planner5d.library.legal.model.manager.a> cVar4, ij.c<com.planner5d.library.modules.user.user.t> cVar5, ij.c<a> cVar6, ij.c<c2> cVar7, ij.c<com.planner5d.library.model.manager.config.p> cVar8, ij.c<com.planner5d.library.model.manager.spaces.b> cVar9, ij.c<m1> cVar10) {
        this.f136619a = cVar;
        this.f136620b = cVar2;
        this.f136621c = cVar3;
        this.f136622d = cVar4;
        this.f136623e = cVar5;
        this.f136624f = cVar6;
        this.f136625g = cVar7;
        this.f136626h = cVar8;
        this.f136627i = cVar9;
        this.f136628j = cVar10;
    }

    public static y a(ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.model.manager.config.j> cVar2, ij.c<com.planner5d.library.model.manager.initialization.r> cVar3, ij.c<com.planner5d.library.legal.model.manager.a> cVar4, ij.c<com.planner5d.library.modules.user.user.t> cVar5, ij.c<a> cVar6, ij.c<c2> cVar7, ij.c<com.planner5d.library.model.manager.config.p> cVar8, ij.c<com.planner5d.library.model.manager.spaces.b> cVar9, ij.c<m1> cVar10) {
        return new y(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10);
    }

    public static x c(com.planner5d.library.application.b bVar, com.planner5d.library.model.manager.config.j jVar, com.planner5d.library.model.manager.initialization.r rVar, fg.e<com.planner5d.library.legal.model.manager.a> eVar, fg.e<com.planner5d.library.modules.user.user.t> eVar2, fg.e<a> eVar3, c2 c2Var, com.planner5d.library.model.manager.config.p pVar, com.planner5d.library.model.manager.spaces.b bVar2, fg.e<m1> eVar4) {
        return new x(bVar, jVar, rVar, eVar, eVar2, eVar3, c2Var, pVar, bVar2, eVar4);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c(this.f136619a.get(), this.f136620b.get(), this.f136621c.get(), dagger.internal.g.a(this.f136622d), dagger.internal.g.a(this.f136623e), dagger.internal.g.a(this.f136624f), this.f136625g.get(), this.f136626h.get(), this.f136627i.get(), dagger.internal.g.a(this.f136628j));
    }
}
