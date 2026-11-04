package com.planner5d.library.application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class s0 implements dagger.internal.h<okhttp3.b0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f148262a;

    public s0(i iVar) {
        this.f148262a = iVar;
    }

    public static s0 a(i iVar) {
        return new s0(iVar);
    }

    public static okhttp3.b0 c(i iVar) {
        return (okhttp3.b0) dagger.internal.p.f(iVar.N());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public okhttp3.b0 get() {
        return c(this.f148262a);
    }
}
