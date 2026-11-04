package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class y4 implements dagger.internal.h<com.planner5d.library.services.o0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x4 f148335a;

    public y4(x4 x4Var) {
        this.f148335a = x4Var;
    }

    public static y4 a(x4 x4Var) {
        return new y4(x4Var);
    }

    public static com.planner5d.library.services.o0 c(x4 x4Var) {
        return (com.planner5d.library.services.o0) dagger.internal.p.f(x4Var.a());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.services.o0 get() {
        return c(this.f148335a);
    }
}
