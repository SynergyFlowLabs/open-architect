package com.planner5d.library.dgenerator.application;

import dagger.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@dagger.internal.r
@dagger.internal.e
@s
public final class o implements dagger.internal.h<ce.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f160096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.smartwizard.interactor.g> f160097b;

    public o(d dVar, ij.c<com.planner5d.library.smartwizard.interactor.g> cVar) {
        this.f160096a = dVar;
        this.f160097b = cVar;
    }

    public static o a(d dVar, ij.c<com.planner5d.library.smartwizard.interactor.g> cVar) {
        return new o(dVar, cVar);
    }

    public static ce.c c(d dVar, com.planner5d.library.smartwizard.interactor.g gVar) {
        return (ce.c) dagger.internal.p.f(dVar.k(gVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ce.c get() {
        return c(this.f160096a, this.f160097b.get());
    }
}
