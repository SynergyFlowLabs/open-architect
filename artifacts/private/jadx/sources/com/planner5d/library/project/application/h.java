package com.planner5d.library.project.application;

import dagger.internal.p;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@r
@dagger.internal.e
@s
public final class h implements dagger.internal.h<pd.e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f223666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.project.interactor.g> f223667b;

    public h(d dVar, ij.c<com.planner5d.library.project.interactor.g> cVar) {
        this.f223666a = dVar;
        this.f223667b = cVar;
    }

    public static h a(d dVar, ij.c<com.planner5d.library.project.interactor.g> cVar) {
        return new h(dVar, cVar);
    }

    public static pd.e c(d dVar, com.planner5d.library.project.interactor.g gVar) {
        return (pd.e) p.f(dVar.d(gVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public pd.e get() {
        return c(this.f223666a, this.f223667b.get());
    }
}
