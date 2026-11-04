package com.planner5d.library.activity.fragment.dialog;

import com.planner5d.library.model.manager.u1;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class m implements dagger.internal.h<k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.statistics.d0> f132132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<u1> f132133b;

    public m(ij.c<com.planner5d.library.model.manager.statistics.d0> cVar, ij.c<u1> cVar2) {
        this.f132132a = cVar;
        this.f132133b = cVar2;
    }

    public static m a(ij.c<com.planner5d.library.model.manager.statistics.d0> cVar, ij.c<u1> cVar2) {
        return new m(cVar, cVar2);
    }

    public static k c(com.planner5d.library.model.manager.statistics.d0 d0Var, u1 u1Var) {
        return new k(d0Var, u1Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c(this.f132132a.get(), this.f132133b.get());
    }
}
