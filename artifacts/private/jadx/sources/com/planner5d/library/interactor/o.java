package com.planner5d.library.interactor;

import android.app.Application;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class o implements dagger.internal.h<m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f180242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<s0> f180243b;

    public o(ij.c<Application> cVar, ij.c<s0> cVar2) {
        this.f180242a = cVar;
        this.f180243b = cVar2;
    }

    public static o a(ij.c<Application> cVar, ij.c<s0> cVar2) {
        return new o(cVar, cVar2);
    }

    public static m c(Application application, s0 s0Var) {
        return new m(application, s0Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m get() {
        return c(this.f180242a.get(), this.f180243b.get());
    }
}
