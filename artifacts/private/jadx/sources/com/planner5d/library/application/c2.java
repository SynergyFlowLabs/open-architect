package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class c2 implements dagger.internal.h<com.planner5d.library.model.manager.statistics.events.r3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142478a;

    public c2(i iVar) {
        this.f142478a = iVar;
    }

    public static c2 a(i iVar) {
        return new c2(iVar);
    }

    public static com.planner5d.library.model.manager.statistics.events.r3 c(i iVar) {
        return (com.planner5d.library.model.manager.statistics.events.r3) dagger.internal.p.f(iVar.z0());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.statistics.events.r3 get() {
        return c(this.f142478a);
    }
}
