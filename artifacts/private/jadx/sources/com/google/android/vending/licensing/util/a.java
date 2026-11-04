package com.google.android.vending.licensing.util;

import com.google.common.base.c;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f115107a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f115108b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte f115109c = 61;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte f115110d = 10;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final byte f115116j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final /* synthetic */ boolean f115117k = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f115111e = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final byte[] f115112f = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final byte f115115i = -5;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte[] f115113g = {-9, -9, -9, -9, -9, -9, -9, -9, -9, f115115i, f115115i, -9, -9, f115115i, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, f115115i, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, c.f116461n, c.f116462o, c.f116463p, c.f116464q, c.f116465r, 17, c.f116468u, 19, c.f116471x, c.f116472y, c.f116473z, c.A, c.B, c.C, -9, -9, -9, -9, -9, -9, c.D, c.E, c.F, c.G, c.H, c.I, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte[] f115114h = {-9, -9, -9, -9, -9, -9, -9, -9, -9, f115115i, f115115i, -9, -9, f115115i, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, f115115i, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, c.f116461n, c.f116462o, c.f116463p, c.f116464q, c.f116465r, 17, c.f116468u, 19, c.f116471x, c.f116472y, c.f116473z, c.A, c.B, c.C, -9, -9, -9, -9, 63, -9, c.D, c.E, c.F, c.G, c.H, c.I, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9};

    private a() {
    }

    public static byte[] a(String str) throws b {
        byte[] bytes = str.getBytes();
        return c(bytes, 0, bytes.length);
    }

    public static byte[] b(byte[] bArr) throws b {
        return c(bArr, 0, bArr.length);
    }

    public static byte[] c(byte[] bArr, int i10, int i11) throws b {
        return d(bArr, i10, i11, f115113g);
    }

    public static byte[] d(byte[] bArr, int i10, int i11, byte[] bArr2) throws b {
        byte[] bArr3 = new byte[((i11 * 3) / 4) + 2];
        byte[] bArr4 = new byte[4];
        int i12 = 0;
        int iE = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = i13 + i10;
            byte b10 = (byte) (bArr[i14] & 127);
            byte b11 = bArr2[b10];
            if (b11 < -5) {
                throw new b("Bad Base64 input character at " + i13 + ": " + ((int) bArr[i14]) + "(decimal)");
            }
            if (b11 >= -1) {
                if (b10 == 61) {
                    int i15 = i11 - i13;
                    byte b12 = (byte) (bArr[(i11 - 1) + i10] & 127);
                    if (i12 == 0 || i12 == 1) {
                        throw new b("invalid padding byte '=' at byte offset " + i13);
                    }
                    if ((i12 == 3 && i15 > 2) || (i12 == 4 && i15 > 1)) {
                        throw new b("padding byte '=' falsely signals end of encoded value at offset " + i13);
                    }
                    if (b12 != 61 && b12 != 10) {
                        throw new b("encoded value has invalid trailing byte");
                    }
                    break;
                    break;
                }
                int i16 = i12 + 1;
                bArr4[i12] = b10;
                if (i16 == 4) {
                    iE += e(bArr4, 0, bArr3, iE, bArr2);
                    i12 = 0;
                } else {
                    i12 = i16;
                }
            }
        }
        if (i12 != 0) {
            if (i12 == 1) {
                throw new b("single trailing character at offset " + (i11 - 1));
            }
            bArr4[i12] = 61;
            iE += e(bArr4, 0, bArr3, iE, bArr2);
        }
        byte[] bArr5 = new byte[iE];
        System.arraycopy(bArr3, 0, bArr5, 0, iE);
        return bArr5;
    }

    private static int e(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3) {
        byte b10 = bArr[i10 + 2];
        if (b10 == 61) {
            bArr2[i11] = (byte) ((((bArr3[bArr[i10 + 1]] << c.B) >>> 12) | ((bArr3[bArr[i10]] << c.B) >>> 6)) >>> 16);
            return 1;
        }
        byte b11 = bArr[i10 + 3];
        if (b11 == 61) {
            int i12 = ((bArr3[bArr[i10 + 1]] << c.B) >>> 12) | ((bArr3[bArr[i10]] << c.B) >>> 6) | ((bArr3[b10] << c.B) >>> 18);
            bArr2[i11] = (byte) (i12 >>> 16);
            bArr2[i11 + 1] = (byte) (i12 >>> 8);
            return 2;
        }
        int i13 = ((bArr3[bArr[i10 + 1]] << c.B) >>> 12) | ((bArr3[bArr[i10]] << c.B) >>> 6) | ((bArr3[b10] << c.B) >>> 18) | ((bArr3[b11] << c.B) >>> 24);
        bArr2[i11] = (byte) (i13 >> 16);
        bArr2[i11 + 1] = (byte) (i13 >> 8);
        bArr2[i11 + 2] = (byte) i13;
        return 3;
    }

    public static byte[] f(String str) throws b {
        byte[] bytes = str.getBytes();
        return h(bytes, 0, bytes.length);
    }

    public static byte[] g(byte[] bArr) throws b {
        return h(bArr, 0, bArr.length);
    }

    public static byte[] h(byte[] bArr, int i10, int i11) throws b {
        return d(bArr, i10, i11, f115114h);
    }

    public static String i(byte[] bArr) {
        return j(bArr, 0, bArr.length, f115111e, true);
    }

    public static String j(byte[] bArr, int i10, int i11, byte[] bArr2, boolean z10) {
        byte[] bArrK = k(bArr, i10, i11, bArr2, Integer.MAX_VALUE);
        int length = bArrK.length;
        while (!z10 && length > 0 && bArrK[length - 1] == 61) {
            length--;
        }
        return new String(bArrK, 0, length);
    }

    public static byte[] k(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        int i13 = ((i11 + 2) / 3) * 4;
        byte[] bArr3 = new byte[i13 + (i13 / i12)];
        int i14 = i11 - 2;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < i14) {
            int i18 = ((bArr[i15 + i10] << c.B) >>> 8) | ((bArr[(i15 + 1) + i10] << c.B) >>> 16) | ((bArr[(i15 + 2) + i10] << c.B) >>> 24);
            bArr3[i16] = bArr2[i18 >>> 18];
            int i19 = i16 + 1;
            bArr3[i19] = bArr2[(i18 >>> 12) & 63];
            bArr3[i16 + 2] = bArr2[(i18 >>> 6) & 63];
            bArr3[i16 + 3] = bArr2[i18 & 63];
            i17 += 4;
            if (i17 == i12) {
                bArr3[i16 + 4] = 10;
                i17 = 0;
                i16 = i19;
            }
            i15 += 3;
            i16 += 4;
        }
        if (i15 < i11) {
            l(bArr, i10 + i15, i11 - i15, bArr3, i16, bArr2);
            if (i17 + 4 == i12) {
                bArr3[i16 + 4] = 10;
            }
        }
        return bArr3;
    }

    private static byte[] l(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, byte[] bArr3) {
        int i13 = (i11 > 0 ? (bArr[i10] << c.B) >>> 8 : 0) | (i11 > 1 ? (bArr[i10 + 1] << c.B) >>> 16 : 0) | (i11 > 2 ? (bArr[i10 + 2] << c.B) >>> 24 : 0);
        if (i11 == 1) {
            bArr2[i12] = bArr3[i13 >>> 18];
            bArr2[i12 + 1] = bArr3[(i13 >>> 12) & 63];
            bArr2[i12 + 2] = 61;
            bArr2[i12 + 3] = 61;
            return bArr2;
        }
        if (i11 == 2) {
            bArr2[i12] = bArr3[i13 >>> 18];
            bArr2[i12 + 1] = bArr3[(i13 >>> 12) & 63];
            bArr2[i12 + 2] = bArr3[(i13 >>> 6) & 63];
            bArr2[i12 + 3] = 61;
            return bArr2;
        }
        if (i11 != 3) {
            return bArr2;
        }
        bArr2[i12] = bArr3[i13 >>> 18];
        bArr2[i12 + 1] = bArr3[(i13 >>> 12) & 63];
        bArr2[i12 + 2] = bArr3[(i13 >>> 6) & 63];
        bArr2[i12 + 3] = bArr3[i13 & 63];
        return bArr2;
    }

    public static String m(byte[] bArr, boolean z10) {
        return j(bArr, 0, bArr.length, f115112f, z10);
    }
}
