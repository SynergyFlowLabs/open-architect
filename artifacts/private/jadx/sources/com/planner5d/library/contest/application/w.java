package com.planner5d.library.contest.application;

/* JADX INFO: loaded from: classes4.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class w implements dagger.internal.h<com.planner5d.library.contest.data.k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f148469a;

    public w(b bVar) {
        this.f148469a = bVar;
    }

    public static w a(b bVar) {
        return new w(bVar);
    }

    public static com.planner5d.library.contest.data.k c(b bVar) {
        return (com.planner5d.library.contest.data.k) dagger.internal.p.f(bVar.u());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.contest.data.k get() {
        return c(this.f148469a);
    }
}
