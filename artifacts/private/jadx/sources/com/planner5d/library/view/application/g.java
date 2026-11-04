package com.planner5d.library.view.application;

import dagger.internal.p;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes12.dex */
@r
@dagger.internal.e
@s
public final class g implements dagger.internal.h<com.planner5d.library.activity.fragment.dialog.k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f244841a;

    public g(d dVar) {
        this.f244841a = dVar;
    }

    public static g a(d dVar) {
        return new g(dVar);
    }

    public static com.planner5d.library.activity.fragment.dialog.k c(d dVar) {
        return (com.planner5d.library.activity.fragment.dialog.k) p.f(dVar.c());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.planner5d.library.activity.fragment.dialog.k get() {
        return c(this.f244841a);
    }
}
