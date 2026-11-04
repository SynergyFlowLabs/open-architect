package com.google.api.client.repackaged.com.google.common.base;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@r7.b
public final class q {
    private q() {
    }

    public static void A(boolean z10, @fj.h String str, @fj.h Object obj, @fj.h Object obj2, @fj.h Object obj3, @fj.h Object obj4) {
        if (!z10) {
            throw new IllegalArgumentException(F0(str, obj, obj2, obj3, obj4));
        }
    }

    public static void A0(boolean z10, @fj.h String str, @fj.h Object obj, long j10) {
        if (!z10) {
            throw new IllegalStateException(F0(str, obj, Long.valueOf(j10)));
        }
    }

    public static void B(boolean z10, @fj.h String str, @fj.h Object... objArr) {
        if (!z10) {
            throw new IllegalArgumentException(F0(str, objArr));
        }
    }

    public static void B0(boolean z10, @fj.h String str, @fj.h Object obj, @fj.h Object obj2) {
        if (!z10) {
            throw new IllegalStateException(F0(str, obj, obj2));
        }
    }

    @z7.a
    public static int C(int i10, int i11) {
        return D(i10, i11, FirebaseAnalytics.d.f120644b0);
    }

    public static void C0(boolean z10, @fj.h String str, @fj.h Object obj, @fj.h Object obj2, @fj.h Object obj3) {
        if (!z10) {
            throw new IllegalStateException(F0(str, obj, obj2, obj3));
        }
    }

