package com.planner5d.planner5d;

/* JADX INFO: loaded from: classes12.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class c0 implements dagger.internal.h<cc.f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t f258921a;

    public c0(t tVar) {
        this.f258921a = tVar;
    }

    public static c0 a(t tVar) {
        return new c0(tVar);
    }

    public static cc.f c(t tVar) {
        return (cc.f) dagger.internal.p.f(tVar.i());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public cc.f get() {
        return c(this.f258921a);
    }
}
