package com.planner5d.library.modules.user.user;

/* JADX INFO: loaded from: classes9.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class c1 implements dagger.internal.h<b1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.payments.p> f222996a;

    public c1(ij.c<com.planner5d.library.model.manager.payments.p> cVar) {
        this.f222996a = cVar;
    }

    public static c1 a(ij.c<com.planner5d.library.model.manager.payments.p> cVar) {
        return new c1(cVar);
    }

    public static b1 c(com.planner5d.library.model.manager.payments.p pVar) {
        return new b1(pVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b1 get() {
        return c(this.f222996a.get());
    }
}
