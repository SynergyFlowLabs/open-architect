package sk;

import com.facebook.appevents.p;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.lang3.a0;
import org.apache.commons.lang3.c0;
import org.apache.commons.lang3.z;
import org.locationtech.jts.geom.l;

/* JADX INFO: loaded from: classes14.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Long f376049a = 0L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Long f376050b = 1L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Long f376051c = -1L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Integer f376052d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Integer f376053e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Integer f376054f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Short f376055g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Short f376056h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Short f376057i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Byte f376058j = (byte) 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Byte f376059k = (byte) 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Byte f376060l = (byte) -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Double f376061m = Double.valueOf(0.0d);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Double f376062n = Double.valueOf(1.0d);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Double f376063o = Double.valueOf(-1.0d);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Float f376064p = Float.valueOf(0.0f);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Float f376065q = Float.valueOf(1.0f);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Float f376066r = Float.valueOf(-1.0f);

    static {
        int i10 = 2 << 0;
        int i11 = 7 | 1;
    }

    public static long A(long j10, long j11, long j12) {
        if (j11 > j10) {
            j10 = j11;
        }
        return j12 > j10 ? j12 : j10;
    }

    public static long B(long... jArr) {
        c0(jArr);
        long j10 = jArr[0];
        for (int i10 = 1; i10 < jArr.length; i10++) {
            long j11 = jArr[i10];
            if (j11 > j10) {
                j10 = j11;
            }
        }
        return j10;
    }

    public static short C(short s10, short s11, short s12) {
        if (s11 > s10) {
            s10 = s11;
        }
        return s12 > s10 ? s12 : s10;
    }

    public static short D(short... sArr) {
        c0(sArr);
        short s10 = sArr[0];
        for (int i10 = 1; i10 < sArr.length; i10++) {
            short s11 = sArr[i10];
            if (s11 > s10) {
                s10 = s11;
            }
        }
        return s10;
    }

    public static byte E(byte b10, byte b11, byte b12) {
        if (b11 < b10) {
            b10 = b11;
        }
        return b12 < b10 ? b12 : b10;
    }

    public static byte F(byte... bArr) {
        c0(bArr);
        byte b10 = bArr[0];
        for (int i10 = 1; i10 < bArr.length; i10++) {
            byte b11 = bArr[i10];
            if (b11 < b10) {
                b10 = b11;
            }
        }
        return b10;
    }

    public static double G(double d10, double d11, double d12) {
        return Math.min(Math.min(d10, d11), d12);
    }

    public static double H(double... dArr) {
        c0(dArr);
        double d10 = dArr[0];
        for (int i10 = 1; i10 < dArr.length; i10++) {
            if (Double.isNaN(dArr[i10])) {
                return Double.NaN;
            }
            double d11 = dArr[i10];
            if (d11 < d10) {
                d10 = d11;
            }
        }
        return d10;
    }

    public static float I(float f10, float f11, float f12) {
        return Math.min(Math.min(f10, f11), f12);
    }

    public static float J(float... fArr) {
        c0(fArr);
        float f10 = fArr[0];
        for (int i10 = 1; i10 < fArr.length; i10++) {
            if (Float.isNaN(fArr[i10])) {
                return Float.NaN;
            }
            float f11 = fArr[i10];
            if (f11 < f10) {
                f10 = f11;
            }
        }
        return f10;
    }

    public static int K(int i10, int i11, int i12) {
        if (i11 < i10) {
            i10 = i11;
        }
        return i12 < i10 ? i12 : i10;
    }

    public static int L(int... iArr) {
        c0(iArr);
        int i10 = iArr[0];
        for (int i11 = 1; i11 < iArr.length; i11++) {
            int i12 = iArr[i11];
            if (i12 < i10) {
                i10 = i12;
            }
        }
        return i10;
    }

    public static long M(long j10, long j11, long j12) {
        if (j11 < j10) {
            j10 = j11;
        }
        return j12 < j10 ? j12 : j10;
    }

    public static long N(long... jArr) {
        c0(jArr);
        long j10 = jArr[0];
        for (int i10 = 1; i10 < jArr.length; i10++) {
            long j11 = jArr[i10];
            if (j11 < j10) {
                j10 = j11;
            }
        }
        return j10;
    }

    public static short O(short s10, short s11, short s12) {
        if (s11 < s10) {
            s10 = s11;
        }
        return s12 < s10 ? s12 : s10;
    }

    public static short P(short... sArr) {
        c0(sArr);
        short s10 = sArr[0];
        for (int i10 = 1; i10 < sArr.length; i10++) {
            short s11 = sArr[i10];
            if (s11 < s10) {
                s10 = s11;
            }
        }
        return s10;
    }

    public static byte Q(String str) {
        return R(str, (byte) 0);
    }

    public static byte R(String str, byte b10) {
        if (str == null) {
            return b10;
        }
        try {
            return Byte.parseByte(str);
        } catch (NumberFormatException unused) {
            return b10;
        }
    }

    public static double S(String str) {
        return T(str, 0.0d);
    }

    public static double T(String str, double d10) {
        if (str == null) {
            return d10;
        }
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            return d10;
        }
    }

    public static float U(String str) {
        return V(str, 0.0f);
    }

    public static float V(String str, float f10) {
        if (str == null) {
            return f10;
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return f10;
        }
    }

    public static int W(String str) {
        return X(str, 0);
    }

    public static int X(String str, int i10) {
        if (str == null) {
            return i10;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    public static long Y(String str) {
        return Z(str, 0L);
    }

    public static long Z(String str, long j10) {
        if (str == null) {
            return j10;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j10;
        }
    }

    public static int a(byte b10, byte b11) {
        return b10 - b11;
    }

    public static short a0(String str) {
        return b0(str, (short) 0);
    }

    public static int b(int i10, int i11) {
        if (i10 == i11) {
            return 0;
        }
        return i10 < i11 ? -1 : 1;
    }

    public static short b0(String str, short s10) {
        if (str == null) {
            return s10;
        }
        try {
            return Short.parseShort(str);
        } catch (NumberFormatException unused) {
            return s10;
        }
    }

    public static int c(long j10, long j11) {
        if (j10 == j11) {
            return 0;
        }
        return j10 < j11 ? -1 : 1;
    }

    private static void c0(Object obj) {
        boolean z10 = true;
        c0.v(obj != null, "The Array must not be null", new Object[0]);
        if (Array.getLength(obj) == 0) {
            z10 = false;
        }
        c0.v(z10, "Array cannot be empty.", new Object[0]);
    }

    public static int d(short s10, short s11) {
        if (s10 == s11) {
            return 0;
        }
        return s10 < s11 ? -1 : 1;
    }

    private static boolean d0(String str, int i10) {
        int i11 = 0;
        while (i10 < str.length()) {
            boolean z10 = str.charAt(i10) == '.';
            if (z10) {
                i11++;
            }
            if (i11 > 1) {
                return false;
            }
            if (!z10 && !Character.isDigit(str.charAt(i10))) {
                return false;
            }
            i10++;
        }
        return true;
    }

    public static BigDecimal e(String str) {
        if (str == null) {
            return null;
        }
        if (z.z0(str)) {
            throw new NumberFormatException("A blank string is not a valid number");
        }
        if (!str.trim().startsWith("--")) {
            return new BigDecimal(str);
        }
        throw new NumberFormatException(str + " is not a valid number.");
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    public static BigInteger f(String str) {
        int i10;
        if (str == null) {
            return null;
        }
        boolean zStartsWith = str.startsWith("-");
        int i11 = 16;
        if (str.startsWith("0x", zStartsWith ? 1 : 0) || str.startsWith("0X", zStartsWith ? 1 : 0)) {
            i10 = (zStartsWith ? 1 : 0) + 2;
        } else if (str.startsWith("#", zStartsWith ? 1 : 0)) {
            i10 = (zStartsWith ? 1 : 0) + 1;
        } else if (str.startsWith(p.f99189d0, zStartsWith ? 1 : 0)) {
            int length = str.length();
            int i12 = (zStartsWith ? 1 : 0) + 1;
            if (length > i12) {
                i11 = 8;
                i10 = i12;
            } else {
                i11 = 10;
                i10 = zStartsWith ? 1 : 0;
            }
        } else {
            i11 = 10;
            i10 = zStartsWith ? 1 : 0;
        }
        BigInteger bigInteger = new BigInteger(str.substring(i10), i11);
        return zStartsWith ? bigInteger.negate() : bigInteger;
    }

    public static Double g(String str) {
        if (str == null) {
            return null;
        }
        return Double.valueOf(str);
    }

    public static Float h(String str) {
        if (str == null) {
            return null;
        }
        return Float.valueOf(str);
    }

    public static Integer i(String str) {
        if (str == null) {
            return null;
        }
        return Integer.decode(str);
    }

    public static Long j(String str) {
        if (str == null) {
            return null;
        }
        return Long.decode(str);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01a1 A[Catch: NumberFormatException -> 0x01ad, TRY_LEAVE, TryCatch #6 {NumberFormatException -> 0x01ad, blocks: (B:104:0x0197, B:106:0x01a1), top: B:167:0x0197 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x0182 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x0197 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0145, code lost:
    
        if (r1 == 'l') goto L83;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Number k(java.lang.String r15) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instruction units count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sk.c.k(java.lang.String):java.lang.Number");
    }

    private static String l(String str) {
        return m(str, str.length());
    }

    private static String m(String str, int i10) {
        char cCharAt = str.charAt(0);
        return (cCharAt == '-' || cCharAt == '+') ? str.substring(1, i10) : str.substring(0, i10);
    }

    private static boolean n(String str) {
        if (str == null) {
            return true;
        }
        for (int length = str.length() - 1; length >= 0; length--) {
            if (str.charAt(length) != '0') {
                return false;
            }
        }
        return str.length() > 0;
    }

    public static boolean o(String str) {
        char c10;
        if (z.A0(str)) {
            return false;
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        char c11 = charArray[0];
        boolean z10 = true;
        int i10 = (c11 == '-' || c11 == '+') ? 1 : 0;
        boolean z11 = i10 == 1 && c11 == '+';
        int i11 = i10 + 1;
        char c12 = l.f338157g;
        if (length > i11 && charArray[i10] == '0') {
            char c13 = charArray[i11];
            if (c13 == 'x' || c13 == 'X') {
                int i12 = i10 + 2;
                if (i12 == length) {
                    return false;
                }
                while (i12 < charArray.length) {
                    char c14 = charArray[i12];
                    if ((c14 < '0' || c14 > '9') && ((c14 < 'a' || c14 > 'f') && (c14 < 'A' || c14 > 'F'))) {
                        return false;
                    }
                    i12++;
                }
                return true;
            }
            if (Character.isDigit(c13)) {
                while (i11 < charArray.length) {
                    char c15 = charArray[i11];
                    if (c15 < '0' || c15 > '7') {
                        return false;
                    }
                    i11++;
                }
                return true;
            }
        }
        int i13 = length - 1;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        while (true) {
            boolean z16 = z10;
            if (i10 >= i13 && (i10 >= length || !z12 || z13)) {
                if (i10 >= charArray.length) {
                    if (z12 || !z13) {
                        return false;
                    }
                    return z16;
                }
                char c16 = charArray[i10];
                if (c16 >= '0' && c16 <= '9') {
                    if (a0.f336832b0 && z11 && !z15) {
                        return false;
                    }
                    return z16;
                }
                if (c16 != 'e' && c16 != 'E') {
                    if (c16 == '.') {
                        if (z15 || z14) {
                            return false;
                        }
                    } else if (z12 || (c16 != 'd' && c16 != 'D' && c16 != 'f' && c16 != c12)) {
                        if ((c16 == 'l' || c16 == 'L') && z13 && !z14 && !z15) {
                            return z16;
                        }
                    }
                    return z13;
                }
                return false;
            }
            char c17 = charArray[i10];
            if (c17 < '0' || c17 > '9') {
                if (c17 == '.') {
                    if (z15 || z14) {
                        break;
                    }
                    z15 = z16;
                } else if (c17 == 'e' || c17 == 'E') {
                    c10 = org.apache.commons.codec.language.l.f335457d;
                    if (z14 || !z13) {
                        return false;
                    }
                    z12 = z16;
                    z14 = z12;
                } else {
                    c10 = org.apache.commons.codec.language.l.f335457d;
                    if ((c17 != '+' && c17 != '-') || !z12) {
                        return false;
                    }
                    z12 = false;
                    z13 = false;
                }
                i10++;
                c12 = l.f338157g;
                z10 = z16;
            } else {
                z13 = z16;
                z12 = false;
            }
            c10 = org.apache.commons.codec.language.l.f335457d;
            i10++;
            c12 = l.f338157g;
            z10 = z16;
        }
        return false;
    }

    public static boolean p(String str) {
        return z.G0(str);
    }

    @Deprecated
    public static boolean q(String str) {
        return o(str);
    }

    public static boolean r(String str) {
        if (!z.A0(str) && str.charAt(str.length() - 1) != '.') {
            if (str.charAt(0) != '-') {
                return d0(str, 0);
            }
            if (str.length() == 1) {
                return false;
            }
            return d0(str, 1);
        }
        return false;
    }

    public static byte s(byte b10, byte b11, byte b12) {
        if (b11 > b10) {
            b10 = b11;
        }
        return b12 > b10 ? b12 : b10;
    }

    public static byte t(byte... bArr) {
        c0(bArr);
        byte b10 = bArr[0];
        for (int i10 = 1; i10 < bArr.length; i10++) {
            byte b11 = bArr[i10];
            if (b11 > b10) {
                b10 = b11;
            }
        }
        return b10;
    }

    public static double u(double d10, double d11, double d12) {
        return Math.max(Math.max(d10, d11), d12);
    }

    public static double v(double... dArr) {
        c0(dArr);
        double d10 = dArr[0];
        for (int i10 = 1; i10 < dArr.length; i10++) {
            if (Double.isNaN(dArr[i10])) {
                return Double.NaN;
            }
            double d11 = dArr[i10];
            if (d11 > d10) {
                d10 = d11;
            }
        }
        return d10;
    }

    public static float w(float f10, float f11, float f12) {
        return Math.max(Math.max(f10, f11), f12);
    }

    public static float x(float... fArr) {
        c0(fArr);
        float f10 = fArr[0];
        for (int i10 = 1; i10 < fArr.length; i10++) {
            if (Float.isNaN(fArr[i10])) {
                return Float.NaN;
            }
            float f11 = fArr[i10];
            if (f11 > f10) {
                f10 = f11;
            }
        }
        return f10;
    }

    public static int y(int i10, int i11, int i12) {
        if (i11 > i10) {
            i10 = i11;
        }
        return i12 > i10 ? i12 : i10;
    }

    public static int z(int... iArr) {
        c0(iArr);
        int i10 = iArr[0];
        for (int i11 = 1; i11 < iArr.length; i11++) {
            int i12 = iArr[i11];
            if (i12 > i10) {
                i10 = i12;
            }
        }
        return i10;
    }
}
