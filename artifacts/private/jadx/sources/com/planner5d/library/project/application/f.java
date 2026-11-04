package com.planner5d.library.project.application;

import dagger.internal.p;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@r
@dagger.internal.e
@s
public final class f implements dagger.internal.h<pd.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f223662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.project.interactor.c> f223663b;

    public f(d dVar, ij.c<com.planner5d.library.project.interactor.c> cVar) {
        this.f223662a = dVar;
        this.f223663b = cVar;
    }

    public static f a(d dVar, ij.c<com.planner5d.library.project.interactor.c> cVar) {
        return new f(dVar, cVar);
    }

    public static pd.b c(d dVar, com.planner5d.library.project.interactor.c cVar) {
        return (pd.b) p.f(dVar.b(cVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public pd.b get() {
        return c(this.f223662a, this.f223663b.get());
    }
}
