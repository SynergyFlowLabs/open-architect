package com.planner5d.library.dgenerator.interactor;

import dagger.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@dagger.internal.r
@dagger.internal.e
@s
public final class b implements dagger.internal.h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.database.manager.a> f160414a;

    public b(ij.c<com.planner5d.library.database.manager.a> cVar) {
        this.f160414a = cVar;
    }

    public static b a(ij.c<com.planner5d.library.database.manager.a> cVar) {
        return new b(cVar);
    }

    public static a c(com.planner5d.library.database.manager.a aVar) {
        return new a(aVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f160414a.get());
    }
}
