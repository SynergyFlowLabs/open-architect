package com.planner5d.library.model.manager.initialization;

import com.planner5d.library.model.manager.t1;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class s implements dagger.internal.h<r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<x> f191703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<b0> f191704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<v> f191705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<z.a> f191706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<t> f191707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<r.a> f191708f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<t1> f191709g;

    public s(ij.c<x> cVar, ij.c<b0> cVar2, ij.c<v> cVar3, ij.c<z.a> cVar4, ij.c<t> cVar5, ij.c<r.a> cVar6, ij.c<t1> cVar7) {
        this.f191703a = cVar;
        this.f191704b = cVar2;
        this.f191705c = cVar3;
        this.f191706d = cVar4;
        this.f191707e = cVar5;
        this.f191708f = cVar6;
        this.f191709g = cVar7;
    }

    public static s a(ij.c<x> cVar, ij.c<b0> cVar2, ij.c<v> cVar3, ij.c<z.a> cVar4, ij.c<t> cVar5, ij.c<r.a> cVar6, ij.c<t1> cVar7) {
        return new s(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7);
    }

    public static r c(x xVar, b0 b0Var, v vVar, z.a aVar, t tVar, fg.e<r.a> eVar, fg.e<t1> eVar2) {
        return new r(xVar, b0Var, vVar, aVar, tVar, eVar, eVar2);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c(this.f191703a.get(), this.f191704b.get(), this.f191705c.get(), this.f191706d.get(), this.f191707e.get(), dagger.internal.g.a(this.f191708f), dagger.internal.g.a(this.f191709g));
    }
}
