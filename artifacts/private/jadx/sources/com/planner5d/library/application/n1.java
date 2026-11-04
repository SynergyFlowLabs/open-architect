package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class n1 implements dagger.internal.h<ka.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.feed.interactor.e> f142863b;

    public n1(i iVar, ij.c<com.planner5d.library.activity.fragment.feed.interactor.e> cVar) {
        this.f142862a = iVar;
        this.f142863b = cVar;
    }

    public static n1 a(i iVar, ij.c<com.planner5d.library.activity.fragment.feed.interactor.e> cVar) {
        return new n1(iVar, cVar);
    }

    public static ka.b c(i iVar, com.planner5d.library.activity.fragment.feed.interactor.e eVar) {
        return (ka.b) dagger.internal.p.f(iVar.j0(eVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ka.b get() {
        return c(this.f142862a, this.f142863b.get());
    }
}
