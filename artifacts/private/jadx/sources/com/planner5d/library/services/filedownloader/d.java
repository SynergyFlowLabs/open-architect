package com.planner5d.library.services.filedownloader;

import android.app.Application;
import com.planner5d.library.services.backgroundexecutor.g;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.i1;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@r
@dagger.internal.e
@s("javax.inject.Singleton")
public final class d implements h<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f224323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<c2> f224324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<i1> f224325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.bitmaploader.d.g> f224326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<c.a> f224327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<g> f224328f;

    public d(ij.c<Application> applicationProvider, ij.c<c2> networkStateUtilityProvider, ij.c<i1> internetStateMonitorProvider, ij.c<com.planner5d.library.services.bitmaploader.d.g> uriLoaderProvider, ij.c<c.a> responseExceptionFactoryProvider, ij.c<g> messageSenderProvider) {
        this.f224323a = applicationProvider;
        this.f224324b = networkStateUtilityProvider;
        this.f224325c = internetStateMonitorProvider;
        this.f224326d = uriLoaderProvider;
        this.f224327e = responseExceptionFactoryProvider;
        this.f224328f = messageSenderProvider;
    }

    public static d a(ij.c<Application> applicationProvider, ij.c<c2> networkStateUtilityProvider, ij.c<i1> internetStateMonitorProvider, ij.c<com.planner5d.library.services.bitmaploader.d.g> uriLoaderProvider, ij.c<c.a> responseExceptionFactoryProvider, ij.c<g> messageSenderProvider) {
        return new d(applicationProvider, networkStateUtilityProvider, internetStateMonitorProvider, uriLoaderProvider, responseExceptionFactoryProvider, messageSenderProvider);
    }

    public static c c(Application application, c2 networkStateUtility, i1 internetStateMonitor, com.planner5d.library.services.bitmaploader.d.g uriLoader, c.a responseExceptionFactory, g messageSender) {
        return new c(application, networkStateUtility, internetStateMonitor, uriLoader, responseExceptionFactory, messageSender);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f224323a.get(), this.f224324b.get(), this.f224325c.get(), this.f224326d.get(), this.f224327e.get(), this.f224328f.get());
    }
}
