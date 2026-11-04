package com.planner5d.library.legal.application;

import com.planner5d.library.modules.user.user.w;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class o implements dagger.internal.h<w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f180341a;

    public o(f fVar) {
        this.f180341a = fVar;
    }

    public static o a(f fVar) {
        return new o(fVar);
    }

    public static w c(f fVar) {
        return (w) dagger.internal.p.f(fVar.i());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public w get() {
        return c(this.f180341a);
    }
}
