package com.planner5d.library.model.manager.initialization;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class u implements dagger.internal.h<t> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.engine.i> f191712a;

    public u(ij.c<com.planner5d.library.engine.i> cVar) {
        this.f191712a = cVar;
    }

    public static u a(ij.c<com.planner5d.library.engine.i> cVar) {
        return new u(cVar);
    }

    public static t c(com.planner5d.library.engine.i iVar) {
        return new t(iVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t get() {
        return c(this.f191712a.get());
    }
}
