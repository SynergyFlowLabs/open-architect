package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class i0 implements dagger.internal.h<zc.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f142567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<d> f142568b;

    public i0(i iVar, ij.c<d> cVar) {
        this.f142567a = iVar;
        this.f142568b = cVar;
    }

    public static i0 a(i iVar, ij.c<d> cVar) {
        return new i0(iVar, cVar);
    }

    public static zc.b c(i iVar, d dVar) {
        return (zc.b) dagger.internal.p.f(iVar.D(dVar));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public zc.b get() {
        return c(this.f142567a, this.f142568b.get());
    }
}
