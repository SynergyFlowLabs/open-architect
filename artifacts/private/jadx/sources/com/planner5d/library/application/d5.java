package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class d5 implements dagger.internal.h<com.planner5d.library.model.manager.statistics.f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a5 f142497a;

    public d5(a5 a5Var) {
        this.f142497a = a5Var;
    }

    public static d5 a(a5 a5Var) {
        return new d5(a5Var);
    }

    public static com.planner5d.library.model.manager.statistics.f c(a5 a5Var) {
        return (com.planner5d.library.model.manager.statistics.f) dagger.internal.p.f(a5Var.d());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.statistics.f get() {
        return c(this.f142497a);
    }
}
