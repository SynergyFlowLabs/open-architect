package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class s implements dagger.internal.h<com.planner5d.library.services.utility.t> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f148261a;

    public s(i iVar) {
        this.f148261a = iVar;
    }

    public static s a(i iVar) {
        return new s(iVar);
    }

    public static com.planner5d.library.services.utility.t c(i iVar) {
        return (com.planner5d.library.services.utility.t) dagger.internal.p.f(iVar.n());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.services.utility.t get() {
        return c(this.f148261a);
    }
}
