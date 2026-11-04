package com.planner5d.library.contest.data;

import com.planner5d.library.activity.fragment.x;
import com.planner5d.library.model.manager.statistics.events.l3;
import com.planner5d.library.modules.user.user.w;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@r
@dagger.internal.e
@s
public final class g implements dagger.internal.h<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<w> f148533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<x> f148534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<l3> f148535c;

    public g(ij.c<w> cVar, ij.c<x> cVar2, ij.c<l3> cVar3) {
        this.f148533a = cVar;
        this.f148534b = cVar2;
        this.f148535c = cVar3;
    }

    public static g a(ij.c<w> cVar, ij.c<x> cVar2, ij.c<l3> cVar3) {
        return new g(cVar, cVar2, cVar3);
    }

    public static f c(w wVar, x xVar, l3 l3Var) {
        return new f(wVar, xVar, l3Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f get() {
        return c(this.f148533a.get(), this.f148534b.get(), this.f148535c.get());
    }
}
