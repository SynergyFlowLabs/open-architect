package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class w4 implements dagger.internal.h<ce.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u4 f148310a;

    public w4(u4 u4Var) {
        this.f148310a = u4Var;
    }

    public static w4 a(u4 u4Var) {
        return new w4(u4Var);
    }

    public static ce.b c(u4 u4Var) {
        return (ce.b) dagger.internal.p.f(u4Var.b());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ce.b get() {
        return c(this.f148310a);
    }
}
