package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class v4 implements dagger.internal.h<ce.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u4 f148300a;

    public v4(u4 u4Var) {
        this.f148300a = u4Var;
    }

    public static v4 a(u4 u4Var) {
        return new v4(u4Var);
    }

    public static ce.a c(u4 u4Var) {
        return (ce.a) dagger.internal.p.f(u4Var.a());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ce.a get() {
        return c(this.f148300a);
    }
}
