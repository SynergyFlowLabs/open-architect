package com.planner5d.library.model.manager;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class z0 implements dagger.internal.h<y0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.bitmaploader.d> f222421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<w0> f222422b;

    public z0(ij.c<com.planner5d.library.services.bitmaploader.d> cVar, ij.c<w0> cVar2) {
        this.f222421a = cVar;
        this.f222422b = cVar2;
    }

    public static z0 a(ij.c<com.planner5d.library.services.bitmaploader.d> cVar, ij.c<w0> cVar2) {
        return new z0(cVar, cVar2);
    }

    public static y0 c(com.planner5d.library.services.bitmaploader.d dVar, fg.e<w0> eVar) {
        return new y0(dVar, eVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public y0 get() {
        return c(this.f222421a.get(), dagger.internal.g.a(this.f222422b));
    }
}
