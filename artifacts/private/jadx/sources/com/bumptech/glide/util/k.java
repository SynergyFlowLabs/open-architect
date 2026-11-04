package com.bumptech.glide.util;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class k {
    private k() {
    }

    public static void a(boolean z10, @NonNull String str) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    @NonNull
    public static String b(@p0 String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        return str;
    }

    @NonNull
    public static <T extends Collection<Y>, Y> T c(@NonNull T t10) {
        if (t10.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        return t10;
    }

    @NonNull
    public static <T> T d(@p0 T t10) {
        return (T) e(t10, "Argument must not be null");
    }

    @NonNull
    public static <T> T e(@p0 T t10, @NonNull String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }
}
