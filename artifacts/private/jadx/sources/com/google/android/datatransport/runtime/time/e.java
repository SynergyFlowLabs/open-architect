package com.google.android.datatransport.runtime.time;

/* JADX INFO: loaded from: classes4.dex */
@com.google.android.datatransport.runtime.dagger.internal.a
@com.google.android.datatransport.runtime.dagger.internal.f({"com.google.android.datatransport.runtime.time.WallTime"})
@com.google.android.datatransport.runtime.dagger.internal.g
public final class e implements com.google.android.datatransport.runtime.dagger.internal.c<com.google.android.datatransport.runtime.time.a> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final e f103808a = new e();

        private a() {
        }
    }

    public static e a() {
        return a.f103808a;
    }

    public static com.google.android.datatransport.runtime.time.a b() {
        return (com.google.android.datatransport.runtime.time.a) com.google.android.datatransport.runtime.dagger.internal.e.f(d.a());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.google.android.datatransport.runtime.time.a get() {
        return b();
    }
}
