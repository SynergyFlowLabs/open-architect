package com.planner5d.library.spaces.application;

import com.planner5d.library.model.manager.c2;

/* JADX INFO: loaded from: classes10.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class n implements dagger.internal.h<c2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f230008a;

    public n(f module) {
        this.f230008a = module;
    }

    public static n a(f module) {
        return new n(module);
    }

    public static c2 c(f instance) {
        return (c2) dagger.internal.p.f(instance.i());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c2 get() {
        return c(this.f230008a);
    }
}
