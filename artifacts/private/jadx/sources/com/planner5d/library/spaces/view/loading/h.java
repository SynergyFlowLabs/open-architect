package com.planner5d.library.spaces.view.loading;

import com.planner5d.library.model.manager.statistics.events.c4;

/* JADX INFO: loaded from: classes11.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class h implements dagger.internal.h<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.spaces.data.a> f230385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<c4> f230386b;

    public h(ij.c<com.planner5d.library.spaces.data.a> addressRepositoryProvider, ij.c<c4> statisticsEventSpacesProvider) {
        this.f230385a = addressRepositoryProvider;
        this.f230386b = statisticsEventSpacesProvider;
    }

    public static h a(ij.c<com.planner5d.library.spaces.data.a> addressRepositoryProvider, ij.c<c4> statisticsEventSpacesProvider) {
        return new h(addressRepositoryProvider, statisticsEventSpacesProvider);
    }

    public static g c(com.planner5d.library.spaces.data.a addressRepository, c4 statisticsEventSpaces) {
        return new g(addressRepository, statisticsEventSpaces);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c(this.f230385a.get(), this.f230386b.get());
    }
}
