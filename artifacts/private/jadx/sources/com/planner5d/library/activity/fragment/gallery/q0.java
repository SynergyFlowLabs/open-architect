package com.planner5d.library.activity.fragment.gallery;

import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.b4;
import com.planner5d.library.model.manager.y0;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class q0 implements dagger.internal.h<p0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<y0> f133898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<b4> f133899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<b2> f133900c;

    public q0(ij.c<y0> cVar, ij.c<b4> cVar2, ij.c<b2> cVar3) {
        this.f133898a = cVar;
        this.f133899b = cVar2;
        this.f133900c = cVar3;
    }

    public static q0 a(ij.c<y0> cVar, ij.c<b4> cVar2, ij.c<b2> cVar3) {
        return new q0(cVar, cVar2, cVar3);
    }

    public static p0 c(y0 y0Var, b4 b4Var, b2 b2Var) {
        return new p0(y0Var, b4Var, b2Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p0 get() {
        return c(this.f133898a.get(), this.f133899b.get(), this.f133900c.get());
    }
}
