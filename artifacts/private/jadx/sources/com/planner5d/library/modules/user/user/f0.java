package com.planner5d.library.modules.user.user;

/* JADX INFO: loaded from: classes9.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class f0 implements dagger.internal.h<e0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.api.requests.c> f223046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.p> f223047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.f1> f223048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<t> f223049d;

    public f0(ij.c<com.planner5d.library.api.requests.c> cVar, ij.c<com.planner5d.library.model.manager.config.p> cVar2, ij.c<com.planner5d.library.services.utility.f1> cVar3, ij.c<t> cVar4) {
        this.f223046a = cVar;
        this.f223047b = cVar2;
        this.f223048c = cVar3;
        this.f223049d = cVar4;
    }

    public static f0 a(ij.c<com.planner5d.library.api.requests.c> cVar, ij.c<com.planner5d.library.model.manager.config.p> cVar2, ij.c<com.planner5d.library.services.utility.f1> cVar3, ij.c<t> cVar4) {
        return new f0(cVar, cVar2, cVar3, cVar4);
    }

    public static e0 c(com.planner5d.library.api.requests.c cVar, com.planner5d.library.model.manager.config.p pVar, com.planner5d.library.services.utility.f1 f1Var, t tVar) {
        return new e0(cVar, pVar, f1Var, tVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e0 get() {
        return c(this.f223046a.get(), this.f223047b.get(), this.f223048c.get(), this.f223049d.get());
    }
}
