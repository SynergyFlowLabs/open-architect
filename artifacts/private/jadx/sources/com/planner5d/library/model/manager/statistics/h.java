package com.planner5d.library.model.manager.statistics;

import android.app.Application;

/* JADX INFO: loaded from: classes9.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class h implements dagger.internal.h<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f217779a;

    public h(ij.c<Application> cVar) {
        this.f217779a = cVar;
    }

    public static h a(ij.c<Application> cVar) {
        return new h(cVar);
    }

    public static g c(Application application) {
        return new g(application);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c(this.f217779a.get());
    }
}
