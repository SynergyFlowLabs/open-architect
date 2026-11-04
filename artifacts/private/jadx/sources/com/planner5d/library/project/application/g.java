package com.planner5d.library.project.application;

import dagger.internal.p;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@r
@dagger.internal.e
@s
public final class g implements dagger.internal.h<pd.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f223664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.project.interactor.e> f223665b;

    public g(d dVar, ij.c<com.planner5d.library.project.interactor.e> cVar) {
        this.f223664a = dVar;
        this.f223665b = cVar;
    }

    public static g a(d dVar, ij.c<com.planner5d.library.project.interactor.e> cVar) {
        return new g(dVar, cVar);
    }

    public static pd.c c(d dVar, com.planner5d.library.project.interactor.e eVar) {
        return (pd.c) p.f(dVar.c(eVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public pd.c get() {
        return c(this.f223664a, this.f223665b.get());
    }
}
