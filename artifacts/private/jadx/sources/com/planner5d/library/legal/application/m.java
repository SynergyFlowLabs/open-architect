package com.planner5d.library.legal.application;

import com.planner5d.library.model.manager.statistics.d0;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class m implements dagger.internal.h<d0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f180339a;

    public m(f fVar) {
        this.f180339a = fVar;
    }

    public static m a(f fVar) {
        return new m(fVar);
    }

    public static d0 c(f fVar) {
        return (d0) dagger.internal.p.f(fVar.g());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d0 get() {
        return c(this.f180339a);
    }
}
