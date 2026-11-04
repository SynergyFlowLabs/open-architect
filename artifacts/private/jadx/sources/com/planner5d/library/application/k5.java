package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class k5 implements dagger.internal.h<com.planner5d.library.activity.fragment.projects.g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j5 f142597a;

    public k5(j5 j5Var) {
        this.f142597a = j5Var;
    }

    public static k5 a(j5 j5Var) {
        return new k5(j5Var);
    }

    public static com.planner5d.library.activity.fragment.projects.g c(j5 j5Var) {
        return j5Var.a();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.activity.fragment.projects.g get() {
        return c(this.f142597a);
    }
}
