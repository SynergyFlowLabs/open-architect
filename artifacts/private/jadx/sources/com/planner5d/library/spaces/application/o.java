package com.planner5d.library.spaces.application;

/* JADX INFO: loaded from: classes10.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class o implements dagger.internal.h<com.planner5d.library.rabbitmq.h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f230009a;

    public o(f module) {
        this.f230009a = module;
    }

    public static o a(f module) {
        return new o(module);
    }

    public static com.planner5d.library.rabbitmq.h c(f instance) {
        return (com.planner5d.library.rabbitmq.h) dagger.internal.p.f(instance.j());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.rabbitmq.h get() {
        return c(this.f230009a);
    }
}
