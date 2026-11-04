package com.planner5d.library.activity.fragment.snapshots;

import com.planner5d.library.model.manager.b4;
import com.planner5d.library.model.manager.d4;
import com.planner5d.library.model.manager.y1;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class d1 implements dagger.internal.h<c1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<y1> f135985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<b4> f135986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<d4> f135987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.t> f135988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.c0> f135989e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.k> f135990f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.x> f135991g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.projects.c0> f135992h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.t> f135993i;

    public d1(ij.c<y1> cVar, ij.c<b4> cVar2, ij.c<d4> cVar3, ij.c<com.planner5d.library.modules.user.user.t> cVar4, ij.c<com.planner5d.library.model.manager.c0> cVar5, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar6, ij.c<com.planner5d.library.activity.fragment.x> cVar7, ij.c<com.planner5d.library.activity.fragment.projects.c0> cVar8, ij.c<com.planner5d.library.services.utility.t> cVar9) {
        this.f135985a = cVar;
        this.f135986b = cVar2;
        this.f135987c = cVar3;
        this.f135988d = cVar4;
        this.f135989e = cVar5;
        this.f135990f = cVar6;
        this.f135991g = cVar7;
        this.f135992h = cVar8;
        this.f135993i = cVar9;
    }

    public static d1 a(ij.c<y1> cVar, ij.c<b4> cVar2, ij.c<d4> cVar3, ij.c<com.planner5d.library.modules.user.user.t> cVar4, ij.c<com.planner5d.library.model.manager.c0> cVar5, ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar6, ij.c<com.planner5d.library.activity.fragment.x> cVar7, ij.c<com.planner5d.library.activity.fragment.projects.c0> cVar8, ij.c<com.planner5d.library.services.utility.t> cVar9) {
        return new d1(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9);
    }

    public static c1 c(y1 y1Var, b4 b4Var, d4 d4Var, com.planner5d.library.modules.user.user.t tVar, com.planner5d.library.model.manager.c0 c0Var, com.planner5d.library.activity.fragment.dialog.k kVar, com.planner5d.library.activity.fragment.x xVar, com.planner5d.library.activity.fragment.projects.c0 c0Var2, com.planner5d.library.services.utility.t tVar2) {
        return new c1(y1Var, b4Var, d4Var, tVar, c0Var, kVar, xVar, c0Var2, tVar2);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c1 get() {
        return c(this.f135985a.get(), this.f135986b.get(), this.f135987c.get(), this.f135988d.get(), this.f135989e.get(), this.f135990f.get(), this.f135991g.get(), this.f135992h.get(), this.f135993i.get());
    }
}
