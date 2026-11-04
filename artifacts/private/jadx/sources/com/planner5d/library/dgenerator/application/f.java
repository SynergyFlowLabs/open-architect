package com.planner5d.library.dgenerator.application;

import dagger.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@dagger.internal.r
@dagger.internal.e
@s
public final class f implements dagger.internal.h<nb.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f160078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.dgenerator.interactor.c> f160079b;

    public f(d dVar, ij.c<com.planner5d.library.dgenerator.interactor.c> cVar) {
        this.f160078a = dVar;
        this.f160079b = cVar;
    }

    public static f a(d dVar, ij.c<com.planner5d.library.dgenerator.interactor.c> cVar) {
        return new f(dVar, cVar);
    }

    public static nb.b c(d dVar, com.planner5d.library.dgenerator.interactor.c cVar) {
        return (nb.b) dagger.internal.p.f(dVar.b(cVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public nb.b get() {
        return c(this.f160078a, this.f160079b.get());
    }
}
