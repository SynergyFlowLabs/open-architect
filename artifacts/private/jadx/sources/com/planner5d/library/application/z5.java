package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class z5 implements dagger.internal.h<com.planner5d.library.widget.drawable.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w5 f148346a;

    public z5(w5 w5Var) {
        this.f148346a = w5Var;
    }

    public static z5 a(w5 w5Var) {
        return new z5(w5Var);
    }

    public static com.planner5d.library.widget.drawable.d c(w5 w5Var) {
        return (com.planner5d.library.widget.drawable.d) dagger.internal.p.f(w5Var.b());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.widget.drawable.d get() {
        return c(this.f148346a);
    }
}
