package com.planner5d.library.model.manager;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class p1 implements dagger.internal.h<n1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.builtin.i> f192244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.w1> f192245b;

    public p1(ij.c<com.planner5d.library.model.manager.builtin.i> cVar, ij.c<com.planner5d.library.services.utility.w1> cVar2) {
        this.f192244a = cVar;
        this.f192245b = cVar2;
    }

    public static p1 a(ij.c<com.planner5d.library.model.manager.builtin.i> cVar, ij.c<com.planner5d.library.services.utility.w1> cVar2) {
        return new p1(cVar, cVar2);
    }

    public static n1 c(fg.e<com.planner5d.library.model.manager.builtin.i> eVar, com.planner5d.library.services.utility.w1 w1Var) {
        return new n1(eVar, w1Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public n1 get() {
        return c(dagger.internal.g.a(this.f192244a), this.f192245b.get());
    }
}
