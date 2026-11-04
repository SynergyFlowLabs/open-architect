package com.planner5d.library.spaces.view.survey.style;

import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@r
@dagger.internal.e
@s
public final class m implements dagger.internal.h<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.spaces.data.a> f230626a;

    public m(ij.c<com.planner5d.library.spaces.data.a> addressRepositoryProvider) {
        this.f230626a = addressRepositoryProvider;
    }

    public static m a(ij.c<com.planner5d.library.spaces.data.a> addressRepositoryProvider) {
        return new m(addressRepositoryProvider);
    }

    public static l c(com.planner5d.library.spaces.data.a addressRepository) {
        return new l(addressRepository);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l get() {
        return c(this.f230626a.get());
    }
}
