package com.planner5d.library.contest.application;

/* JADX INFO: loaded from: classes4.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class l implements dagger.internal.h<com.planner5d.library.model.manager.w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f148458a;

    public l(b bVar) {
        this.f148458a = bVar;
    }

    public static l a(b bVar) {
        return new l(bVar);
    }

    public static com.planner5d.library.model.manager.w c(b bVar) {
        return (com.planner5d.library.model.manager.w) dagger.internal.p.f(bVar.j());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.w get() {
        return c(this.f148458a);
    }
}
