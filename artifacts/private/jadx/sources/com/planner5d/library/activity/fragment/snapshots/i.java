package com.planner5d.library.activity.fragment.snapshots;

import com.planner5d.library.model.manager.b4;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class i implements dagger.internal.h<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.w> f136027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.u0> f136028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<b4> f136029c;

    public i(ij.c<com.planner5d.library.modules.user.user.w> cVar, ij.c<com.planner5d.library.modules.user.user.u0> cVar2, ij.c<b4> cVar3) {
        this.f136027a = cVar;
        this.f136028b = cVar2;
        this.f136029c = cVar3;
    }

    public static i a(ij.c<com.planner5d.library.modules.user.user.w> cVar, ij.c<com.planner5d.library.modules.user.user.u0> cVar2, ij.c<b4> cVar3) {
        return new i(cVar, cVar2, cVar3);
    }

    public static h c(com.planner5d.library.modules.user.user.w wVar, com.planner5d.library.modules.user.user.u0 u0Var, b4 b4Var) {
        return new h(wVar, u0Var, b4Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h get() {
        return c(this.f136027a.get(), this.f136028b.get(), this.f136029c.get());
    }
}
