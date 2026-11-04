package com.google.android.gms.common.util;

import android.util.Base64;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public final class c {
    @NonNull
    @g6.a
    public static byte[] a(@NonNull String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    @NonNull
    @g6.a
    public static byte[] b(@NonNull String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 10);
    }

    @NonNull
    @g6.a
    public static byte[] c(@NonNull String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }

    @NonNull
    @g6.a
    public static String d(@NonNull byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 0);
    }

    @NonNull
    @g6.a
    public static String e(@NonNull byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 10);
    }

    @NonNull
    @g6.a
    public static String f(@NonNull byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
