package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class q0 implements dagger.internal.h<com.planner5d.library.services.utility.a2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f148239a;

    public q0(i iVar) {
        this.f148239a = iVar;
    }

    public static q0 a(i iVar) {
        return new q0(iVar);
    }

    public static com.planner5d.library.services.utility.a2 c(i iVar) {
        return (com.planner5d.library.services.utility.a2) dagger.internal.p.f(iVar.L());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.services.utility.a2 get() {
        return c(this.f148239a);
    }
}
