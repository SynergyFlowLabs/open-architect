package com.planner5d.library.model.manager;

import android.app.Application;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class t4 implements dagger.internal.h<o4> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f222243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<h1> f222244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.c2> f222245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<q4> f222246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<p5> f222247e;

    public t4(ij.c<Application> cVar, ij.c<h1> cVar2, ij.c<com.planner5d.library.services.utility.c2> cVar3, ij.c<q4> cVar4, ij.c<p5> cVar5) {
        this.f222243a = cVar;
        this.f222244b = cVar2;
        this.f222245c = cVar3;
        this.f222246d = cVar4;
        this.f222247e = cVar5;
    }

    public static t4 a(ij.c<Application> cVar, ij.c<h1> cVar2, ij.c<com.planner5d.library.services.utility.c2> cVar3, ij.c<q4> cVar4, ij.c<p5> cVar5) {
        return new t4(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static o4 c(Application application, h1 h1Var, com.planner5d.library.services.utility.c2 c2Var, q4 q4Var, p5 p5Var) {
        return new o4(application, h1Var, c2Var, q4Var, p5Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public o4 get() {
        return c(this.f222243a.get(), this.f222244b.get(), this.f222245c.get(), this.f222246d.get(), this.f222247e.get());
    }
}
