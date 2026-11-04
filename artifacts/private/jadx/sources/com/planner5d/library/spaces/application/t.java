package com.planner5d.library.spaces.application;

import com.planner5d.library.modules.user.user.w;

/* JADX INFO: loaded from: classes10.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class t implements dagger.internal.h<w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f230014a;

    public t(f module) {
        this.f230014a = module;
    }

    public static t a(f module) {
        return new t(module);
    }

    public static w c(f instance) {
        return (w) dagger.internal.p.f(instance.o());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public w get() {
        return c(this.f230014a);
    }
}
