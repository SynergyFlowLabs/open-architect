package com.planner5d.library.contest.application;

/* JADX INFO: loaded from: classes4.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class r implements dagger.internal.h<com.planner5d.library.services.v> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f148464a;

    public r(b bVar) {
        this.f148464a = bVar;
    }

    public static r a(b bVar) {
        return new r(bVar);
    }

    public static com.planner5d.library.services.v c(b bVar) {
        return (com.planner5d.library.services.v) dagger.internal.p.f(bVar.p());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.services.v get() {
        return c(this.f148464a);
    }
}
