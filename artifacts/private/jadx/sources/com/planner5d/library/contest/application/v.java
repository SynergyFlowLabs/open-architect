package com.planner5d.library.contest.application;

/* JADX INFO: loaded from: classes4.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class v implements dagger.internal.h<com.planner5d.library.contest.helper.g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f148468a;

    public v(b bVar) {
        this.f148468a = bVar;
    }

    public static v a(b bVar) {
        return new v(bVar);
    }

    public static com.planner5d.library.contest.helper.g c(b bVar) {
        return (com.planner5d.library.contest.helper.g) dagger.internal.p.f(bVar.t());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.contest.helper.g get() {
        return c(this.f148468a);
    }
}
