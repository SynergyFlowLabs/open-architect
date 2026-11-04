package com.planner5d.library.services.bitmaploader;

import android.app.Application;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.i1;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@r
@dagger.internal.e
@s("javax.inject.Singleton")
public final class h implements dagger.internal.h<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f224166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.bitmaploader.background.b> f224167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.bitmaploader.cache.a> f224168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<c2> f224169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<i1> f224170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<d.g> f224171f;

    public h(ij.c<Application> applicationProvider, ij.c<com.planner5d.library.services.bitmaploader.background.b> clientProvider, ij.c<com.planner5d.library.services.bitmaploader.cache.a> cacheProvider, ij.c<c2> networkStateUtilityProvider, ij.c<i1> internetStateMonitorProvider, ij.c<d.g> uriLoaderProvider) {
        this.f224166a = applicationProvider;
        this.f224167b = clientProvider;
        this.f224168c = cacheProvider;
        this.f224169d = networkStateUtilityProvider;
        this.f224170e = internetStateMonitorProvider;
        this.f224171f = uriLoaderProvider;
    }

    public static h a(ij.c<Application> applicationProvider, ij.c<com.planner5d.library.services.bitmaploader.background.b> clientProvider, ij.c<com.planner5d.library.services.bitmaploader.cache.a> cacheProvider, ij.c<c2> networkStateUtilityProvider, ij.c<i1> internetStateMonitorProvider, ij.c<d.g> uriLoaderProvider) {
        return new h(applicationProvider, clientProvider, cacheProvider, networkStateUtilityProvider, internetStateMonitorProvider, uriLoaderProvider);
    }

    public static d c(Application application, com.planner5d.library.services.bitmaploader.background.b client, com.planner5d.library.services.bitmaploader.cache.a cache, c2 networkStateUtility, i1 internetStateMonitor, d.g uriLoader) {
        return new d(application, client, cache, networkStateUtility, internetStateMonitor, uriLoader);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f224166a.get(), this.f224167b.get(), this.f224168c.get(), this.f224169d.get(), this.f224170e.get(), this.f224171f.get());
    }
}
