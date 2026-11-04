package com.google.vr.sdk.deps;

/* JADX INFO: loaded from: classes5.dex */
final class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class<?> f129408a = a("libcore.io.Memory");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f129409b;

    static {
        f129409b = a("org.robolectric.Robolectric") != null;
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean b() {
        return (f129408a == null || f129409b) ? false : true;
    }

    static Class<?> c() {
        return f129408a;
    }
}
