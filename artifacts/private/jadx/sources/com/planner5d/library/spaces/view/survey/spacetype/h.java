package com.planner5d.library.spaces.view.survey.spacetype;

import com.planner5d.library.model.manager.statistics.events.c4;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@r
@dagger.internal.e
@s
public final class h implements dagger.internal.h<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<c4> f230604a;

    public h(ij.c<c4> statisticsEventSpacesProvider) {
        this.f230604a = statisticsEventSpacesProvider;
    }

    public static h a(ij.c<c4> statisticsEventSpacesProvider) {
        return new h(statisticsEventSpacesProvider);
    }

    public static g c(c4 statisticsEventSpaces) {
        return new g(statisticsEventSpaces);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c(this.f230604a.get());
    }
}
