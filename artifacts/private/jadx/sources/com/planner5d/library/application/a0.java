package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class a0 implements dagger.internal.h<com.planner5d.library.feed.usecase.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.feed.interactor.c> f142446b;

    public a0(i iVar, ij.c<com.planner5d.library.activity.fragment.feed.interactor.c> cVar) {
        this.f142445a = iVar;
        this.f142446b = cVar;
    }

    public static a0 a(i iVar, ij.c<com.planner5d.library.activity.fragment.feed.interactor.c> cVar) {
        return new a0(iVar, cVar);
    }

    public static com.planner5d.library.feed.usecase.a c(i iVar, com.planner5d.library.activity.fragment.feed.interactor.c cVar) {
        return (com.planner5d.library.feed.usecase.a) dagger.internal.p.f(iVar.v(cVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.feed.usecase.a get() {
        return c(this.f142445a, this.f142446b.get());
    }
}
