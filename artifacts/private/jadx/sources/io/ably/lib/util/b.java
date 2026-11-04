package io.ably.lib.util;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes13.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f288206a = System.getProperty("line.separator");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char[] f288207b = new char[64];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static byte[] f288208c;

    static {
        boolean z10 = false & false;
        char c10 = 'A';
        int i10 = 0;
        while (c10 <= 'Z') {
            f288207b[i10] = c10;
            c10 = (char) (c10 + 1);
            i10++;
        }
        char c11 = 'a';
        while (c11 <= 'z') {
            f288207b[i10] = c11;
            c11 = (char) (c11 + 1);
            i10++;
        }
        char c12 = org.locationtech.jts.geom.l.f338160j;
        while (c12 <= '9') {
            f288207b[i10] = c12;
            c12 = (char) (c12 + 1);
            i10++;
        }
        char[] cArr = f288207b;
        cArr[i10] = '+';
        cArr[i10 + 1] = '/';
        f288208c = new byte[128];
        int i11 = 0;
        while (true) {
            byte[] bArr = f288208c;
            if (i11 >= bArr.length) {
                break;
            }
            bArr[i11] = -1;
            i11++;
        }
        for (int i12 = 0; i12 < 64; i12++) {
            f288208c[f288207b[i12]] = (byte) i12;
        }
        byte[] bArr2 = f288208c;
        bArr2[45] = bArr2[43];
        bArr2[95] = bArr2[47];
    }

    private b() {
    }

    public static byte[] a(String str) {
        return b(str.toCharArray());
    }

    public static byte[] b(char[] cArr) {
        return c(cArr, 0, cArr.length);
    }

    public static byte[] c(char[] cArr, int i10, int i11) {
        char c10;
        if (i11 % 4 != 0) {
            throw new IllegalArgumentException("Length of Base64 encoded input string is not a multiple of 4.");
        }
        while (i11 > 0 && cArr[(i10 + i11) - 1] == '=') {
            i11--;
        }
        int i12 = (i11 * 3) / 4;
        byte[] bArr = new byte[i12];
        int i13 = i11 + i10;
        int i14 = 0;
        while (i10 < i13) {
            char c11 = cArr[i10];
            int i15 = i10 + 2;
            char c12 = cArr[i10 + 1];
            char c13 = 'A';
            if (i15 < i13) {
                i10 += 3;
                c10 = cArr[i15];
            } else {
                i10 = i15;
                c10 = 'A';
            }
            if (i10 < i13) {
                c13 = cArr[i10];
                i10++;
            }
            if (c11 > 127 || c12 > 127 || c10 > 127 || c13 > 127) {
                throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
            }
            byte[] bArr2 = f288208c;
            byte b10 = bArr2[c11];
            byte b11 = bArr2[c12];
            byte b12 = bArr2[c10];
            byte b13 = bArr2[c13];
            if (b10 < 0 || b11 < 0 || b12 < 0 || b13 < 0) {
                throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
            }
            int i16 = (b10 << 2) | (b11 >>> 4);
            int i17 = ((b11 & com.google.common.base.c.f116464q) << 4) | (b12 >>> 2);
            int i18 = ((b12 & 3) << 6) | b13;
            int i19 = i14 + 1;
            bArr[i14] = (byte) i16;
            if (i19 < i12) {
                bArr[i19] = (byte) i17;
                i19 = i14 + 2;
            }
            if (i19 < i12) {
                i14 = i19 + 1;
                bArr[i19] = (byte) i18;
            } else {
                i14 = i19;
            }
        }
        return bArr;
    }

    public static byte[] d(String str) {
        char[] cArr = new char[str.length()];
        int i10 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt != ' ' && cCharAt != '\r' && cCharAt != '\n' && cCharAt != '\t') {
                cArr[i10] = cCharAt;
                i10++;
            }
        }
        return c(cArr, 0, i10);
    }

    public static String e(String str) {
        return new String(a(str));
    }

    public static char[] f(byte[] bArr) {
        return h(bArr, 0, bArr.length);
    }

    public static char[] g(byte[] bArr, int i10) {
        return h(bArr, 0, i10);
    }

    public static char[] h(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = ((i11 * 4) + 2) / 3;
        char[] cArr = new char[((i11 + 2) / 3) * 4];
        int i17 = i11 + i10;
        int i18 = 0;
        while (i10 < i17) {
            int i19 = i10 + 1;
            byte b10 = bArr[i10];
            int i20 = b10 & 255;
            if (i19 < i17) {
                i12 = i10 + 2;
                i13 = bArr[i19] & 255;
            } else {
                i12 = i19;
                i13 = 0;
            }
            if (i12 < i17) {
                i14 = i12 + 1;
                i15 = bArr[i12] & 255;
            } else {
                i14 = i12;
                i15 = 0;
            }
            int i21 = ((b10 & 3) << 4) | (i13 >>> 4);
            int i22 = ((i13 & 15) << 2) | (i15 >>> 6);
            int i23 = i15 & 63;
            char[] cArr2 = f288207b;
            cArr[i18] = cArr2[i20 >>> 2];
            int i24 = i18 + 2;
            cArr[i18 + 1] = cArr2[i21];
            char c10 = '=';
            cArr[i24] = i24 < i16 ? cArr2[i22] : '=';
            int i25 = i18 + 3;
            if (i25 < i16) {
                c10 = cArr2[i23];
            }
            cArr[i25] = c10;
            i18 += 4;
            i10 = i14;
        }
        return cArr;
    }

    public static String i(byte[] bArr) {
        return j(bArr, 0, bArr.length, 76, f288206a);
    }

    public static String j(byte[] bArr, int i10, int i11, int i12, String str) {
        int i13 = (i12 * 3) / 4;
        if (i13 <= 0) {
            throw new IllegalArgumentException();
        }
        StringBuilder sb2 = new StringBuilder((((i11 + 2) / 3) * 4) + ((((i11 + i13) - 1) / i13) * str.length()));
        int i14 = 0;
        while (i14 < i11) {
            int iMin = Math.min(i11 - i14, i13);
            sb2.append(h(bArr, i10 + i14, iMin));
            sb2.append(str);
            i14 += iMin;
        }
        return sb2.toString();
    }

    public static String k(String str) {
        return new String(f(str.getBytes(Charset.forName("UTF-8"))));
    }

    public static String l(byte[] bArr) {
        return new String(h(bArr, 0, bArr.length));
    }
}
