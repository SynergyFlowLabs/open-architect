package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class g3 implements dagger.internal.h<com.planner5d.library.model.manager.statistics.events.l3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142548a;

    public g3(i iVar) {
        this.f142548a = iVar;
    }

    public static g3 a(i iVar) {
        return new g3(iVar);
    }

    public static com.planner5d.library.model.manager.statistics.events.l3 c(i iVar) {
        return (com.planner5d.library.model.manager.statistics.events.l3) dagger.internal.p.f(iVar.f1());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.statistics.events.l3 get() {
        return c(this.f142548a);
    }
}
