package com.planner5d.library.interactor;

import com.planner5d.library.services.utility.f1;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class v implements dagger.internal.h<u> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.project.d0> f180292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<f1> f180293b;

    public v(ij.c<com.planner5d.library.model.manager.project.d0> cVar, ij.c<f1> cVar2) {
        this.f180292a = cVar;
        this.f180293b = cVar2;
    }

    public static v a(ij.c<com.planner5d.library.model.manager.project.d0> cVar, ij.c<f1> cVar2) {
        return new v(cVar, cVar2);
    }

    public static u c(com.planner5d.library.model.manager.project.d0 d0Var, f1 f1Var) {
        return new u(d0Var, f1Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u get() {
        return c(this.f180292a.get(), this.f180293b.get());
    }
}
