package org.slf4j.helpers;

import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes14.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final char f339634a = '{';

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final char f339635b = '}';

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f339636c = "{}";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char f339637d = '\\';

    public static final f a(String str, Object[] objArr) {
        Throwable thM = m(objArr);
        if (thM != null) {
            objArr = u(objArr);
        }
        return b(str, objArr, thM);
    }

    public static final f b(String str, Object[] objArr, Throwable th2) {
        int i10;
        if (str == null) {
            return new f(null, objArr, th2);
        }
        if (objArr == null) {
            return new f(str);
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 50);
        int i11 = 0;
        int i12 = 0;
        while (i11 < objArr.length) {
            int iIndexOf = str.indexOf(f339636c, i12);
            if (iIndexOf == -1) {
                if (i12 == 0) {
                    return new f(str, objArr, th2);
                }
                sb2.append((CharSequence) str, i12, str.length());
                return new f(sb2.toString(), objArr, th2);
            }
            if (p(str, iIndexOf)) {
                if (o(str, iIndexOf)) {
                    sb2.append((CharSequence) str, i12, iIndexOf - 1);
                    h(sb2, objArr[i11], new HashMap());
                } else {
                    i11--;
                    sb2.append((CharSequence) str, i12, iIndexOf - 1);
                    sb2.append('{');
                    i10 = iIndexOf + 1;
                }
                i12 = i10;
                i11++;
            } else {
                sb2.append((CharSequence) str, i12, iIndexOf);
                h(sb2, objArr[i11], new HashMap());
            }
            i10 = iIndexOf + 2;
            i12 = i10;
            i11++;
        }
        sb2.append((CharSequence) str, i12, str.length());
        return new f(sb2.toString(), objArr, th2);
    }

    public static final String c(String str, Object[] objArr) {
        return b(str, objArr, null).b();
    }

    public static String d(o oVar) {
        return c(oVar.b(), oVar.a());
    }

    private static void e(StringBuilder sb2, boolean[] zArr) {
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        int length = zArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append(zArr[i10]);
            if (i10 != length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append(AbstractJsonLexerKt.END_LIST);
    }

    private static void f(StringBuilder sb2, byte[] bArr) {
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append((int) bArr[i10]);
            if (i10 != length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append(AbstractJsonLexerKt.END_LIST);
    }

    private static void g(StringBuilder sb2, char[] cArr) {
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        int length = cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append(cArr[i10]);
            if (i10 != length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append(AbstractJsonLexerKt.END_LIST);
    }

    private static void h(StringBuilder sb2, Object obj, Map<Object[], Object> map) {
        if (obj == null) {
            sb2.append(AbstractJsonLexerKt.NULL);
            return;
        }
        if (!obj.getClass().isArray()) {
            s(sb2, obj);
            return;
        }
        if (obj instanceof boolean[]) {
            e(sb2, (boolean[]) obj);
            return;
        }
        if (obj instanceof byte[]) {
            f(sb2, (byte[]) obj);
            return;
        }
        if (obj instanceof char[]) {
            g(sb2, (char[]) obj);
            return;
        }
        if (obj instanceof short[]) {
            t(sb2, (short[]) obj);
            return;
        }
        if (obj instanceof int[]) {
            n(sb2, (int[]) obj);
            return;
        }
        if (obj instanceof long[]) {
            q(sb2, (long[]) obj);
            return;
        }
        if (obj instanceof float[]) {
            j(sb2, (float[]) obj);
        } else if (obj instanceof double[]) {
            i(sb2, (double[]) obj);
        } else {
            r(sb2, (Object[]) obj, map);
        }
    }

    private static void i(StringBuilder sb2, double[] dArr) {
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        int length = dArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append(dArr[i10]);
            if (i10 != length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append(AbstractJsonLexerKt.END_LIST);
    }

    private static void j(StringBuilder sb2, float[] fArr) {
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append(fArr[i10]);
            if (i10 != length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append(AbstractJsonLexerKt.END_LIST);
    }

    public static final f k(String str, Object obj) {
        return a(str, new Object[]{obj});
    }

    public static final f l(String str, Object obj, Object obj2) {
        return a(str, new Object[]{obj, obj2});
    }

    public static Throwable m(Object[] objArr) {
        return o.d(objArr);
    }

    private static void n(StringBuilder sb2, int[] iArr) {
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append(iArr[i10]);
            if (i10 != length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append(AbstractJsonLexerKt.END_LIST);
    }

    static final boolean o(String str, int i10) {
        return i10 >= 2 && str.charAt(i10 - 2) == '\\';
    }

    static final boolean p(String str, int i10) {
        return i10 != 0 && str.charAt(i10 - 1) == '\\';
    }

    private static void q(StringBuilder sb2, long[] jArr) {
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append(jArr[i10]);
            if (i10 != length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append(AbstractJsonLexerKt.END_LIST);
    }

    private static void r(StringBuilder sb2, Object[] objArr, Map<Object[], Object> map) {
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        if (map.containsKey(objArr)) {
            sb2.append("...");
        } else {
            map.put(objArr, null);
            int length = objArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                h(sb2, objArr[i10], map);
                if (i10 != length - 1) {
                    sb2.append(", ");
                }
            }
            map.remove(objArr);
        }
        sb2.append(AbstractJsonLexerKt.END_LIST);
    }

    private static void s(StringBuilder sb2, Object obj) {
        try {
            sb2.append(obj.toString());
        } catch (Throwable th2) {
            p.c("Failed toString() invocation on an object of type [" + obj.getClass().getName() + "]", th2);
            sb2.append("[FAILED toString()]");
        }
    }

    private static void t(StringBuilder sb2, short[] sArr) {
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append((int) sArr[i10]);
            if (i10 != length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append(AbstractJsonLexerKt.END_LIST);
    }

    public static Object[] u(Object[] objArr) {
        return o.g(objArr);
    }
}
