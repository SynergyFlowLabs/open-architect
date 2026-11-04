package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class w2 implements dagger.internal.h<com.planner5d.library.modules.user.user.u0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f148307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t0> f148308b;

    public w2(i iVar, ij.c<com.planner5d.library.modules.user.user.t0> cVar) {
        this.f148307a = iVar;
        this.f148308b = cVar;
    }

    public static w2 a(i iVar, ij.c<com.planner5d.library.modules.user.user.t0> cVar) {
        return new w2(iVar, cVar);
    }

    public static com.planner5d.library.modules.user.user.u0 c(i iVar, com.planner5d.library.modules.user.user.t0 t0Var) {
        return (com.planner5d.library.modules.user.user.u0) dagger.internal.p.f(iVar.V0(t0Var));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.modules.user.user.u0 get() {
        return c(this.f148307a, this.f148308b.get());
    }
}
