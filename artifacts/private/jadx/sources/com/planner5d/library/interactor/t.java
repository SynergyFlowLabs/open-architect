package com.planner5d.library.interactor;

import com.planner5d.library.services.utility.f1;
import com.planner5d.library.services.utility.p0;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class t implements dagger.internal.h<s> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<p0> f180278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.project.d0> f180279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f180280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<f1> f180281d;

    public t(ij.c<p0> cVar, ij.c<com.planner5d.library.model.manager.project.d0> cVar2, ij.c<com.planner5d.library.modules.user.user.t> cVar3, ij.c<f1> cVar4) {
        this.f180278a = cVar;
        this.f180279b = cVar2;
        this.f180280c = cVar3;
        this.f180281d = cVar4;
    }

    public static t a(ij.c<p0> cVar, ij.c<com.planner5d.library.model.manager.project.d0> cVar2, ij.c<com.planner5d.library.modules.user.user.t> cVar3, ij.c<f1> cVar4) {
        return new t(cVar, cVar2, cVar3, cVar4);
    }

    public static s c(p0 p0Var, com.planner5d.library.model.manager.project.d0 d0Var, com.planner5d.library.modules.user.user.t tVar, f1 f1Var) {
        return new s(p0Var, d0Var, tVar, f1Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public s get() {
        return c(this.f180278a.get(), this.f180279b.get(), this.f180280c.get(), this.f180281d.get());
    }
}
