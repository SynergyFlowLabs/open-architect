package com.planner5d.library.services.utility;

/* JADX INFO: loaded from: classes10.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class b1 implements dagger.internal.h<p0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<w1> f225058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<p0.a> f225059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.u1> f225060c;

    public b1(ij.c<w1> cVar, ij.c<p0.a> cVar2, ij.c<com.planner5d.library.model.manager.u1> cVar3) {
        this.f225058a = cVar;
        this.f225059b = cVar2;
        this.f225060c = cVar3;
    }

    public static b1 a(ij.c<w1> cVar, ij.c<p0.a> cVar2, ij.c<com.planner5d.library.model.manager.u1> cVar3) {
        return new b1(cVar, cVar2, cVar3);
    }

    public static p0 c() {
        return new p0();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p0 get() {
        p0 p0VarC = c();
        c1.b(p0VarC, this.f225058a.get());
        c1.e(p0VarC, dagger.internal.g.a(this.f225059b));
        c1.c(p0VarC, dagger.internal.g.a(this.f225060c));
        return p0VarC;
    }
}
