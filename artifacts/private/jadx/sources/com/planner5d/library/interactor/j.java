package com.planner5d.library.interactor;

import com.planner5d.library.model.manager.b2;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class j implements dagger.internal.h<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.n> f180183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<le.d> f180184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<b2> f180185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.x> f180186d;

    public j(ij.c<com.planner5d.library.activity.fragment.n> cVar, ij.c<le.d> cVar2, ij.c<b2> cVar3, ij.c<com.planner5d.library.activity.fragment.x> cVar4) {
        this.f180183a = cVar;
        this.f180184b = cVar2;
        this.f180185c = cVar3;
        this.f180186d = cVar4;
    }

    public static j a(ij.c<com.planner5d.library.activity.fragment.n> cVar, ij.c<le.d> cVar2, ij.c<b2> cVar3, ij.c<com.planner5d.library.activity.fragment.x> cVar4) {
        return new j(cVar, cVar2, cVar3, cVar4);
    }

    public static i c(com.planner5d.library.activity.fragment.n nVar, le.d dVar, b2 b2Var, com.planner5d.library.activity.fragment.x xVar) {
        return new i(nVar, dVar, b2Var, xVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.f180183a.get(), this.f180184b.get(), this.f180185c.get(), this.f180186d.get());
    }
}
