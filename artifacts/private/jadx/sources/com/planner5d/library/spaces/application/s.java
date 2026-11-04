package com.planner5d.library.spaces.application;

/* JADX INFO: loaded from: classes10.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class s implements dagger.internal.h<com.planner5d.library.api.requests.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f230013a;

    public s(f module) {
        this.f230013a = module;
    }

    public static s a(f module) {
        return new s(module);
    }

    public static com.planner5d.library.api.requests.c c(f instance) {
        return (com.planner5d.library.api.requests.c) dagger.internal.p.f(instance.n());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.api.requests.c get() {
        return c(this.f230013a);
    }
}
