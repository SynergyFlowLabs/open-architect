package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class g4 implements dagger.internal.h<com.planner5d.library.feed.view.holders.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f4 f142549a;

    public g4(f4 f4Var) {
        this.f142549a = f4Var;
    }

    public static g4 a(f4 f4Var) {
        return new g4(f4Var);
    }

    public static com.planner5d.library.feed.view.holders.b c(f4 f4Var) {
        return (com.planner5d.library.feed.view.holders.b) dagger.internal.p.f(f4Var.a());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.feed.view.holders.b get() {
        return c(this.f142549a);
    }
}
