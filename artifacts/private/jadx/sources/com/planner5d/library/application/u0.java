package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class u0 implements dagger.internal.h<com.planner5d.library.model.manager.payments.k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f148282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.payments.j> f148283b;

    public u0(i iVar, ij.c<com.planner5d.library.model.manager.payments.j> cVar) {
        this.f148282a = iVar;
        this.f148283b = cVar;
    }

    public static u0 a(i iVar, ij.c<com.planner5d.library.model.manager.payments.j> cVar) {
        return new u0(iVar, cVar);
    }

    public static com.planner5d.library.model.manager.payments.k c(i iVar, com.planner5d.library.model.manager.payments.j jVar) {
        return (com.planner5d.library.model.manager.payments.k) dagger.internal.p.f(iVar.P(jVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.payments.k get() {
        return c(this.f148282a, this.f148283b.get());
    }
}
