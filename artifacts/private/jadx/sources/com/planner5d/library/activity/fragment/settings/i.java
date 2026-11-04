package com.planner5d.library.activity.fragment.settings;

import com.planner5d.library.model.manager.b2;
import com.planner5d.library.modules.user.user.g1;
import com.planner5d.library.modules.user.user.t;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
@s
public final class i implements dagger.internal.h<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<t> f135263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<g1> f135264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<b2> f135265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.auth.m> f135266d;

    public i(ij.c<t> cVar, ij.c<g1> cVar2, ij.c<b2> cVar3, ij.c<com.planner5d.library.modules.user.auth.m> cVar4) {
        this.f135263a = cVar;
        this.f135264b = cVar2;
        this.f135265c = cVar3;
        this.f135266d = cVar4;
    }

    public static i a(ij.c<t> cVar, ij.c<g1> cVar2, ij.c<b2> cVar3, ij.c<com.planner5d.library.modules.user.auth.m> cVar4) {
        return new i(cVar, cVar2, cVar3, cVar4);
    }

    public static h c(t tVar, g1 g1Var, b2 b2Var, com.planner5d.library.modules.user.auth.m mVar) {
        return new h(tVar, g1Var, b2Var, mVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h get() {
        return c(this.f135263a.get(), this.f135264b.get(), this.f135265c.get(), this.f135266d.get());
    }
}
