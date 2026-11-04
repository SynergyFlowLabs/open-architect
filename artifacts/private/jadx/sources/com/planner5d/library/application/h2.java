package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class h2 implements dagger.internal.h<com.planner5d.library.model.manager.statistics.d0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.statistics.b0> f142556b;

    public h2(i iVar, ij.c<com.planner5d.library.model.manager.statistics.b0> cVar) {
        this.f142555a = iVar;
        this.f142556b = cVar;
    }

    public static h2 a(i iVar, ij.c<com.planner5d.library.model.manager.statistics.b0> cVar) {
        return new h2(iVar, cVar);
    }

    public static com.planner5d.library.model.manager.statistics.d0 c(i iVar, com.planner5d.library.model.manager.statistics.b0 b0Var) {
        return (com.planner5d.library.model.manager.statistics.d0) dagger.internal.p.f(iVar.E0(b0Var));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.statistics.d0 get() {
        return c(this.f142555a, this.f142556b.get());
    }
}
