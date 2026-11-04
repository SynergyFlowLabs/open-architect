package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class d4 implements dagger.internal.h<ac.f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t3 f142496a;

    public d4(t3 t3Var) {
        this.f142496a = t3Var;
    }

    public static d4 a(t3 t3Var) {
        return new d4(t3Var);
    }

    public static ac.f c(t3 t3Var) {
        return (ac.f) dagger.internal.p.f(t3Var.j());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ac.f get() {
        return c(this.f142496a);
    }
}
