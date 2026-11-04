package com.planner5d.library.model.manager.builtin;

import android.app.Application;
import com.planner5d.library.model.manager.n1;
import com.planner5d.library.services.utility.f2;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class m0 implements dagger.internal.h<l0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f181098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.d> f181099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<i> f181100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<n1> f181101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.l> f181102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<f2> f181103f;

    public m0(ij.c<Application> cVar, ij.c<com.planner5d.library.application.d> cVar2, ij.c<i> cVar3, ij.c<n1> cVar4, ij.c<com.planner5d.library.model.manager.l> cVar5, ij.c<f2> cVar6) {
        this.f181098a = cVar;
        this.f181099b = cVar2;
        this.f181100c = cVar3;
        this.f181101d = cVar4;
        this.f181102e = cVar5;
        this.f181103f = cVar6;
    }

    public static m0 a(ij.c<Application> cVar, ij.c<com.planner5d.library.application.d> cVar2, ij.c<i> cVar3, ij.c<n1> cVar4, ij.c<com.planner5d.library.model.manager.l> cVar5, ij.c<f2> cVar6) {
        return new m0(cVar, cVar2, cVar3, cVar4, cVar5, cVar6);
    }

    public static l0 c(Application application, com.planner5d.library.application.d dVar, i iVar, n1 n1Var, com.planner5d.library.model.manager.l lVar, f2 f2Var) {
        return new l0(application, dVar, iVar, n1Var, lVar, f2Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l0 get() {
        return c(this.f181098a.get(), this.f181099b.get(), this.f181100c.get(), this.f181101d.get(), this.f181102e.get(), this.f181103f.get());
    }
}
