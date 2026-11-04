package com.planner5d.planner5d;

/* JADX INFO: loaded from: classes13.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class x implements dagger.internal.h<cc.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t f264824a;

    public x(t tVar) {
        this.f264824a = tVar;
    }

    public static x a(t tVar) {
        return new x(tVar);
    }

    public static cc.b c(t tVar) {
        return (cc.b) dagger.internal.p.f(tVar.d());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public cc.b get() {
        return c(this.f264824a);
    }
}
