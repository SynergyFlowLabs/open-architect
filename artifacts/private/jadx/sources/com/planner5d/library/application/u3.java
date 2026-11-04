package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class u3 implements dagger.internal.h<com.planner5d.library.engine.h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t3 f148288a;

    public u3(t3 t3Var) {
        this.f148288a = t3Var;
    }

    public static u3 a(t3 t3Var) {
        return new u3(t3Var);
    }

    public static com.planner5d.library.engine.h c(t3 t3Var) {
        return (com.planner5d.library.engine.h) dagger.internal.p.f(t3Var.a());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.engine.h get() {
        return c(this.f148288a);
    }
}
