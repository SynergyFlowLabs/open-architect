package com.planner5d.library.services.bitmaploader.background;

import android.app.Application;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@r
@dagger.internal.e
@s("javax.inject.Singleton")
public final class c implements dagger.internal.h<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f224050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.bitmaploader.cache.a> f224051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.backgroundexecutor.g> f224052c;

    public c(ij.c<Application> applicationProvider, ij.c<com.planner5d.library.services.bitmaploader.cache.a> cacheProvider, ij.c<com.planner5d.library.services.backgroundexecutor.g> messageSenderProvider) {
        this.f224050a = applicationProvider;
        this.f224051b = cacheProvider;
        this.f224052c = messageSenderProvider;
    }

    public static c a(ij.c<Application> applicationProvider, ij.c<com.planner5d.library.services.bitmaploader.cache.a> cacheProvider, ij.c<com.planner5d.library.services.backgroundexecutor.g> messageSenderProvider) {
        return new c(applicationProvider, cacheProvider, messageSenderProvider);
    }

    public static b c(Application application, com.planner5d.library.services.bitmaploader.cache.a cache, com.planner5d.library.services.backgroundexecutor.g messageSender) {
        return new b(application, cache, messageSender);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c(this.f224050a.get(), this.f224051b.get(), this.f224052c.get());
    }
}
