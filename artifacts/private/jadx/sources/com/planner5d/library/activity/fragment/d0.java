package com.planner5d.library.activity.fragment;

import com.planner5d.library.model.manager.b2;
import com.planner5d.library.model.manager.s0;
import com.planner5d.library.model.manager.y1;

/* JADX INFO: loaded from: classes5.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class d0 implements dagger.internal.h<c0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<y1> f131593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<s0> f131594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<b2> f131595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<x> f131596d;

    public d0(ij.c<y1> cVar, ij.c<s0> cVar2, ij.c<b2> cVar3, ij.c<x> cVar4) {
        this.f131593a = cVar;
        this.f131594b = cVar2;
        this.f131595c = cVar3;
        this.f131596d = cVar4;
    }

    public static d0 a(ij.c<y1> cVar, ij.c<s0> cVar2, ij.c<b2> cVar3, ij.c<x> cVar4) {
        return new d0(cVar, cVar2, cVar3, cVar4);
    }

    public static c0 c(y1 y1Var, s0 s0Var, b2 b2Var, x xVar) {
        return new c0(y1Var, s0Var, b2Var, xVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c0 get() {
        return c(this.f131593a.get(), this.f131594b.get(), this.f131595c.get(), this.f131596d.get());
    }
}
