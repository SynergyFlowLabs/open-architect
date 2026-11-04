package com.planner5d.library.model.converter.json.from;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class n implements dagger.internal.h<m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<z> f180614a;

    public n(ij.c<z> cVar) {
        this.f180614a = cVar;
    }

    public static n a(ij.c<z> cVar) {
        return new n(cVar);
    }

    public static m c(z zVar) {
        return new m(zVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m get() {
        return c(this.f180614a.get());
    }
}
