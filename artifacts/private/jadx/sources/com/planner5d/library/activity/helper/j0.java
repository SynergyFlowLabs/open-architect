package com.planner5d.library.activity.helper;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class j0 implements dagger.internal.h<i0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t0> f136973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.d> f136974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.licensing.a<?>> f136975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.payments.p> f136976d;

    public j0(ij.c<com.planner5d.library.modules.user.user.t0> cVar, ij.c<com.planner5d.library.application.d> cVar2, ij.c<com.planner5d.library.services.licensing.a<?>> cVar3, ij.c<com.planner5d.library.model.manager.payments.p> cVar4) {
        this.f136973a = cVar;
        this.f136974b = cVar2;
        this.f136975c = cVar3;
        this.f136976d = cVar4;
    }

    public static j0 a(ij.c<com.planner5d.library.modules.user.user.t0> cVar, ij.c<com.planner5d.library.application.d> cVar2, ij.c<com.planner5d.library.services.licensing.a<?>> cVar3, ij.c<com.planner5d.library.model.manager.payments.p> cVar4) {
        return new j0(cVar, cVar2, cVar3, cVar4);
    }

    public static i0 c(com.planner5d.library.modules.user.user.t0 t0Var, com.planner5d.library.application.d dVar, com.planner5d.library.services.licensing.a<?> aVar, com.planner5d.library.model.manager.payments.p pVar) {
        return new i0(t0Var, dVar, aVar, pVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i0 get() {
        return c(this.f136973a.get(), this.f136974b.get(), this.f136975c.get(), this.f136976d.get());
    }
}
