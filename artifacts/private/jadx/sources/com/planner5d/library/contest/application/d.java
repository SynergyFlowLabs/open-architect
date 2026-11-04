package com.planner5d.library.contest.application;

/* JADX INFO: loaded from: classes4.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class d implements dagger.internal.h<com.planner5d.library.contest.data.i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f148426a;

    public d(b bVar) {
        this.f148426a = bVar;
    }

    public static d a(b bVar) {
        return new d(bVar);
    }

    public static com.planner5d.library.contest.data.i c(b bVar) {
        return (com.planner5d.library.contest.data.i) dagger.internal.p.f(bVar.b());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.contest.data.i get() {
        return c(this.f148426a);
    }
}
