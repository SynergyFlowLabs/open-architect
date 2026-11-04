package com.planner5d.library.model.manager;

import com.planner5d.library.services.exceptions.ErrorMessageParser;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class g4 implements dagger.internal.h<b4> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<c0> f191464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<y0> f191465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.project.d0> f191466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.p0> f191467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.converter.json.to.o> f191468e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.synchronization.i> f191469f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.helper.b0> f191470g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f191471h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.d> f191472i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f191473j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ij.c<b2> f191474k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ij.c<com.planner5d.library.api.requests.c> f191475l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ij.c<ErrorMessageParser> f191476m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.x> f191477n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.j> f191478o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ij.c<d4> f191479p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.c2> f191480q;

    public g4(ij.c<c0> cVar, ij.c<y0> cVar2, ij.c<com.planner5d.library.model.manager.project.d0> cVar3, ij.c<com.planner5d.library.services.utility.p0> cVar4, ij.c<com.planner5d.library.model.converter.json.to.o> cVar5, ij.c<com.planner5d.library.model.manager.synchronization.i> cVar6, ij.c<com.planner5d.library.activity.helper.b0> cVar7, ij.c<com.planner5d.library.application.b> cVar8, ij.c<com.planner5d.library.application.d> cVar9, ij.c<com.planner5d.library.modules.user.user.t> cVar10, ij.c<b2> cVar11, ij.c<com.planner5d.library.api.requests.c> cVar12, ij.c<ErrorMessageParser> cVar13, ij.c<com.planner5d.library.activity.fragment.x> cVar14, ij.c<com.planner5d.library.model.manager.config.j> cVar15, ij.c<d4> cVar16, ij.c<com.planner5d.library.services.utility.c2> cVar17) {
        this.f191464a = cVar;
        this.f191465b = cVar2;
        this.f191466c = cVar3;
        this.f191467d = cVar4;
        this.f191468e = cVar5;
        this.f191469f = cVar6;
        this.f191470g = cVar7;
        this.f191471h = cVar8;
        this.f191472i = cVar9;
        this.f191473j = cVar10;
        this.f191474k = cVar11;
        this.f191475l = cVar12;
        this.f191476m = cVar13;
        this.f191477n = cVar14;
        this.f191478o = cVar15;
        this.f191479p = cVar16;
        this.f191480q = cVar17;
    }

    public static g4 a(ij.c<c0> cVar, ij.c<y0> cVar2, ij.c<com.planner5d.library.model.manager.project.d0> cVar3, ij.c<com.planner5d.library.services.utility.p0> cVar4, ij.c<com.planner5d.library.model.converter.json.to.o> cVar5, ij.c<com.planner5d.library.model.manager.synchronization.i> cVar6, ij.c<com.planner5d.library.activity.helper.b0> cVar7, ij.c<com.planner5d.library.application.b> cVar8, ij.c<com.planner5d.library.application.d> cVar9, ij.c<com.planner5d.library.modules.user.user.t> cVar10, ij.c<b2> cVar11, ij.c<com.planner5d.library.api.requests.c> cVar12, ij.c<ErrorMessageParser> cVar13, ij.c<com.planner5d.library.activity.fragment.x> cVar14, ij.c<com.planner5d.library.model.manager.config.j> cVar15, ij.c<d4> cVar16, ij.c<com.planner5d.library.services.utility.c2> cVar17) {
        return new g4(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15, cVar16, cVar17);
    }

    public static b4 c(c0 c0Var, y0 y0Var, fg.e<com.planner5d.library.model.manager.project.d0> eVar, com.planner5d.library.services.utility.p0 p0Var, com.planner5d.library.model.converter.json.to.o oVar, fg.e<com.planner5d.library.model.manager.synchronization.i> eVar2, fg.e<com.planner5d.library.activity.helper.b0> eVar3, com.planner5d.library.application.b bVar, com.planner5d.library.application.d dVar, fg.e<com.planner5d.library.modules.user.user.t> eVar4, fg.e<b2> eVar5, com.planner5d.library.api.requests.c cVar, ErrorMessageParser errorMessageParser, com.planner5d.library.activity.fragment.x xVar, fg.e<com.planner5d.library.model.manager.config.j> eVar6, fg.e<d4> eVar7, com.planner5d.library.services.utility.c2 c2Var) {
        return new b4(c0Var, y0Var, eVar, p0Var, oVar, eVar2, eVar3, bVar, dVar, eVar4, eVar5, cVar, errorMessageParser, xVar, eVar6, eVar7, c2Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b4 get() {
        return c(this.f191464a.get(), this.f191465b.get(), dagger.internal.g.a(this.f191466c), this.f191467d.get(), this.f191468e.get(), dagger.internal.g.a(this.f191469f), dagger.internal.g.a(this.f191470g), this.f191471h.get(), this.f191472i.get(), dagger.internal.g.a(this.f191473j), dagger.internal.g.a(this.f191474k), this.f191475l.get(), this.f191476m.get(), this.f191477n.get(), dagger.internal.g.a(this.f191478o), dagger.internal.g.a(this.f191479p), this.f191480q.get());
    }
}
