package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class l5 implements dagger.internal.h<com.planner5d.library.activity.fragment.projects.z0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j5 f142608a;

    public l5(j5 j5Var) {
        this.f142608a = j5Var;
    }

    public static l5 a(j5 j5Var) {
        return new l5(j5Var);
    }

    public static com.planner5d.library.activity.fragment.projects.z0 c(j5 j5Var) {
        return j5Var.b();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.activity.fragment.projects.z0 get() {
        return c(this.f142608a);
    }
}
