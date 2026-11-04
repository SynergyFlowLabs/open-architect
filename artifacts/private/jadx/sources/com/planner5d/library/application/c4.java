package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class c4 implements dagger.internal.h<cc.f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t3 f142481a;

    public c4(t3 t3Var) {
        this.f142481a = t3Var;
    }

    public static c4 a(t3 t3Var) {
        return new c4(t3Var);
    }

    public static cc.f c(t3 t3Var) {
        return (cc.f) dagger.internal.p.f(t3Var.i());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public cc.f get() {
        return c(this.f142481a);
    }
}
