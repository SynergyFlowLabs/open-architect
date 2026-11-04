package com.planner5d.library.model.converter.json.from;

import com.planner5d.library.services.utility.p0;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class y implements dagger.internal.h<x> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<p0> f180638a;

    public y(ij.c<p0> cVar) {
        this.f180638a = cVar;
    }

    public static y a(ij.c<p0> cVar) {
        return new y(cVar);
    }

    public static x c(p0 p0Var) {
        return new x(p0Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c(this.f180638a.get());
    }
}
