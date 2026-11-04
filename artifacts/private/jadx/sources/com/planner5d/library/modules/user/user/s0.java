package com.planner5d.library.modules.user.user;

/* JADX INFO: loaded from: classes9.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class s0 implements dagger.internal.h<q0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.api.requests.c> f223281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.api.b> f223282b;

    public s0(ij.c<com.planner5d.library.api.requests.c> cVar, ij.c<com.planner5d.library.api.b> cVar2) {
        this.f223281a = cVar;
        this.f223282b = cVar2;
    }

    public static s0 a(ij.c<com.planner5d.library.api.requests.c> cVar, ij.c<com.planner5d.library.api.b> cVar2) {
        return new s0(cVar, cVar2);
    }

    public static q0 c(com.planner5d.library.api.requests.c cVar, com.planner5d.library.api.b bVar) {
        return new q0(cVar, bVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public q0 get() {
        return c(this.f223281a.get(), this.f223282b.get());
    }
}
