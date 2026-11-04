package com.planner5d.library.legal.application;

import com.planner5d.library.modules.user.user.r0;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class p implements dagger.internal.h<r0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f180342a;

    public p(f fVar) {
        this.f180342a = fVar;
    }

    public static p a(f fVar) {
        return new p(fVar);
    }

    public static r0 c(f fVar) {
        return (r0) dagger.internal.p.f(fVar.j());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r0 get() {
        return c(this.f180342a);
    }
}
