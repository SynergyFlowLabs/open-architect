package org.apache.commons.lang3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes14.dex */
public class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f337055a = "The validated value is not a number";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f337056b = "The value is invalid: %f";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f337057c = "The value %s is not in the specified exclusive range of %s to %s";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f337058d = "The value %s is not in the specified inclusive range of %s to %s";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f337059e = "The string %s does not match the pattern %s";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f337060f = "The validated object is null";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f337061g = "The validated expression is false";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f337062h = "The validated array contains null element at index: %d";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f337063i = "The validated collection contains null element at index: %d";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f337064j = "The validated character sequence is blank";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f337065k = "The validated array is empty";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f337066l = "The validated character sequence is empty";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f337067m = "The validated collection is empty";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f337068n = "The validated map is empty";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f337069o = "The validated array index is invalid: %d";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f337070p = "The validated character sequence index is invalid: %d";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f337071q = "The validated collection index is invalid: %d";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f337072r = "The validated state is false";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f337073s = "Cannot assign a %s to a %s";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f337074t = "Expected type: %s, actual: %s";

    public static <T> T[] A(T[] tArr) {
        return (T[]) B(tArr, f337062h, new Object[0]);
    }

    public static <T> T[] B(T[] tArr, String str, Object... objArr) {
        O(tArr);
        for (int i10 = 0; i10 < tArr.length; i10++) {
            if (tArr[i10] == null) {
                throw new IllegalArgumentException(String.format(str, c.o(objArr, Integer.valueOf(i10))));
            }
        }
        return tArr;
    }

    public static <T extends CharSequence> T C(T t10) {
        return (T) D(t10, f337064j, new Object[0]);
    }

    public static <T extends CharSequence> T D(T t10, String str, Object... objArr) {
        if (t10 == null) {
            throw new NullPointerException(String.format(str, objArr));
        }
        if (z.z0(t10)) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
        return t10;
    }

    public static <T extends CharSequence> T E(T t10) {
        return (T) F(t10, f337066l, new Object[0]);
    }

    public static <T extends CharSequence> T F(T t10, String str, Object... objArr) {
        if (t10 == null) {
            throw new NullPointerException(String.format(str, objArr));
        }
        if (t10.length() != 0) {
            return t10;
        }
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static <T extends Collection<?>> T G(T t10) {
        return (T) H(t10, f337067m, new Object[0]);
    }

    public static <T extends Collection<?>> T H(T t10, String str, Object... objArr) {
        if (t10 == null) {
            throw new NullPointerException(String.format(str, objArr));
        }
        if (t10.isEmpty()) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
        return t10;
    }

    public static <T extends Map<?, ?>> T I(T t10) {
        return (T) J(t10, f337068n, new Object[0]);
    }

    public static <T extends Map<?, ?>> T J(T t10, String str, Object... objArr) {
        if (t10 == null) {
            throw new NullPointerException(String.format(str, objArr));
        }
        if (t10.isEmpty()) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
        return t10;
    }

    public static <T> T[] K(T[] tArr) {
        return (T[]) L(tArr, f337065k, new Object[0]);
    }

    public static <T> T[] L(T[] tArr, String str, Object... objArr) {
        if (tArr == null) {
            throw new NullPointerException(String.format(str, objArr));
        }
        if (tArr.length != 0) {
            return tArr;
        }
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static void M(double d10) {
        N(d10, f337055a, new Object[0]);
    }

    public static void N(double d10, String str, Object... objArr) {
        if (Double.isNaN(d10)) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static <T> T O(T t10) {
        return (T) P(t10, f337060f, new Object[0]);
    }

    public static <T> T P(T t10, String str, Object... objArr) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.format(str, objArr));
    }

    public static <T extends CharSequence> T Q(T t10, int i10) {
        return (T) R(t10, i10, f337070p, Integer.valueOf(i10));
    }

    public static <T extends CharSequence> T R(T t10, int i10, String str, Object... objArr) {
        O(t10);
        if (i10 < 0 || i10 >= t10.length()) {
            throw new IndexOutOfBoundsException(String.format(str, objArr));
        }
        return t10;
    }

    public static <T extends Collection<?>> T S(T t10, int i10) {
        return (T) T(t10, i10, f337071q, Integer.valueOf(i10));
    }

    public static <T extends Collection<?>> T T(T t10, int i10, String str, Object... objArr) {
        O(t10);
        if (i10 < 0 || i10 >= t10.size()) {
            throw new IndexOutOfBoundsException(String.format(str, objArr));
        }
        return t10;
    }

    public static <T> T[] U(T[] tArr, int i10) {
        return (T[]) V(tArr, i10, f337069o, Integer.valueOf(i10));
    }

    public static <T> T[] V(T[] tArr, int i10, String str, Object... objArr) {
        O(tArr);
        if (i10 < 0 || i10 >= tArr.length) {
            throw new IndexOutOfBoundsException(String.format(str, objArr));
        }
        return tArr;
    }

    public static void W(boolean z10) {
        if (!z10) {
            throw new IllegalStateException(f337072r);
        }
    }

    public static void X(boolean z10, String str, Object... objArr) {
        if (!z10) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static void a(double d10, double d11, double d12) {
        if (d12 <= d10 || d12 >= d11) {
            throw new IllegalArgumentException(String.format(f337057c, Double.valueOf(d12), Double.valueOf(d10), Double.valueOf(d11)));
        }
    }

    public static void b(double d10, double d11, double d12, String str) {
        if (d12 <= d10 || d12 >= d11) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void c(long j10, long j11, long j12) {
        if (j12 <= j10 || j12 >= j11) {
            throw new IllegalArgumentException(String.format(f337057c, Long.valueOf(j12), Long.valueOf(j10), Long.valueOf(j11)));
        }
    }

    public static void d(long j10, long j11, long j12, String str) {
        if (j12 <= j10 || j12 >= j11) {
            throw new IllegalArgumentException(str);
        }
    }

    public static <T> void e(T t10, T t11, Comparable<T> comparable) {
        if (comparable.compareTo(t10) <= 0 || comparable.compareTo(t11) >= 0) {
            throw new IllegalArgumentException(String.format(f337057c, comparable, t10, t11));
        }
    }

    public static <T> void f(T t10, T t11, Comparable<T> comparable, String str, Object... objArr) {
        if (comparable.compareTo(t10) <= 0 || comparable.compareTo(t11) >= 0) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void g(double d10) {
        h(d10, f337056b, Double.valueOf(d10));
    }

    public static void h(double d10, String str, Object... objArr) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void i(double d10, double d11, double d12) {
        if (d12 < d10 || d12 > d11) {
            throw new IllegalArgumentException(String.format(f337058d, Double.valueOf(d12), Double.valueOf(d10), Double.valueOf(d11)));
        }
    }

    public static void j(double d10, double d11, double d12, String str) {
        if (d12 < d10 || d12 > d11) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void k(long j10, long j11, long j12) {
        if (j12 < j10 || j12 > j11) {
            throw new IllegalArgumentException(String.format(f337058d, Long.valueOf(j12), Long.valueOf(j10), Long.valueOf(j11)));
        }
    }

    public static void l(long j10, long j11, long j12, String str) {
        if (j12 < j10 || j12 > j11) {
            throw new IllegalArgumentException(str);
        }
    }

    public static <T> void m(T t10, T t11, Comparable<T> comparable) {
        if (comparable.compareTo(t10) < 0 || comparable.compareTo(t11) > 0) {
            throw new IllegalArgumentException(String.format(f337058d, comparable, t10, t11));
        }
    }

    public static <T> void n(T t10, T t11, Comparable<T> comparable, String str, Object... objArr) {
        if (comparable.compareTo(t10) < 0 || comparable.compareTo(t11) > 0) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void o(Class<?> cls, Class<?> cls2) {
        if (cls.isAssignableFrom(cls2)) {
        } else {
            throw new IllegalArgumentException(String.format(f337073s, cls2 == null ? AbstractJsonLexerKt.NULL : cls2.getName(), cls.getName()));
        }
    }

    public static void p(Class<?> cls, Class<?> cls2, String str, Object... objArr) {
        if (!cls.isAssignableFrom(cls2)) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void q(Class<?> cls, Object obj) {
        if (cls.isInstance(obj)) {
        } else {
            throw new IllegalArgumentException(String.format(f337074t, cls.getName(), obj == null ? AbstractJsonLexerKt.NULL : obj.getClass().getName()));
        }
    }

    public static void r(Class<?> cls, Object obj, String str, Object... objArr) {
        if (!cls.isInstance(obj)) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void s(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(f337061g);
        }
    }

    public static void t(boolean z10, String str, double d10) {
        if (!z10) {
            throw new IllegalArgumentException(String.format(str, Double.valueOf(d10)));
        }
    }

    public static void u(boolean z10, String str, long j10) {
        if (!z10) {
            throw new IllegalArgumentException(String.format(str, Long.valueOf(j10)));
        }
    }

    public static void v(boolean z10, String str, Object... objArr) {
        if (!z10) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void w(CharSequence charSequence, String str) {
        if (!Pattern.matches(str, charSequence)) {
            throw new IllegalArgumentException(String.format(f337059e, charSequence, str));
        }
    }

    public static void x(CharSequence charSequence, String str, String str2, Object... objArr) {
        if (!Pattern.matches(str, charSequence)) {
            throw new IllegalArgumentException(String.format(str2, objArr));
        }
    }

    public static <T extends Iterable<?>> T y(T t10) {
        return (T) z(t10, f337063i, new Object[0]);
    }

    public static <T extends Iterable<?>> T z(T t10, String str, Object... objArr) {
        O(t10);
        Iterator it = t10.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new IllegalArgumentException(String.format(str, c.z(objArr, Integer.valueOf(i10))));
            }
            i10++;
        }
        return t10;
    }
}
