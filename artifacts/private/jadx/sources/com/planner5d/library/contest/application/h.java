package com.planner5d.library.contest.application;

/* JADX INFO: loaded from: classes4.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class h implements dagger.internal.h<com.planner5d.library.model.manager.synchronization.k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f148432a;

    public h(b bVar) {
        this.f148432a = bVar;
    }

    public static h a(b bVar) {
        return new h(bVar);
    }

    public static com.planner5d.library.model.manager.synchronization.k c(b bVar) {
        return (com.planner5d.library.model.manager.synchronization.k) dagger.internal.p.f(bVar.f());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.synchronization.k get() {
        return c(this.f148432a);
    }
}
