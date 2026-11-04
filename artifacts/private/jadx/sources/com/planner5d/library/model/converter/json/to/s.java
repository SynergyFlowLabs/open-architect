package com.planner5d.library.model.converter.json.to;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class s implements dagger.internal.h<r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<z> f180668a;

    public s(ij.c<z> cVar) {
        this.f180668a = cVar;
    }

    public static s a(ij.c<z> cVar) {
        return new s(cVar);
    }

    public static r c(z zVar) {
        return new r(zVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c(this.f180668a.get());
    }
}
