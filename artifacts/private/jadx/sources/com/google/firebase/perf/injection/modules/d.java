package com.google.firebase.perf.injection.modules;

import com.google.firebase.installations.k;
import dagger.internal.p;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@r
@dagger.internal.e
@s
public final class d implements dagger.internal.h<k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f123953a;

    public d(a aVar) {
        this.f123953a = aVar;
    }

    public static d a(a aVar) {
        return new d(aVar);
    }

    public static k c(a aVar) {
        return (k) p.f(aVar.c());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c(this.f123953a);
    }
}
