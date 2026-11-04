package com.google.android.datatransport.runtime.backends;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
@com.google.android.datatransport.runtime.dagger.internal.f({"com.google.android.datatransport.runtime.time.WallTime", "com.google.android.datatransport.runtime.time.Monotonic"})
@com.google.android.datatransport.runtime.dagger.internal.g
@com.google.android.datatransport.runtime.dagger.internal.a
public final class k implements com.google.android.datatransport.runtime.dagger.internal.c<j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Context> f103487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<com.google.android.datatransport.runtime.time.a> f103488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ij.c<com.google.android.datatransport.runtime.time.a> f103489c;

    public k(ij.c<Context> cVar, ij.c<com.google.android.datatransport.runtime.time.a> cVar2, ij.c<com.google.android.datatransport.runtime.time.a> cVar3) {
        this.f103487a = cVar;
        this.f103488b = cVar2;
        this.f103489c = cVar3;
    }

    public static k a(ij.c<Context> cVar, ij.c<com.google.android.datatransport.runtime.time.a> cVar2, ij.c<com.google.android.datatransport.runtime.time.a> cVar3) {
        return new k(cVar, cVar2, cVar3);
    }

    public static j c(Context context, com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2) {
        return new j(context, aVar, aVar2);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        return c(this.f103487a.get(), this.f103488b.get(), this.f103489c.get());
    }
}
