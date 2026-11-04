package com.google.firebase.components;

/* JADX INFO: loaded from: classes5.dex */
public final class i0 {
    public static void a(boolean z10, String str) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    @z7.a
    public static <T> T b(T t10) {
        t10.getClass();
        return t10;
    }

    @z7.a
    public static <T> T c(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    public static void d(boolean z10, String str) {
        if (!z10) {
            throw new IllegalStateException(str);
        }
    }
}
