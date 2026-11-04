package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class s4 implements dagger.internal.h<com.planner5d.library.activity.fragment.smartwizard.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q4 f148267a;

    public s4(q4 q4Var) {
        this.f148267a = q4Var;
    }

    public static s4 a(q4 q4Var) {
        return new s4(q4Var);
    }

    public static com.planner5d.library.activity.fragment.smartwizard.a c(q4 q4Var) {
        return (com.planner5d.library.activity.fragment.smartwizard.a) dagger.internal.p.f(q4Var.b());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.activity.fragment.smartwizard.a get() {
        return c(this.f148267a);
    }
}
