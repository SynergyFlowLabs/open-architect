package com.planner5d.library.smartwizard.interactor;

import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@r
@dagger.internal.e
@s
public final class d implements dagger.internal.h<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<com.planner5d.library.smartwizard.data.c> f229938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<ce.c> f229939b;

    public d(ij.c<com.planner5d.library.smartwizard.data.c> cVar, ij.c<ce.c> cVar2) {
        this.f229938a = cVar;
        this.f229939b = cVar2;
    }

    public static d a(ij.c<com.planner5d.library.smartwizard.data.c> cVar, ij.c<ce.c> cVar2) {
        return new d(cVar, cVar2);
    }

    public static c c(com.planner5d.library.smartwizard.data.c cVar, ce.c cVar2) {
        return new c(cVar, cVar2);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f229938a.get(), this.f229939b.get());
    }
}
