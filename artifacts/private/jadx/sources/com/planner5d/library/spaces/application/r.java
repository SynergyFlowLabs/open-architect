package com.planner5d.library.spaces.application;

import com.planner5d.library.model.manager.statistics.events.c4;

/* JADX INFO: loaded from: classes10.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class r implements dagger.internal.h<c4> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f230012a;

    public r(f module) {
        this.f230012a = module;
    }

    public static r a(f module) {
        return new r(module);
    }

    public static c4 c(f instance) {
        return (c4) dagger.internal.p.f(instance.m());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c4 get() {
        return c(this.f230012a);
    }
}
