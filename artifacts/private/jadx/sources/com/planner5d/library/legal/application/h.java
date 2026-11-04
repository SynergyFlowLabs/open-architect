package com.planner5d.library.legal.application;

import com.planner5d.library.services.utility.f1;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class h implements dagger.internal.h<f1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f180334a;

    public h(f fVar) {
        this.f180334a = fVar;
    }

    public static h a(f fVar) {
        return new h(fVar);
    }

    public static f1 c(f fVar) {
        return (f1) dagger.internal.p.f(fVar.b());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f1 get() {
        return c(this.f180334a);
    }
}
