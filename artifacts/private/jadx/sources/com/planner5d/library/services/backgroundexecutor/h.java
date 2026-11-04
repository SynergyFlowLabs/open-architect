package com.planner5d.library.services.backgroundexecutor;

import android.app.Application;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@r
@dagger.internal.e
@s("javax.inject.Singleton")
public final class h implements dagger.internal.h<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f224024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.k> f224025b;

    public h(ij.c<Application> applicationProvider, ij.c<com.planner5d.library.model.manager.k> crashReporterProvider) {
        this.f224024a = applicationProvider;
        this.f224025b = crashReporterProvider;
    }

    public static h a(ij.c<Application> applicationProvider, ij.c<com.planner5d.library.model.manager.k> crashReporterProvider) {
        return new h(applicationProvider, crashReporterProvider);
    }

    public static g c(Application application, com.planner5d.library.model.manager.k crashReporter) {
        return new g(application, crashReporter);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c(this.f224024a.get(), this.f224025b.get());
    }
}
