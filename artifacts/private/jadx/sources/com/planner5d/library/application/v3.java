package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class v3 implements dagger.internal.h<com.planner5d.library.engine.i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t3 f148299a;

    public v3(t3 t3Var) {
        this.f148299a = t3Var;
    }

    public static v3 a(t3 t3Var) {
        return new v3(t3Var);
    }

    public static com.planner5d.library.engine.i c(t3 t3Var) {
        return (com.planner5d.library.engine.i) dagger.internal.p.f(t3Var.b());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.engine.i get() {
        return c(this.f148299a);
    }
}
