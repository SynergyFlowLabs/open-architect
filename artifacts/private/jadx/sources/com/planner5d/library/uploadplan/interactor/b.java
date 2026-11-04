package com.planner5d.library.uploadplan.interactor;

import com.planner5d.library.modules.user.user.t;

/* JADX INFO: loaded from: classes11.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class b implements dagger.internal.h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.api.requests.c> f230749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<t> f230750b;

    public b(ij.c<com.planner5d.library.api.requests.c> cVar, ij.c<t> cVar2) {
        this.f230749a = cVar;
        this.f230750b = cVar2;
    }

    public static b a(ij.c<com.planner5d.library.api.requests.c> cVar, ij.c<t> cVar2) {
        return new b(cVar, cVar2);
    }

    public static a c(com.planner5d.library.api.requests.c cVar, t tVar) {
        return new a(cVar, tVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f230749a.get(), this.f230750b.get());
    }
}
