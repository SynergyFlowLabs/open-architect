package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class g2 implements dagger.internal.h<com.planner5d.library.model.manager.statistics.events.e4> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142547a;

    public g2(i iVar) {
        this.f142547a = iVar;
    }

    public static g2 a(i iVar) {
        return new g2(iVar);
    }

    public static com.planner5d.library.model.manager.statistics.events.e4 c(i iVar) {
        return (com.planner5d.library.model.manager.statistics.events.e4) dagger.internal.p.f(iVar.D0());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.statistics.events.e4 get() {
        return c(this.f142547a);
    }
}
