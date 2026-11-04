package com.planner5d.library.interactor;

import com.planner5d.library.services.utility.f1;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class i0 implements dagger.internal.h<h0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.helper.b0> f180181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<f1> f180182b;

    public i0(ij.c<com.planner5d.library.activity.helper.b0> cVar, ij.c<f1> cVar2) {
        this.f180181a = cVar;
        this.f180182b = cVar2;
    }

    public static i0 a(ij.c<com.planner5d.library.activity.helper.b0> cVar, ij.c<f1> cVar2) {
        return new i0(cVar, cVar2);
    }

    public static h0 c(com.planner5d.library.activity.helper.b0 b0Var, f1 f1Var) {
        return new h0(b0Var, f1Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h0 get() {
        return c(this.f180181a.get(), this.f180182b.get());
    }
}
