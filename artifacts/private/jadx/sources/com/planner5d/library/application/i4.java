package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class i4 implements dagger.internal.h<com.planner5d.library.services.p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h4 f142574a;

    public i4(h4 h4Var) {
        this.f142574a = h4Var;
    }

    public static i4 a(h4 h4Var) {
        return new i4(h4Var);
    }

    public static com.planner5d.library.services.p c(h4 h4Var) {
        return (com.planner5d.library.services.p) dagger.internal.p.f(h4Var.a());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.services.p get() {
        return c(this.f142574a);
    }
}
