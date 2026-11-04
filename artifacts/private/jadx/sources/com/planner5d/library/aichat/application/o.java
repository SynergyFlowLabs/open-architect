package com.planner5d.library.aichat.application;

import com.planner5d.library.modules.user.user.w;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class o implements dagger.internal.h<w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f141925a;

    public o(b bVar) {
        this.f141925a = bVar;
    }

    public static o a(b bVar) {
        return new o(bVar);
    }

    public static w c(b bVar) {
        return (w) dagger.internal.p.f(bVar.m());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public w get() {
        return c(this.f141925a);
    }
}
