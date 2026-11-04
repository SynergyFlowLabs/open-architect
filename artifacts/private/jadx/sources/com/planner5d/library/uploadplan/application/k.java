package com.planner5d.library.uploadplan.application;

/* JADX INFO: loaded from: classes11.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class k implements dagger.internal.h<ke.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f230724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.uploadplan.interactor.h> f230725b;

    public k(h hVar, ij.c<com.planner5d.library.uploadplan.interactor.h> cVar) {
        this.f230724a = hVar;
        this.f230725b = cVar;
    }

    public static k a(h hVar, ij.c<com.planner5d.library.uploadplan.interactor.h> cVar) {
        return new k(hVar, cVar);
    }

    public static ke.c c(h hVar, com.planner5d.library.uploadplan.interactor.h hVar2) {
        return (ke.c) dagger.internal.p.f(hVar.c(hVar2));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ke.c get() {
        return c(this.f230724a, this.f230725b.get());
    }
}
