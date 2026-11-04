package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class a6 implements dagger.internal.h<com.planner5d.library.services.utility.z0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w5 f142454a;

    public a6(w5 w5Var) {
        this.f142454a = w5Var;
    }

    public static a6 a(w5 w5Var) {
        return new a6(w5Var);
    }

    public static com.planner5d.library.services.utility.z0 c(w5 w5Var) {
        return (com.planner5d.library.services.utility.z0) dagger.internal.p.f(w5Var.c());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.services.utility.z0 get() {
        return c(this.f142454a);
    }
}
