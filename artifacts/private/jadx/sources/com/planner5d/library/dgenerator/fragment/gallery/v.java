package com.planner5d.library.dgenerator.fragment.gallery;

import com.planner5d.library.activity.helper.x;
import com.planner5d.library.model.manager.statistics.events.j3;

/* JADX INFO: loaded from: classes5.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class v implements dagger.internal.h<u> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f160289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.k> f160290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<pd.a> f160291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<nb.c> f160292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<nb.b> f160293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<x> f160294f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<nb.e> f160295g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.i> f160296h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<j3> f160297i;

    public v(ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar2, ij.c<pd.a> cVar3, ij.c<nb.c> cVar4, ij.c<nb.b> cVar5, ij.c<x> cVar6, ij.c<nb.e> cVar7, ij.c<com.planner5d.library.model.manager.builtin.i> cVar8, ij.c<j3> cVar9) {
        this.f160289a = cVar;
        this.f160290b = cVar2;
        this.f160291c = cVar3;
        this.f160292d = cVar4;
        this.f160293e = cVar5;
        this.f160294f = cVar6;
        this.f160295g = cVar7;
        this.f160296h = cVar8;
        this.f160297i = cVar9;
    }

    public static v a(ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar2, ij.c<pd.a> cVar3, ij.c<nb.c> cVar4, ij.c<nb.b> cVar5, ij.c<x> cVar6, ij.c<nb.e> cVar7, ij.c<com.planner5d.library.model.manager.builtin.i> cVar8, ij.c<j3> cVar9) {
        return new v(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9);
    }

    public static u c(com.planner5d.library.application.b bVar, com.planner5d.library.activity.fragment.dialog.k kVar, pd.a aVar, nb.c cVar, nb.b bVar2, x xVar, nb.e eVar, com.planner5d.library.model.manager.builtin.i iVar, j3 j3Var) {
        return new u(bVar, kVar, aVar, cVar, bVar2, xVar, eVar, iVar, j3Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u get() {
        return c(this.f160289a.get(), this.f160290b.get(), this.f160291c.get(), this.f160292d.get(), this.f160293e.get(), this.f160294f.get(), this.f160295g.get(), this.f160296h.get(), this.f160297i.get());
    }
}
