package com.planner5d.library.activity.fragment.feed;

import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.statistics.events.j3;
import com.planner5d.library.model.manager.t1;
import com.planner5d.library.model.manager.y1;
import com.planner5d.library.services.exceptions.ErrorMessageParser;
import com.planner5d.library.services.utility.c2;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class f1 implements dagger.internal.h<e1> {
    private final ij.c<com.planner5d.library.model.manager.p> A;
    private final ij.c<com.planner5d.library.application.d> B;
    private final ij.c<com.planner5d.library.activity.fragment.n> C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f133337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.x> f133338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<y1> f133339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.contest.g> f133340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<b2> f133341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.b> f133342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<c2> f133343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<t1> f133344h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.j> f133345i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ij.c<com.planner5d.library.contest.data.f> f133346j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.synchronization.i> f133347k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.projects.c0> f133348l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ij.c<b> f133349m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.p> f133350n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ij.c<ka.d> f133351o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ij.c<j3> f133352p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.projects.g> f133353q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.projects.z0> f133354r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ij.c<ErrorMessageParser> f133355s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.projects.h> f133356t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final ij.c<le.e> f133357u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.c0> f133358v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t0> f133359w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.project.d0> f133360x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f133361y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final ij.c<com.planner5d.library.feed.usecase.a> f133362z;

    public f1(ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.activity.fragment.x> cVar2, ij.c<y1> cVar3, ij.c<com.planner5d.library.model.manager.contest.g> cVar4, ij.c<b2> cVar5, ij.c<com.planner5d.library.model.manager.b> cVar6, ij.c<c2> cVar7, ij.c<t1> cVar8, ij.c<com.planner5d.library.model.manager.config.j> cVar9, ij.c<com.planner5d.library.contest.data.f> cVar10, ij.c<com.planner5d.library.model.manager.synchronization.i> cVar11, ij.c<com.planner5d.library.activity.fragment.projects.c0> cVar12, ij.c<b> cVar13, ij.c<com.planner5d.library.model.manager.config.p> cVar14, ij.c<ka.d> cVar15, ij.c<j3> cVar16, ij.c<com.planner5d.library.activity.fragment.projects.g> cVar17, ij.c<com.planner5d.library.activity.fragment.projects.z0> cVar18, ij.c<ErrorMessageParser> cVar19, ij.c<com.planner5d.library.activity.fragment.projects.h> cVar20, ij.c<le.e> cVar21, ij.c<com.planner5d.library.model.manager.c0> cVar22, ij.c<com.planner5d.library.modules.user.user.t0> cVar23, ij.c<com.planner5d.library.model.manager.project.d0> cVar24, ij.c<com.planner5d.library.modules.user.user.t> cVar25, ij.c<com.planner5d.library.feed.usecase.a> cVar26, ij.c<com.planner5d.library.model.manager.p> cVar27, ij.c<com.planner5d.library.application.d> cVar28, ij.c<com.planner5d.library.activity.fragment.n> cVar29) {
        this.f133337a = cVar;
        this.f133338b = cVar2;
        this.f133339c = cVar3;
        this.f133340d = cVar4;
        this.f133341e = cVar5;
        this.f133342f = cVar6;
        this.f133343g = cVar7;
        this.f133344h = cVar8;
        this.f133345i = cVar9;
        this.f133346j = cVar10;
        this.f133347k = cVar11;
        this.f133348l = cVar12;
        this.f133349m = cVar13;
        this.f133350n = cVar14;
        this.f133351o = cVar15;
        this.f133352p = cVar16;
        this.f133353q = cVar17;
        this.f133354r = cVar18;
        this.f133355s = cVar19;
        this.f133356t = cVar20;
        this.f133357u = cVar21;
        this.f133358v = cVar22;
        this.f133359w = cVar23;
        this.f133360x = cVar24;
        this.f133361y = cVar25;
        this.f133362z = cVar26;
        this.A = cVar27;
        this.B = cVar28;
        this.C = cVar29;
    }

    public static f1 a(ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.activity.fragment.x> cVar2, ij.c<y1> cVar3, ij.c<com.planner5d.library.model.manager.contest.g> cVar4, ij.c<b2> cVar5, ij.c<com.planner5d.library.model.manager.b> cVar6, ij.c<c2> cVar7, ij.c<t1> cVar8, ij.c<com.planner5d.library.model.manager.config.j> cVar9, ij.c<com.planner5d.library.contest.data.f> cVar10, ij.c<com.planner5d.library.model.manager.synchronization.i> cVar11, ij.c<com.planner5d.library.activity.fragment.projects.c0> cVar12, ij.c<b> cVar13, ij.c<com.planner5d.library.model.manager.config.p> cVar14, ij.c<ka.d> cVar15, ij.c<j3> cVar16, ij.c<com.planner5d.library.activity.fragment.projects.g> cVar17, ij.c<com.planner5d.library.activity.fragment.projects.z0> cVar18, ij.c<ErrorMessageParser> cVar19, ij.c<com.planner5d.library.activity.fragment.projects.h> cVar20, ij.c<le.e> cVar21, ij.c<com.planner5d.library.model.manager.c0> cVar22, ij.c<com.planner5d.library.modules.user.user.t0> cVar23, ij.c<com.planner5d.library.model.manager.project.d0> cVar24, ij.c<com.planner5d.library.modules.user.user.t> cVar25, ij.c<com.planner5d.library.feed.usecase.a> cVar26, ij.c<com.planner5d.library.model.manager.p> cVar27, ij.c<com.planner5d.library.application.d> cVar28, ij.c<com.planner5d.library.activity.fragment.n> cVar29) {
        return new f1(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15, cVar16, cVar17, cVar18, cVar19, cVar20, cVar21, cVar22, cVar23, cVar24, cVar25, cVar26, cVar27, cVar28, cVar29);
    }

    public static e1 c(com.planner5d.library.application.b bVar, com.planner5d.library.activity.fragment.x xVar, y1 y1Var, com.planner5d.library.model.manager.contest.g gVar, b2 b2Var, com.planner5d.library.model.manager.b bVar2, c2 c2Var, t1 t1Var, com.planner5d.library.model.manager.config.j jVar, com.planner5d.library.contest.data.f fVar, com.planner5d.library.model.manager.synchronization.i iVar, com.planner5d.library.activity.fragment.projects.c0 c0Var, b bVar3, com.planner5d.library.model.manager.config.p pVar, ka.d dVar, j3 j3Var, com.planner5d.library.activity.fragment.projects.g gVar2, com.planner5d.library.activity.fragment.projects.z0 z0Var, ErrorMessageParser errorMessageParser, com.planner5d.library.activity.fragment.projects.h hVar, le.e eVar, com.planner5d.library.model.manager.c0 c0Var2, com.planner5d.library.modules.user.user.t0 t0Var, com.planner5d.library.model.manager.project.d0 d0Var, com.planner5d.library.modules.user.user.t tVar, com.planner5d.library.feed.usecase.a aVar, com.planner5d.library.model.manager.p pVar2, com.planner5d.library.application.d dVar2, com.planner5d.library.activity.fragment.n nVar) {
        return new e1(bVar, xVar, y1Var, gVar, b2Var, bVar2, c2Var, t1Var, jVar, fVar, iVar, c0Var, bVar3, pVar, dVar, j3Var, gVar2, z0Var, errorMessageParser, hVar, eVar, c0Var2, t0Var, d0Var, tVar, aVar, pVar2, dVar2, nVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e1 get() {
        return c(this.f133337a.get(), this.f133338b.get(), this.f133339c.get(), this.f133340d.get(), this.f133341e.get(), this.f133342f.get(), this.f133343g.get(), this.f133344h.get(), this.f133345i.get(), this.f133346j.get(), this.f133347k.get(), this.f133348l.get(), this.f133349m.get(), this.f133350n.get(), this.f133351o.get(), this.f133352p.get(), this.f133353q.get(), this.f133354r.get(), this.f133355s.get(), this.f133356t.get(), this.f133357u.get(), this.f133358v.get(), this.f133359w.get(), this.f133360x.get(), this.f133361y.get(), this.f133362z.get(), this.A.get(), this.B.get(), this.C.get());
    }
}
