package com.planner5d.library.services;

/* JADX INFO: loaded from: classes10.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s
public final class h implements dagger.internal.h<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.k> f224342a;

    public h(ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar) {
        this.f224342a = cVar;
    }

    public static h a(ij.c<com.planner5d.library.activity.fragment.dialog.k> cVar) {
        return new h(cVar);
    }

    public static g c(com.planner5d.library.activity.fragment.dialog.k kVar) {
        return new g(kVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c(this.f224342a.get());
    }
}
