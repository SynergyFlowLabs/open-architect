package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public final class w {
    private w() {
        throw new AssertionError("Uninstantiable");
    }

    static String A(String str, Object... objArr) {
        int iIndexOf;
        StringBuilder sb2 = new StringBuilder(str.length() + 48);
        int i10 = 0;
        int i11 = 0;
        while (i10 < 3 && (iIndexOf = str.indexOf("%s", i11)) != -1) {
            sb2.append(str.substring(i11, iIndexOf));
            sb2.append(objArr[i10]);
            i11 = iIndexOf + 2;
            i10++;
        }
        sb2.append(str.substring(i11));
        if (i10 < 3) {
            sb2.append(" [");
            sb2.append(objArr[i10]);
            for (int i12 = i10 + 1; i12 < 3; i12++) {
                sb2.append(", ");
                sb2.append(objArr[i12]);
            }
            sb2.append("]");
        }
        return sb2.toString();
    }

    @g6.a
    public static void a(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    @g6.a
    public static void b(boolean z10, @NonNull Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @g6.a
    public static void c(boolean z10, @NonNull String str, @NonNull Object... objArr) {
        if (!z10) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    @g6.a
    public static double d(double d10, double d11, double d12, @NonNull String str) {
        if (d10 < d11) {
            throw new IllegalArgumentException(A("%s is out of range of [%f, %f] (too low)", str, Double.valueOf(d11), Double.valueOf(d12)));
        }
        if (d10 <= d12) {
            return d10;
        }
        throw new IllegalArgumentException(A("%s is out of range of [%f, %f] (too high)", str, Double.valueOf(d11), Double.valueOf(d12)));
    }

    @g6.a
    public static float e(float f10, float f11, float f12, @NonNull String str) {
        if (f10 < f11) {
            throw new IllegalArgumentException(A("%s is out of range of [%f, %f] (too low)", str, Float.valueOf(f11), Float.valueOf(f12)));
        }
        if (f10 <= f12) {
            return f10;
        }
        throw new IllegalArgumentException(A("%s is out of range of [%f, %f] (too high)", str, Float.valueOf(f11), Float.valueOf(f12)));
    }

    @g6.a
    public static int f(int i10, int i11, int i12, @NonNull String str) {
        if (i10 < i11) {
            throw new IllegalArgumentException(A("%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i11), Integer.valueOf(i12)));
        }
        if (i10 <= i12) {
            return i10;
        }
        throw new IllegalArgumentException(A("%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i11), Integer.valueOf(i12)));
    }

    @g6.a
    public static long g(long j10, long j11, long j12, @NonNull String str) {
        if (j10 < j11) {
            throw new IllegalArgumentException(A("%s is out of range of [%d, %d] (too low)", str, Long.valueOf(j11), Long.valueOf(j12)));
        }
        if (j10 <= j12) {
            return j10;
        }
        throw new IllegalArgumentException(A("%s is out of range of [%d, %d] (too high)", str, Long.valueOf(j11), Long.valueOf(j12)));
    }

    @g6.a
    public static void h(@NonNull Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            throw new IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    @g6.a
    public static void i(@NonNull Handler handler, @NonNull String str) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException(str);
        }
    }

    @g6.a
    public static void j() {
        k("Must be called on the main application thread");
    }

    @g6.a
    public static void k(@NonNull String str) {
        if (!com.google.android.gms.common.util.i0.a()) {
            throw new IllegalStateException(str);
        }
    }

    @NonNull
    @g6.a
    public static String l(@androidx.annotation.p0 String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        return str;
    }

    @NonNull
    @g6.a
    public static String m(@androidx.annotation.p0 String str, @NonNull Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }

    @g6.a
    public static void n() {
        o("Must not be called on GoogleApiHandler thread.");
    }

    @g6.a
    public static void o(@NonNull String str) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException(str);
        }
    }

    @g6.a
    public static void p() {
        q("Must not be called on the main application thread");
    }

    @g6.a
    public static void q(@NonNull String str) {
        if (com.google.android.gms.common.util.i0.a()) {
            throw new IllegalStateException(str);
        }
    }

    @NonNull
    @g6.a
    public static <T> T r(@androidx.annotation.p0 T t10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException("null reference");
    }

    @NonNull
    @g6.a
    public static <T> T s(@NonNull T t10, @NonNull Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @g6.a
    public static int t(int i10) {
        if (i10 != 0) {
            return i10;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    @g6.a
    public static int u(int i10, @NonNull Object obj) {
        if (i10 != 0) {
            return i10;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @g6.a
    public static long v(long j10) {
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalArgumentException("Given Long is zero");
    }

    @g6.a
    public static long w(long j10, @NonNull Object obj) {
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @g6.a
    public static void x(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    @g6.a
    public static void y(boolean z10, @NonNull Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    @g6.a
    public static void z(boolean z10, @NonNull String str, @NonNull Object... objArr) {
        if (!z10) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }
}
