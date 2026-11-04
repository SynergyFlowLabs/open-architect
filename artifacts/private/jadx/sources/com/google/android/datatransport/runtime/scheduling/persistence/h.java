package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
@com.google.android.datatransport.runtime.dagger.internal.f({"javax.inject.Named"})
@com.google.android.datatransport.runtime.dagger.internal.g("javax.inject.Singleton")
@com.google.android.datatransport.runtime.dagger.internal.a
public final class h implements com.google.android.datatransport.runtime.dagger.internal.c<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ij.c<Context> f103731a;

    public h(ij.c<Context> cVar) {
        this.f103731a = cVar;
    }

    public static h a(ij.c<Context> cVar) {
        return new h(cVar);
    }

    public static String c(Context context) {
        return (String) com.google.android.datatransport.runtime.dagger.internal.e.f(f.d(context));
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c(this.f103731a.get());
    }
}
