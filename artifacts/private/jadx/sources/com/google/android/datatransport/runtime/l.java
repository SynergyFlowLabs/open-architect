package com.google.android.datatransport.runtime;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
@com.google.android.datatransport.runtime.dagger.internal.a
@com.google.android.datatransport.runtime.dagger.internal.f
@com.google.android.datatransport.runtime.dagger.internal.g("javax.inject.Singleton")
public final class l implements com.google.android.datatransport.runtime.dagger.internal.c<Executor> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final l f103583a = new l();

        private a() {
        }
    }

    public static l a() {
        return a.f103583a;
    }

    public static Executor b() {
        return (Executor) com.google.android.datatransport.runtime.dagger.internal.e.f(k.a());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return b();
    }
}
