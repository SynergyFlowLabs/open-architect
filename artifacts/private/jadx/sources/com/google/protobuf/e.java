package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f125831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class<?> f125832b = a("libcore.io.Memory");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f125833c;

    static {
        f125833c = (f125831a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    private e() {
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class<?> b() {
        return f125832b;
    }

    static boolean c() {
        if (f125831a) {
            return true;
        }
        return (f125832b == null || f125833c) ? false : true;
    }
}
