package com.planner5d.library.dgenerator.interactor;

import dagger.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@dagger.internal.r
@dagger.internal.e
@s
public final class f implements dagger.internal.h<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.database.manager.a> f160427a;

    public f(ij.c<com.planner5d.library.database.manager.a> cVar) {
        this.f160427a = cVar;
    }

    public static f a(ij.c<com.planner5d.library.database.manager.a> cVar) {
        return new f(cVar);
    }

    public static e c(com.planner5d.library.database.manager.a aVar) {
        return new e(aVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c(this.f160427a.get());
    }
}
