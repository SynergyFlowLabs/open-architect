package com.planner5d.library.widget.editor.helper;

import com.planner5d.library.model.item.builder.ItemBuilder;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class w2 implements dagger.internal.h<g1> {
    private final ij.c<r1> A;
    private final ij.c<k2.a> B;
    private final ij.c<com.planner5d.library.services.utility.p0> C;
    private final ij.c<com.planner5d.library.model.manager.performancetracing.e> D;
    private final ij.c<com.planner5d.library.model.manager.statistics.events.l3> E;
    private final ij.c<com.planner5d.library.services.utility.w> F;
    private final ij.c<u2> G;
    private final ij.c<n2.a> H;
    private final ij.c<com.planner5d.library.model.manager.config.j> I;
    private final ij.c<com.planner5d.library.model.converter.json.from.x> J;
    private final ij.c<com.planner5d.library.model.converter.json.from.z> K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.project.d0> f256828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.project.m0> f256829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.y1> f256830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.synchronization.i> f256831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<ItemBuilder> f256832e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f256833f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.k> f256834g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.i> f256835h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<com.planner5d.library.widget.editor.popup.e> f256836i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.d> f256837j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.b2> f256838k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ij.c<n3> f256839l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ij.c<com.planner5d.library.widget.editor.menu.j> f256840m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.helper.l0> f256841n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.contest.g> f256842o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.x> f256843p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t0> f256844q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ij.c<com.planner5d.library.widget.rate.g> f256845r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.unlockeditems.b> f256846s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ij.c<com.planner5d.library.widget.editor.controls.a> f256847t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final ij.c<com.planner5d.library.widget.editor.facade.c0> f256848u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final ij.c<w1> f256849v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.t1> f256850w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.smartwizard.a> f256851x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final ij.c<sd.e> f256852y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final ij.c<com.planner5d.library.widget.editor.facade.s> f256853z;

    public w2(ij.c<com.planner5d.library.model.manager.project.d0> cVar, ij.c<com.planner5d.library.model.manager.project.m0> cVar2, ij.c<com.planner5d.library.model.manager.y1> cVar3, ij.c<com.planner5d.library.model.manager.synchronization.i> cVar4, ij.c<ItemBuilder> cVar5, ij.c<com.planner5d.library.modules.user.user.t> cVar6, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar7, ij.c<com.planner5d.library.model.manager.builtin.i> cVar8, ij.c<com.planner5d.library.widget.editor.popup.e> cVar9, ij.c<com.planner5d.library.application.d> cVar10, ij.c<com.planner5d.library.model.manager.b2> cVar11, ij.c<n3> cVar12, ij.c<com.planner5d.library.widget.editor.menu.j> cVar13, ij.c<com.planner5d.library.activity.helper.l0> cVar14, ij.c<com.planner5d.library.model.manager.contest.g> cVar15, ij.c<com.planner5d.library.activity.fragment.x> cVar16, ij.c<com.planner5d.library.modules.user.user.t0> cVar17, ij.c<com.planner5d.library.widget.rate.g> cVar18, ij.c<com.planner5d.library.model.manager.unlockeditems.b> cVar19, ij.c<com.planner5d.library.widget.editor.controls.a> cVar20, ij.c<com.planner5d.library.widget.editor.facade.c0> cVar21, ij.c<w1> cVar22, ij.c<com.planner5d.library.model.manager.t1> cVar23, ij.c<com.planner5d.library.activity.fragment.smartwizard.a> cVar24, ij.c<sd.e> cVar25, ij.c<com.planner5d.library.widget.editor.facade.s> cVar26, ij.c<r1> cVar27, ij.c<k2.a> cVar28, ij.c<com.planner5d.library.services.utility.p0> cVar29, ij.c<com.planner5d.library.model.manager.performancetracing.e> cVar30, ij.c<com.planner5d.library.model.manager.statistics.events.l3> cVar31, ij.c<com.planner5d.library.services.utility.w> cVar32, ij.c<u2> cVar33, ij.c<n2.a> cVar34, ij.c<com.planner5d.library.model.manager.config.j> cVar35, ij.c<com.planner5d.library.model.converter.json.from.x> cVar36, ij.c<com.planner5d.library.model.converter.json.from.z> cVar37) {
        this.f256828a = cVar;
        this.f256829b = cVar2;
        this.f256830c = cVar3;
        this.f256831d = cVar4;
        this.f256832e = cVar5;
        this.f256833f = cVar6;
        this.f256834g = cVar7;
        this.f256835h = cVar8;
        this.f256836i = cVar9;
        this.f256837j = cVar10;
        this.f256838k = cVar11;
        this.f256839l = cVar12;
        this.f256840m = cVar13;
        this.f256841n = cVar14;
        this.f256842o = cVar15;
        this.f256843p = cVar16;
        this.f256844q = cVar17;
        this.f256845r = cVar18;
        this.f256846s = cVar19;
        this.f256847t = cVar20;
        this.f256848u = cVar21;
        this.f256849v = cVar22;
        this.f256850w = cVar23;
        this.f256851x = cVar24;
        this.f256852y = cVar25;
        this.f256853z = cVar26;
        this.A = cVar27;
        this.B = cVar28;
        this.C = cVar29;
        this.D = cVar30;
        this.E = cVar31;
        this.F = cVar32;
        this.G = cVar33;
        this.H = cVar34;
        this.I = cVar35;
        this.J = cVar36;
        this.K = cVar37;
    }

    public static w2 a(ij.c<com.planner5d.library.model.manager.project.d0> cVar, ij.c<com.planner5d.library.model.manager.project.m0> cVar2, ij.c<com.planner5d.library.model.manager.y1> cVar3, ij.c<com.planner5d.library.model.manager.synchronization.i> cVar4, ij.c<ItemBuilder> cVar5, ij.c<com.planner5d.library.modules.user.user.t> cVar6, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar7, ij.c<com.planner5d.library.model.manager.builtin.i> cVar8, ij.c<com.planner5d.library.widget.editor.popup.e> cVar9, ij.c<com.planner5d.library.application.d> cVar10, ij.c<com.planner5d.library.model.manager.b2> cVar11, ij.c<n3> cVar12, ij.c<com.planner5d.library.widget.editor.menu.j> cVar13, ij.c<com.planner5d.library.activity.helper.l0> cVar14, ij.c<com.planner5d.library.model.manager.contest.g> cVar15, ij.c<com.planner5d.library.activity.fragment.x> cVar16, ij.c<com.planner5d.library.modules.user.user.t0> cVar17, ij.c<com.planner5d.library.widget.rate.g> cVar18, ij.c<com.planner5d.library.model.manager.unlockeditems.b> cVar19, ij.c<com.planner5d.library.widget.editor.controls.a> cVar20, ij.c<com.planner5d.library.widget.editor.facade.c0> cVar21, ij.c<w1> cVar22, ij.c<com.planner5d.library.model.manager.t1> cVar23, ij.c<com.planner5d.library.activity.fragment.smartwizard.a> cVar24, ij.c<sd.e> cVar25, ij.c<com.planner5d.library.widget.editor.facade.s> cVar26, ij.c<r1> cVar27, ij.c<k2.a> cVar28, ij.c<com.planner5d.library.services.utility.p0> cVar29, ij.c<com.planner5d.library.model.manager.performancetracing.e> cVar30, ij.c<com.planner5d.library.model.manager.statistics.events.l3> cVar31, ij.c<com.planner5d.library.services.utility.w> cVar32, ij.c<u2> cVar33, ij.c<n2.a> cVar34, ij.c<com.planner5d.library.model.manager.config.j> cVar35, ij.c<com.planner5d.library.model.converter.json.from.x> cVar36, ij.c<com.planner5d.library.model.converter.json.from.z> cVar37) {
        return new w2(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15, cVar16, cVar17, cVar18, cVar19, cVar20, cVar21, cVar22, cVar23, cVar24, cVar25, cVar26, cVar27, cVar28, cVar29, cVar30, cVar31, cVar32, cVar33, cVar34, cVar35, cVar36, cVar37);
    }

    public static g1 c(com.planner5d.library.model.manager.project.d0 d0Var, com.planner5d.library.model.manager.project.m0 m0Var, com.planner5d.library.model.manager.y1 y1Var, com.planner5d.library.model.manager.synchronization.i iVar, ItemBuilder itemBuilder, com.planner5d.library.modules.user.user.t tVar, com.planner5d.library.activity.fragment.dialog.k kVar, com.planner5d.library.model.manager.builtin.i iVar2, com.planner5d.library.widget.editor.popup.e eVar, com.planner5d.library.application.d dVar, com.planner5d.library.model.manager.b2 b2Var, n3 n3Var, com.planner5d.library.widget.editor.menu.j jVar, com.planner5d.library.activity.helper.l0 l0Var, com.planner5d.library.model.manager.contest.g gVar, com.planner5d.library.activity.fragment.x xVar, com.planner5d.library.modules.user.user.t0 t0Var, com.planner5d.library.widget.rate.g gVar2, com.planner5d.library.model.manager.unlockeditems.b bVar, com.planner5d.library.widget.editor.controls.a aVar, com.planner5d.library.widget.editor.facade.c0 c0Var, w1 w1Var, com.planner5d.library.model.manager.t1 t1Var, com.planner5d.library.activity.fragment.smartwizard.a aVar2, sd.e eVar2, com.planner5d.library.widget.editor.facade.s sVar, r1 r1Var, k2.a aVar3, com.planner5d.library.services.utility.p0 p0Var, com.planner5d.library.model.manager.performancetracing.e eVar3, com.planner5d.library.model.manager.statistics.events.l3 l3Var, com.planner5d.library.services.utility.w wVar, u2 u2Var, n2.a aVar4, com.planner5d.library.model.manager.config.j jVar2, com.planner5d.library.model.converter.json.from.x xVar2, com.planner5d.library.model.converter.json.from.z zVar) {
        return new g1(d0Var, m0Var, y1Var, iVar, itemBuilder, tVar, kVar, iVar2, eVar, dVar, b2Var, n3Var, jVar, l0Var, gVar, xVar, t0Var, gVar2, bVar, aVar, c0Var, w1Var, t1Var, aVar2, eVar2, sVar, r1Var, aVar3, p0Var, eVar3, l3Var, wVar, u2Var, aVar4, jVar2, xVar2, zVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g1 get() {
        return c(this.f256828a.get(), this.f256829b.get(), this.f256830c.get(), this.f256831d.get(), this.f256832e.get(), this.f256833f.get(), this.f256834g.get(), this.f256835h.get(), this.f256836i.get(), this.f256837j.get(), this.f256838k.get(), this.f256839l.get(), this.f256840m.get(), this.f256841n.get(), this.f256842o.get(), this.f256843p.get(), this.f256844q.get(), this.f256845r.get(), this.f256846s.get(), this.f256847t.get(), this.f256848u.get(), this.f256849v.get(), this.f256850w.get(), this.f256851x.get(), this.f256852y.get(), this.f256853z.get(), this.A.get(), this.B.get(), this.C.get(), this.D.get(), this.E.get(), this.F.get(), this.G.get(), this.H.get(), this.I.get(), this.J.get(), this.K.get());
    }
}
