package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class h3 implements dagger.internal.h<com.planner5d.library.model.manager.statistics.events.m3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142557a;

    public h3(i iVar) {
        this.f142557a = iVar;
    }

    public static h3 a(i iVar) {
        return new h3(iVar);
    }

    public static com.planner5d.library.model.manager.statistics.events.m3 c(i iVar) {
        return (com.planner5d.library.model.manager.statistics.events.m3) dagger.internal.p.f(iVar.g1());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.statistics.events.m3 get() {
        return c(this.f142557a);
    }
}
