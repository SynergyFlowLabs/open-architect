package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class i3 implements dagger.internal.h<com.planner5d.library.model.manager.statistics.events.n3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142573a;

    public i3(i iVar) {
        this.f142573a = iVar;
    }

    public static i3 a(i iVar) {
        return new i3(iVar);
    }

    public static com.planner5d.library.model.manager.statistics.events.n3 c(i iVar) {
        return (com.planner5d.library.model.manager.statistics.events.n3) dagger.internal.p.f(iVar.h1());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.statistics.events.n3 get() {
        return c(this.f142573a);
    }
}
