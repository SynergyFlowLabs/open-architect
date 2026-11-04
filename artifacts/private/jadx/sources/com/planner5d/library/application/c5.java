package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class c5 implements dagger.internal.h<com.planner5d.library.services.i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a5 f142482a;

    public c5(a5 a5Var) {
        this.f142482a = a5Var;
    }

    public static c5 a(a5 a5Var) {
        return new c5(a5Var);
    }

    public static com.planner5d.library.services.i c(a5 a5Var) {
        return (com.planner5d.library.services.i) dagger.internal.p.f(a5Var.c());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.services.i get() {
        return c(this.f142482a);
    }
}
