package com.planner5d.library.legal.application;

import com.planner5d.library.services.utility.c2;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class k implements dagger.internal.h<c2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f180337a;

    public k(f fVar) {
        this.f180337a = fVar;
    }

    public static k a(f fVar) {
        return new k(fVar);
    }

    public static c2 c(f fVar) {
        return (c2) dagger.internal.p.f(fVar.e());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c2 get() {
        return c(this.f180337a);
    }
}
