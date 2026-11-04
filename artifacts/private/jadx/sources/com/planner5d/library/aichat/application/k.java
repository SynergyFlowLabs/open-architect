package com.planner5d.library.aichat.application;

import com.planner5d.library.services.y;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class k implements dagger.internal.h<y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f141921a;

    public k(b bVar) {
        this.f141921a = bVar;
    }

    public static k a(b bVar) {
        return new k(bVar);
    }

    public static y c(b bVar) {
        return (y) dagger.internal.p.f(bVar.i());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public y get() {
        return c(this.f141921a);
    }
}
