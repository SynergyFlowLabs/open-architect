package com.planner5d.library.spaces.application;

/* JADX INFO: loaded from: classes10.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class q implements dagger.internal.h<com.planner5d.library.spaces.data.e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f230011a;

    public q(f module) {
        this.f230011a = module;
    }

    public static q a(f module) {
        return new q(module);
    }

    public static com.planner5d.library.spaces.data.e c(f instance) {
        return (com.planner5d.library.spaces.data.e) dagger.internal.p.f(instance.l());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.spaces.data.e get() {
        return c(this.f230011a);
    }
}
