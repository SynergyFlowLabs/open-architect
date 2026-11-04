package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class t1 implements dagger.internal.h<ka.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f148273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.feed.interactor.i> f148274b;

    public t1(i iVar, ij.c<com.planner5d.library.activity.fragment.feed.interactor.i> cVar) {
        this.f148273a = iVar;
        this.f148274b = cVar;
    }

    public static t1 a(i iVar, ij.c<com.planner5d.library.activity.fragment.feed.interactor.i> cVar) {
        return new t1(iVar, cVar);
    }

    public static ka.d c(i iVar, com.planner5d.library.activity.fragment.feed.interactor.i iVar2) {
        return (ka.d) dagger.internal.p.f(iVar.q0(iVar2));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ka.d get() {
        return c(this.f148273a, this.f148274b.get());
    }
}
