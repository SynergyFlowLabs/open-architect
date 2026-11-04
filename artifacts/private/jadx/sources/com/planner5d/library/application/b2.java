package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class b2 implements dagger.internal.h<com.planner5d.library.model.manager.statistics.events.j3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142468a;

    public b2(i iVar) {
        this.f142468a = iVar;
    }

    public static b2 a(i iVar) {
        return new b2(iVar);
    }

    public static com.planner5d.library.model.manager.statistics.events.j3 c(i iVar) {
        return (com.planner5d.library.model.manager.statistics.events.j3) dagger.internal.p.f(iVar.y0());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.statistics.events.j3 get() {
        return c(this.f142468a);
    }
}
