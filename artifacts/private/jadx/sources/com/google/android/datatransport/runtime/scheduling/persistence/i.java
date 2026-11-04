package com.google.android.datatransport.runtime.scheduling.persistence;

/* JADX INFO: loaded from: classes4.dex */
@com.google.android.datatransport.runtime.dagger.internal.a
@com.google.android.datatransport.runtime.dagger.internal.f({"javax.inject.Named"})
@com.google.android.datatransport.runtime.dagger.internal.g
public final class i implements com.google.android.datatransport.runtime.dagger.internal.c<Integer> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final i f103732a = new i();

        private a() {
        }
    }

    public static i a() {
        return a.f103732a;
    }

    public static int c() {
        return f.e();
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer get() {
        return Integer.valueOf(c());
    }
}
