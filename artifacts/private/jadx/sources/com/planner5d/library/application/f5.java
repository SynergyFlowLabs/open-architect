package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class f5 implements dagger.internal.h<com.planner5d.library.model.manager.statistics.i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a5 f142541a;

    public f5(a5 a5Var) {
        this.f142541a = a5Var;
    }

    public static f5 a(a5 a5Var) {
        return new f5(a5Var);
    }

    public static com.planner5d.library.model.manager.statistics.i c(a5 a5Var) {
        return (com.planner5d.library.model.manager.statistics.i) dagger.internal.p.f(a5Var.g());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.statistics.i get() {
        return c(this.f142541a);
    }
}
