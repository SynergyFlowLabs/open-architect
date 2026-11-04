package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class o0 implements dagger.internal.h<com.planner5d.library.model.manager.c2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.b2> f142871b;

    public o0(i iVar, ij.c<com.planner5d.library.model.manager.b2> cVar) {
        this.f142870a = iVar;
        this.f142871b = cVar;
    }

    public static o0 a(i iVar, ij.c<com.planner5d.library.model.manager.b2> cVar) {
        return new o0(iVar, cVar);
    }

    public static com.planner5d.library.model.manager.c2 c(i iVar, com.planner5d.library.model.manager.b2 b2Var) {
        return (com.planner5d.library.model.manager.c2) dagger.internal.p.f(iVar.J(b2Var));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.c2 get() {
        return c(this.f142870a, this.f142871b.get());
    }
}
