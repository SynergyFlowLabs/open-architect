package com.planner5d.library.spaces.application;

import com.planner5d.library.services.utility.f1;

/* JADX INFO: loaded from: classes10.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class l implements dagger.internal.h<f1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f230006a;

    public l(f module) {
        this.f230006a = module;
    }

    public static l a(f module) {
        return new l(module);
    }

    public static f1 c(f instance) {
        return (f1) dagger.internal.p.f(instance.g());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f1 get() {
        return c(this.f230006a);
    }
}
