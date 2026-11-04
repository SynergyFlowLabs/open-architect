package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class b5 implements dagger.internal.h<com.planner5d.library.model.manager.push.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a5 f142472a;

    public b5(a5 a5Var) {
        this.f142472a = a5Var;
    }

    public static b5 a(a5 a5Var) {
        return new b5(a5Var);
    }

    public static com.planner5d.library.model.manager.push.b c(a5 a5Var) {
        return (com.planner5d.library.model.manager.push.b) dagger.internal.p.f(a5Var.b());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.push.b get() {
        return c(this.f142472a);
    }
}
