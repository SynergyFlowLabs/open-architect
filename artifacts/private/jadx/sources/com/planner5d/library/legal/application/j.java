package com.planner5d.library.legal.application;

import com.planner5d.library.model.manager.h2;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class j implements dagger.internal.h<h2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f180336a;

    public j(f fVar) {
        this.f180336a = fVar;
    }

    public static j a(f fVar) {
        return new j(fVar);
    }

    public static h2 c(f fVar) {
        return (h2) dagger.internal.p.f(fVar.d());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h2 get() {
        return c(this.f180336a);
    }
}
