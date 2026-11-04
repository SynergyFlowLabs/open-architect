package com.planner5d.library.model.manager.project;

import com.planner5d.library.model.manager.t1;
import com.planner5d.library.services.utility.p0;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class f0 implements dagger.internal.h<d0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.synchronization.i> f193172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<p0> f193173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.converter.json.to.o> f193174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.converter.json.from.q> f193175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.c0> f193176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.i> f193177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<t1> f193178g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.helper.b0> f193179h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f193180i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.l> f193181j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ij.c<c> f193182k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ij.c<m0> f193183l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.w> f193184m;

    public f0(ij.c<com.planner5d.library.model.manager.synchronization.i> cVar, ij.c<p0> cVar2, ij.c<com.planner5d.library.model.converter.json.to.o> cVar3, ij.c<com.planner5d.library.model.converter.json.from.q> cVar4, ij.c<com.planner5d.library.model.manager.c0> cVar5, ij.c<com.planner5d.library.model.manager.builtin.i> cVar6, ij.c<t1> cVar7, ij.c<com.planner5d.library.activity.helper.b0> cVar8, ij.c<com.planner5d.library.application.b> cVar9, ij.c<com.planner5d.library.model.manager.l> cVar10, ij.c<c> cVar11, ij.c<m0> cVar12, ij.c<com.planner5d.library.services.utility.w> cVar13) {
        this.f193172a = cVar;
        this.f193173b = cVar2;
        this.f193174c = cVar3;
        this.f193175d = cVar4;
        this.f193176e = cVar5;
        this.f193177f = cVar6;
        this.f193178g = cVar7;
        this.f193179h = cVar8;
        this.f193180i = cVar9;
        this.f193181j = cVar10;
        this.f193182k = cVar11;
        this.f193183l = cVar12;
        this.f193184m = cVar13;
    }

    public static f0 a(ij.c<com.planner5d.library.model.manager.synchronization.i> cVar, ij.c<p0> cVar2, ij.c<com.planner5d.library.model.converter.json.to.o> cVar3, ij.c<com.planner5d.library.model.converter.json.from.q> cVar4, ij.c<com.planner5d.library.model.manager.c0> cVar5, ij.c<com.planner5d.library.model.manager.builtin.i> cVar6, ij.c<t1> cVar7, ij.c<com.planner5d.library.activity.helper.b0> cVar8, ij.c<com.planner5d.library.application.b> cVar9, ij.c<com.planner5d.library.model.manager.l> cVar10, ij.c<c> cVar11, ij.c<m0> cVar12, ij.c<com.planner5d.library.services.utility.w> cVar13) {
        return new f0(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13);
    }

    public static d0 c(fg.e<com.planner5d.library.model.manager.synchronization.i> eVar, p0 p0Var, fg.e<com.planner5d.library.model.converter.json.to.o> eVar2, fg.e<com.planner5d.library.model.converter.json.from.q> eVar3, fg.e<com.planner5d.library.model.manager.c0> eVar4, com.planner5d.library.model.manager.builtin.i iVar, fg.e<t1> eVar5, fg.e<com.planner5d.library.activity.helper.b0> eVar6, fg.e<com.planner5d.library.application.b> eVar7, fg.e<com.planner5d.library.model.manager.l> eVar8, c cVar, fg.e<m0> eVar9, fg.e<com.planner5d.library.services.utility.w> eVar10) {
        return new d0(eVar, p0Var, eVar2, eVar3, eVar4, iVar, eVar5, eVar6, eVar7, eVar8, cVar, eVar9, eVar10);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d0 get() {
        return c(dagger.internal.g.a(this.f193172a), this.f193173b.get(), dagger.internal.g.a(this.f193174c), dagger.internal.g.a(this.f193175d), dagger.internal.g.a(this.f193176e), this.f193177f.get(), dagger.internal.g.a(this.f193178g), dagger.internal.g.a(this.f193179h), dagger.internal.g.a(this.f193180i), dagger.internal.g.a(this.f193181j), this.f193182k.get(), dagger.internal.g.a(this.f193183l), dagger.internal.g.a(this.f193184m));
    }
}
