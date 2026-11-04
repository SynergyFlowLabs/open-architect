package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class i1 implements dagger.internal.h<com.planner5d.library.model.manager.v2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<d> f142570b;

    public i1(i iVar, ij.c<d> cVar) {
        this.f142569a = iVar;
        this.f142570b = cVar;
    }

    public static i1 a(i iVar, ij.c<d> cVar) {
        return new i1(iVar, cVar);
    }

    public static com.planner5d.library.model.manager.v2 c(i iVar, d dVar) {
        return (com.planner5d.library.model.manager.v2) dagger.internal.p.f(iVar.e0(dVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.v2 get() {
        return c(this.f142569a, this.f142570b.get());
    }
}
