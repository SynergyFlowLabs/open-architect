package com.planner5d.library.uploadplan.application;

import com.planner5d.library.model.manager.t1;
import com.planner5d.library.model.manager.u1;

/* JADX INFO: loaded from: classes11.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class q implements dagger.internal.h<u1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f230736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<t1> f230737b;

    public q(h hVar, ij.c<t1> cVar) {
        this.f230736a = hVar;
        this.f230737b = cVar;
    }

    public static q a(h hVar, ij.c<t1> cVar) {
        return new q(hVar, cVar);
    }

    public static u1 c(h hVar, t1 t1Var) {
        return (u1) dagger.internal.p.f(hVar.i(t1Var));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u1 get() {
        return c(this.f230736a, this.f230737b.get());
    }
}
