package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class t0 implements dagger.internal.h<com.planner5d.library.model.payments.paymentmethod.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f148270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.q2> f148271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.payments.j> f148272c;

    public t0(i iVar, ij.c<com.planner5d.library.model.manager.q2> cVar, ij.c<com.planner5d.library.model.manager.payments.j> cVar2) {
        this.f148270a = iVar;
        this.f148271b = cVar;
        this.f148272c = cVar2;
    }

    public static t0 a(i iVar, ij.c<com.planner5d.library.model.manager.q2> cVar, ij.c<com.planner5d.library.model.manager.payments.j> cVar2) {
        return new t0(iVar, cVar, cVar2);
    }

    public static com.planner5d.library.model.payments.paymentmethod.a c(i iVar, com.planner5d.library.model.manager.q2 q2Var, fg.e<com.planner5d.library.model.manager.payments.j> eVar) {
        return (com.planner5d.library.model.payments.paymentmethod.a) dagger.internal.p.f(iVar.O(q2Var, eVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.payments.paymentmethod.a get() {
        return c(this.f148270a, this.f148271b.get(), dagger.internal.g.a(this.f148272c));
    }
}
