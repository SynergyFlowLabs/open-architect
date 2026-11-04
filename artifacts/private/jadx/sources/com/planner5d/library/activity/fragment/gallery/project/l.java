package com.planner5d.library.activity.fragment.gallery.project;

import com.planner5d.library.activity.fragment.gallery.m;
import com.planner5d.library.activity.fragment.gallery.p0;
import com.planner5d.library.activity.fragment.x;
import com.planner5d.library.model.manager.y1;
import com.planner5d.library.services.utility.t;
import dagger.internal.r;
import dagger.internal.s;
import le.o;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
@s
public final class l implements dagger.internal.h<k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<p0> f133889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<o> f133890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.i> f133891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.favorite.a> f133892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<x> f133893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<y1> f133894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<m> f133895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<t> f133896h;

    public l(ij.c<p0> cVar, ij.c<o> cVar2, ij.c<com.planner5d.library.model.i> cVar3, ij.c<com.planner5d.library.model.manager.favorite.a> cVar4, ij.c<x> cVar5, ij.c<y1> cVar6, ij.c<m> cVar7, ij.c<t> cVar8) {
        this.f133889a = cVar;
        this.f133890b = cVar2;
        this.f133891c = cVar3;
        this.f133892d = cVar4;
        this.f133893e = cVar5;
        this.f133894f = cVar6;
        this.f133895g = cVar7;
        this.f133896h = cVar8;
    }

    public static l a(ij.c<p0> cVar, ij.c<o> cVar2, ij.c<com.planner5d.library.model.i> cVar3, ij.c<com.planner5d.library.model.manager.favorite.a> cVar4, ij.c<x> cVar5, ij.c<y1> cVar6, ij.c<m> cVar7, ij.c<t> cVar8) {
        return new l(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8);
    }

    public static k c(p0 p0Var, o oVar, com.planner5d.library.model.i iVar, com.planner5d.library.model.manager.favorite.a aVar, x xVar, y1 y1Var, m mVar, t tVar) {
        return new k(p0Var, oVar, iVar, aVar, xVar, y1Var, mVar, tVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c(this.f133889a.get(), this.f133890b.get(), this.f133891c.get(), this.f133892d.get(), this.f133893e.get(), this.f133894f.get(), this.f133895g.get(), this.f133896h.get());
    }
}
