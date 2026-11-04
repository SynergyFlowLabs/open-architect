package com.planner5d.planner5d;

/* JADX INFO: loaded from: classes12.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class e0 implements dagger.internal.h<com.planner5d.library.engine.p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t f258932a;

    public e0(t tVar) {
        this.f258932a = tVar;
    }

    public static e0 a(t tVar) {
        return new e0(tVar);
    }

    public static com.planner5d.library.engine.p c(t tVar) {
        return (com.planner5d.library.engine.p) dagger.internal.p.f(tVar.k());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.engine.p get() {
        return c(this.f258932a);
    }
}
