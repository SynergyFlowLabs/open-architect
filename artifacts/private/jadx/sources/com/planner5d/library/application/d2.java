package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class d2 implements dagger.internal.h<com.planner5d.library.model.manager.statistics.events.t3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142493a;

    public d2(i iVar) {
        this.f142493a = iVar;
    }

    public static d2 a(i iVar) {
        return new d2(iVar);
    }

    public static com.planner5d.library.model.manager.statistics.events.t3 c(i iVar) {
        return (com.planner5d.library.model.manager.statistics.events.t3) dagger.internal.p.f(iVar.A0());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.statistics.events.t3 get() {
        return c(this.f142493a);
    }
}
