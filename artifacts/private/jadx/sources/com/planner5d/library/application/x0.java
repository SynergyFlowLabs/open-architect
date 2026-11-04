package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class x0 implements dagger.internal.h<com.planner5d.library.model.manager.t2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f148314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.s2> f148315b;

    public x0(i iVar, ij.c<com.planner5d.library.model.manager.s2> cVar) {
        this.f148314a = iVar;
        this.f148315b = cVar;
    }

    public static x0 a(i iVar, ij.c<com.planner5d.library.model.manager.s2> cVar) {
        return new x0(iVar, cVar);
    }

    public static com.planner5d.library.model.manager.t2 c(i iVar, com.planner5d.library.model.manager.s2 s2Var) {
        return (com.planner5d.library.model.manager.t2) dagger.internal.p.f(iVar.S(s2Var));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.t2 get() {
        return c(this.f148314a, this.f148315b.get());
    }
}
