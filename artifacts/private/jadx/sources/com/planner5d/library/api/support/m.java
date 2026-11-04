package com.planner5d.library.api.support;

import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@s("javax.inject.Singleton")
public final class m implements dagger.internal.h<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.config.p> f142406a;

    public m(ij.c<com.planner5d.library.model.manager.config.p> cVar) {
        this.f142406a = cVar;
    }

    public static m a(ij.c<com.planner5d.library.model.manager.config.p> cVar) {
        return new m(cVar);
    }

    public static l c(com.planner5d.library.model.manager.config.p pVar) {
        return new l(pVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l get() {
        return c(this.f142406a.get());
    }
}
