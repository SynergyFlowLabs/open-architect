package com.planner5d.library.spaces.application;

/* JADX INFO: loaded from: classes10.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class h implements dagger.internal.h<com.planner5d.library.model.manager.k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f230000a;

    public h(f module) {
        this.f230000a = module;
    }

    public static h a(f module) {
        return new h(module);
    }

    public static com.planner5d.library.model.manager.k c(f instance) {
        return (com.planner5d.library.model.manager.k) dagger.internal.p.f(instance.c());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.k get() {
        return c(this.f230000a);
    }
}
