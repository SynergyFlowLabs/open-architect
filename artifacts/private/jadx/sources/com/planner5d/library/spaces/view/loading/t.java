package com.planner5d.library.spaces.view.loading;

import com.planner5d.library.model.manager.statistics.events.c4;

/* JADX INFO: loaded from: classes11.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class t implements dagger.internal.h<q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.spaces.data.a> f230425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<fe.a> f230426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<c4> f230427c;

    public t(ij.c<com.planner5d.library.spaces.data.a> addressRepositoryProvider, ij.c<fe.a> findHouseInfoUseCaseProvider, ij.c<c4> statisticsEventSpacesProvider) {
        this.f230425a = addressRepositoryProvider;
        this.f230426b = findHouseInfoUseCaseProvider;
        this.f230427c = statisticsEventSpacesProvider;
    }

    public static t a(ij.c<com.planner5d.library.spaces.data.a> addressRepositoryProvider, ij.c<fe.a> findHouseInfoUseCaseProvider, ij.c<c4> statisticsEventSpacesProvider) {
        return new t(addressRepositoryProvider, findHouseInfoUseCaseProvider, statisticsEventSpacesProvider);
    }

    public static q c(com.planner5d.library.spaces.data.a addressRepository, fe.a findHouseInfoUseCase, c4 statisticsEventSpaces) {
        return new q(addressRepository, findHouseInfoUseCase, statisticsEventSpaces);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public q get() {
        return c(this.f230425a.get(), this.f230426b.get(), this.f230427c.get());
    }
}
