package com.planner5d.planner5d;

/* JADX INFO: loaded from: classes13.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class x0 implements dagger.internal.h<com.planner5d.library.widget.drawable.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u0 f264825a;

    public x0(u0 u0Var) {
        this.f264825a = u0Var;
    }

    public static x0 a(u0 u0Var) {
        return new x0(u0Var);
    }

    public static com.planner5d.library.widget.drawable.d c(u0 u0Var) {
        return (com.planner5d.library.widget.drawable.d) dagger.internal.p.f(u0Var.c());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.widget.drawable.d get() {
        return c(this.f264825a);
    }
}
