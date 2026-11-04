package com.planner5d.library.contest.application;

/* JADX INFO: loaded from: classes4.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class f implements dagger.internal.h<com.planner5d.library.contest.view.b0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f148430a;

    public f(b bVar) {
        this.f148430a = bVar;
    }

    public static f a(b bVar) {
        return new f(bVar);
    }

    public static com.planner5d.library.contest.view.b0 c(b bVar) {
        return (com.planner5d.library.contest.view.b0) dagger.internal.p.f(bVar.d());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.contest.view.b0 get() {
        return c(this.f148430a);
    }
}
