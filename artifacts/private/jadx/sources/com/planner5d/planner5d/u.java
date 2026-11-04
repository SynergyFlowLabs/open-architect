package com.planner5d.planner5d;

/* JADX INFO: loaded from: classes13.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class u implements dagger.internal.h<com.planner5d.library.engine.h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t f264817a;

    public u(t tVar) {
        this.f264817a = tVar;
    }

    public static u a(t tVar) {
        return new u(tVar);
    }

    public static com.planner5d.library.engine.h c(t tVar) {
        return (com.planner5d.library.engine.h) dagger.internal.p.f(tVar.a());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.engine.h get() {
        return c(this.f264817a);
    }
}
