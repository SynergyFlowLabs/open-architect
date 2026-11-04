package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class w3 implements dagger.internal.h<dc.d<cc.a>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t3 f148309a;

    public w3(t3 t3Var) {
        this.f148309a = t3Var;
    }

    public static w3 a(t3 t3Var) {
        return new w3(t3Var);
    }

    public static dc.d<cc.a> c(t3 t3Var) {
        return (dc.d) dagger.internal.p.f(t3Var.c());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public dc.d<cc.a> get() {
        return c(this.f148309a);
    }
}
