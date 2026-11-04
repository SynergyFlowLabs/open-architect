package com.google.android.datatransport.runtime.time;

/* JADX INFO: loaded from: classes4.dex */
@com.google.android.datatransport.runtime.dagger.internal.a
@com.google.android.datatransport.runtime.dagger.internal.f({"com.google.android.datatransport.runtime.time.Monotonic"})
@com.google.android.datatransport.runtime.dagger.internal.g
public final class f implements com.google.android.datatransport.runtime.dagger.internal.c<com.google.android.datatransport.runtime.time.a> {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final f f103809a = new f();

        private a() {
        }
    }

    public static f a() {
        return a.f103809a;
    }

    public static com.google.android.datatransport.runtime.time.a c() {
        return (com.google.android.datatransport.runtime.time.a) com.google.android.datatransport.runtime.dagger.internal.e.f(d.b());
    }

    @Override // ij.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.google.android.datatransport.runtime.time.a get() {
        return c();
    }
}
