package com.planner5d.library.model.manager;

import android.app.Application;

/* JADX INFO: loaded from: classes7.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class g2 implements dagger.internal.h<f2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f191459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.p> f191460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.p0> f191461c;

    public g2(ij.c<Application> cVar, ij.c<com.planner5d.library.model.manager.config.p> cVar2, ij.c<com.planner5d.library.services.utility.p0> cVar3) {
        this.f191459a = cVar;
        this.f191460b = cVar2;
        this.f191461c = cVar3;
    }

    public static g2 a(ij.c<Application> cVar, ij.c<com.planner5d.library.model.manager.config.p> cVar2, ij.c<com.planner5d.library.services.utility.p0> cVar3) {
        return new g2(cVar, cVar2, cVar3);
    }

    public static f2 c(Application application, com.planner5d.library.model.manager.config.p pVar, com.planner5d.library.services.utility.p0 p0Var) {
        return new f2(application, pVar, p0Var);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f2 get() {
        return c(this.f191459a.get(), this.f191460b.get(), this.f191461c.get());
    }
}
