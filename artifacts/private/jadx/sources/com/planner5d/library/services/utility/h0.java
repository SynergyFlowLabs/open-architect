package com.planner5d.library.services.utility;

import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
@dagger.internal.r
@dagger.internal.e
@dagger.internal.s("javax.inject.Singleton")
public final class h0 implements dagger.internal.h<g0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Map<Class<? extends androidx.lifecycle.f2>, ij.c<androidx.lifecycle.f2>>> f225254a;

    public h0(ij.c<Map<Class<? extends androidx.lifecycle.f2>, ij.c<androidx.lifecycle.f2>>> cVar) {
        this.f225254a = cVar;
    }

    public static h0 a(ij.c<Map<Class<? extends androidx.lifecycle.f2>, ij.c<androidx.lifecycle.f2>>> cVar) {
        return new h0(cVar);
    }

    public static g0 c(Map<Class<? extends androidx.lifecycle.f2>, ij.c<androidx.lifecycle.f2>> map) {
        return new g0(map);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g0 get() {
        return c(this.f225254a.get());
    }
}
