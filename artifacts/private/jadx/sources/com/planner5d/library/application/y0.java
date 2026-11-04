package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class y0 implements dagger.internal.h<com.planner5d.library.services.y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f148328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.n> f148329b;

    public y0(i iVar, ij.c<com.planner5d.library.model.manager.n> cVar) {
        this.f148328a = iVar;
        this.f148329b = cVar;
    }

    public static y0 a(i iVar, ij.c<com.planner5d.library.model.manager.n> cVar) {
        return new y0(iVar, cVar);
    }

    public static com.planner5d.library.services.y c(i iVar, com.planner5d.library.model.manager.n nVar) {
        return (com.planner5d.library.services.y) dagger.internal.p.f(iVar.T(nVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.services.y get() {
        return c(this.f148328a, this.f148329b.get());
    }
}
