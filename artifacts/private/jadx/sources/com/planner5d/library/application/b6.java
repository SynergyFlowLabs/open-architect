package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class b6 implements dagger.internal.h<com.planner5d.library.model.manager.config.p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w5 f142473a;

    public b6(w5 w5Var) {
        this.f142473a = w5Var;
    }

    public static b6 a(w5 w5Var) {
        return new b6(w5Var);
    }

    public static com.planner5d.library.model.manager.config.p c(w5 w5Var) {
        return (com.planner5d.library.model.manager.config.p) dagger.internal.p.f(w5Var.d());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.config.p get() {
        return c(this.f142473a);
    }
}
