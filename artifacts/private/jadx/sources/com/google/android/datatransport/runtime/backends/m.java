package com.google.android.datatransport.runtime.backends;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
@com.google.android.datatransport.runtime.dagger.internal.f
@com.google.android.datatransport.runtime.dagger.internal.g("javax.inject.Singleton")
@com.google.android.datatransport.runtime.dagger.internal.a
public final class m implements com.google.android.datatransport.runtime.dagger.internal.c<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Context> f103497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ij.c<j> f103498b;

    public m(ij.c<Context> cVar, ij.c<j> cVar2) {
        this.f103497a = cVar;
        this.f103498b = cVar2;
    }

    public static m a(ij.c<Context> cVar, ij.c<j> cVar2) {
        return new m(cVar, cVar2);
    }

    public static l c(Context context, Object obj) {
        return new l(context, (j) obj);
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l get() {
        return c(this.f103497a.get(), this.f103498b.get());
    }
}
