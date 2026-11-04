package com.planner5d.library.spaces.view.search;

import android.app.Application;
import com.planner5d.library.model.manager.statistics.events.c4;

/* JADX INFO: loaded from: classes11.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class z implements dagger.internal.h<y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Application> f230516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.services.utility.c> f230517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.spaces.data.a> f230518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<c4> f230519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.w> f230520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ij.c<com.planner5d.library.util.location.b> f230521f;

    public z(ij.c<Application> applicationProvider, ij.c<com.planner5d.library.services.utility.c> appSystemSettingsLauncherProvider, ij.c<com.planner5d.library.spaces.data.a> addressRepositoryProvider, ij.c<c4> statisticsEventSpacesProvider, ij.c<com.planner5d.library.model.manager.w> featureConfigManagerProvider, ij.c<com.planner5d.library.util.location.b> locationManagerProvider) {
        this.f230516a = applicationProvider;
        this.f230517b = appSystemSettingsLauncherProvider;
        this.f230518c = addressRepositoryProvider;
        this.f230519d = statisticsEventSpacesProvider;
        this.f230520e = featureConfigManagerProvider;
        this.f230521f = locationManagerProvider;
    }

    public static z a(ij.c<Application> applicationProvider, ij.c<com.planner5d.library.services.utility.c> appSystemSettingsLauncherProvider, ij.c<com.planner5d.library.spaces.data.a> addressRepositoryProvider, ij.c<c4> statisticsEventSpacesProvider, ij.c<com.planner5d.library.model.manager.w> featureConfigManagerProvider, ij.c<com.planner5d.library.util.location.b> locationManagerProvider) {
        return new z(applicationProvider, appSystemSettingsLauncherProvider, addressRepositoryProvider, statisticsEventSpacesProvider, featureConfigManagerProvider, locationManagerProvider);
    }

    public static y c(Application application, com.planner5d.library.services.utility.c appSystemSettingsLauncher, com.planner5d.library.spaces.data.a addressRepository, c4 statisticsEventSpaces, com.planner5d.library.model.manager.w featureConfigManager, com.planner5d.library.util.location.b locationManager) {
        return new y(application, appSystemSettingsLauncher, addressRepository, statisticsEventSpaces, featureConfigManager, locationManager);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public y get() {
        return c(this.f230516a.get(), this.f230517b.get(), this.f230518c.get(), this.f230519d.get(), this.f230520e.get(), this.f230521f.get());
    }
}
