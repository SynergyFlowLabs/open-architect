package com.planner5d.library.model.manager.payments;

import android.app.Application;
import com.planner5d.library.model.manager.e1;
import com.planner5d.library.services.e0;
import com.planner5d.library.services.exceptions.NetworkErrorUtility;
import com.planner5d.library.services.utility.c2;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class s implements dagger.internal.h<r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f192990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.t> f192991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.api.requests.c> f192992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<NetworkErrorUtility> f192993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<c2> f192994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.p> f192995f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<e1> f192996g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.c<e0> f192997h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.c<com.planner5d.library.modules.user.user.w> f192998i;

    public s(ij.c<Application> cVar, ij.c<com.planner5d.library.services.utility.t> cVar2, ij.c<com.planner5d.library.api.requests.c> cVar3, ij.c<NetworkErrorUtility> cVar4, ij.c<c2> cVar5, ij.c<com.planner5d.library.model.manager.config.p> cVar6, ij.c<e1> cVar7, ij.c<e0> cVar8, ij.c<com.planner5d.library.modules.user.user.w> cVar9) {
        this.f192990a = cVar;
        this.f192991b = cVar2;
        this.f192992c = cVar3;
        this.f192993d = cVar4;
        this.f192994e = cVar5;
        this.f192995f = cVar6;
        this.f192996g = cVar7;
        this.f192997h = cVar8;
        this.f192998i = cVar9;
    }

    public static s a(ij.c<Application> cVar, ij.c<com.planner5d.library.services.utility.t> cVar2, ij.c<com.planner5d.library.api.requests.c> cVar3, ij.c<NetworkErrorUtility> cVar4, ij.c<c2> cVar5, ij.c<com.planner5d.library.model.manager.config.p> cVar6, ij.c<e1> cVar7, ij.c<e0> cVar8, ij.c<com.planner5d.library.modules.user.user.w> cVar9) {
        return new s(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9);
    }

    public static r c(Application application, com.planner5d.library.services.utility.t tVar, com.planner5d.library.api.requests.c cVar, NetworkErrorUtility networkErrorUtility, c2 c2Var, com.planner5d.library.model.manager.config.p pVar, e1 e1Var, e0 e0Var, com.planner5d.library.modules.user.user.w wVar) {
        return new r(application, tVar, cVar, networkErrorUtility, c2Var, pVar, e1Var, e0Var, wVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c(this.f192990a.get(), this.f192991b.get(), this.f192992c.get(), this.f192993d.get(), this.f192994e.get(), this.f192995f.get(), this.f192996g.get(), this.f192997h.get(), this.f192998i.get());
    }
}
