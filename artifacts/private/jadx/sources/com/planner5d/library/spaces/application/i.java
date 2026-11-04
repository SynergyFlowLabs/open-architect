package com.planner5d.library.spaces.application;

import com.planner5d.library.model.manager.w;

/* JADX INFO: loaded from: classes10.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class i implements dagger.internal.h<w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f230001a;

    public i(f module) {
        this.f230001a = module;
    }

    public static i a(f module) {
        return new i(module);
    }

    public static w c(f instance) {
        return (w) dagger.internal.p.f(instance.d());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public w get() {
        return c(this.f230001a);
    }
}
