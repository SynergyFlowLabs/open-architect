package com.planner5d.library.activity.fragment.dialog.purchase.premium;

import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.r
@dagger.internal.e
@s
public final class q implements dagger.internal.h<p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.purchase.c.a> f132708a;

    public q(ij.c<com.planner5d.library.activity.fragment.dialog.purchase.c.a> cVar) {
        this.f132708a = cVar;
    }

    public static q a(ij.c<com.planner5d.library.activity.fragment.dialog.purchase.c.a> cVar) {
        return new q(cVar);
    }

    public static p c(com.planner5d.library.activity.fragment.dialog.purchase.c.a aVar) {
        return new p(aVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p get() {
        return c(this.f132708a.get());
    }
}
