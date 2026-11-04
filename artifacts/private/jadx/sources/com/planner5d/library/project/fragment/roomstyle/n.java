package com.planner5d.library.project.fragment.roomstyle;

import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.statistics.events.j3;
import com.planner5d.library.modules.user.user.t;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@r
@dagger.internal.e
@s
public final class n implements dagger.internal.h<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<pd.a> f223802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<pd.e> f223803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<pd.c> f223804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<le.c> f223805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<b2> f223806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<j3> f223807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.j> f223808g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<t> f223809h;

    public n(ij.c<pd.a> cVar, ij.c<pd.e> cVar2, ij.c<pd.c> cVar3, ij.c<le.c> cVar4, ij.c<b2> cVar5, ij.c<j3> cVar6, ij.c<com.planner5d.library.model.manager.config.j> cVar7, ij.c<t> cVar8) {
        this.f223802a = cVar;
        this.f223803b = cVar2;
        this.f223804c = cVar3;
        this.f223805d = cVar4;
        this.f223806e = cVar5;
        this.f223807f = cVar6;
        this.f223808g = cVar7;
        this.f223809h = cVar8;
    }

    public static n a(ij.c<pd.a> cVar, ij.c<pd.e> cVar2, ij.c<pd.c> cVar3, ij.c<le.c> cVar4, ij.c<b2> cVar5, ij.c<j3> cVar6, ij.c<com.planner5d.library.model.manager.config.j> cVar7, ij.c<t> cVar8) {
        return new n(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8);
    }

    public static l c(pd.a aVar, pd.e eVar, pd.c cVar, le.c cVar2, b2 b2Var, j3 j3Var, com.planner5d.library.model.manager.config.j jVar, t tVar) {
        return new l(aVar, eVar, cVar, cVar2, b2Var, j3Var, jVar, tVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l get() {
        return c(this.f223802a.get(), this.f223803b.get(), this.f223804c.get(), this.f223805d.get(), this.f223806e.get(), this.f223807f.get(), this.f223808g.get(), this.f223809h.get());
    }
}
