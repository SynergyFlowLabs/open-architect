package com.planner5d.library.spaces.view.info;

import com.planner5d.library.model.manager.config.p;
import com.planner5d.library.model.manager.statistics.events.c4;
import com.planner5d.library.services.q;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@r
@dagger.internal.e
@s
public final class h implements dagger.internal.h<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<q> f230334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<p> f230335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.spaces.data.e> f230336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<c4> f230337d;

    public h(ij.c<q> imageManagerProvider, ij.c<p> sharedPreferencesProvider, ij.c<com.planner5d.library.spaces.data.e> spacesManagerServiceProvider, ij.c<c4> statisticsEventSpacesProvider) {
        this.f230334a = imageManagerProvider;
        this.f230335b = sharedPreferencesProvider;
        this.f230336c = spacesManagerServiceProvider;
        this.f230337d = statisticsEventSpacesProvider;
    }

    public static h a(ij.c<q> imageManagerProvider, ij.c<p> sharedPreferencesProvider, ij.c<com.planner5d.library.spaces.data.e> spacesManagerServiceProvider, ij.c<c4> statisticsEventSpacesProvider) {
        return new h(imageManagerProvider, sharedPreferencesProvider, spacesManagerServiceProvider, statisticsEventSpacesProvider);
    }

    public static g c(q imageManager, p sharedPreferences, com.planner5d.library.spaces.data.e spacesManagerService, c4 statisticsEventSpaces) {
        return new g(imageManager, sharedPreferences, spacesManagerService, statisticsEventSpaces);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c(this.f230334a.get(), this.f230335b.get(), this.f230336c.get(), this.f230337d.get());
    }
}
