package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class c6 implements dagger.internal.h<s5> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w5 f142483a;

    public c6(w5 w5Var) {
        this.f142483a = w5Var;
    }

    public static c6 a(w5 w5Var) {
        return new c6(w5Var);
    }

    public static s5 c(w5 w5Var) {
        return (s5) dagger.internal.p.f(w5Var.e());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public s5 get() {
        return c(this.f142483a);
    }
}
