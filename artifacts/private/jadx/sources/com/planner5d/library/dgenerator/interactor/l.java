package com.planner5d.library.dgenerator.interactor;

import dagger.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@dagger.internal.r
@dagger.internal.e
@s
public final class l implements dagger.internal.h<k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.database.manager.a> f160467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<nb.h> f160468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.planner5d.library.dgenerator.data.a> f160469c;

    public l(ij.c<com.planner5d.library.database.manager.a> cVar, ij.c<nb.h> cVar2, ij.c<com.planner5d.library.dgenerator.data.a> cVar3) {
        this.f160467a = cVar;
        this.f160468b = cVar2;
        this.f160469c = cVar3;
    }

    public static l a(ij.c<com.planner5d.library.database.manager.a> cVar, ij.c<nb.h> cVar2, ij.c<com.planner5d.library.dgenerator.data.a> cVar3) {
        return new l(cVar, cVar2, cVar3);
    }

    public static k c(com.planner5d.library.database.manager.a aVar, nb.h hVar, com.planner5d.library.dgenerator.data.a aVar2) {
        return new k(aVar, hVar, aVar2);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c(this.f160467a.get(), this.f160468b.get(), this.f160469c.get());
    }
}
