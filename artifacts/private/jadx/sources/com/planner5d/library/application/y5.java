package com.planner5d.library.application;

import android.app.Application;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class y5 implements dagger.internal.h<Application> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w5 f148336a;

    public y5(w5 w5Var) {
        this.f148336a = w5Var;
    }

    public static y5 a(w5 w5Var) {
        return new y5(w5Var);
    }

    public static Application c(w5 w5Var) {
        return (Application) dagger.internal.p.f(w5Var.a());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Application get() {
        return c(this.f148336a);
    }
}
