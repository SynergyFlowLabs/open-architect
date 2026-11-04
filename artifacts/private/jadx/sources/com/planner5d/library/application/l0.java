package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class l0 implements dagger.internal.h<com.planner5d.library.services.v> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142599a;

    public l0(i iVar) {
        this.f142599a = iVar;
    }

    public static l0 a(i iVar) {
        return new l0(iVar);
    }

    public static com.planner5d.library.services.v c(i iVar) {
        return (com.planner5d.library.services.v) dagger.internal.p.f(iVar.G());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.services.v get() {
        return c(this.f142599a);
    }
}
