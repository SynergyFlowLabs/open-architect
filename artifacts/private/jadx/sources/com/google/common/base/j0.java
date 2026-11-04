package com.google.common.base;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes4.dex */
@com.google.common.annotations.b
@k
public final class j0 {
    private j0() {
    }

    public static void A(boolean expression, String errorMessageTemplate, @fj.a Object p10, @fj.a Object p11, @fj.a Object p12, @fj.a Object p13) {
        if (!expression) {
            throw new IllegalArgumentException(r0.e(errorMessageTemplate, p10, p11, p12, p13));
        }
    }

    public static void A0(boolean expression, String errorMessageTemplate, @fj.a Object p10, long p11) {
        if (!expression) {
            throw new IllegalStateException(r0.e(errorMessageTemplate, p10, Long.valueOf(p11)));
        }
    }

    public static void B(boolean expression, String errorMessageTemplate, @fj.a Object... errorMessageArgs) {
        if (!expression) {
            throw new IllegalArgumentException(r0.e(errorMessageTemplate, errorMessageArgs));
        }
    }

    public static void B0(boolean expression, String errorMessageTemplate, @fj.a Object p10, @fj.a Object p11) {
        if (!expression) {
            throw new IllegalStateException(r0.e(errorMessageTemplate, p10, p11));
        }
    }

    @z7.a
    public static int C(int index, int size) {
        return D(index, size, FirebaseAnalytics.d.f120644b0);
    }

    public static void C0(boolean expression, String errorMessageTemplate, @fj.a Object p10, @fj.a Object p11, @fj.a Object p12) {
        if (!expression) {
            throw new IllegalStateException(r0.e(errorMessageTemplate, p10, p11, p12));
        }
    }

