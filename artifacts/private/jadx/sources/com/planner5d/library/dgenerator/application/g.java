package com.planner5d.library.dgenerator.application;

import dagger.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@dagger.internal.r
@dagger.internal.e
@s
public final class g implements dagger.internal.h<nb.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f160080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.dgenerator.interactor.e> f160081b;

    public g(d dVar, ij.c<com.planner5d.library.dgenerator.interactor.e> cVar) {
        this.f160080a = dVar;
        this.f160081b = cVar;
    }

    public static g a(d dVar, ij.c<com.planner5d.library.dgenerator.interactor.e> cVar) {
        return new g(dVar, cVar);
    }

    public static nb.c c(d dVar, com.planner5d.library.dgenerator.interactor.e eVar) {
        return (nb.c) dagger.internal.p.f(dVar.c(eVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public nb.c get() {
        return c(this.f160080a, this.f160081b.get());
    }
}
