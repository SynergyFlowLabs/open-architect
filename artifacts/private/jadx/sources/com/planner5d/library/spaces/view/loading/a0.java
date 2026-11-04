package com.planner5d.library.spaces.view.loading;

import com.planner5d.library.model.manager.statistics.events.c4;

/* JADX INFO: loaded from: classes11.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class a0 implements dagger.internal.h<z> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<c4> f230377a;

    public a0(ij.c<c4> statisticsEventSpacesProvider) {
        this.f230377a = statisticsEventSpacesProvider;
    }

    public static a0 a(ij.c<c4> statisticsEventSpacesProvider) {
        return new a0(statisticsEventSpacesProvider);
    }

    public static z c(c4 statisticsEventSpaces) {
        return new z(statisticsEventSpaces);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public z get() {
        return c(this.f230377a.get());
    }
}