    @z7.a
    public static int D(int index, int size, String desc) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(a(index, size, desc));
        }
        return index;
    }

    public static void D0(boolean expression, String errorMessageTemplate, @fj.a Object p10, @fj.a Object p11, @fj.a Object p12, @fj.a Object p13) {
        if (!expression) {
            throw new IllegalStateException(r0.e(errorMessageTemplate, p10, p11, p12, p13));
        }
    }

    @z7.a
    public static <T> T E(@fj.a T reference) {
        reference.getClass();
        return reference;
    }

    public static void E0(boolean expression, @fj.a String errorMessageTemplate, @fj.a Object... errorMessageArgs) {
        if (!expression) {
            throw new IllegalStateException(r0.e(errorMessageTemplate, errorMessageArgs));
        }
    }

    @z7.a
    public static <T> T F(@fj.a T reference, @fj.a Object errorMessage) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(String.valueOf(errorMessage));
    }

    @z7.a
    public static <T> T G(@fj.a T reference, String errorMessageTemplate, char p10) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(r0.e(errorMessageTemplate, Character.valueOf(p10)));
    }

    @z7.a
    public static <T> T H(@fj.a T reference, String errorMessageTemplate, char p10, char p11) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(r0.e(errorMessageTemplate, Character.valueOf(p10), Character.valueOf(p11)));
    }

    @z7.a
    public static <T> T I(@fj.a T reference, String errorMessageTemplate, char p10, int p11) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(r0.e(errorMessageTemplate, Character.valueOf(p10), Integer.valueOf(p11)));
    }

    @z7.a
    public static <T> T J(@fj.a T reference, String errorMessageTemplate, char p10, long p11) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(r0.e(errorMessageTemplate, Character.valueOf(p10), Long.valueOf(p11)));
    }

    @z7.a
    public static <T> T K(@fj.a T reference, String errorMessageTemplate, char p10, @fj.a Object p11) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(r0.e(errorMessageTemplate, Character.valueOf(p10), p11));
    }

    @z7.a
    public static <T> T L(@fj.a T reference, String errorMessageTemplate, int p10) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(r0.e(errorMessageTemplate, Integer.valueOf(p10)));
    }

    @z7.a
    public static <T> T M(@fj.a T reference, String errorMessageTemplate, int p10, char p11) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(r0.e(errorMessageTemplate, Integer.valueOf(p10), Character.valueOf(p11)));
    }

    @z7.a
    public static <T> T N(@fj.a T reference, String errorMessageTemplate, int p10, int p11) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(r0.e(errorMessageTemplate, Integer.valueOf(p10), Integer.valueOf(p11)));
    }

    @z7.a
    public static <T> T O(@fj.a T reference, String errorMessageTemplate, int p10, long p11) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(r0.e(errorMessageTemplate, Integer.valueOf(p10), Long.valueOf(p11)));
    }

    @z7.a
    public static <T> T P(@fj.a T reference, String errorMessageTemplate, int p10, @fj.a Object p11) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(r0.e(errorMessageTemplate, Integer.valueOf(p10), p11));
    }

    @z7.a
    public static <T> T Q(@fj.a T reference, String errorMessageTemplate, long p10) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(r0.e(errorMessageTemplate, Long.valueOf(p10)));
    }

    @z7.a
    public static <T> T R(@fj.a T reference, String errorMessageTemplate, long p10, char p11) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(r0.e(errorMessageTemplate, Long.valueOf(p10), Character.valueOf(p11)));
    }

    @z7.a
    public static <T> T S(@fj.a T reference, String errorMessageTemplate, long p10, int p11) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(r0.e(errorMessageTemplate, Long.valueOf(p10), Integer.valueOf(p11)));
    }

    @z7.a
    public static <T> T T(@fj.a T reference, String errorMessageTemplate, long p10, long p11) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(r0.e(errorMessageTemplate, Long.valueOf(p10), Long.valueOf(p11)));
    }

    @z7.a
    public static <T> T U(@fj.a T reference, String errorMessageTemplate, long p10, @fj.a Object p11) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(r0.e(errorMessageTemplate, Long.valueOf(p10), p11));
    }

    @z7.a
    public static <T> T V(@fj.a T reference, String errorMessageTemplate, @fj.a Object p10) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(r0.e(errorMessageTemplate, p10));
    }

    @z7.a
    public static <T> T W(@fj.a T reference, String errorMessageTemplate, @fj.a Object p10, char p11) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(r0.e(errorMessageTemplate, p10, Character.valueOf(p11)));
    }

    @z7.a
    public static <T> T X(@fj.a T reference, String errorMessageTemplate, @fj.a Object p10, int p11) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(r0.e(errorMessageTemplate, p10, Integer.valueOf(p11)));
    }

    @z7.a
    public static <T> T Y(@fj.a T reference, String errorMessageTemplate, @fj.a Object p10, long p11) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(r0.e(errorMessageTemplate, p10, Long.valueOf(p11)));
    }

    @z7.a
    public static <T> T Z(@fj.a T reference, String errorMessageTemplate, @fj.a Object p10, @fj.a Object p11) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(r0.e(errorMessageTemplate, p10, p11));
    }

    private static String a(int index, int size, String desc) {
        if (index < 0) {
            return r0.e("%s (%s) must not be negative", desc, Integer.valueOf(index));
        }
        if (size >= 0) {
            return r0.e("%s (%s) must be less than size (%s)", desc, Integer.valueOf(index), Integer.valueOf(size));
        }
        throw new IllegalArgumentException("negative size: " + size);
    }

    @z7.a
    public static <T> T a0(@fj.a T reference, String errorMessageTemplate, @fj.a Object p10, @fj.a Object p11, @fj.a Object p12) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(r0.e(errorMessageTemplate, p10, p11, p12));
    }

    private static String b(int index, int size, String desc) {
        if (index < 0) {
            return r0.e("%s (%s) must not be negative", desc, Integer.valueOf(index));
        }
        if (size >= 0) {
            return r0.e("%s (%s) must not be greater than size (%s)", desc, Integer.valueOf(index), Integer.valueOf(size));
        }
        throw new IllegalArgumentException("negative size: " + size);
    }

    @z7.a
    public static <T> T b0(@fj.a T reference, String errorMessageTemplate, @fj.a Object p10, @fj.a Object p11, @fj.a Object p12, @fj.a Object p13) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(r0.e(errorMessageTemplate, p10, p11, p12, p13));
    }

    private static String c(int start, int end, int size) {
        if (start < 0 || start > size) {
            return b(start, size, "start index");
        }
        if (end >= 0 && end <= size) {
            return r0.e("end index (%s) must not be less than start index (%s)", Integer.valueOf(end), Integer.valueOf(start));
        }
        return b(end, size, "end index");
    }

    @z7.a
    public static <T> T c0(@fj.a T reference, String errorMessageTemplate, @fj.a Object... errorMessageArgs) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(r0.e(errorMessageTemplate, errorMessageArgs));
    }

    public static void d(boolean expression) {
        if (!expression) {
            throw new IllegalArgumentException();
        }
    }

    @z7.a
    public static int d0(int index, int size) {
        return e0(index, size, FirebaseAnalytics.d.f120644b0);
    }

    public static void e(boolean expression, @fj.a Object errorMessage) {
        if (!expression) {
            throw new IllegalArgumentException(String.valueOf(errorMessage));
        }
    }

    @z7.a
    public static int e0(int index, int size, String desc) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(b(index, size, desc));
        }
        return index;
    }

    public static void f(boolean expression, String errorMessageTemplate, char p10) {
        if (!expression) {
            throw new IllegalArgumentException(r0.e(errorMessageTemplate, Character.valueOf(p10)));
        }
    }

    public static void f0(int start, int end, int size) {
        if (start < 0 || end < start || end > size) {
            throw new IndexOutOfBoundsException(c(start, end, size));
        }
    }

    public static void g(boolean expression, String errorMessageTemplate, char p10, char p11) {
        if (!expression) {
            throw new IllegalArgumentException(r0.e(errorMessageTemplate, Character.valueOf(p10), Character.valueOf(p11)));
        }
    }

    public static void g0(boolean expression) {
        if (!expression) {
            throw new IllegalStateException();
        }
    }

    public static void h(boolean expression, String errorMessageTemplate, char p10, int p11) {
        if (!expression) {
            throw new IllegalArgumentException(r0.e(errorMessageTemplate, Character.valueOf(p10), Integer.valueOf(p11)));
        }
    }

    public static void h0(boolean expression, @fj.a Object errorMessage) {
        if (!expression) {
            throw new IllegalStateException(String.valueOf(errorMessage));
        }
    }

    public static void i(boolean expression, String errorMessageTemplate, char p10, long p11) {
        if (!expression) {
            throw new IllegalArgumentException(r0.e(errorMessageTemplate, Character.valueOf(p10), Long.valueOf(p11)));
        }
    }

    public static void i0(boolean expression, String errorMessageTemplate, char p10) {
        if (!expression) {
            throw new IllegalStateException(r0.e(errorMessageTemplate, Character.valueOf(p10)));
        }
    }

    public static void j(boolean expression, String errorMessageTemplate, char p10, @fj.a Object p11) {
        if (!expression) {
            throw new IllegalArgumentException(r0.e(errorMessageTemplate, Character.valueOf(p10), p11));
        }
    }

    public static void j0(boolean expression, String errorMessageTemplate, char p10, char p11) {
        if (!expression) {
            throw new IllegalStateException(r0.e(errorMessageTemplate, Character.valueOf(p10), Character.valueOf(p11)));
        }
    }

    public static void k(boolean expression, String errorMessageTemplate, int p10) {
        if (!expression) {
            throw new IllegalArgumentException(r0.e(errorMessageTemplate, Integer.valueOf(p10)));
        }
    }

    public static void k0(boolean expression, String errorMessageTemplate, char p10, int p11) {
        if (!expression) {
            throw new IllegalStateException(r0.e(errorMessageTemplate, Character.valueOf(p10), Integer.valueOf(p11)));
        }
    }

    public static void l(boolean expression, String errorMessageTemplate, int p10, char p11) {
        if (!expression) {
            throw new IllegalArgumentException(r0.e(errorMessageTemplate, Integer.valueOf(p10), Character.valueOf(p11)));
        }
    }

    public static void l0(boolean expression, String errorMessageTemplate, char p10, long p11) {
        if (!expression) {
            throw new IllegalStateException(r0.e(errorMessageTemplate, Character.valueOf(p10), Long.valueOf(p11)));
        }
    }

    public static void m(boolean expression, String errorMessageTemplate, int p10, int p11) {
        if (!expression) {
            throw new IllegalArgumentException(r0.e(errorMessageTemplate, Integer.valueOf(p10), Integer.valueOf(p11)));
        }
    }

    public static void m0(boolean expression, String errorMessageTemplate, char p10, @fj.a Object p11) {
        if (!expression) {
            throw new IllegalStateException(r0.e(errorMessageTemplate, Character.valueOf(p10), p11));
        }
    }

    public static void n(boolean expression, String errorMessageTemplate, int p10, long p11) {
        if (!expression) {
            throw new IllegalArgumentException(r0.e(errorMessageTemplate, Integer.valueOf(p10), Long.valueOf(p11)));
        }
    }

    public static void n0(boolean expression, String errorMessageTemplate, int p10) {
        if (!expression) {
            throw new IllegalStateException(r0.e(errorMessageTemplate, Integer.valueOf(p10)));
        }
    }

    public static void o(boolean expression, String errorMessageTemplate, int p10, @fj.a Object p11) {
        if (!expression) {
            throw new IllegalArgumentException(r0.e(errorMessageTemplate, Integer.valueOf(p10), p11));
        }
    }

    public static void o0(boolean expression, String errorMessageTemplate, int p10, char p11) {
        if (!expression) {
            throw new IllegalStateException(r0.e(errorMessageTemplate, Integer.valueOf(p10), Character.valueOf(p11)));
        }
    }

    public static void p(boolean expression, String errorMessageTemplate, long p10) {
        if (!expression) {
            throw new IllegalArgumentException(r0.e(errorMessageTemplate, Long.valueOf(p10)));
        }
    }

    public static void p0(boolean expression, String errorMessageTemplate, int p10, int p11) {
        if (!expression) {
            throw new IllegalStateException(r0.e(errorMessageTemplate, Integer.valueOf(p10), Integer.valueOf(p11)));
        }
    }

    public static void q(boolean expression, String errorMessageTemplate, long p10, char p11) {
        if (!expression) {
            throw new IllegalArgumentException(r0.e(errorMessageTemplate, Long.valueOf(p10), Character.valueOf(p11)));
        }
    }

    public static void q0(boolean expression, String errorMessageTemplate, int p10, long p11) {
        if (!expression) {
            throw new IllegalStateException(r0.e(errorMessageTemplate, Integer.valueOf(p10), Long.valueOf(p11)));
        }
    }

    public static void r(boolean expression, String errorMessageTemplate, long p10, int p11) {
        if (!expression) {
            throw new IllegalArgumentException(r0.e(errorMessageTemplate, Long.valueOf(p10), Integer.valueOf(p11)));
        }
    }

    public static void r0(boolean expression, String errorMessageTemplate, int p10, @fj.a Object p11) {
        if (!expression) {
            throw new IllegalStateException(r0.e(errorMessageTemplate, Integer.valueOf(p10), p11));
        }
    }

    public static void s(boolean expression, String errorMessageTemplate, long p10, long p11) {
        if (!expression) {
            throw new IllegalArgumentException(r0.e(errorMessageTemplate, Long.valueOf(p10), Long.valueOf(p11)));
        }
    }

    public static void s0(boolean expression, String errorMessageTemplate, long p10) {
        if (!expression) {
            throw new IllegalStateException(r0.e(errorMessageTemplate, Long.valueOf(p10)));
        }
    }

    public static void t(boolean expression, String errorMessageTemplate, long p10, @fj.a Object p11) {
        if (!expression) {
            throw new IllegalArgumentException(r0.e(errorMessageTemplate, Long.valueOf(p10), p11));
        }
    }

    public static void t0(boolean expression, String errorMessageTemplate, long p10, char p11) {
        if (!expression) {
            throw new IllegalStateException(r0.e(errorMessageTemplate, Long.valueOf(p10), Character.valueOf(p11)));
        }
    }

    public static void u(boolean expression, String errorMessageTemplate, @fj.a Object p10) {
        if (!expression) {
            throw new IllegalArgumentException(r0.e(errorMessageTemplate, p10));
        }
    }

    public static void u0(boolean expression, String errorMessageTemplate, long p10, int p11) {
        if (!expression) {
            throw new IllegalStateException(r0.e(errorMessageTemplate, Long.valueOf(p10), Integer.valueOf(p11)));
        }
    }

    public static void v(boolean expression, String errorMessageTemplate, @fj.a Object p10, char p11) {
        if (!expression) {
            throw new IllegalArgumentException(r0.e(errorMessageTemplate, p10, Character.valueOf(p11)));
        }
    }

    public static void v0(boolean expression, String errorMessageTemplate, long p10, long p11) {
        if (!expression) {
            throw new IllegalStateException(r0.e(errorMessageTemplate, Long.valueOf(p10), Long.valueOf(p11)));
        }
    }

    public static void w(boolean expression, String errorMessageTemplate, @fj.a Object p10, int p11) {
        if (!expression) {
            throw new IllegalArgumentException(r0.e(errorMessageTemplate, p10, Integer.valueOf(p11)));
        }
    }

    public static void w0(boolean expression, String errorMessageTemplate, long p10, @fj.a Object p11) {
        if (!expression) {
            throw new IllegalStateException(r0.e(errorMessageTemplate, Long.valueOf(p10), p11));
        }
    }

    public static void x(boolean expression, String errorMessageTemplate, @fj.a Object p10, long p11) {
        if (!expression) {
            throw new IllegalArgumentException(r0.e(errorMessageTemplate, p10, Long.valueOf(p11)));
        }
    }

    public static void x0(boolean expression, String errorMessageTemplate, @fj.a Object p10) {
        if (!expression) {
            throw new IllegalStateException(r0.e(errorMessageTemplate, p10));
        }
    }

    public static void y(boolean expression, @fj.a String errorMessageTemplate, @fj.a Object p10, @fj.a Object p11) {
        if (!expression) {
            throw new IllegalArgumentException(r0.e(errorMessageTemplate, p10, p11));
        }
    }

    public static void y0(boolean expression, String errorMessageTemplate, @fj.a Object p10, char p11) {
        if (!expression) {
            throw new IllegalStateException(r0.e(errorMessageTemplate, p10, Character.valueOf(p11)));
        }
    }

    public static void z(boolean expression, String errorMessageTemplate, @fj.a Object p10, @fj.a Object p11, @fj.a Object p12) {
        if (!expression) {
            throw new IllegalArgumentException(r0.e(errorMessageTemplate, p10, p11, p12));
        }
    }

    public static void z0(boolean expression, String errorMessageTemplate, @fj.a Object p10, int p11) {
        if (!expression) {
            throw new IllegalStateException(r0.e(errorMessageTemplate, p10, Integer.valueOf(p11)));
        }
    }
}
