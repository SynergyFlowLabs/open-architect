package com.planner5d.planner5d;

/* JADX INFO: loaded from: classes13.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class v implements dagger.internal.h<com.planner5d.library.engine.i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t f264818a;

    public v(t tVar) {
        this.f264818a = tVar;
    }

    public static v a(t tVar) {
        return new v(tVar);
    }

    public static com.planner5d.library.engine.i c(t tVar) {
        return (com.planner5d.library.engine.i) dagger.internal.p.f(tVar.b());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.engine.i get() {
        return c(this.f264818a);
    }
}
