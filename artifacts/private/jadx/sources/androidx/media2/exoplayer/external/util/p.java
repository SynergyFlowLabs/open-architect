package androidx.media2.exoplayer.external.util;

import android.text.TextUtils;
import androidx.annotation.b1;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f57615a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f57616b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f57617c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f57618d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f57619e = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f57620f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f57621g = true;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @interface a {
    }

    private p() {
    }

    private static String a(String message, @androidx.annotation.p0 Throwable throwable) {
        if (throwable != null) {
            String message2 = throwable.getMessage();
            if (!TextUtils.isEmpty(message2)) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 3 + String.valueOf(message2).length());
                sb2.append(message);
                sb2.append(" - ");
                sb2.append(message2);
                return sb2.toString();
            }
        }
        return message;
    }

    public static void b(String tag, String message) {
    }

    public static void c(String tag, String message, @androidx.annotation.p0 Throwable throwable) {
        if (f57621g) {
            return;
        }
        b(tag, a(message, throwable));
    }

    public static void d(String tag, String message) {
    }

    public static void e(String tag, String message, @androidx.annotation.p0 Throwable throwable) {
        if (f57621g) {
            return;
        }
        d(tag, a(message, throwable));
    }

    public static int f() {
        return f57620f;
    }

    public static void h(String tag, String message) {
    }

    public static void i(String tag, String message, @androidx.annotation.p0 Throwable throwable) {
        if (f57621g) {
            return;
        }
        h(tag, a(message, throwable));
    }

    public static void j(int logLevel) {
        f57620f = logLevel;
    }

    public static void k(boolean logStackTraces) {
        f57621g = logStackTraces;
    }

    public static void l(String tag, String message) {
    }

    public static void m(String tag, String message, @androidx.annotation.p0 Throwable throwable) {
        if (f57621g) {
            return;
        }
        l(tag, a(message, throwable));
    }

    public boolean g() {
        return f57621g;
    }
}
