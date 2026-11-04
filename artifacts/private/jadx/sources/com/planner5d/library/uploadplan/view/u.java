package com.planner5d.library.uploadplan.view;

import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.statistics.events.e4;

/* JADX INFO: loaded from: classes11.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class u implements dagger.internal.h<t> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<e4> f231174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<ke.d> f231175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<b2> f231176c;

    public u(ij.c<e4> cVar, ij.c<ke.d> cVar2, ij.c<b2> cVar3) {
        this.f231174a = cVar;
        this.f231175b = cVar2;
        this.f231176c = cVar3;
    }

    public static u a(ij.c<e4> cVar, ij.c<ke.d> cVar2, ij.c<b2> cVar3) {
        return new u(cVar, cVar2, cVar3);
    }

    public static t c(e4 e4Var, ke.d dVar, b2 b2Var) {
        return new t(e4Var, dVar, b2Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t get() {
        return c(this.f231174a.get(), this.f231175b.get(), this.f231176c.get());
    }
}
