package com.davidehrmann.vcdiff.util;

/* JADX INFO: loaded from: classes3.dex */
public class a {
    public static <T> T a(T t10) {
        t10.getClass();
        return t10;
    }

    public static <T> T b(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }
}
