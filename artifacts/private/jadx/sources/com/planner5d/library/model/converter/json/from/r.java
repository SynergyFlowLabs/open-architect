package com.planner5d.library.model.converter.json.from;

import com.planner5d.library.model.manager.b2;
import com.planner5d.library.services.utility.p0;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class r implements dagger.internal.h<q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<p0> f180623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<f> f180624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<x> f180625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<a> f180626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<b2> f180627e;

    public r(ij.c<p0> cVar, ij.c<f> cVar2, ij.c<x> cVar3, ij.c<a> cVar4, ij.c<b2> cVar5) {
        this.f180623a = cVar;
        this.f180624b = cVar2;
        this.f180625c = cVar3;
        this.f180626d = cVar4;
        this.f180627e = cVar5;
    }

    public static r a(ij.c<p0> cVar, ij.c<f> cVar2, ij.c<x> cVar3, ij.c<a> cVar4, ij.c<b2> cVar5) {
        return new r(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static q c(p0 p0Var, f fVar, x xVar, ij.c<a> cVar, b2 b2Var) {
        return new q(p0Var, fVar, xVar, cVar, b2Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public q get() {
        return c(this.f180623a.get(), this.f180624b.get(), this.f180625c.get(), this.f180626d, this.f180627e.get());
    }
}
