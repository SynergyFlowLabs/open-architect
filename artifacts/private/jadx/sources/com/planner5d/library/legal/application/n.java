package com.planner5d.library.legal.application;

import com.planner5d.library.model.manager.p5;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class n implements dagger.internal.h<p5> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f180340a;

    public n(f fVar) {
        this.f180340a = fVar;
    }

    public static n a(f fVar) {
        return new n(fVar);
    }

    public static p5 c(f fVar) {
        return (p5) dagger.internal.p.f(fVar.h());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p5 get() {
        return c(this.f180340a);
    }
}
