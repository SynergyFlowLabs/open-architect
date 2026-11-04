package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class v0 implements dagger.internal.h<com.planner5d.library.model.payments.paymentmethod.e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f148292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.q2> f148293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.payments.paymentmethod.g> f148294c;

    public v0(i iVar, ij.c<com.planner5d.library.model.manager.q2> cVar, ij.c<com.planner5d.library.model.payments.paymentmethod.g> cVar2) {
        this.f148292a = iVar;
        this.f148293b = cVar;
        this.f148294c = cVar2;
    }

    public static v0 a(i iVar, ij.c<com.planner5d.library.model.manager.q2> cVar, ij.c<com.planner5d.library.model.payments.paymentmethod.g> cVar2) {
        return new v0(iVar, cVar, cVar2);
    }

    public static com.planner5d.library.model.payments.paymentmethod.e c(i iVar, com.planner5d.library.model.manager.q2 q2Var, fg.e<com.planner5d.library.model.payments.paymentmethod.g> eVar) {
        return (com.planner5d.library.model.payments.paymentmethod.e) dagger.internal.p.f(iVar.Q(q2Var, eVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.payments.paymentmethod.e get() {
        return c(this.f148292a, this.f148293b.get(), dagger.internal.g.a(this.f148294c));
    }
}
