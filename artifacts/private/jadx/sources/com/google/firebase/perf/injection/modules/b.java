package com.google.firebase.perf.injection.modules;

import dagger.internal.p;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@r
@dagger.internal.e
@s
public final class b implements dagger.internal.h<com.google.firebase.perf.config.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f123951a;

    public b(a aVar) {
        this.f123951a = aVar;
    }

    public static b a(a aVar) {
        return new b(aVar);
    }

    public static com.google.firebase.perf.config.a c(a aVar) {
        return (com.google.firebase.perf.config.a) p.f(aVar.a());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.google.firebase.perf.config.a get() {
        return c(this.f123951a);
    }
}
