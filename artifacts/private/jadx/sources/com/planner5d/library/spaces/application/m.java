package com.planner5d.library.spaces.application;

/* JADX INFO: loaded from: classes10.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class m implements dagger.internal.h<com.planner5d.library.services.q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f230007a;

    public m(f module) {
        this.f230007a = module;
    }

    public static m a(f module) {
        return new m(module);
    }

    public static com.planner5d.library.services.q c(f instance) {
        return (com.planner5d.library.services.q) dagger.internal.p.f(instance.h());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.services.q get() {
        return c(this.f230007a);
    }
}
