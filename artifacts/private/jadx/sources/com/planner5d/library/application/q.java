package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class q implements dagger.internal.h<com.planner5d.library.contest.view.b0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f148237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.l> f148238b;

    public q(i iVar, ij.c<com.planner5d.library.activity.fragment.l> cVar) {
        this.f148237a = iVar;
        this.f148238b = cVar;
    }

    public static q a(i iVar, ij.c<com.planner5d.library.activity.fragment.l> cVar) {
        return new q(iVar, cVar);
    }

    public static com.planner5d.library.contest.view.b0 c(i iVar, com.planner5d.library.activity.fragment.l lVar) {
        return (com.planner5d.library.contest.view.b0) dagger.internal.p.f(iVar.l(lVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.contest.view.b0 get() {
        return c(this.f148237a, this.f148238b.get());
    }
}
