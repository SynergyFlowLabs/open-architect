package com.planner5d.planner5d;

import android.view.View;

/* JADX INFO: loaded from: classes13.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class w0 implements dagger.internal.h<View> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u0 f264822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<Application> f264823b;

    public w0(u0 u0Var, ij.c<Application> cVar) {
        this.f264822a = u0Var;
        this.f264823b = cVar;
    }

    public static w0 a(u0 u0Var, ij.c<Application> cVar) {
        return new w0(u0Var, cVar);
    }

    public static View c(u0 u0Var, Application application) {
        return (View) dagger.internal.p.f(u0Var.b(application));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public View get() {
        return c(this.f264822a, this.f264823b.get());
    }
}
