package com.planner5d.library.activity.fragment.dialog.purchase.snapshots;

import com.planner5d.library.model.manager.y0;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
@s
public final class i implements dagger.internal.h<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<y0> f132797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.purchase.c.a> f132798b;

    public i(ij.c<y0> cVar, ij.c<com.planner5d.library.activity.fragment.dialog.purchase.c.a> cVar2) {
        this.f132797a = cVar;
        this.f132798b = cVar2;
    }

    public static i a(ij.c<y0> cVar, ij.c<com.planner5d.library.activity.fragment.dialog.purchase.c.a> cVar2) {
        return new i(cVar, cVar2);
    }

    public static h c(y0 y0Var, com.planner5d.library.activity.fragment.dialog.purchase.c.a aVar) {
        return new h(y0Var, aVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h get() {
        return c(this.f132797a.get(), this.f132798b.get());
    }
}
