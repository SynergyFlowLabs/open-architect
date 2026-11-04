package com.planner5d.library.model.manager;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class i4 implements dagger.internal.h<h4> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.payments.a0> f191570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.f1> f191571b;

    public i4(ij.c<com.planner5d.library.model.manager.payments.a0> cVar, ij.c<com.planner5d.library.services.utility.f1> cVar2) {
        this.f191570a = cVar;
        this.f191571b = cVar2;
    }

    public static i4 a(ij.c<com.planner5d.library.model.manager.payments.a0> cVar, ij.c<com.planner5d.library.services.utility.f1> cVar2) {
        return new i4(cVar, cVar2);
    }

    public static h4 c(com.planner5d.library.model.manager.payments.a0 a0Var, com.planner5d.library.services.utility.f1 f1Var) {
        return new h4(a0Var, f1Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h4 get() {
        return c(this.f191570a.get(), this.f191571b.get());
    }
}
