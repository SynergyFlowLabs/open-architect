package com.planner5d.library.spaces.view.start;

import com.planner5d.library.model.manager.config.p;
import com.planner5d.library.model.manager.statistics.events.c4;
import com.planner5d.library.model.manager.w;
import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@r
@dagger.internal.e
@s
public final class g implements h<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.spaces.data.a> f230539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<w> f230540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<p> f230541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<c4> f230542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.c<com.planner5d.library.spaces.data.e> f230543e;

    public g(ij.c<com.planner5d.library.spaces.data.a> addressRepositoryProvider, ij.c<w> featureConfigManagerProvider, ij.c<p> sharedPreferencesProvider, ij.c<c4> statisticsEventSpacesProvider, ij.c<com.planner5d.library.spaces.data.e> spacesManagerServiceProvider) {
        this.f230539a = addressRepositoryProvider;
        this.f230540b = featureConfigManagerProvider;
        this.f230541c = sharedPreferencesProvider;
        this.f230542d = statisticsEventSpacesProvider;
        this.f230543e = spacesManagerServiceProvider;
    }

    public static g a(ij.c<com.planner5d.library.spaces.data.a> addressRepositoryProvider, ij.c<w> featureConfigManagerProvider, ij.c<p> sharedPreferencesProvider, ij.c<c4> statisticsEventSpacesProvider, ij.c<com.planner5d.library.spaces.data.e> spacesManagerServiceProvider) {
        return new g(addressRepositoryProvider, featureConfigManagerProvider, sharedPreferencesProvider, statisticsEventSpacesProvider, spacesManagerServiceProvider);
    }

    public static f c(com.planner5d.library.spaces.data.a addressRepository, w featureConfigManager, p sharedPreferences, c4 statisticsEventSpaces, com.planner5d.library.spaces.data.e spacesManagerService) {
        return new f(addressRepository, featureConfigManager, sharedPreferences, statisticsEventSpaces, spacesManagerService);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f get() {
        return c(this.f230539a.get(), this.f230540b.get(), this.f230541c.get(), this.f230542d.get(), this.f230543e.get());
    }
}
