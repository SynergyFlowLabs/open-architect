package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class s2 implements dagger.internal.h<com.planner5d.library.services.bitmaploader.d.g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f148265a;

    public s2(i iVar) {
        this.f148265a = iVar;
    }

    public static s2 a(i iVar) {
        return new s2(iVar);
    }

    public static com.planner5d.library.services.bitmaploader.d.g c(i iVar) {
        return (com.planner5d.library.services.bitmaploader.d.g) dagger.internal.p.f(iVar.R0());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.services.bitmaploader.d.g get() {
        return c(this.f148265a);
    }
}
