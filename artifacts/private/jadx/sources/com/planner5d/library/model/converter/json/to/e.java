package com.planner5d.library.model.converter.json.to;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class e implements dagger.internal.h<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<z> f180650a;

    public e(ij.c<z> cVar) {
        this.f180650a = cVar;
    }

    public static e a(ij.c<z> cVar) {
        return new e(cVar);
    }

    public static d c(z zVar) {
        return new d(zVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f180650a.get());
    }
}
