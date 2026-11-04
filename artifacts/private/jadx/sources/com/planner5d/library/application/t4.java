package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class t4 implements dagger.internal.h<com.planner5d.library.model.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q4 f148277a;

    public t4(q4 q4Var) {
        this.f148277a = q4Var;
    }

    public static t4 a(q4 q4Var) {
        return new t4(q4Var);
    }

    public static com.planner5d.library.model.a c(q4 q4Var) {
        return (com.planner5d.library.model.a) dagger.internal.p.f(q4Var.c());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.a get() {
        return c(this.f148277a);
    }
}
