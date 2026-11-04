package androidx.media2.exoplayer.external.util;

import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class a {
    private a() {
    }

    public static void a(boolean expression) {
        if (!expression) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean expression, Object errorMessage) {
        if (!expression) {
            throw new IllegalArgumentException(String.valueOf(errorMessage));
        }
    }

    public static int c(int index, int start, int limit) {
        if (index < start || index >= limit) {
            throw new IndexOutOfBoundsException();
        }
        return index;
    }

    public static void d() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Not in applications main thread");
        }
    }

    @il.d({"#1"})
    public static String e(@androidx.annotation.p0 String string) {
        if (TextUtils.isEmpty(string)) {
            throw new IllegalArgumentException();
        }
        return string;
    }

    @il.d({"#1"})
    public static String f(@androidx.annotation.p0 String string, Object errorMessage) {
        if (TextUtils.isEmpty(string)) {
            throw new IllegalArgumentException(String.valueOf(errorMessage));
        }
        return string;
    }

    @il.d({"#1"})
    public static <T> T g(@androidx.annotation.p0 T reference) {
        reference.getClass();
        return reference;
    }

    @il.d({"#1"})
    public static <T> T h(@androidx.annotation.p0 T reference, Object errorMessage) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(String.valueOf(errorMessage));
    }

    public static void i(boolean expression) {
        if (!expression) {
            throw new IllegalStateException();
        }
    }

    public static void j(boolean expression, Object errorMessage) {
        if (!expression) {
            throw new IllegalStateException(String.valueOf(errorMessage));
        }
    }
}
