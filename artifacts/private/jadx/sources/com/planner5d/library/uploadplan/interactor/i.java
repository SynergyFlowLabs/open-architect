package com.planner5d.library.uploadplan.interactor;

import com.planner5d.library.modules.user.user.t;

/* JADX INFO: loaded from: classes11.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class i implements dagger.internal.h<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.api.requests.c> f230767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<t> f230768b;

    public i(ij.c<com.planner5d.library.api.requests.c> cVar, ij.c<t> cVar2) {
        this.f230767a = cVar;
        this.f230768b = cVar2;
    }

    public static i a(ij.c<com.planner5d.library.api.requests.c> cVar, ij.c<t> cVar2) {
        return new i(cVar, cVar2);
    }

    public static h c(com.planner5d.library.api.requests.c cVar, t tVar) {
        return new h(cVar, tVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h get() {
        return c(this.f230767a.get(), this.f230768b.get());
    }
}
