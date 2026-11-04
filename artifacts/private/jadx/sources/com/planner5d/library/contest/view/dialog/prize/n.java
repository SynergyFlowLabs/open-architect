package com.planner5d.library.contest.view.dialog.prize;

import android.app.Application;
import com.planner5d.library.model.manager.w;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.p0;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@r
@dagger.internal.e
@s
public final class n implements dagger.internal.h<m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f153650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.contest.data.i> f153651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.synchronization.k> f153652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<p0> f153653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<c2> f153654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<w> f153655f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<com.planner5d.library.contest.data.k> f153656g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.w> f153657h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.c2> f153658i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ij.c<com.planner5d.library.contest.helper.b> f153659j;

    public n(ij.c<Application> cVar, ij.c<com.planner5d.library.contest.data.i> cVar2, ij.c<com.planner5d.library.model.manager.synchronization.k> cVar3, ij.c<p0> cVar4, ij.c<c2> cVar5, ij.c<w> cVar6, ij.c<com.planner5d.library.contest.data.k> cVar7, ij.c<com.planner5d.library.modules.user.user.w> cVar8, ij.c<com.planner5d.library.model.manager.c2> cVar9, ij.c<com.planner5d.library.contest.helper.b> cVar10) {
        this.f153650a = cVar;
        this.f153651b = cVar2;
        this.f153652c = cVar3;
        this.f153653d = cVar4;
        this.f153654e = cVar5;
        this.f153655f = cVar6;
        this.f153656g = cVar7;
        this.f153657h = cVar8;
        this.f153658i = cVar9;
        this.f153659j = cVar10;
    }

    public static n a(ij.c<Application> cVar, ij.c<com.planner5d.library.contest.data.i> cVar2, ij.c<com.planner5d.library.model.manager.synchronization.k> cVar3, ij.c<p0> cVar4, ij.c<c2> cVar5, ij.c<w> cVar6, ij.c<com.planner5d.library.contest.data.k> cVar7, ij.c<com.planner5d.library.modules.user.user.w> cVar8, ij.c<com.planner5d.library.model.manager.c2> cVar9, ij.c<com.planner5d.library.contest.helper.b> cVar10) {
        return new n(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10);
    }

    public static m c(Application application, com.planner5d.library.contest.data.i iVar, com.planner5d.library.model.manager.synchronization.k kVar, p0 p0Var, c2 c2Var, w wVar, com.planner5d.library.contest.data.k kVar2, com.planner5d.library.modules.user.user.w wVar2, com.planner5d.library.model.manager.c2 c2Var2, com.planner5d.library.contest.helper.b bVar) {
        return new m(application, iVar, kVar, p0Var, c2Var, wVar, kVar2, wVar2, c2Var2, bVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m get() {
        return c(this.f153650a.get(), this.f153651b.get(), this.f153652c.get(), this.f153653d.get(), this.f153654e.get(), this.f153655f.get(), this.f153656g.get(), this.f153657h.get(), this.f153658i.get(), this.f153659j.get());
    }
}
