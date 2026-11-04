package com.planner5d.library.activity.tutorial;

import android.app.Application;
import com.planner5d.library.services.utility.z0;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class q implements dagger.internal.h<p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f141868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.p> f141869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<z0> f141870c;

    public q(ij.c<Application> cVar, ij.c<com.planner5d.library.model.manager.config.p> cVar2, ij.c<z0> cVar3) {
        this.f141868a = cVar;
        this.f141869b = cVar2;
        this.f141870c = cVar3;
    }

    public static q a(ij.c<Application> cVar, ij.c<com.planner5d.library.model.manager.config.p> cVar2, ij.c<z0> cVar3) {
        return new q(cVar, cVar2, cVar3);
    }

    public static p c() {
        return new p();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p get() {
        p pVarC = c();
        r.b(pVarC, this.f141868a.get());
        r.e(pVarC, this.f141869b.get());
        r.c(pVarC, this.f141870c.get());
        return pVarC;
    }
}
