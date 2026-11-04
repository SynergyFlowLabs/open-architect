package com.planner5d.library.interactor;

import com.planner5d.library.activity.helper.f1;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class g0 implements dagger.internal.h<f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.project.d0> f180132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.w> f180133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.synchronization.i> f180134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<f1> f180135d;

    public g0(ij.c<com.planner5d.library.model.manager.project.d0> cVar, ij.c<com.planner5d.library.modules.user.user.w> cVar2, ij.c<com.planner5d.library.model.manager.synchronization.i> cVar3, ij.c<f1> cVar4) {
        this.f180132a = cVar;
        this.f180133b = cVar2;
        this.f180134c = cVar3;
        this.f180135d = cVar4;
    }

    public static g0 a(ij.c<com.planner5d.library.model.manager.project.d0> cVar, ij.c<com.planner5d.library.modules.user.user.w> cVar2, ij.c<com.planner5d.library.model.manager.synchronization.i> cVar3, ij.c<f1> cVar4) {
        return new g0(cVar, cVar2, cVar3, cVar4);
    }

    public static f0 c(com.planner5d.library.model.manager.project.d0 d0Var, com.planner5d.library.modules.user.user.w wVar, com.planner5d.library.model.manager.synchronization.i iVar, f1 f1Var) {
        return new f0(d0Var, wVar, iVar, f1Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f0 get() {
        return c(this.f180132a.get(), this.f180133b.get(), this.f180134c.get(), this.f180135d.get());
    }
}
