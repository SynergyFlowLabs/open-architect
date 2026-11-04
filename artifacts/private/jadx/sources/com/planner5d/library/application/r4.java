package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class r4 implements dagger.internal.h<com.planner5d.library.activity.fragment.feed.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q4 f148254a;

    public r4(q4 q4Var) {
        this.f148254a = q4Var;
    }

    public static r4 a(q4 q4Var) {
        return new r4(q4Var);
    }

    public static com.planner5d.library.activity.fragment.feed.b c(q4 q4Var) {
        return (com.planner5d.library.activity.fragment.feed.b) dagger.internal.p.f(q4Var.a());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.activity.fragment.feed.b get() {
        return c(this.f148254a);
    }
}
