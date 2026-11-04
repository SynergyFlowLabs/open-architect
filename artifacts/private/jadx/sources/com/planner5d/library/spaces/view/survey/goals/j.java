package com.planner5d.library.spaces.view.survey.goals;

import com.planner5d.library.model.manager.statistics.events.c4;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@r
@dagger.internal.e
@s
public final class j implements dagger.internal.h<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<c4> f230565a;

    public j(ij.c<c4> statisticsEventSpacesProvider) {
        this.f230565a = statisticsEventSpacesProvider;
    }

    public static j a(ij.c<c4> statisticsEventSpacesProvider) {
        return new j(statisticsEventSpacesProvider);
    }

    public static i c(c4 statisticsEventSpaces) {
        return new i(statisticsEventSpaces);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.f230565a.get());
    }
}
