package com.planner5d.library.model.manager.config.source;

import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@r
@dagger.internal.e
@s
public final class b implements dagger.internal.h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.application.d> f181656a;

    public b(ij.c<com.planner5d.library.application.d> cVar) {
        this.f181656a = cVar;
    }

    public static b a(ij.c<com.planner5d.library.application.d> cVar) {
        return new b(cVar);
    }

    public static a c(com.planner5d.library.application.d dVar) {
        return new a(dVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f181656a.get());
    }
}
