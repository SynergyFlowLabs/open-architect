package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class r3 implements dagger.internal.h<ed.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q3 f148253a;

    public r3(q3 q3Var) {
        this.f148253a = q3Var;
    }

    public static r3 a(q3 q3Var) {
        return new r3(q3Var);
    }

    public static ed.a c(q3 q3Var) {
        return (ed.a) dagger.internal.p.f(q3Var.a());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ed.a get() {
        return c(this.f148253a);
    }
}
