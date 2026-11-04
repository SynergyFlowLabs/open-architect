package com.planner5d.library.legal.application;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class l implements dagger.internal.h<com.planner5d.library.model.manager.config.p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f180338a;

    public l(f fVar) {
        this.f180338a = fVar;
    }

    public static l a(f fVar) {
        return new l(fVar);
    }

    public static com.planner5d.library.model.manager.config.p c(f fVar) {
        return (com.planner5d.library.model.manager.config.p) dagger.internal.p.f(fVar.f());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.config.p get() {
        return c(this.f180338a);
    }
}
