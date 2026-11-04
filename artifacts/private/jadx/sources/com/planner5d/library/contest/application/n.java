package com.planner5d.library.contest.application;

/* JADX INFO: loaded from: classes4.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class n implements dagger.internal.h<com.planner5d.library.activity.fragment.x> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f148460a;

    public n(b bVar) {
        this.f148460a = bVar;
    }

    public static n a(b bVar) {
        return new n(bVar);
    }

    public static com.planner5d.library.activity.fragment.x c(b bVar) {
        return (com.planner5d.library.activity.fragment.x) dagger.internal.p.f(bVar.l());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.activity.fragment.x get() {
        return c(this.f148460a);
    }
}
