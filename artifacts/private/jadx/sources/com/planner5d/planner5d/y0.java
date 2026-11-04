package com.planner5d.planner5d;

import com.planner5d.library.widget.s1;

/* JADX INFO: loaded from: classes13.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class y0 implements dagger.internal.h<s1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u0 f264827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.tutorial.p> f264828b;

    public y0(u0 u0Var, ij.c<com.planner5d.library.activity.tutorial.p> cVar) {
        this.f264827a = u0Var;
        this.f264828b = cVar;
    }

    public static y0 a(u0 u0Var, ij.c<com.planner5d.library.activity.tutorial.p> cVar) {
        return new y0(u0Var, cVar);
    }

    public static s1 c(u0 u0Var, com.planner5d.library.activity.tutorial.p pVar) {
        return (s1) dagger.internal.p.f(u0Var.d(pVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public s1 get() {
        return c(this.f264827a, this.f264828b.get());
    }
}
