package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class k2 implements dagger.internal.h<com.planner5d.library.services.utility.g3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142593a;

    public k2(i iVar) {
        this.f142593a = iVar;
    }

    public static k2 a(i iVar) {
        return new k2(iVar);
    }

    public static com.planner5d.library.services.utility.g3 c(i iVar) {
        return (com.planner5d.library.services.utility.g3) dagger.internal.p.f(iVar.H0());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.services.utility.g3 get() {
        return c(this.f142593a);
    }
}
