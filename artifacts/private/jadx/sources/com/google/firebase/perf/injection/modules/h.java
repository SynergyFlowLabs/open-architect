package com.google.firebase.perf.injection.modules;

import com.google.android.datatransport.m;
import dagger.internal.p;
import dagger.internal.r;
import dagger.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@r
@dagger.internal.e
@s
public final class h implements dagger.internal.h<z8.b<m>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f123957a;

    public h(a aVar) {
        this.f123957a = aVar;
    }

    public static h a(a aVar) {
        return new h(aVar);
    }

    public static z8.b<m> c(a aVar) {
        return (z8.b) p.f(aVar.g());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public z8.b<m> get() {
        return c(this.f123957a);
    }
}
