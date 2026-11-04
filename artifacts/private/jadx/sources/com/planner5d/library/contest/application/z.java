package com.planner5d.library.contest.application;

/* JADX INFO: loaded from: classes4.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class z implements dagger.internal.h<com.planner5d.library.model.manager.config.p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f148472a;

    public z(b bVar) {
        this.f148472a = bVar;
    }

    public static z a(b bVar) {
        return new z(bVar);
    }

    public static com.planner5d.library.model.manager.config.p c(b bVar) {
        return (com.planner5d.library.model.manager.config.p) dagger.internal.p.f(bVar.x());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.config.p get() {
        return c(this.f148472a);
    }
}
