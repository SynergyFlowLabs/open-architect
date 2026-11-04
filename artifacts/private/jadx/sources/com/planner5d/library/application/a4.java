package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class a4 implements dagger.internal.h<vb.f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t3 f142452a;

    public a4(t3 t3Var) {
        this.f142452a = t3Var;
    }

    public static a4 a(t3 t3Var) {
        return new a4(t3Var);
    }

    public static vb.f c(t3 t3Var) {
        return (vb.f) dagger.internal.p.f(t3Var.g());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public vb.f get() {
        return c(this.f142452a);
    }
}
