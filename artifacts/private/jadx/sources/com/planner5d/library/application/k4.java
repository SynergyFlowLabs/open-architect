package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class k4 implements dagger.internal.h<com.planner5d.library.model.manager.s4> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h4 f142596a;

    public k4(h4 h4Var) {
        this.f142596a = h4Var;
    }

    public static k4 a(h4 h4Var) {
        return new k4(h4Var);
    }

    public static com.planner5d.library.model.manager.s4 c(h4 h4Var) {
        return (com.planner5d.library.model.manager.s4) dagger.internal.p.f(h4Var.c());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.s4 get() {
        return c(this.f142596a);
    }
}
