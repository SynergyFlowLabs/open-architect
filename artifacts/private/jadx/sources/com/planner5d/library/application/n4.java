package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class n4 implements dagger.internal.h<com.planner5d.library.services.t> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m4 f142866a;

    public n4(m4 m4Var) {
        this.f142866a = m4Var;
    }

    public static n4 a(m4 m4Var) {
        return new n4(m4Var);
    }

    public static com.planner5d.library.services.t c(m4 m4Var) {
        return (com.planner5d.library.services.t) dagger.internal.p.f(m4Var.a());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.services.t get() {
        return c(this.f142866a);
    }
}
