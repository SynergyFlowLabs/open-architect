package com.planner5d.library.dgenerator.application;

import dagger.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@dagger.internal.r
@dagger.internal.e
@s
public final class i implements dagger.internal.h<nb.e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f160084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.dgenerator.interactor.i> f160085b;

    public i(d dVar, ij.c<com.planner5d.library.dgenerator.interactor.i> cVar) {
        this.f160084a = dVar;
        this.f160085b = cVar;
    }

    public static i a(d dVar, ij.c<com.planner5d.library.dgenerator.interactor.i> cVar) {
        return new i(dVar, cVar);
    }

    public static nb.e c(d dVar, com.planner5d.library.dgenerator.interactor.i iVar) {
        return (nb.e) dagger.internal.p.f(dVar.e(iVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public nb.e get() {
        return c(this.f160084a, this.f160085b.get());
    }
}
