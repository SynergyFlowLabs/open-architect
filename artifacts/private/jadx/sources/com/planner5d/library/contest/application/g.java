package com.planner5d.library.contest.application;

/* JADX INFO: loaded from: classes4.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class g implements dagger.internal.h<com.planner5d.library.contest.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f148431a;

    public g(b bVar) {
        this.f148431a = bVar;
    }

    public static g a(b bVar) {
        return new g(bVar);
    }

    public static com.planner5d.library.contest.d c(b bVar) {
        return (com.planner5d.library.contest.d) dagger.internal.p.f(bVar.e());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.contest.d get() {
        return c(this.f148431a);
    }
}
