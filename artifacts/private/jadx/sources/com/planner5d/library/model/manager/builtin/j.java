package com.planner5d.library.model.manager.builtin;

import com.planner5d.library.model.item.builder.ItemBuilder;
import com.planner5d.library.model.manager.n1;
import com.planner5d.library.model.manager.t1;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class j implements dagger.internal.h<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<n1> f181048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.p> f181049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<p0> f181050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<y> f181051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<u> f181052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<r> f181053f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f181054g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<ItemBuilder> f181055h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.converter.json.to.o> f181056i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ij.c<p> f181057j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ij.c<v0> f181058k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.managedfiles.a0> f181059l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t0> f181060m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ij.c<l0> f181061n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ij.c<t1> f181062o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ij.c<g0> f181063p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.z> f181064q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ij.c<le.f> f181065r;

    public j(ij.c<n1> cVar, ij.c<com.planner5d.library.model.manager.config.p> cVar2, ij.c<p0> cVar3, ij.c<y> cVar4, ij.c<u> cVar5, ij.c<r> cVar6, ij.c<com.planner5d.library.application.b> cVar7, ij.c<ItemBuilder> cVar8, ij.c<com.planner5d.library.model.converter.json.to.o> cVar9, ij.c<p> cVar10, ij.c<v0> cVar11, ij.c<com.planner5d.library.model.manager.managedfiles.a0> cVar12, ij.c<com.planner5d.library.modules.user.user.t0> cVar13, ij.c<l0> cVar14, ij.c<t1> cVar15, ij.c<g0> cVar16, ij.c<com.planner5d.library.services.z> cVar17, ij.c<le.f> cVar18) {
        this.f181048a = cVar;
        this.f181049b = cVar2;
        this.f181050c = cVar3;
        this.f181051d = cVar4;
        this.f181052e = cVar5;
        this.f181053f = cVar6;
        this.f181054g = cVar7;
        this.f181055h = cVar8;
        this.f181056i = cVar9;
        this.f181057j = cVar10;
        this.f181058k = cVar11;
        this.f181059l = cVar12;
        this.f181060m = cVar13;
        this.f181061n = cVar14;
        this.f181062o = cVar15;
        this.f181063p = cVar16;
        this.f181064q = cVar17;
        this.f181065r = cVar18;
    }

    public static j a(ij.c<n1> cVar, ij.c<com.planner5d.library.model.manager.config.p> cVar2, ij.c<p0> cVar3, ij.c<y> cVar4, ij.c<u> cVar5, ij.c<r> cVar6, ij.c<com.planner5d.library.application.b> cVar7, ij.c<ItemBuilder> cVar8, ij.c<com.planner5d.library.model.converter.json.to.o> cVar9, ij.c<p> cVar10, ij.c<v0> cVar11, ij.c<com.planner5d.library.model.manager.managedfiles.a0> cVar12, ij.c<com.planner5d.library.modules.user.user.t0> cVar13, ij.c<l0> cVar14, ij.c<t1> cVar15, ij.c<g0> cVar16, ij.c<com.planner5d.library.services.z> cVar17, ij.c<le.f> cVar18) {
        return new j(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15, cVar16, cVar17, cVar18);
    }

    public static i c() {
        return new i();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        i iVarC = c();
        k.n(iVarC, this.f181048a.get());
        k.r(iVarC, this.f181049b.get());
        k.j(iVarC, this.f181050c.get());
        k.g(iVarC, this.f181051d.get());
        k.f(iVarC, this.f181052e.get());
        k.e(iVarC, this.f181053f.get());
        k.b(iVarC, this.f181054g.get());
        k.m(iVarC, dagger.internal.g.a(this.f181055h));
        k.c(iVarC, dagger.internal.g.a(this.f181056i));
        k.d(iVarC, dagger.internal.g.a(this.f181057j));
        k.k(iVarC, dagger.internal.g.a(this.f181058k));
        k.p(iVarC, dagger.internal.g.a(this.f181059l));
        k.t(iVarC, dagger.internal.g.a(this.f181060m));
        k.i(iVarC, dagger.internal.g.a(this.f181061n));
        k.o(iVarC, dagger.internal.g.a(this.f181062o));
        k.h(iVarC, this.f181063p.get());
        k.s(iVarC, this.f181064q.get());
        k.l(iVarC, this.f181065r.get());
        return iVarC;
    }
}
