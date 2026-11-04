package com.planner5d.library.dgenerator.application;

import dagger.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@dagger.internal.r
@dagger.internal.e
@s("javax.inject.Singleton")
public final class k implements dagger.internal.h<p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f160088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.n> f160089b;

    public k(d dVar, ij.c<com.planner5d.library.activity.fragment.n> cVar) {
        this.f160088a = dVar;
        this.f160089b = cVar;
    }

    public static k a(d dVar, ij.c<com.planner5d.library.activity.fragment.n> cVar) {
        return new k(dVar, cVar);
    }

    public static p c(d dVar, com.planner5d.library.activity.fragment.n nVar) {
        return (p) dagger.internal.p.f(dVar.g(nVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p get() {
        return c(this.f160088a, this.f160089b.get());
    }
}
