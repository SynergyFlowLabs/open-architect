package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class t5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile int f109339a = 100;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f109340b = 0;

    static int a(byte[] bArr, int i10, r5 r5Var) throws l7 {
        int iH = h(bArr, i10, r5Var);
        int i11 = r5Var.f109299a;
        if (i11 < 0) {
            throw new l7("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 > bArr.length - iH) {
            throw new l7("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i11 == 0) {
            r5Var.f109301c = d6.f109102b;
            return iH;
        }
        r5Var.f109301c = d6.r(bArr, iH, i11);
        return iH + i11;
    }

    static int b(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    static int c(s8 s8Var, byte[] bArr, int i10, int i11, int i12, r5 r5Var) throws IOException {
        Object objJ = s8Var.j();
        int iL = l(objJ, s8Var, bArr, i10, i11, i12, r5Var);
        s8Var.b(objJ);
        r5Var.f109301c = objJ;
        return iL;
    }

    static int d(s8 s8Var, byte[] bArr, int i10, int i11, r5 r5Var) throws IOException {
        Object objJ = s8Var.j();
        int iM = m(objJ, s8Var, bArr, i10, i11, r5Var);
        s8Var.b(objJ);
        r5Var.f109301c = objJ;
        return iM;
    }

    static int e(s8 s8Var, int i10, byte[] bArr, int i11, int i12, i7 i7Var, r5 r5Var) throws IOException {
        int iD = d(s8Var, bArr, i11, i12, r5Var);
        i7Var.add(r5Var.f109301c);
        while (iD < i12) {
            int iH = h(bArr, iD, r5Var);
            if (i10 != r5Var.f109299a) {
                break;
            }
            iD = d(s8Var, bArr, iH, i12, r5Var);
            i7Var.add(r5Var.f109301c);
        }
        return iD;
    }

    static int f(byte[] bArr, int i10, i7 i7Var, r5 r5Var) throws IOException {
        f7 f7Var = (f7) i7Var;
        int iH = h(bArr, i10, r5Var);
        int i11 = r5Var.f109299a + iH;
        while (iH < i11) {
            iH = h(bArr, iH, r5Var);
            f7Var.k(r5Var.f109299a);
        }
        if (iH == i11) {
            return iH;
        }
        throw new l7("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int g(int i10, byte[] bArr, int i11, int i12, g9 g9Var, r5 r5Var) throws l7 {
        if ((i10 >>> 3) == 0) {
            throw new l7("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iK = k(bArr, i11, r5Var);
            g9Var.j(i10, Long.valueOf(r5Var.f109300b));
            return iK;
        }
        if (i13 == 1) {
            g9Var.j(i10, Long.valueOf(n(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iH = h(bArr, i11, r5Var);
            int i14 = r5Var.f109299a;
            if (i14 < 0) {
                throw new l7("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i14 > bArr.length - iH) {
                throw new l7("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i14 == 0) {
                g9Var.j(i10, d6.f109102b);
            } else {
                g9Var.j(i10, d6.r(bArr, iH, i14));
            }
            return iH + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new l7("Protocol message contained an invalid tag (zero).");
            }
            g9Var.j(i10, Integer.valueOf(b(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        g9 g9VarF = g9.f();
        int i16 = r5Var.f109303e + 1;
        r5Var.f109303e = i16;
        o(i16);
        int i17 = 0;
        while (i11 < i12) {
            int iH2 = h(bArr, i11, r5Var);
            int i18 = r5Var.f109299a;
            if (i18 == i15) {
                i17 = i18;
                i11 = iH2;
                break;
            }
            i11 = g(i18, bArr, iH2, i12, g9VarF, r5Var);
            i17 = i18;
        }
        r5Var.f109303e--;
        if (i11 > i12 || i17 != i15) {
            throw new l7("Failed to parse the message.");
        }
        g9Var.j(i10, g9VarF);
        return i11;
    }

    static int h(byte[] bArr, int i10, r5 r5Var) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return i(b10, bArr, i11, r5Var);
        }
        r5Var.f109299a = b10;
        return i11;
    }

    static int i(int i10, byte[] bArr, int i11, r5 r5Var) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            r5Var.f109299a = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & 127) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            r5Var.f109299a = i14 | (b11 << com.google.common.base.c.f116463p);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            r5Var.f109299a = i16 | (b12 << com.google.common.base.c.f116472y);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            r5Var.f109299a = i18 | (b13 << com.google.common.base.c.F);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                r5Var.f109299a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    static int j(int i10, byte[] bArr, int i11, int i12, i7 i7Var, r5 r5Var) {
        f7 f7Var = (f7) i7Var;
        int iH = h(bArr, i11, r5Var);
        f7Var.k(r5Var.f109299a);
        while (iH < i12) {
            int iH2 = h(bArr, iH, r5Var);
            if (i10 != r5Var.f109299a) {
                break;
            }
            iH = h(bArr, iH2, r5Var);
            f7Var.k(r5Var.f109299a);
        }
        return iH;
    }

    static int k(byte[] bArr, int i10, r5 r5Var) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            r5Var.f109300b = j10;
            return i11;
        }
        int i12 = i10 + 2;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | (((long) (b10 & 127)) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j11 |= ((long) (b11 & 127)) << i13;
            b10 = b11;
            i12 = i14;
        }
        r5Var.f109300b = j11;
        return i12;
    }

    static int l(Object obj, s8 s8Var, byte[] bArr, int i10, int i11, int i12, r5 r5Var) throws IOException {
        int i13 = r5Var.f109303e + 1;
        r5Var.f109303e = i13;
        o(i13);
        int iY = ((k8) s8Var).y(obj, bArr, i10, i11, i12, r5Var);
        r5Var.f109303e--;
        r5Var.f109301c = obj;
        return iY;
    }

    static int m(Object obj, s8 s8Var, byte[] bArr, int i10, int i11, r5 r5Var) throws IOException {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = i(i13, bArr, i12, r5Var);
            i13 = r5Var.f109299a;
        }
        int i14 = i12;
        if (i13 < 0 || i13 > i11 - i14) {
            throw new l7("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i15 = r5Var.f109303e + 1;
        r5Var.f109303e = i15;
        o(i15);
        int i16 = i14 + i13;
        s8Var.h(obj, bArr, i14, i16, r5Var);
        r5Var.f109303e--;
        r5Var.f109301c = obj;
        return i16;
    }

    static long n(byte[] bArr, int i10) {
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }

    private static void o(int i10) throws l7 {
        if (i10 >= f109339a) {
            throw new l7("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
