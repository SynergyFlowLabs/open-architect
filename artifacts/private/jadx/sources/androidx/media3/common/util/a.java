package androidx.media3.common.util;

import android.os.Looper;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class a {
    private a() {
    }

    @xl.d
    public static void a(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    @xl.d
    public static void b(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @xl.d
    public static int c(int i10, int i11, int i12) {
        if (i10 < i11 || i10 >= i12) {
            throw new IndexOutOfBoundsException();
        }
        return i10;
    }

    @xl.d
    public static void d() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Not in applications main thread");
        }
    }

    @il.d({"#1"})
    @xl.d
    public static String e(@androidx.annotation.p0 String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }

    @il.d({"#1"})
    @xl.d
    public static String f(@androidx.annotation.p0 String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }

    @il.d({"#1"})
    @xl.d
    public static <T> T g(@androidx.annotation.p0 T t10) {
        t10.getClass();
        return t10;
    }

    @il.d({"#1"})
    @xl.d
    public static <T> T h(@androidx.annotation.p0 T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @xl.d
    public static void i(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    @xl.d
    public static void j(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    @il.d({"#1"})
    @xl.d
    public static <T> T k(@androidx.annotation.p0 T t10) {
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException();
    }

    @il.d({"#1"})
    @xl.d
    public static <T> T l(@androidx.annotation.p0 T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }
}
