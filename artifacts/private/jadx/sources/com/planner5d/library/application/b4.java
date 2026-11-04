package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class b4 implements dagger.internal.h<vb.g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t3 f142471a;

    public b4(t3 t3Var) {
        this.f142471a = t3Var;
    }

    public static b4 a(t3 t3Var) {
        return new b4(t3Var);
    }

    public static vb.g c(t3 t3Var) {
        return (vb.g) dagger.internal.p.f(t3Var.h());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public vb.g get() {
        return c(this.f142471a);
    }
}
