package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class l4 implements dagger.internal.h<com.planner5d.library.model.manager.b5> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h4 f142607a;

    public l4(h4 h4Var) {
        this.f142607a = h4Var;
    }

    public static l4 a(h4 h4Var) {
        return new l4(h4Var);
    }

    public static com.planner5d.library.model.manager.b5 c(h4 h4Var) {
        return (com.planner5d.library.model.manager.b5) dagger.internal.p.f(h4Var.d());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.b5 get() {
        return c(this.f142607a);
    }
}
