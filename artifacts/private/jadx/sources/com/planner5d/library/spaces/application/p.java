package com.planner5d.library.spaces.application;

/* JADX INFO: loaded from: classes10.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class p implements dagger.internal.h<com.planner5d.library.model.manager.config.p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f230010a;

    public p(f module) {
        this.f230010a = module;
    }

    public static p a(f module) {
        return new p(module);
    }

    public static com.planner5d.library.model.manager.config.p c(f instance) {
        return (com.planner5d.library.model.manager.config.p) dagger.internal.p.f(instance.k());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.config.p get() {
        return c(this.f230010a);
    }
}
