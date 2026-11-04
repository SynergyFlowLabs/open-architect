package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class j3 implements dagger.internal.h<com.planner5d.library.model.manager.statistics.events.c4> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142584a;

    public j3(i iVar) {
        this.f142584a = iVar;
    }

    public static j3 a(i iVar) {
        return new j3(iVar);
    }

    public static com.planner5d.library.model.manager.statistics.events.c4 c(i iVar) {
        return (com.planner5d.library.model.manager.statistics.events.c4) dagger.internal.p.f(iVar.i1());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.statistics.events.c4 get() {
        return c(this.f142584a);
    }
}
