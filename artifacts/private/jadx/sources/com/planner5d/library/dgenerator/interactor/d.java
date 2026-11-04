package com.planner5d.library.dgenerator.interactor;

import dagger.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@dagger.internal.r
@dagger.internal.e
@s
public final class d implements dagger.internal.h<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.database.manager.a> f160420a;

    public d(ij.c<com.planner5d.library.database.manager.a> cVar) {
        this.f160420a = cVar;
    }

    public static d a(ij.c<com.planner5d.library.database.manager.a> cVar) {
        return new d(cVar);
    }

    public static c c(com.planner5d.library.database.manager.a aVar) {
        return new c(aVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f160420a.get());
    }
}
