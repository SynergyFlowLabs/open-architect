package com.planner5d.library.services.utility;

import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("dagger.Reusable")
public final class h1 implements dagger.internal.h<g1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Map<Class<? extends androidx.lifecycle.f2>, f<? extends androidx.lifecycle.f2>>> f225255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<Map<Class<? extends androidx.lifecycle.f2>, ij.c<androidx.lifecycle.f2>>> f225256b;

    public h1(ij.c<Map<Class<? extends androidx.lifecycle.f2>, f<? extends androidx.lifecycle.f2>>> cVar, ij.c<Map<Class<? extends androidx.lifecycle.f2>, ij.c<androidx.lifecycle.f2>>> cVar2) {
        this.f225255a = cVar;
        this.f225256b = cVar2;
    }

    public static h1 a(ij.c<Map<Class<? extends androidx.lifecycle.f2>, f<? extends androidx.lifecycle.f2>>> cVar, ij.c<Map<Class<? extends androidx.lifecycle.f2>, ij.c<androidx.lifecycle.f2>>> cVar2) {
        return new h1(cVar, cVar2);
    }

    public static g1 c(Map<Class<? extends androidx.lifecycle.f2>, f<? extends androidx.lifecycle.f2>> map, Map<Class<? extends androidx.lifecycle.f2>, ij.c<androidx.lifecycle.f2>> map2) {
        return new g1(map, map2);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g1 get() {
        return c(this.f225255a.get(), this.f225256b.get());
    }
}
