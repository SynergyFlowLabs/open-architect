package com.planner5d.library.model.manager.builtin;

import com.planner5d.library.model.manager.t1;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class q0 implements dagger.internal.h<p0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<i> f181194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.converter.json.from.a> f181195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.converter.json.from.c0> f181196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.converter.json.from.f> f181197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<t1> f181198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.p0> f181199f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<u> f181200g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.converter.json.from.c> f181201h;

    public q0(ij.c<i> cVar, ij.c<com.planner5d.library.model.converter.json.from.a> cVar2, ij.c<com.planner5d.library.model.converter.json.from.c0> cVar3, ij.c<com.planner5d.library.model.converter.json.from.f> cVar4, ij.c<t1> cVar5, ij.c<com.planner5d.library.services.utility.p0> cVar6, ij.c<u> cVar7, ij.c<com.planner5d.library.model.converter.json.from.c> cVar8) {
        this.f181194a = cVar;
        this.f181195b = cVar2;
        this.f181196c = cVar3;
        this.f181197d = cVar4;
        this.f181198e = cVar5;
        this.f181199f = cVar6;
        this.f181200g = cVar7;
        this.f181201h = cVar8;
    }

    public static q0 a(ij.c<i> cVar, ij.c<com.planner5d.library.model.converter.json.from.a> cVar2, ij.c<com.planner5d.library.model.converter.json.from.c0> cVar3, ij.c<com.planner5d.library.model.converter.json.from.f> cVar4, ij.c<t1> cVar5, ij.c<com.planner5d.library.services.utility.p0> cVar6, ij.c<u> cVar7, ij.c<com.planner5d.library.model.converter.json.from.c> cVar8) {
        return new q0(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8);
    }

    public static p0 c() {
        return new p0();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p0 get() {
        p0 p0VarC = c();
        r0.b(p0VarC, dagger.internal.g.a(this.f181194a));
        r0.j(p0VarC, this.f181195b);
        r0.e(p0VarC, dagger.internal.g.a(this.f181196c));
        r0.d(p0VarC, dagger.internal.g.a(this.f181197d));
        r0.h(p0VarC, dagger.internal.g.a(this.f181198e));
        r0.f(p0VarC, this.f181199f.get());
        r0.g(p0VarC, this.f181200g.get());
        r0.c(p0VarC, this.f181201h.get());
        return p0VarC;
    }
}
