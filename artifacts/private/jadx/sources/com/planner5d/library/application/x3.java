package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class x3 implements dagger.internal.h<cc.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t3 f148320a;

    public x3(t3 t3Var) {
        this.f148320a = t3Var;
    }

    public static x3 a(t3 t3Var) {
        return new x3(t3Var);
    }

    public static cc.b c(t3 t3Var) {
        return (cc.b) dagger.internal.p.f(t3Var.d());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public cc.b get() {
        return c(this.f148320a);
    }
}
