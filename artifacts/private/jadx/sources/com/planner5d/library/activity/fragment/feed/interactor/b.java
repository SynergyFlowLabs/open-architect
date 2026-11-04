package com.planner5d.library.activity.fragment.feed.interactor;

import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
@s("javax.inject.Singleton")
public final class b implements dagger.internal.h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.model.manager.uploadplan.a> f133455a;

    public b(ij.c<com.planner5d.library.model.manager.uploadplan.a> cVar) {
        this.f133455a = cVar;
    }

    public static b a(ij.c<com.planner5d.library.model.manager.uploadplan.a> cVar) {
        return new b(cVar);
    }

    public static a c(com.planner5d.library.model.manager.uploadplan.a aVar) {
        return new a(aVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f133455a.get());
    }
}
