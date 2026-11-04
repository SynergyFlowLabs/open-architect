package com.planner5d.library.dgenerator.application;

import dagger.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@dagger.internal.r
@dagger.internal.e
@s
public final class l implements dagger.internal.h<nb.h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f160090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.dgenerator.interactor.p> f160091b;

    public l(d dVar, ij.c<com.planner5d.library.dgenerator.interactor.p> cVar) {
        this.f160090a = dVar;
        this.f160091b = cVar;
    }

    public static l a(d dVar, ij.c<com.planner5d.library.dgenerator.interactor.p> cVar) {
        return new l(dVar, cVar);
    }

    public static nb.h c(d dVar, com.planner5d.library.dgenerator.interactor.p pVar) {
        return (nb.h) dagger.internal.p.f(dVar.h(pVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public nb.h get() {
        return c(this.f160090a, this.f160091b.get());
    }
}
