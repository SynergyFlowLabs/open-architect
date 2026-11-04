package com.planner5d.library.smartwizard.interactor;

import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@r
@dagger.internal.e
@s
public final class f implements dagger.internal.h<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.smartwizard.data.c> f229951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<ce.c> f229952b;

    public f(ij.c<com.planner5d.library.smartwizard.data.c> cVar, ij.c<ce.c> cVar2) {
        this.f229951a = cVar;
        this.f229952b = cVar2;
    }

    public static f a(ij.c<com.planner5d.library.smartwizard.data.c> cVar, ij.c<ce.c> cVar2) {
        return new f(cVar, cVar2);
    }

    public static e c(com.planner5d.library.smartwizard.data.c cVar, ce.c cVar2) {
        return new e(cVar, cVar2);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c(this.f229951a.get(), this.f229952b.get());
    }
}
