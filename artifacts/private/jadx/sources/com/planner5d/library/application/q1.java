package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class q1 implements dagger.internal.h<com.planner5d.library.services.filedownloader.c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f148240a;

    public q1(i iVar) {
        this.f148240a = iVar;
    }

    public static q1 a(i iVar) {
        return new q1(iVar);
    }

    public static com.planner5d.library.services.filedownloader.c.a c(i iVar) {
        return (com.planner5d.library.services.filedownloader.c.a) dagger.internal.p.f(iVar.m0());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.services.filedownloader.c.a get() {
        return c(this.f148240a);
    }
}
