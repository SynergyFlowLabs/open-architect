package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class l implements dagger.internal.h<com.planner5d.library.services.bitmaploader.cache.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142598a;

    public l(i iVar) {
        this.f142598a = iVar;
    }

    public static l a(i iVar) {
        return new l(iVar);
    }

    public static com.planner5d.library.services.bitmaploader.cache.a c(i iVar) {
        return (com.planner5d.library.services.bitmaploader.cache.a) dagger.internal.p.f(iVar.g());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.services.bitmaploader.cache.a get() {
        return c(this.f142598a);
    }
}
