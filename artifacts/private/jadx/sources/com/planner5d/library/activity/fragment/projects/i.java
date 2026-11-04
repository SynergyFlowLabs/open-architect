package com.planner5d.library.activity.fragment.projects;

import com.planner5d.library.model.manager.b2;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class i implements dagger.internal.h<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t0> f135020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<b2> f135021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.d> f135022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.helper.z0> f135023d;

    public i(ij.c<com.planner5d.library.modules.user.user.t0> cVar, ij.c<b2> cVar2, ij.c<com.planner5d.library.application.d> cVar3, ij.c<com.planner5d.library.activity.helper.z0> cVar4) {
        this.f135020a = cVar;
        this.f135021b = cVar2;
        this.f135022c = cVar3;
        this.f135023d = cVar4;
    }

    public static i a(ij.c<com.planner5d.library.modules.user.user.t0> cVar, ij.c<b2> cVar2, ij.c<com.planner5d.library.application.d> cVar3, ij.c<com.planner5d.library.activity.helper.z0> cVar4) {
        return new i(cVar, cVar2, cVar3, cVar4);
    }

    public static h c(com.planner5d.library.modules.user.user.t0 t0Var, b2 b2Var, com.planner5d.library.application.d dVar, com.planner5d.library.activity.helper.z0 z0Var) {
        return new h(t0Var, b2Var, dVar, z0Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h get() {
        return c(this.f135020a.get(), this.f135021b.get(), this.f135022c.get(), this.f135023d.get());
    }
}
