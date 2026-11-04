package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class e5 implements dagger.internal.h<com.planner5d.library.database.migration.p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a5 f142531a;

    public e5(a5 a5Var) {
        this.f142531a = a5Var;
    }

    public static e5 a(a5 a5Var) {
        return new e5(a5Var);
    }

    public static com.planner5d.library.database.migration.p c(a5 a5Var) {
        return (com.planner5d.library.database.migration.p) dagger.internal.p.f(a5Var.e());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.database.migration.p get() {
        return c(this.f142531a);
    }
}
