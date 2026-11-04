package com.google.android.gms.internal.auth;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class r2 {
    static int a(byte[] bArr, int i10, q2 q2Var) throws a4 {
        int iH = h(bArr, i10, q2Var);
        int i11 = q2Var.f107762a;
        if (i11 < 0) {
            throw a4.c();
        }
        if (i11 > bArr.length - iH) {
            throw a4.f();
        }
        if (i11 == 0) {
            q2Var.f107764c = d3.f107612b;
            return iH;
        }
        q2Var.f107764c = d3.s(bArr, iH, i11);
        return iH + i11;
    }

    static int b(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    static int c(i5 i5Var, byte[] bArr, int i10, int i11, int i12, q2 q2Var) throws IOException {
        Object objM = i5Var.m();
        int iL = l(objM, i5Var, bArr, i10, i11, i12, q2Var);
        i5Var.b(objM);
        q2Var.f107764c = objM;
        return iL;
    }

    static int d(i5 i5Var, byte[] bArr, int i10, int i11, q2 q2Var) throws IOException {
        Object objM = i5Var.m();
        int iM = m(objM, i5Var, bArr, i10, i11, q2Var);
        i5Var.b(objM);
        q2Var.f107764c = objM;
        return iM;
    }

    static int e(i5 i5Var, int i10, byte[] bArr, int i11, int i12, x3 x3Var, q2 q2Var) throws IOException {
        int iD = d(i5Var, bArr, i11, i12, q2Var);
        x3Var.add(q2Var.f107764c);
        while (iD < i12) {
            int iH = h(bArr, iD, q2Var);
            if (i10 != q2Var.f107762a) {
                break;
            }
            iD = d(i5Var, bArr, iH, i12, q2Var);
            x3Var.add(q2Var.f107764c);
        }
        return iD;
    }

    static int f(byte[] bArr, int i10, x3 x3Var, q2 q2Var) throws IOException {
        u3 u3Var = (u3) x3Var;
        int iH = h(bArr, i10, q2Var);
        int i11 = q2Var.f107762a + iH;
        while (iH < i11) {
            iH = h(bArr, iH, q2Var);
            u3Var.d(q2Var.f107762a);
        }
        if (iH == i11) {
            return iH;
        }
        throw a4.f();
    }

    static int g(int i10, byte[] bArr, int i11, int i12, b6 b6Var, q2 q2Var) throws a4 {
        if ((i10 >>> 3) == 0) {
            throw a4.a();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iK = k(bArr, i11, q2Var);
            b6Var.h(i10, Long.valueOf(q2Var.f107763b));
            return iK;
        }
        if (i13 == 1) {
            b6Var.h(i10, Long.valueOf(n(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iH = h(bArr, i11, q2Var);
            int i14 = q2Var.f107762a;
            if (i14 < 0) {
                throw a4.c();
            }
            if (i14 > bArr.length - iH) {
                throw a4.f();
            }
            if (i14 == 0) {
                b6Var.h(i10, d3.f107612b);
            } else {
                b6Var.h(i10, d3.s(bArr, iH, i14));
            }
            return iH + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw a4.a();
            }
            b6Var.h(i10, Integer.valueOf(b(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        b6 b6VarD = b6.d();
        int i16 = 0;
        while (i11 < i12) {
            int iH2 = h(bArr, i11, q2Var);
            i16 = q2Var.f107762a;
            if (i16 == i15) {
                i11 = iH2;
                break;
            }
            i11 = g(i16, bArr, iH2, i12, b6VarD, q2Var);
        }
        if (i11 > i12 || i16 != i15) {
            throw a4.d();
        }
        b6Var.h(i10, b6VarD);
        return i11;
    }

    static int h(byte[] bArr, int i10, q2 q2Var) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return i(b10, bArr, i11, q2Var);
        }
        q2Var.f107762a = b10;
        return i11;
    }

    static int i(int i10, byte[] bArr, int i11, q2 q2Var) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            q2Var.f107762a = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & 127) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            q2Var.f107762a = i14 | (b11 << com.google.common.base.c.f116463p);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            q2Var.f107762a = i16 | (b12 << com.google.common.base.c.f116472y);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            q2Var.f107762a = i18 | (b13 << com.google.common.base.c.F);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                q2Var.f107762a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    static int j(int i10, byte[] bArr, int i11, int i12, x3 x3Var, q2 q2Var) {
        u3 u3Var = (u3) x3Var;
        int iH = h(bArr, i11, q2Var);
        u3Var.d(q2Var.f107762a);
        while (iH < i12) {
            int iH2 = h(bArr, iH, q2Var);
            if (i10 != q2Var.f107762a) {
                break;
            }
            iH = h(bArr, iH2, q2Var);
            u3Var.d(q2Var.f107762a);
        }
        return iH;
    }

    static int k(byte[] bArr, int i10, q2 q2Var) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            q2Var.f107763b = j10;
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
        q2Var.f107763b = j11;
        return i12;
    }

    static int l(Object obj, i5 i5Var, byte[] bArr, int i10, int i11, int i12, q2 q2Var) throws IOException {
        int iQ = ((a5) i5Var).q(obj, bArr, i10, i11, i12, q2Var);
        q2Var.f107764c = obj;
        return iQ;
    }

    static int m(Object obj, i5 i5Var, byte[] bArr, int i10, int i11, q2 q2Var) throws IOException {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = i(i13, bArr, i12, q2Var);
            i13 = q2Var.f107762a;
        }
        int i14 = i12;
        if (i13 < 0 || i13 > i11 - i14) {
            throw a4.f();
        }
        int i15 = i14 + i13;
        i5Var.e(obj, bArr, i14, i15, q2Var);
        q2Var.f107764c = obj;
        return i15;
    }

    static long n(byte[] bArr, int i10) {
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }
}
