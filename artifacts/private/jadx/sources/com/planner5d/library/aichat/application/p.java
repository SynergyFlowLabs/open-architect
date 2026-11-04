package com.planner5d.library.aichat.application;

import com.planner5d.library.modules.user.user.a0;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class p implements dagger.internal.h<a0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f141926a;

    public p(b bVar) {
        this.f141926a = bVar;
    }

    public static p a(b bVar) {
        return new p(bVar);
    }

    public static a0 c(b bVar) {
        return (a0) dagger.internal.p.f(bVar.n());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a0 get() {
        return c(this.f141926a);
    }
}
