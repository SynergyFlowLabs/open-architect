package com.planner5d.library.legal.application;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class g implements dagger.internal.h<com.planner5d.library.model.manager.h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f180333a;

    public g(f fVar) {
        this.f180333a = fVar;
    }

    public static g a(f fVar) {
        return new g(fVar);
    }

    public static com.planner5d.library.model.manager.h c(f fVar) {
        return (com.planner5d.library.model.manager.h) dagger.internal.p.f(fVar.a());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.h get() {
        return c(this.f180333a);
    }
}
