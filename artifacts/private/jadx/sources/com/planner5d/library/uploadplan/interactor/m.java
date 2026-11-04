package com.planner5d.library.uploadplan.interactor;

import com.planner5d.library.model.manager.u1;

/* JADX INFO: loaded from: classes11.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class m implements dagger.internal.h<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f230788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<u1> f230789b;

    public m(ij.c<com.planner5d.library.application.b> cVar, ij.c<u1> cVar2) {
        this.f230788a = cVar;
        this.f230789b = cVar2;
    }

    public static m a(ij.c<com.planner5d.library.application.b> cVar, ij.c<u1> cVar2) {
        return new m(cVar, cVar2);
    }

    public static l c(com.planner5d.library.application.b bVar, u1 u1Var) {
        return new l(bVar, u1Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l get() {
        return c(this.f230788a.get(), this.f230789b.get());
    }
}
