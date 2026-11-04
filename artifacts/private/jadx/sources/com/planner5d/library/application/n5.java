package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class n5 implements dagger.internal.h<com.planner5d.library.widget.s1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m5 f142867a;

    public n5(m5 m5Var) {
        this.f142867a = m5Var;
    }

    public static n5 a(m5 m5Var) {
        return new n5(m5Var);
    }

    public static com.planner5d.library.widget.s1 c(m5 m5Var) {
        return (com.planner5d.library.widget.s1) dagger.internal.p.f(m5Var.a());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.widget.s1 get() {
        return c(this.f142867a);
    }
}
