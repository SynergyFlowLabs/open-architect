package com.planner5d.library.spaces.application;

import android.app.Application;

/* JADX INFO: loaded from: classes10.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class g implements dagger.internal.h<Application> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f229999a;

    public g(f module) {
        this.f229999a = module;
    }

    public static g a(f module) {
        return new g(module);
    }

    public static Application c(f instance) {
        return (Application) dagger.internal.p.f(instance.b());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Application get() {
        return c(this.f229999a);
    }
}
