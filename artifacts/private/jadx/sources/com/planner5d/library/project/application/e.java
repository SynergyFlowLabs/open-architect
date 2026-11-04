package com.planner5d.library.project.application;

import dagger.internal.p;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@r
@dagger.internal.e
@s
public final class e implements dagger.internal.h<pd.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f223660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.project.interactor.a> f223661b;

    public e(d dVar, ij.c<com.planner5d.library.project.interactor.a> cVar) {
        this.f223660a = dVar;
        this.f223661b = cVar;
    }

    public static e a(d dVar, ij.c<com.planner5d.library.project.interactor.a> cVar) {
        return new e(dVar, cVar);
    }

    public static pd.a c(d dVar, com.planner5d.library.project.interactor.a aVar) {
        return (pd.a) p.f(dVar.a(aVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public pd.a get() {
        return c(this.f223660a, this.f223661b.get());
    }
}
