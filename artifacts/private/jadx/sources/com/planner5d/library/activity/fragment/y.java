package com.planner5d.library.activity.fragment;

import com.planner5d.library.model.manager.y1;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class y implements dagger.internal.h<x> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<y1> f136655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<j> f136656b;

    public y(ij.c<y1> cVar, ij.c<j> cVar2) {
        this.f136655a = cVar;
        this.f136656b = cVar2;
    }

    public static y a(ij.c<y1> cVar, ij.c<j> cVar2) {
        return new y(cVar, cVar2);
    }

    public static x c(y1 y1Var, j jVar) {
        return new x(y1Var, jVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c(this.f136655a.get(), this.f136656b.get());
    }
}
