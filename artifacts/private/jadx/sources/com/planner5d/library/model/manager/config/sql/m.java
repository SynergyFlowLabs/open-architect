package com.planner5d.library.model.manager.config.sql;

import android.app.Application;
import com.planner5d.library.services.utility.f1;

/* JADX INFO: loaded from: classes8.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class m implements dagger.internal.h<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f190869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.xml.a> f190870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<f1> f190871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.k> f190872d;

    public m(ij.c<Application> applicationProvider, ij.c<com.planner5d.library.model.manager.config.xml.a> xmlSharedPreferencesManagerProvider, ij.c<f1> coroutineScopeProvider, ij.c<com.planner5d.library.model.manager.k> crashReporterProvider) {
        this.f190869a = applicationProvider;
        this.f190870b = xmlSharedPreferencesManagerProvider;
        this.f190871c = coroutineScopeProvider;
        this.f190872d = crashReporterProvider;
    }

    public static m a(ij.c<Application> applicationProvider, ij.c<com.planner5d.library.model.manager.config.xml.a> xmlSharedPreferencesManagerProvider, ij.c<f1> coroutineScopeProvider, ij.c<com.planner5d.library.model.manager.k> crashReporterProvider) {
        return new m(applicationProvider, xmlSharedPreferencesManagerProvider, coroutineScopeProvider, crashReporterProvider);
    }

    public static l c(Application application, com.planner5d.library.model.manager.config.xml.a xmlSharedPreferencesManager, f1 coroutineScope, com.planner5d.library.model.manager.k crashReporter) {
        return new l(application, xmlSharedPreferencesManager, coroutineScope, crashReporter);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l get() {
        return c(this.f190869a.get(), this.f190870b.get(), this.f190871c.get(), this.f190872d.get());
    }
}
