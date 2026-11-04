package com.planner5d.library.dgenerator.application;

import dagger.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@dagger.internal.r
@dagger.internal.e
@s
public final class j implements dagger.internal.h<nb.f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f160086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.dgenerator.interactor.k> f160087b;

    public j(d dVar, ij.c<com.planner5d.library.dgenerator.interactor.k> cVar) {
        this.f160086a = dVar;
        this.f160087b = cVar;
    }

    public static j a(d dVar, ij.c<com.planner5d.library.dgenerator.interactor.k> cVar) {
        return new j(dVar, cVar);
    }

    public static nb.f c(d dVar, com.planner5d.library.dgenerator.interactor.k kVar) {
        return (nb.f) dagger.internal.p.f(dVar.f(kVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public nb.f get() {
        return c(this.f160086a, this.f160087b.get());
    }
}
