package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class l1 implements dagger.internal.h<com.planner5d.library.model.manager.statistics.k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.statistics.b0> f142601b;

    public l1(i iVar, ij.c<com.planner5d.library.model.manager.statistics.b0> cVar) {
        this.f142600a = iVar;
        this.f142601b = cVar;
    }

    public static l1 a(i iVar, ij.c<com.planner5d.library.model.manager.statistics.b0> cVar) {
        return new l1(iVar, cVar);
    }

    public static com.planner5d.library.model.manager.statistics.k c(i iVar, com.planner5d.library.model.manager.statistics.b0 b0Var) {
        return (com.planner5d.library.model.manager.statistics.k) dagger.internal.p.f(iVar.h0(b0Var));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.statistics.k get() {
        return c(this.f142600a, this.f142601b.get());
    }
}
