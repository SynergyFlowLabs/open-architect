package com.planner5d.library.model.converter.json.to;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class l implements dagger.internal.h<k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<z> f180659a;

    public l(ij.c<z> cVar) {
        this.f180659a = cVar;
    }

    public static l a(ij.c<z> cVar) {
        return new l(cVar);
    }

    public static k c(z zVar) {
        return new k(zVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c(this.f180659a.get());
    }
}
