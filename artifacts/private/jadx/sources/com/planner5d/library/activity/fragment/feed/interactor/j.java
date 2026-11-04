package com.planner5d.library.activity.fragment.feed.interactor;

import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
@s("javax.inject.Singleton")
public final class j implements dagger.internal.h<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.uploadplan.a> f133505a;

    public j(ij.c<com.planner5d.library.model.manager.uploadplan.a> cVar) {
        this.f133505a = cVar;
    }

    public static j a(ij.c<com.planner5d.library.model.manager.uploadplan.a> cVar) {
        return new j(cVar);
    }

    public static i c(com.planner5d.library.model.manager.uploadplan.a aVar) {
        return new i(aVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.f133505a.get());
    }
}
