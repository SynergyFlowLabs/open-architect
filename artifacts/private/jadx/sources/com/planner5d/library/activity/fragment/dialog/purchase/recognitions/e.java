package com.planner5d.library.activity.fragment.dialog.purchase.recognitions;

import dagger.internal.h;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@r
@dagger.internal.e
@s
public final class e implements h<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.activity.fragment.dialog.purchase.c.a> f132757a;

    public e(ij.c<com.planner5d.library.activity.fragment.dialog.purchase.c.a> cVar) {
        this.f132757a = cVar;
    }

    public static e a(ij.c<com.planner5d.library.activity.fragment.dialog.purchase.c.a> cVar) {
        return new e(cVar);
    }

    public static d c(com.planner5d.library.activity.fragment.dialog.purchase.c.a aVar) {
        return new d(aVar);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f132757a.get());
    }
}
