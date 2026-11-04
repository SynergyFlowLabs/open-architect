package com.google.firebase.perf.injection.modules;

import dagger.internal.p;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@r
@dagger.internal.e
@s
public final class c implements dagger.internal.h<com.google.firebase.h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f123952a;

    public c(a aVar) {
        this.f123952a = aVar;
    }

    public static c a(a aVar) {
        return new c(aVar);
    }

    public static com.google.firebase.h c(a aVar) {
        return (com.google.firebase.h) p.f(aVar.b());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.google.firebase.h get() {
        return c(this.f123952a);
    }
}
