package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class m1 implements dagger.internal.h<com.planner5d.library.model.manager.x2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<d> f142614b;

    public m1(i iVar, ij.c<d> cVar) {
        this.f142613a = iVar;
        this.f142614b = cVar;
    }

    public static m1 a(i iVar, ij.c<d> cVar) {
        return new m1(iVar, cVar);
    }

    public static com.planner5d.library.model.manager.x2 c(i iVar, d dVar) {
        return (com.planner5d.library.model.manager.x2) dagger.internal.p.f(iVar.i0(dVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.x2 get() {
        return c(this.f142613a, this.f142614b.get());
    }
}
