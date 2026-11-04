package com.planner5d.library.model.converter.json.from;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class p implements dagger.internal.h<o> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<z> f180616a;

    public p(ij.c<z> cVar) {
        this.f180616a = cVar;
    }

    public static p a(ij.c<z> cVar) {
        return new p(cVar);
    }

    public static o c(z zVar) {
        return new o(zVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public o get() {
        return c(this.f180616a.get());
    }
}
