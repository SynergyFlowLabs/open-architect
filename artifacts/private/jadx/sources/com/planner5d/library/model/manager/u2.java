package com.planner5d.library.model.manager;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class u2 implements dagger.internal.h<s2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.u0> f222251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.payments.j> f222252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.payments.paymentmethod.g> f222253c;

    public u2(ij.c<com.planner5d.library.modules.user.user.u0> cVar, ij.c<com.planner5d.library.model.manager.payments.j> cVar2, ij.c<com.planner5d.library.model.payments.paymentmethod.g> cVar3) {
        this.f222251a = cVar;
        this.f222252b = cVar2;
        this.f222253c = cVar3;
    }

    public static u2 a(ij.c<com.planner5d.library.modules.user.user.u0> cVar, ij.c<com.planner5d.library.model.manager.payments.j> cVar2, ij.c<com.planner5d.library.model.payments.paymentmethod.g> cVar3) {
        return new u2(cVar, cVar2, cVar3);
    }

    public static s2 c(com.planner5d.library.modules.user.user.u0 u0Var, com.planner5d.library.model.manager.payments.j jVar, fg.e<com.planner5d.library.model.payments.paymentmethod.g> eVar) {
        return new s2(u0Var, jVar, eVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public s2 get() {
        return c(this.f222251a.get(), this.f222252b.get(), dagger.internal.g.a(this.f222253c));
    }
}
