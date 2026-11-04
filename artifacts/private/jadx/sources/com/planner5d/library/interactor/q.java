package com.planner5d.library.interactor;

import com.planner5d.library.model.manager.k1;
import com.planner5d.library.modules.user.user.t0;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class q implements dagger.internal.h<p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<t0> f180261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.unlockeditems.b> f180262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.d> f180263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<k1> f180264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.d> f180265e;

    public q(ij.c<t0> cVar, ij.c<com.planner5d.library.model.manager.unlockeditems.b> cVar2, ij.c<com.planner5d.library.model.manager.d> cVar3, ij.c<k1> cVar4, ij.c<com.planner5d.library.model.manager.config.d> cVar5) {
        this.f180261a = cVar;
        this.f180262b = cVar2;
        this.f180263c = cVar3;
        this.f180264d = cVar4;
        this.f180265e = cVar5;
    }

    public static q a(ij.c<t0> cVar, ij.c<com.planner5d.library.model.manager.unlockeditems.b> cVar2, ij.c<com.planner5d.library.model.manager.d> cVar3, ij.c<k1> cVar4, ij.c<com.planner5d.library.model.manager.config.d> cVar5) {
        return new q(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static p c(t0 t0Var, com.planner5d.library.model.manager.unlockeditems.b bVar, com.planner5d.library.model.manager.d dVar, k1 k1Var, com.planner5d.library.model.manager.config.d dVar2) {
        return new p(t0Var, bVar, dVar, k1Var, dVar2);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p get() {
        return c(this.f180261a.get(), this.f180262b.get(), this.f180263c.get(), this.f180264d.get(), this.f180265e.get());
    }
}
