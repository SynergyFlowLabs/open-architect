package com.planner5d.library.project.interactor;

import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@r
@dagger.internal.e
@s
public final class h implements dagger.internal.h<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.database.manager.a> f223932a;

    public h(ij.c<com.planner5d.library.database.manager.a> cVar) {
        this.f223932a = cVar;
    }

    public static h a(ij.c<com.planner5d.library.database.manager.a> cVar) {
        return new h(cVar);
    }

    public static g c(com.planner5d.library.database.manager.a aVar) {
        return new g(aVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c(this.f223932a.get());
    }
}
