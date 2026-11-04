package com.planner5d.library.uploadplan.view;

import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.statistics.events.e4;

/* JADX INFO: loaded from: classes11.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class i0 implements dagger.internal.h<h0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<b2> f231048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<ke.f> f231049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<e4> f231050c;

    public i0(ij.c<b2> cVar, ij.c<ke.f> cVar2, ij.c<e4> cVar3) {
        this.f231048a = cVar;
        this.f231049b = cVar2;
        this.f231050c = cVar3;
    }

    public static i0 a(ij.c<b2> cVar, ij.c<ke.f> cVar2, ij.c<e4> cVar3) {
        return new i0(cVar, cVar2, cVar3);
    }

    public static h0 c(b2 b2Var, ke.f fVar, e4 e4Var) {
        return new h0(b2Var, fVar, e4Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h0 get() {
        return c(this.f231048a.get(), this.f231049b.get(), this.f231050c.get());
    }
}
