package com.planner5d.library.activity.fragment.list;

import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.s4;
import com.planner5d.library.model.manager.statistics.events.l3;
import com.planner5d.library.model.manager.statistics.events.m3;
import com.planner5d.library.services.exceptions.ErrorMessageParser;
import com.planner5d.library.services.utility.f2;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class m1 implements dagger.internal.h<l1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f134395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.k> f134396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.synchronization.i> f134397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.c0> f134398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f134399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<s4> f134400f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.j> f134401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.contest.g> f134402h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<b2> f134403i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.x> f134404j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.d> f134405k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ij.c<f2> f134406l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ij.c<ErrorMessageParser> f134407m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ij.c<l3> f134408n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.spaces.documents.c> f134409o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ij.c<m3> f134410p;

    public m1(ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar2, ij.c<com.planner5d.library.model.manager.synchronization.i> cVar3, ij.c<com.planner5d.library.model.manager.c0> cVar4, ij.c<com.planner5d.library.modules.user.user.t> cVar5, ij.c<s4> cVar6, ij.c<com.planner5d.library.model.manager.config.j> cVar7, ij.c<com.planner5d.library.model.manager.contest.g> cVar8, ij.c<b2> cVar9, ij.c<com.planner5d.library.activity.fragment.x> cVar10, ij.c<com.planner5d.library.application.d> cVar11, ij.c<f2> cVar12, ij.c<ErrorMessageParser> cVar13, ij.c<l3> cVar14, ij.c<com.planner5d.library.model.manager.spaces.documents.c> cVar15, ij.c<m3> cVar16) {
        this.f134395a = cVar;
        this.f134396b = cVar2;
        this.f134397c = cVar3;
        this.f134398d = cVar4;
        this.f134399e = cVar5;
        this.f134400f = cVar6;
        this.f134401g = cVar7;
        this.f134402h = cVar8;
        this.f134403i = cVar9;
        this.f134404j = cVar10;
        this.f134405k = cVar11;
        this.f134406l = cVar12;
        this.f134407m = cVar13;
        this.f134408n = cVar14;
        this.f134409o = cVar15;
        this.f134410p = cVar16;
    }

    public static m1 a(ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar2, ij.c<com.planner5d.library.model.manager.synchronization.i> cVar3, ij.c<com.planner5d.library.model.manager.c0> cVar4, ij.c<com.planner5d.library.modules.user.user.t> cVar5, ij.c<s4> cVar6, ij.c<com.planner5d.library.model.manager.config.j> cVar7, ij.c<com.planner5d.library.model.manager.contest.g> cVar8, ij.c<b2> cVar9, ij.c<com.planner5d.library.activity.fragment.x> cVar10, ij.c<com.planner5d.library.application.d> cVar11, ij.c<f2> cVar12, ij.c<ErrorMessageParser> cVar13, ij.c<l3> cVar14, ij.c<com.planner5d.library.model.manager.spaces.documents.c> cVar15, ij.c<m3> cVar16) {
        return new m1(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15, cVar16);
    }

    public static l1 c(com.planner5d.library.application.b bVar, com.planner5d.library.activity.fragment.dialog.k kVar, com.planner5d.library.model.manager.synchronization.i iVar, com.planner5d.library.model.manager.c0 c0Var, com.planner5d.library.modules.user.user.t tVar, s4 s4Var, com.planner5d.library.model.manager.config.j jVar, com.planner5d.library.model.manager.contest.g gVar, b2 b2Var, com.planner5d.library.activity.fragment.x xVar, com.planner5d.library.application.d dVar, f2 f2Var, ErrorMessageParser errorMessageParser, l3 l3Var, com.planner5d.library.model.manager.spaces.documents.c cVar, m3 m3Var) {
        return new l1(bVar, kVar, iVar, c0Var, tVar, s4Var, jVar, gVar, b2Var, xVar, dVar, f2Var, errorMessageParser, l3Var, cVar, m3Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l1 get() {
        return c(this.f134395a.get(), this.f134396b.get(), this.f134397c.get(), this.f134398d.get(), this.f134399e.get(), this.f134400f.get(), this.f134401g.get(), this.f134402h.get(), this.f134403i.get(), this.f134404j.get(), this.f134405k.get(), this.f134406l.get(), this.f134407m.get(), this.f134408n.get(), this.f134409o.get(), this.f134410p.get());
    }
}
