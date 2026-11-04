package com.planner5d.library.widget.editor.editor3d;

import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.k5;
import com.planner5d.library.model.manager.s0;
import com.planner5d.library.model.manager.t1;
import com.planner5d.library.model.manager.y0;
import com.planner5d.library.services.utility.c2;

/* JADX INFO: loaded from: classes12.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class x implements dagger.internal.h<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f255898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<s0> f255899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<t1> f255900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<b2> f255901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<k5> f255902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<y0> f255903f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<ec.e> f255904g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<c2> f255905h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.w> f255906i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ij.c<com.planner5d.library.engine.i> f255907j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ij.c<ac.f> f255908k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ij.c<bc.c> f255909l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ij.c<cc.b> f255910m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ij.c<dc.d<cc.a>> f255911n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ij.c<com.planner5d.library.engine.h> f255912o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.n> f255913p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ij.c<vb.g> f255914q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ij.c<cc.f> f255915r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ij.c<dd.c> f255916s;

    public x(ij.c<com.planner5d.library.application.b> cVar, ij.c<s0> cVar2, ij.c<t1> cVar3, ij.c<b2> cVar4, ij.c<k5> cVar5, ij.c<y0> cVar6, ij.c<ec.e> cVar7, ij.c<c2> cVar8, ij.c<com.planner5d.library.services.utility.w> cVar9, ij.c<com.planner5d.library.engine.i> cVar10, ij.c<ac.f> cVar11, ij.c<bc.c> cVar12, ij.c<cc.b> cVar13, ij.c<dc.d<cc.a>> cVar14, ij.c<com.planner5d.library.engine.h> cVar15, ij.c<com.planner5d.library.model.manager.builtin.n> cVar16, ij.c<vb.g> cVar17, ij.c<cc.f> cVar18, ij.c<dd.c> cVar19) {
        this.f255898a = cVar;
        this.f255899b = cVar2;
        this.f255900c = cVar3;
        this.f255901d = cVar4;
        this.f255902e = cVar5;
        this.f255903f = cVar6;
        this.f255904g = cVar7;
        this.f255905h = cVar8;
        this.f255906i = cVar9;
        this.f255907j = cVar10;
        this.f255908k = cVar11;
        this.f255909l = cVar12;
        this.f255910m = cVar13;
        this.f255911n = cVar14;
        this.f255912o = cVar15;
        this.f255913p = cVar16;
        this.f255914q = cVar17;
        this.f255915r = cVar18;
        this.f255916s = cVar19;
    }

    public static x a(ij.c<com.planner5d.library.application.b> cVar, ij.c<s0> cVar2, ij.c<t1> cVar3, ij.c<b2> cVar4, ij.c<k5> cVar5, ij.c<y0> cVar6, ij.c<ec.e> cVar7, ij.c<c2> cVar8, ij.c<com.planner5d.library.services.utility.w> cVar9, ij.c<com.planner5d.library.engine.i> cVar10, ij.c<ac.f> cVar11, ij.c<bc.c> cVar12, ij.c<cc.b> cVar13, ij.c<dc.d<cc.a>> cVar14, ij.c<com.planner5d.library.engine.h> cVar15, ij.c<com.planner5d.library.model.manager.builtin.n> cVar16, ij.c<vb.g> cVar17, ij.c<cc.f> cVar18, ij.c<dd.c> cVar19) {
        return new x(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15, cVar16, cVar17, cVar18, cVar19);
    }

    public static l c(com.planner5d.library.application.b bVar, s0 s0Var, t1 t1Var, b2 b2Var, k5 k5Var, y0 y0Var, ec.e eVar, c2 c2Var, com.planner5d.library.services.utility.w wVar, com.planner5d.library.engine.i iVar, ac.f fVar, bc.c cVar, cc.b bVar2, dc.d<cc.a> dVar, com.planner5d.library.engine.h hVar, com.planner5d.library.model.manager.builtin.n nVar, vb.g gVar, cc.f fVar2, dd.c cVar2) {
        return new l(bVar, s0Var, t1Var, b2Var, k5Var, y0Var, eVar, c2Var, wVar, iVar, fVar, cVar, bVar2, dVar, hVar, nVar, gVar, fVar2, cVar2);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l get() {
        return c(this.f255898a.get(), this.f255899b.get(), this.f255900c.get(), this.f255901d.get(), this.f255902e.get(), this.f255903f.get(), this.f255904g.get(), this.f255905h.get(), this.f255906i.get(), this.f255907j.get(), this.f255908k.get(), this.f255909l.get(), this.f255910m.get(), this.f255911n.get(), this.f255912o.get(), this.f255913p.get(), this.f255914q.get(), this.f255915r.get(), this.f255916s.get());
    }
}
