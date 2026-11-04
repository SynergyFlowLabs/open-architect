package com.planner5d.library.legal.application;

import com.planner5d.library.model.manager.u1;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class i implements dagger.internal.h<u1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f180335a;

    public i(f fVar) {
        this.f180335a = fVar;
    }

    public static i a(f fVar) {
        return new i(fVar);
    }

    public static u1 c(f fVar) {
        return (u1) dagger.internal.p.f(fVar.c());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u1 get() {
        return c(this.f180335a);
    }
}
