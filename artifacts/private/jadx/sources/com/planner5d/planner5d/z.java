package com.planner5d.planner5d;

/* JADX INFO: loaded from: classes13.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class z implements dagger.internal.h<bc.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t f264829a;

    public z(t tVar) {
        this.f264829a = tVar;
    }

    public static z a(t tVar) {
        return new z(tVar);
    }

    public static bc.c c(t tVar) {
        return (bc.c) dagger.internal.p.f(tVar.f());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public bc.c get() {
        return c(this.f264829a);
    }
}
