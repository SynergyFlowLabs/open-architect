package com.planner5d.library.model.manager.payments;

import com.planner5d.library.modules.user.user.u0;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class n implements dagger.internal.h<m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.w> f192558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<j> f192559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<u0> f192560c;

    public n(ij.c<com.planner5d.library.modules.user.user.w> cVar, ij.c<j> cVar2, ij.c<u0> cVar3) {
        this.f192558a = cVar;
        this.f192559b = cVar2;
        this.f192560c = cVar3;
    }

    public static n a(ij.c<com.planner5d.library.modules.user.user.w> cVar, ij.c<j> cVar2, ij.c<u0> cVar3) {
        return new n(cVar, cVar2, cVar3);
    }

    public static m c(fg.e<com.planner5d.library.modules.user.user.w> eVar, fg.e<j> eVar2, u0 u0Var) {
        return new m(eVar, eVar2, u0Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m get() {
        return c(dagger.internal.g.a(this.f192558a), dagger.internal.g.a(this.f192559b), this.f192560c.get());
    }
}
