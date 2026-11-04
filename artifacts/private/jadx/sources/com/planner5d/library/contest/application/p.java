package com.planner5d.library.contest.application;

/* JADX INFO: loaded from: classes4.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class p implements dagger.internal.h<com.planner5d.library.services.q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f148462a;

    public p(b bVar) {
        this.f148462a = bVar;
    }

    public static p a(b bVar) {
        return new p(bVar);
    }

    public static com.planner5d.library.services.q c(b bVar) {
        return (com.planner5d.library.services.q) dagger.internal.p.f(bVar.n());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.services.q get() {
        return c(this.f148462a);
    }
}
