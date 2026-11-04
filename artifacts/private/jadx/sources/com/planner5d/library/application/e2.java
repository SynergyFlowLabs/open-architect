package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class e2 implements dagger.internal.h<com.planner5d.library.model.manager.statistics.events.v3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142527a;

    public e2(i iVar) {
        this.f142527a = iVar;
    }

    public static e2 a(i iVar) {
        return new e2(iVar);
    }

    public static com.planner5d.library.model.manager.statistics.events.v3 c(i iVar) {
        return (com.planner5d.library.model.manager.statistics.events.v3) dagger.internal.p.f(iVar.B0());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.statistics.events.v3 get() {
        return c(this.f142527a);
    }
}
