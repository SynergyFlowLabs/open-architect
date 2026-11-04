package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class p2 implements dagger.internal.h<com.planner5d.library.model.manager.n5> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.unlockeditems.d> f142896b;

    public p2(i iVar, ij.c<com.planner5d.library.model.manager.unlockeditems.d> cVar) {
        this.f142895a = iVar;
        this.f142896b = cVar;
    }

    public static p2 a(i iVar, ij.c<com.planner5d.library.model.manager.unlockeditems.d> cVar) {
        return new p2(iVar, cVar);
    }

    public static com.planner5d.library.model.manager.n5 c(i iVar, com.planner5d.library.model.manager.unlockeditems.d dVar) {
        return (com.planner5d.library.model.manager.n5) dagger.internal.p.f(iVar.O0(dVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.n5 get() {
        return c(this.f142895a, this.f142896b.get());
    }
}
