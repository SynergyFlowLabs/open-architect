package com.planner5d.library.dgenerator.application;

import dagger.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@dagger.internal.r
@dagger.internal.e
@s
public final class h implements dagger.internal.h<nb.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f160082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.dgenerator.interactor.g> f160083b;

    public h(d dVar, ij.c<com.planner5d.library.dgenerator.interactor.g> cVar) {
        this.f160082a = dVar;
        this.f160083b = cVar;
    }

    public static h a(d dVar, ij.c<com.planner5d.library.dgenerator.interactor.g> cVar) {
        return new h(dVar, cVar);
    }

    public static nb.d c(d dVar, com.planner5d.library.dgenerator.interactor.g gVar) {
        return (nb.d) dagger.internal.p.f(dVar.d(gVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public nb.d get() {
        return c(this.f160082a, this.f160083b.get());
    }
}
