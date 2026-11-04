package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class z3 implements dagger.internal.h<bc.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t3 f148345a;

    public z3(t3 t3Var) {
        this.f148345a = t3Var;
    }

    public static z3 a(t3 t3Var) {
        return new z3(t3Var);
    }

    public static bc.c c(t3 t3Var) {
        return (bc.c) dagger.internal.p.f(t3Var.f());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public bc.c get() {
        return c(this.f148345a);
    }
}
