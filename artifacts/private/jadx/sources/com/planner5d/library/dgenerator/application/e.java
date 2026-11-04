package com.planner5d.library.dgenerator.application;

import dagger.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@dagger.internal.r
@dagger.internal.e
@s
public final class e implements dagger.internal.h<nb.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f160076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.dgenerator.interactor.a> f160077b;

    public e(d dVar, ij.c<com.planner5d.library.dgenerator.interactor.a> cVar) {
        this.f160076a = dVar;
        this.f160077b = cVar;
    }

    public static e a(d dVar, ij.c<com.planner5d.library.dgenerator.interactor.a> cVar) {
        return new e(dVar, cVar);
    }

    public static nb.a c(d dVar, com.planner5d.library.dgenerator.interactor.a aVar) {
        return (nb.a) dagger.internal.p.f(dVar.a(aVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public nb.a get() {
        return c(this.f160076a, this.f160077b.get());
    }
}
