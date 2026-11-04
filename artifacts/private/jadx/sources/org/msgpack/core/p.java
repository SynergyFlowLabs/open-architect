package org.msgpack.core;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes14.dex */
public final class p {
    private p() {
    }

    private static String a(int i10, int i11, String str) {
        if (i10 < 0) {
            return r("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return r("%s (%s) must be less than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException("negative size: " + i11);
    }

    private static String b(int i10, int i11, String str) {
        if (i10 < 0) {
            return r("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return r("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException("negative size: " + i11);
    }

    private static String c(int i10, int i11, int i12) {
        if (i10 < 0 || i10 > i12) {
            return b(i10, i12, "start index");
        }
        if (i11 >= 0 && i11 <= i12) {
            return r("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
        }
        return b(i11, i12, "end index");
    }

    public static void d(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(boolean z10, @ym.a Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void f(boolean z10, @ym.a String str, @ym.a Object... objArr) {
        if (!z10) {
            throw new IllegalArgumentException(r(str, objArr));
        }
    }

    public static int g(int i10, int i11) {
        return h(i10, i11, FirebaseAnalytics.d.f120644b0);
    }

    public static int h(int i10, int i11, @ym.a String str) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(a(i10, i11, str));
        }
        return i10;
    }

    public static <T> T i(T t10) {
        t10.getClass();
        return t10;
    }

    public static <T> T j(T t10, @ym.a Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static <T> T k(T t10, @ym.a String str, @ym.a Object... objArr) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(r(str, objArr));
    }

    public static int l(int i10, int i11) {
        return m(i10, i11, FirebaseAnalytics.d.f120644b0);
    }

    public static int m(int i10, int i11, @ym.a String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(b(i10, i11, str));
        }
        return i10;
    }

    public static void n(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException(c(i10, i11, i12));
        }
    }

    public static void o(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void p(boolean z10, @ym.a Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void q(boolean z10, @ym.a String str, @ym.a Object... objArr) {
        if (!z10) {
            throw new IllegalStateException(r(str, objArr));
        }
    }

    @ym.b
    static String r(String str, @ym.a Object... objArr) {
        int iIndexOf;
        String strValueOf = String.valueOf(str);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + (objArr.length * 16));
        int i10 = 0;
        int i11 = 0;
        while (i10 < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i11)) != -1) {
            sb2.append(strValueOf.substring(i11, iIndexOf));
            sb2.append(objArr[i10]);
            i11 = iIndexOf + 2;
            i10++;
        }
        sb2.append(strValueOf.substring(i11));
        if (i10 < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i10]);
            for (int i12 = i10 + 1; i12 < objArr.length; i12++) {
                sb2.append(", ");
                sb2.append(objArr[i12]);
            }
            sb2.append(AbstractJsonLexerKt.END_LIST);
        }
        return sb2.toString();
    }
}
