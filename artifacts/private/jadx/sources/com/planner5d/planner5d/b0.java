package com.planner5d.planner5d;

/* JADX INFO: loaded from: classes12.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class b0 implements dagger.internal.h<vb.g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t f258915a;

    public b0(t tVar) {
        this.f258915a = tVar;
    }

    public static b0 a(t tVar) {
        return new b0(tVar);
    }

    public static vb.g c(t tVar) {
        return (vb.g) dagger.internal.p.f(tVar.h());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public vb.g get() {
        return c(this.f258915a);
    }
}
