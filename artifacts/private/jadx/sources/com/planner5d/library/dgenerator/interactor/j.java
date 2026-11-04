package com.planner5d.library.dgenerator.interactor;

import dagger.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@dagger.internal.r
@dagger.internal.e
@s
public final class j implements dagger.internal.h<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.database.manager.a> f160441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<ce.c> f160442b;

    public j(ij.c<com.planner5d.library.database.manager.a> cVar, ij.c<ce.c> cVar2) {
        this.f160441a = cVar;
        this.f160442b = cVar2;
    }

    public static j a(ij.c<com.planner5d.library.database.manager.a> cVar, ij.c<ce.c> cVar2) {
        return new j(cVar, cVar2);
    }

    public static i c(com.planner5d.library.database.manager.a aVar, ce.c cVar) {
        return new i(aVar, cVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.f160441a.get(), this.f160442b.get());
    }
}
