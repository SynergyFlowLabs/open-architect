package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class i5 implements dagger.internal.h<com.planner5d.library.model.manager.payments.b0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g5 f142575a;

    public i5(g5 g5Var) {
        this.f142575a = g5Var;
    }

    public static i5 a(g5 g5Var) {
        return new i5(g5Var);
    }

    public static com.planner5d.library.model.manager.payments.b0 c(g5 g5Var) {
        return (com.planner5d.library.model.manager.payments.b0) dagger.internal.p.f(g5Var.b());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.payments.b0 get() {
        return c(this.f142575a);
    }
}
