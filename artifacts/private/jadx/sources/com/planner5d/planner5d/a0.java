package com.planner5d.planner5d;

/* JADX INFO: loaded from: classes12.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class a0 implements dagger.internal.h<vb.f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t f258910a;

    public a0(t tVar) {
        this.f258910a = tVar;
    }

    public static a0 a(t tVar) {
        return new a0(tVar);
    }

    public static vb.f c(t tVar) {
        return (vb.f) dagger.internal.p.f(tVar.g());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public vb.f get() {
        return c(this.f258910a);
    }
}
