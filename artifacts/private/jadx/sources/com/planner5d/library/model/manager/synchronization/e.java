package com.planner5d.library.model.manager.synchronization;

import com.planner5d.library.model.manager.b4;
import com.planner5d.library.model.manager.c0;
import com.planner5d.library.model.manager.config.p;
import com.planner5d.library.model.manager.d5;
import com.planner5d.library.model.manager.project.d0;
import com.planner5d.library.model.manager.t1;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@r
@dagger.internal.e
@s
public final class e implements dagger.internal.h<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f222184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.contest.g> f222185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<c0> f222186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<t1> f222187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<d0> f222188e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<p> f222189f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<b4> f222190g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<d5> f222191h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<com.planner5d.library.api.requests.c> f222192i;

    public e(ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.model.manager.contest.g> cVar2, ij.c<c0> cVar3, ij.c<t1> cVar4, ij.c<d0> cVar5, ij.c<p> cVar6, ij.c<b4> cVar7, ij.c<d5> cVar8, ij.c<com.planner5d.library.api.requests.c> cVar9) {
        this.f222184a = cVar;
        this.f222185b = cVar2;
        this.f222186c = cVar3;
        this.f222187d = cVar4;
        this.f222188e = cVar5;
        this.f222189f = cVar6;
        this.f222190g = cVar7;
        this.f222191h = cVar8;
        this.f222192i = cVar9;
    }

    public static e a(ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.model.manager.contest.g> cVar2, ij.c<c0> cVar3, ij.c<t1> cVar4, ij.c<d0> cVar5, ij.c<p> cVar6, ij.c<b4> cVar7, ij.c<d5> cVar8, ij.c<com.planner5d.library.api.requests.c> cVar9) {
        return new e(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9);
    }

    public static d c(com.planner5d.library.application.b bVar, com.planner5d.library.model.manager.contest.g gVar, c0 c0Var, fg.e<t1> eVar, d0 d0Var, p pVar, b4 b4Var, d5 d5Var, com.planner5d.library.api.requests.c cVar) {
        return new d(bVar, gVar, c0Var, eVar, d0Var, pVar, b4Var, d5Var, cVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f222184a.get(), this.f222185b.get(), this.f222186c.get(), dagger.internal.g.a(this.f222187d), this.f222188e.get(), this.f222189f.get(), this.f222190g.get(), this.f222191h.get(), this.f222192i.get());
    }
}
