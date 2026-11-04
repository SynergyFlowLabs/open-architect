package com.planner5d.library.model.manager.project;

import com.planner5d.library.services.utility.g3;
import com.planner5d.library.services.utility.p0;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class n0 implements dagger.internal.h<m0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<d0> f193256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<p0> f193257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<g3> f193258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<m0.a> f193259d;

    public n0(ij.c<d0> cVar, ij.c<p0> cVar2, ij.c<g3> cVar3, ij.c<m0.a> cVar4) {
        this.f193256a = cVar;
        this.f193257b = cVar2;
        this.f193258c = cVar3;
        this.f193259d = cVar4;
    }

    public static n0 a(ij.c<d0> cVar, ij.c<p0> cVar2, ij.c<g3> cVar3, ij.c<m0.a> cVar4) {
        return new n0(cVar, cVar2, cVar3, cVar4);
    }

    public static m0 c(fg.e<d0> eVar, p0 p0Var, g3 g3Var, m0.a aVar) {
        return new m0(eVar, p0Var, g3Var, aVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m0 get() {
        return c(dagger.internal.g.a(this.f193256a), this.f193257b.get(), this.f193258c.get(), this.f193259d.get());
    }
}
