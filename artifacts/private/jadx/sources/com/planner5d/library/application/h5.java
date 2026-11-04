package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class h5 implements dagger.internal.h<com.planner5d.library.model.manager.payments.a0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g5 f142559a;

    public h5(g5 g5Var) {
        this.f142559a = g5Var;
    }

    public static h5 a(g5 g5Var) {
        return new h5(g5Var);
    }

    public static com.planner5d.library.model.manager.payments.a0 c(g5 g5Var) {
        return (com.planner5d.library.model.manager.payments.a0) dagger.internal.p.f(g5Var.a());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.payments.a0 get() {
        return c(this.f142559a);
    }
}
