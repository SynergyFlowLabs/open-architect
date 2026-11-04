package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class r1 implements dagger.internal.h<ka.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f148249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.feed.interactor.g> f148250b;

    public r1(i iVar, ij.c<com.planner5d.library.activity.fragment.feed.interactor.g> cVar) {
        this.f148249a = iVar;
        this.f148250b = cVar;
    }

    public static r1 a(i iVar, ij.c<com.planner5d.library.activity.fragment.feed.interactor.g> cVar) {
        return new r1(iVar, cVar);
    }

    public static ka.c c(i iVar, com.planner5d.library.activity.fragment.feed.interactor.g gVar) {
        return (ka.c) dagger.internal.p.f(iVar.o0(gVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ka.c get() {
        return c(this.f148249a, this.f148250b.get());
    }
}
