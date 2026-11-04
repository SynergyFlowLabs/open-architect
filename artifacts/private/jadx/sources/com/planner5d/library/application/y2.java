package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class y2 implements dagger.internal.h<oa.f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f148332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<oa.d> f148333b;

    public y2(i iVar, ij.c<oa.d> cVar) {
        this.f148332a = iVar;
        this.f148333b = cVar;
    }

    public static y2 a(i iVar, ij.c<oa.d> cVar) {
        return new y2(iVar, cVar);
    }

    public static oa.f c(i iVar, oa.d dVar) {
        return (oa.f) dagger.internal.p.f(iVar.X0(dVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public oa.f get() {
        return c(this.f148332a, this.f148333b.get());
    }
}
