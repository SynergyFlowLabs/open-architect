package com.planner5d.planner5d;

/* JADX INFO: loaded from: classes12.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class d0 implements dagger.internal.h<ac.f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t f258924a;

    public d0(t tVar) {
        this.f258924a = tVar;
    }

    public static d0 a(t tVar) {
        return new d0(tVar);
    }

    public static ac.f c(t tVar) {
        return (ac.f) dagger.internal.p.f(tVar.j());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ac.f get() {
        return c(this.f258924a);
    }
}
