package com.planner5d.library.dgenerator.interactor;

import com.planner5d.library.modules.user.user.t;
import dagger.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@dagger.internal.r
@dagger.internal.e
@s
public final class n implements dagger.internal.h<m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.api.requests.c> f160489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<t> f160490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<le.m> f160491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ij.c<com.planner5d.library.database.manager.a> f160492d;

    public n(ij.c<com.planner5d.library.api.requests.c> cVar, ij.c<t> cVar2, ij.c<le.m> cVar3, ij.c<com.planner5d.library.database.manager.a> cVar4) {
        this.f160489a = cVar;
        this.f160490b = cVar2;
        this.f160491c = cVar3;
        this.f160492d = cVar4;
    }

    public static n a(ij.c<com.planner5d.library.api.requests.c> cVar, ij.c<t> cVar2, ij.c<le.m> cVar3, ij.c<com.planner5d.library.database.manager.a> cVar4) {
        return new n(cVar, cVar2, cVar3, cVar4);
    }

    public static m c(com.planner5d.library.api.requests.c cVar, t tVar, le.m mVar, com.planner5d.library.database.manager.a aVar) {
        return new m(cVar, tVar, mVar, aVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m get() {
        return c(this.f160489a.get(), this.f160490b.get(), this.f160491c.get(), this.f160492d.get());
    }
}
