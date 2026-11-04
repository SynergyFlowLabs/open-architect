package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class j4 implements dagger.internal.h<com.planner5d.library.model.manager.i1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h4 f142585a;

    public j4(h4 h4Var) {
        this.f142585a = h4Var;
    }

    public static j4 a(h4 h4Var) {
        return new j4(h4Var);
    }

    public static com.planner5d.library.model.manager.i1 c(h4 h4Var) {
        return (com.planner5d.library.model.manager.i1) dagger.internal.p.f(h4Var.b());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.i1 get() {
        return c(this.f142585a);
    }
}
