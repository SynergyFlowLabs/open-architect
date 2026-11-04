package com.planner5d.library.model.manager.payments;

import android.app.Application;
import com.planner5d.library.model.manager.c2;
import com.planner5d.library.model.manager.u1;
import com.planner5d.library.model.manager.w2;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class z implements dagger.internal.h<y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f193061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.w> f193062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<w2> f193063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<u1> f193064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<c2> f193065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.c2> f193066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.purchase.t> f193067g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<a0> f193068h;

    public z(ij.c<Application> cVar, ij.c<com.planner5d.library.model.manager.w> cVar2, ij.c<w2> cVar3, ij.c<u1> cVar4, ij.c<c2> cVar5, ij.c<com.planner5d.library.services.utility.c2> cVar6, ij.c<com.planner5d.library.activity.fragment.dialog.purchase.t> cVar7, ij.c<a0> cVar8) {
        this.f193061a = cVar;
        this.f193062b = cVar2;
        this.f193063c = cVar3;
        this.f193064d = cVar4;
        this.f193065e = cVar5;
        this.f193066f = cVar6;
        this.f193067g = cVar7;
        this.f193068h = cVar8;
    }

    public static z a(ij.c<Application> cVar, ij.c<com.planner5d.library.model.manager.w> cVar2, ij.c<w2> cVar3, ij.c<u1> cVar4, ij.c<c2> cVar5, ij.c<com.planner5d.library.services.utility.c2> cVar6, ij.c<com.planner5d.library.activity.fragment.dialog.purchase.t> cVar7, ij.c<a0> cVar8) {
        return new z(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8);
    }

    public static y c(Application application, com.planner5d.library.model.manager.w wVar, w2 w2Var, u1 u1Var, c2 c2Var, com.planner5d.library.services.utility.c2 c2Var2, com.planner5d.library.activity.fragment.dialog.purchase.t tVar, a0 a0Var) {
        return new y(application, wVar, w2Var, u1Var, c2Var, c2Var2, tVar, a0Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public y get() {
        return c(this.f193061a.get(), this.f193062b.get(), this.f193063c.get(), this.f193064d.get(), this.f193065e.get(), this.f193066f.get(), this.f193067g.get(), this.f193068h.get());
    }
}
