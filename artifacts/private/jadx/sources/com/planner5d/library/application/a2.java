package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class a2 implements dagger.internal.h<com.planner5d.library.model.manager.statistics.events.i3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142449a;

    public a2(i iVar) {
        this.f142449a = iVar;
    }

    public static a2 a(i iVar) {
        return new a2(iVar);
    }

    public static com.planner5d.library.model.manager.statistics.events.i3 c(i iVar) {
        return (com.planner5d.library.model.manager.statistics.events.i3) dagger.internal.p.f(iVar.x0());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.statistics.events.i3 get() {
        return c(this.f142449a);
    }
}
