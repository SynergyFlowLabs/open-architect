package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class y3 implements dagger.internal.h<ec.e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t3 f148334a;

    public y3(t3 t3Var) {
        this.f148334a = t3Var;
    }

    public static y3 a(t3 t3Var) {
        return new y3(t3Var);
    }

    public static ec.e c(t3 t3Var) {
        return (ec.e) dagger.internal.p.f(t3Var.e());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ec.e get() {
        return c(this.f148334a);
    }
}
