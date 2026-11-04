package com.planner5d.library.model.manager.managedfiles;

import com.planner5d.library.model.manager.builtin.g0;
import com.planner5d.library.model.manager.builtin.v0;
import com.planner5d.library.model.manager.k5;
import com.planner5d.library.model.manager.t1;
import com.planner5d.library.services.exceptions.NetworkErrorUtility;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.f1;
import com.planner5d.library.services.utility.i1;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class z implements dagger.internal.h<y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f192166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.filedownloader.c> f192167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<g0> f192168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.download.a> f192169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<t1> f192170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<k5> f192171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<v0> f192172g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<c2> f192173h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<NetworkErrorUtility> f192174i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ij.c<i1> f192175j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.i> f192176k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ij.c<f1> f192177l;

    public z(ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.services.filedownloader.c> cVar2, ij.c<g0> cVar3, ij.c<com.planner5d.library.services.download.a> cVar4, ij.c<t1> cVar5, ij.c<k5> cVar6, ij.c<v0> cVar7, ij.c<c2> cVar8, ij.c<NetworkErrorUtility> cVar9, ij.c<i1> cVar10, ij.c<com.planner5d.library.model.manager.i> cVar11, ij.c<f1> cVar12) {
        this.f192166a = cVar;
        this.f192167b = cVar2;
        this.f192168c = cVar3;
        this.f192169d = cVar4;
        this.f192170e = cVar5;
        this.f192171f = cVar6;
        this.f192172g = cVar7;
        this.f192173h = cVar8;
        this.f192174i = cVar9;
        this.f192175j = cVar10;
        this.f192176k = cVar11;
        this.f192177l = cVar12;
    }

    public static z a(ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.services.filedownloader.c> cVar2, ij.c<g0> cVar3, ij.c<com.planner5d.library.services.download.a> cVar4, ij.c<t1> cVar5, ij.c<k5> cVar6, ij.c<v0> cVar7, ij.c<c2> cVar8, ij.c<NetworkErrorUtility> cVar9, ij.c<i1> cVar10, ij.c<com.planner5d.library.model.manager.i> cVar11, ij.c<f1> cVar12) {
        return new z(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12);
    }

    public static y c(com.planner5d.library.application.b bVar, com.planner5d.library.services.filedownloader.c cVar, fg.e<g0> eVar, com.planner5d.library.services.download.a aVar, t1 t1Var, k5 k5Var, v0 v0Var, c2 c2Var, NetworkErrorUtility networkErrorUtility, i1 i1Var, fg.e<com.planner5d.library.model.manager.i> eVar2, f1 f1Var) {
        return new y(bVar, cVar, eVar, aVar, t1Var, k5Var, v0Var, c2Var, networkErrorUtility, i1Var, eVar2, f1Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public y get() {
        return c(this.f192166a.get(), this.f192167b.get(), dagger.internal.g.a(this.f192168c), this.f192169d.get(), this.f192170e.get(), this.f192171f.get(), this.f192172g.get(), this.f192173h.get(), this.f192174i.get(), this.f192175j.get(), dagger.internal.g.a(this.f192176k), this.f192177l.get());
    }
}
