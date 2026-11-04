package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class e4 implements dagger.internal.h<com.planner5d.library.engine.p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t3 f142530a;

    public e4(t3 t3Var) {
        this.f142530a = t3Var;
    }

    public static e4 a(t3 t3Var) {
        return new e4(t3Var);
    }

    public static com.planner5d.library.engine.p c(t3 t3Var) {
        return (com.planner5d.library.engine.p) dagger.internal.p.f(t3Var.k());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.engine.p get() {
        return c(this.f142530a);
    }
}
