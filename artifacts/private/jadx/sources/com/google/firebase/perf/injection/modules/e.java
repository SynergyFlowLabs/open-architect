package com.google.firebase.perf.injection.modules;

import com.google.firebase.remoteconfig.d0;
import dagger.internal.p;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@r
@dagger.internal.e
@s
public final class e implements dagger.internal.h<z8.b<d0>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f123954a;

    public e(a aVar) {
        this.f123954a = aVar;
    }

    public static e a(a aVar) {
        return new e(aVar);
    }

    public static z8.b<d0> c(a aVar) {
        return (z8.b) p.f(aVar.d());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public z8.b<d0> get() {
        return c(this.f123954a);
    }
}