    @z7.a
    public static int D(int i10, int i11, @fj.h String str) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(a(i10, i11, str));
        }
        return i10;
    }

    public static void D0(boolean z10, @fj.h String str, @fj.h Object obj, @fj.h Object obj2, @fj.h Object obj3, @fj.h Object obj4) {
        if (!z10) {
            throw new IllegalStateException(F0(str, obj, obj2, obj3, obj4));
        }
    }

    @z7.a
    public static <T> T E(T t10) {
        t10.getClass();
        return t10;
    }

    public static void E0(boolean z10, @fj.h String str, @fj.h Object... objArr) {
        if (!z10) {
            throw new IllegalStateException(F0(str, objArr));
        }
    }

    @z7.a
    public static <T> T F(T t10, @fj.h Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    static String F0(String str, @fj.h Object... objArr) {
        int iIndexOf;
        String strValueOf = String.valueOf(str);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + (objArr.length * 16));
        int i10 = 0;
        int i11 = 0;
        while (i10 < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i11)) != -1) {
            sb2.append((CharSequence) strValueOf, i11, iIndexOf);
            sb2.append(objArr[i10]);
            i11 = iIndexOf + 2;
            i10++;
        }
        sb2.append((CharSequence) strValueOf, i11, strValueOf.length());
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

    @z7.a
    public static <T> T G(T t10, @fj.h String str, char c10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(F0(str, Character.valueOf(c10)));
    }

    @z7.a
    public static <T> T H(T t10, @fj.h String str, char c10, char c11) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(F0(str, Character.valueOf(c10), Character.valueOf(c11)));
    }

    @z7.a
    public static <T> T I(T t10, @fj.h String str, char c10, int i10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(F0(str, Character.valueOf(c10), Integer.valueOf(i10)));
    }

    @z7.a
    public static <T> T J(T t10, @fj.h String str, char c10, long j10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(F0(str, Character.valueOf(c10), Long.valueOf(j10)));
    }

    @z7.a
    public static <T> T K(T t10, @fj.h String str, char c10, @fj.h Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(F0(str, Character.valueOf(c10), obj));
    }

    @z7.a
    public static <T> T L(T t10, @fj.h String str, int i10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(F0(str, Integer.valueOf(i10)));
    }

    @z7.a
    public static <T> T M(T t10, @fj.h String str, int i10, char c10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(F0(str, Integer.valueOf(i10), Character.valueOf(c10)));
    }

    @z7.a
    public static <T> T N(T t10, @fj.h String str, int i10, int i11) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(F0(str, Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    @z7.a
    public static <T> T O(T t10, @fj.h String str, int i10, long j10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(F0(str, Integer.valueOf(i10), Long.valueOf(j10)));
    }

    @z7.a
    public static <T> T P(T t10, @fj.h String str, int i10, @fj.h Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(F0(str, Integer.valueOf(i10), obj));
    }

    @z7.a
    public static <T> T Q(T t10, @fj.h String str, long j10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(F0(str, Long.valueOf(j10)));
    }

    @z7.a
    public static <T> T R(T t10, @fj.h String str, long j10, char c10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(F0(str, Long.valueOf(j10), Character.valueOf(c10)));
    }

    @z7.a
    public static <T> T S(T t10, @fj.h String str, long j10, int i10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(F0(str, Long.valueOf(j10), Integer.valueOf(i10)));
    }

    @z7.a
    public static <T> T T(T t10, @fj.h String str, long j10, long j11) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(F0(str, Long.valueOf(j10), Long.valueOf(j11)));
    }

    @z7.a
    public static <T> T U(T t10, @fj.h String str, long j10, @fj.h Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(F0(str, Long.valueOf(j10), obj));
    }

    @z7.a
    public static <T> T V(T t10, @fj.h String str, @fj.h Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(F0(str, obj));
    }

    @z7.a
    public static <T> T W(T t10, @fj.h String str, @fj.h Object obj, char c10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(F0(str, obj, Character.valueOf(c10)));
    }

    @z7.a
    public static <T> T X(T t10, @fj.h String str, @fj.h Object obj, int i10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(F0(str, obj, Integer.valueOf(i10)));
    }

    @z7.a
    public static <T> T Y(T t10, @fj.h String str, @fj.h Object obj, long j10) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(F0(str, obj, Long.valueOf(j10)));
    }

    @z7.a
    public static <T> T Z(T t10, @fj.h String str, @fj.h Object obj, @fj.h Object obj2) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(F0(str, obj, obj2));
    }

    private static String a(int i10, int i11, String str) {
        if (i10 < 0) {
            return F0("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return F0("%s (%s) must be less than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException("negative size: " + i11);
    }

    @z7.a
    public static <T> T a0(T t10, @fj.h String str, @fj.h Object obj, @fj.h Object obj2, @fj.h Object obj3) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(F0(str, obj, obj2, obj3));
    }

    private static String b(int i10, int i11, String str) {
        if (i10 < 0) {
            return F0("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return F0("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException("negative size: " + i11);
    }

    @z7.a
    public static <T> T b0(T t10, @fj.h String str, @fj.h Object obj, @fj.h Object obj2, @fj.h Object obj3, @fj.h Object obj4) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(F0(str, obj, obj2, obj3, obj4));
    }

    private static String c(int i10, int i11, int i12) {
        if (i10 < 0 || i10 > i12) {
            return b(i10, i12, "start index");
        }
        return (i11 < 0 || i11 > i12) ? b(i11, i12, "end index") : F0("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
    }

    @z7.a
    public static <T> T c0(T t10, @fj.h String str, @fj.h Object... objArr) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(F0(str, objArr));
    }

    public static void d(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    @z7.a
    public static int d0(int i10, int i11) {
        return e0(i10, i11, FirebaseAnalytics.d.f120644b0);
    }

    public static void e(boolean z10, @fj.h Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @z7.a
    public static int e0(int i10, int i11, @fj.h String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(b(i10, i11, str));
        }
        return i10;
    }

    public static void f(boolean z10, @fj.h String str, char c10) {
        if (!z10) {
            throw new IllegalArgumentException(F0(str, Character.valueOf(c10)));
        }
    }

    public static void f0(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException(c(i10, i11, i12));
        }
    }

    public static void g(boolean z10, @fj.h String str, char c10, char c11) {
        if (!z10) {
            throw new IllegalArgumentException(F0(str, Character.valueOf(c10), Character.valueOf(c11)));
        }
    }

    public static void g0(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void h(boolean z10, @fj.h String str, char c10, int i10) {
        if (!z10) {
            throw new IllegalArgumentException(F0(str, Character.valueOf(c10), Integer.valueOf(i10)));
        }
    }

    public static void h0(boolean z10, @fj.h Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void i(boolean z10, @fj.h String str, char c10, long j10) {
        if (!z10) {
            throw new IllegalArgumentException(F0(str, Character.valueOf(c10), Long.valueOf(j10)));
        }
    }

    public static void i0(boolean z10, @fj.h String str, char c10) {
        if (!z10) {
            throw new IllegalStateException(F0(str, Character.valueOf(c10)));
        }
    }

    public static void j(boolean z10, @fj.h String str, char c10, @fj.h Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(F0(str, Character.valueOf(c10), obj));
        }
    }

    public static void j0(boolean z10, @fj.h String str, char c10, char c11) {
        if (!z10) {
            throw new IllegalStateException(F0(str, Character.valueOf(c10), Character.valueOf(c11)));
        }
    }

    public static void k(boolean z10, @fj.h String str, int i10) {
        if (!z10) {
            throw new IllegalArgumentException(F0(str, Integer.valueOf(i10)));
        }
    }

    public static void k0(boolean z10, @fj.h String str, char c10, int i10) {
        if (!z10) {
            throw new IllegalStateException(F0(str, Character.valueOf(c10), Integer.valueOf(i10)));
        }
    }

    public static void l(boolean z10, @fj.h String str, int i10, char c10) {
        if (!z10) {
            throw new IllegalArgumentException(F0(str, Integer.valueOf(i10), Character.valueOf(c10)));
        }
    }

    public static void l0(boolean z10, @fj.h String str, char c10, long j10) {
        if (!z10) {
            throw new IllegalStateException(F0(str, Character.valueOf(c10), Long.valueOf(j10)));
        }
    }

    public static void m(boolean z10, @fj.h String str, int i10, int i11) {
        if (!z10) {
            throw new IllegalArgumentException(F0(str, Integer.valueOf(i10), Integer.valueOf(i11)));
        }
    }

    public static void m0(boolean z10, @fj.h String str, char c10, @fj.h Object obj) {
        if (!z10) {
            throw new IllegalStateException(F0(str, Character.valueOf(c10), obj));
        }
    }

    public static void n(boolean z10, @fj.h String str, int i10, long j10) {
        if (!z10) {
            throw new IllegalArgumentException(F0(str, Integer.valueOf(i10), Long.valueOf(j10)));
        }
    }

    public static void n0(boolean z10, @fj.h String str, int i10) {
        if (!z10) {
            throw new IllegalStateException(F0(str, Integer.valueOf(i10)));
        }
    }

    public static void o(boolean z10, @fj.h String str, int i10, @fj.h Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(F0(str, Integer.valueOf(i10), obj));
        }
    }

    public static void o0(boolean z10, @fj.h String str, int i10, char c10) {
        if (!z10) {
            throw new IllegalStateException(F0(str, Integer.valueOf(i10), Character.valueOf(c10)));
        }
    }

    public static void p(boolean z10, @fj.h String str, long j10) {
        if (!z10) {
            throw new IllegalArgumentException(F0(str, Long.valueOf(j10)));
        }
    }

    public static void p0(boolean z10, @fj.h String str, int i10, int i11) {
        if (!z10) {
            throw new IllegalStateException(F0(str, Integer.valueOf(i10), Integer.valueOf(i11)));
        }
    }

    public static void q(boolean z10, @fj.h String str, long j10, char c10) {
        if (!z10) {
            throw new IllegalArgumentException(F0(str, Long.valueOf(j10), Character.valueOf(c10)));
        }
    }

    public static void q0(boolean z10, @fj.h String str, int i10, long j10) {
        if (!z10) {
            throw new IllegalStateException(F0(str, Integer.valueOf(i10), Long.valueOf(j10)));
        }
    }

    public static void r(boolean z10, @fj.h String str, long j10, int i10) {
        if (!z10) {
            throw new IllegalArgumentException(F0(str, Long.valueOf(j10), Integer.valueOf(i10)));
        }
    }

    public static void r0(boolean z10, @fj.h String str, int i10, @fj.h Object obj) {
        if (!z10) {
            throw new IllegalStateException(F0(str, Integer.valueOf(i10), obj));
        }
    }

    public static void s(boolean z10, @fj.h String str, long j10, long j11) {
        if (!z10) {
            throw new IllegalArgumentException(F0(str, Long.valueOf(j10), Long.valueOf(j11)));
        }
    }

    public static void s0(boolean z10, @fj.h String str, long j10) {
        if (!z10) {
            throw new IllegalStateException(F0(str, Long.valueOf(j10)));
        }
    }

    public static void t(boolean z10, @fj.h String str, long j10, @fj.h Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(F0(str, Long.valueOf(j10), obj));
        }
    }

    public static void t0(boolean z10, @fj.h String str, long j10, char c10) {
        if (!z10) {
            throw new IllegalStateException(F0(str, Long.valueOf(j10), Character.valueOf(c10)));
        }
    }

    public static void u(boolean z10, @fj.h String str, @fj.h Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(F0(str, obj));
        }
    }

    public static void u0(boolean z10, @fj.h String str, long j10, int i10) {
        if (!z10) {
            throw new IllegalStateException(F0(str, Long.valueOf(j10), Integer.valueOf(i10)));
        }
    }

    public static void v(boolean z10, @fj.h String str, @fj.h Object obj, char c10) {
        if (!z10) {
            throw new IllegalArgumentException(F0(str, obj, Character.valueOf(c10)));
        }
    }

    public static void v0(boolean z10, @fj.h String str, long j10, long j11) {
        if (!z10) {
            throw new IllegalStateException(F0(str, Long.valueOf(j10), Long.valueOf(j11)));
        }
    }

    public static void w(boolean z10, @fj.h String str, @fj.h Object obj, int i10) {
        if (!z10) {
            throw new IllegalArgumentException(F0(str, obj, Integer.valueOf(i10)));
        }
    }

    public static void w0(boolean z10, @fj.h String str, long j10, @fj.h Object obj) {
        if (!z10) {
            throw new IllegalStateException(F0(str, Long.valueOf(j10), obj));
        }
    }

    public static void x(boolean z10, @fj.h String str, @fj.h Object obj, long j10) {
        if (!z10) {
            throw new IllegalArgumentException(F0(str, obj, Long.valueOf(j10)));
        }
    }

    public static void x0(boolean z10, @fj.h String str, @fj.h Object obj) {
        if (!z10) {
            throw new IllegalStateException(F0(str, obj));
        }
    }

    public static void y(boolean z10, @fj.h String str, @fj.h Object obj, @fj.h Object obj2) {
        if (!z10) {
            throw new IllegalArgumentException(F0(str, obj, obj2));
        }
    }

    public static void y0(boolean z10, @fj.h String str, @fj.h Object obj, char c10) {
        if (!z10) {
            throw new IllegalStateException(F0(str, obj, Character.valueOf(c10)));
        }
    }

    public static void z(boolean z10, @fj.h String str, @fj.h Object obj, @fj.h Object obj2, @fj.h Object obj3) {
        if (!z10) {
            throw new IllegalArgumentException(F0(str, obj, obj2, obj3));
        }
    }

    public static void z0(boolean z10, @fj.h String str, @fj.h Object obj, int i10) {
        if (!z10) {
            throw new IllegalStateException(F0(str, obj, Integer.valueOf(i10)));
        }
    }
}
