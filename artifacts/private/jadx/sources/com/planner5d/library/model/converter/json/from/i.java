package com.planner5d.library.model.converter.json.from;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class i implements dagger.internal.h<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<z> f180600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<x> f180601b;

    public i(ij.c<z> cVar, ij.c<x> cVar2) {
        this.f180600a = cVar;
        this.f180601b = cVar2;
    }

    public static i a(ij.c<z> cVar, ij.c<x> cVar2) {
        return new i(cVar, cVar2);
    }

    public static h c(z zVar, x xVar) {
        return new h(zVar, xVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h get() {
        return c(this.f180600a.get(), this.f180601b.get());
    }
}
