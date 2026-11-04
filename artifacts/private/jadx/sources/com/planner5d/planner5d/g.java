package com.planner5d.planner5d;

import com.planner5d.library.model.manager.c1;
import com.planner5d.library.model.manager.t1;
import com.planner5d.library.services.utility.f1;

/* JADX INFO: loaded from: classes13.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class g implements dagger.internal.h<com.planner5d.library.model.manager.statistics.devtodev.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f258936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.b> f258937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.statistics.devtodev.d.b> f258938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.statistics.appsflyer.d> f258939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<t1> f258940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<c1> f258941f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.c<f1> f258942g;

    public g(b bVar, ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.model.manager.statistics.devtodev.d.b> cVar2, ij.c<com.planner5d.library.model.manager.statistics.appsflyer.d> cVar3, ij.c<t1> cVar4, ij.c<c1> cVar5, ij.c<f1> cVar6) {
        this.f258936a = bVar;
        this.f258937b = cVar;
        this.f258938c = cVar2;
        this.f258939d = cVar3;
        this.f258940e = cVar4;
        this.f258941f = cVar5;
        this.f258942g = cVar6;
    }

    public static g a(b bVar, ij.c<com.planner5d.library.application.b> cVar, ij.c<com.planner5d.library.model.manager.statistics.devtodev.d.b> cVar2, ij.c<com.planner5d.library.model.manager.statistics.appsflyer.d> cVar3, ij.c<t1> cVar4, ij.c<c1> cVar5, ij.c<f1> cVar6) {
        return new g(bVar, cVar, cVar2, cVar3, cVar4, cVar5, cVar6);
    }

    public static com.planner5d.library.model.manager.statistics.devtodev.d c(b bVar, com.planner5d.library.application.b bVar2, com.planner5d.library.model.manager.statistics.devtodev.d.b bVar3, fg.e<com.planner5d.library.model.manager.statistics.appsflyer.d> eVar, t1 t1Var, c1 c1Var, f1 f1Var) {
        return (com.planner5d.library.model.manager.statistics.devtodev.d) dagger.internal.p.f(bVar.e(bVar2, bVar3, eVar, t1Var, c1Var, f1Var));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.model.manager.statistics.devtodev.d get() {
        return c(this.f258936a, this.f258937b.get(), this.f258938c.get(), dagger.internal.g.a(this.f258939d), this.f258940e.get(), this.f258941f.get(), this.f258942g.get());
    }
}
