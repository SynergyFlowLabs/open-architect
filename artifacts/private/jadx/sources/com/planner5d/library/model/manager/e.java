package com.planner5d.library.model.manager;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class e implements dagger.internal.h<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.i> f191293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.contest.b> f191294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<y0> f191295c;

    public e(ij.c<com.planner5d.library.model.manager.builtin.i> cVar, ij.c<com.planner5d.library.model.manager.contest.b> cVar2, ij.c<y0> cVar3) {
        this.f191293a = cVar;
        this.f191294b = cVar2;
        this.f191295c = cVar3;
    }

    public static e a(ij.c<com.planner5d.library.model.manager.builtin.i> cVar, ij.c<com.planner5d.library.model.manager.contest.b> cVar2, ij.c<y0> cVar3) {
        return new e(cVar, cVar2, cVar3);
    }

    public static d c(com.planner5d.library.model.manager.builtin.i iVar, com.planner5d.library.model.manager.contest.b bVar, y0 y0Var) {
        return new d(iVar, bVar, y0Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f191293a.get(), this.f191294b.get(), this.f191295c.get());
    }
}
