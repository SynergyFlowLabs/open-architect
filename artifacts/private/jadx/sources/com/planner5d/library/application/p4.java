package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class p4 implements dagger.internal.h<ad.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o4 f142897a;

    public p4(o4 o4Var) {
        this.f142897a = o4Var;
    }

    public static p4 a(o4 o4Var) {
        return new p4(o4Var);
    }

    public static ad.b c(o4 o4Var) {
        return (ad.b) dagger.internal.p.f(o4Var.a());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ad.b get() {
        return c(this.f142897a);
    }
}
