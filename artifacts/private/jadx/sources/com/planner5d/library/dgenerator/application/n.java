package com.planner5d.library.dgenerator.application;

import dagger.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@dagger.internal.r
@dagger.internal.e
@s
public final class n implements dagger.internal.h<nb.g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f160094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.dgenerator.interactor.m> f160095b;

    public n(d dVar, ij.c<com.planner5d.library.dgenerator.interactor.m> cVar) {
        this.f160094a = dVar;
        this.f160095b = cVar;
    }

    public static n a(d dVar, ij.c<com.planner5d.library.dgenerator.interactor.m> cVar) {
        return new n(dVar, cVar);
    }

    public static nb.g c(d dVar, com.planner5d.library.dgenerator.interactor.m mVar) {
        return (nb.g) dagger.internal.p.f(dVar.j(mVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public nb.g get() {
        return c(this.f160094a, this.f160095b.get());
    }
}
