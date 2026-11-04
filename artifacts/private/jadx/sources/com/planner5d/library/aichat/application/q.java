package com.planner5d.library.aichat.application;

import com.planner5d.library.modules.user.user.u0;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class q implements dagger.internal.h<u0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f141927a;

    public q(b bVar) {
        this.f141927a = bVar;
    }

    public static q a(b bVar) {
        return new q(bVar);
    }

    public static u0 c(b bVar) {
        return (u0) dagger.internal.p.f(bVar.o());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u0 get() {
        return c(this.f141927a);
    }
}
