package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class ga {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile int f108444a = 100;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f108445b = 0;

    static int a(byte[] bArr, int i10, fa faVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return b(b10, bArr, i11, faVar);
        }
        faVar.f108425a = b10;
        return i11;
    }

    static int b(int i10, byte[] bArr, int i11, fa faVar) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            faVar.f108425a = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & 127) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            faVar.f108425a = i14 | (b11 << com.google.common.base.c.f116463p);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            faVar.f108425a = i16 | (b12 << com.google.common.base.c.f116472y);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            faVar.f108425a = i18 | (b13 << com.google.common.base.c.F);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                faVar.f108425a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    static int c(byte[] bArr, int i10, fa faVar) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            faVar.f108426b = j10;
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
        faVar.f108426b = j11;
        return i12;
    }

    static int d(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    static long e(byte[] bArr, int i10) {
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }

    static int f(byte[] bArr, int i10, fa faVar) throws cc {
        int i11;
        int iA = a(bArr, i10, faVar);
        int i12 = faVar.f108425a;
        if (i12 < 0) {
            throw new cc("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i12 == 0) {
            faVar.f108427c = "";
            return iA;
        }
        int i13 = fe.f108431a;
        int length = bArr.length;
        if ((((length - iA) - i12) | iA | i12) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iA), Integer.valueOf(i12)));
        }
        int i14 = iA + i12;
        char[] cArr = new char[i12];
        int i15 = 0;
        while (iA < i14) {
            byte b10 = bArr[iA];
            if (!de.a(b10)) {
                break;
            }
            iA++;
            cArr[i15] = (char) b10;
            i15++;
        }
        int i16 = i15;
        while (iA < i14) {
            int i17 = iA + 1;
            byte b11 = bArr[iA];
            if (de.a(b11)) {
                cArr[i16] = (char) b11;
                i16++;
                iA = i17;
                while (iA < i14) {
                    byte b12 = bArr[iA];
                    if (!de.a(b12)) {
                        break;
                    }
                    iA++;
                    cArr[i16] = (char) b12;
                    i16++;
                }
            } else {
                if (b11 < -32) {
                    if (i17 >= i14) {
                        throw new cc("Protocol message had invalid UTF-8.");
                    }
                    i11 = i16 + 1;
                    iA += 2;
                    de.b(b11, bArr[i17], cArr, i16);
                } else if (b11 < -16) {
                    if (i17 >= i14 - 1) {
                        throw new cc("Protocol message had invalid UTF-8.");
                    }
                    i11 = i16 + 1;
                    int i18 = iA + 2;
                    iA += 3;
                    de.c(b11, bArr[i17], bArr[i18], cArr, i16);
                } else {
                    if (i17 >= i14 - 2) {
                        throw new cc("Protocol message had invalid UTF-8.");
                    }
                    byte b13 = bArr[i17];
                    int i19 = iA + 3;
                    byte b14 = bArr[iA + 2];
                    iA += 4;
                    de.d(b11, b13, b14, bArr[i19], cArr, i16);
                    i16 += 2;
                }
                i16 = i11;
            }
        }
        faVar.f108427c = new String(cArr, 0, i16);
        return i14;
    }

    static int g(byte[] bArr, int i10, fa faVar) throws cc {
        int iA = a(bArr, i10, faVar);
        int i11 = faVar.f108425a;
        if (i11 < 0) {
            throw new cc("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 > bArr.length - iA) {
            throw new cc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i11 == 0) {
            faVar.f108427c = ra.f108771b;
            return iA;
        }
        faVar.f108427c = ra.n(bArr, iA, i11);
        return iA + i11;
    }

    static int h(jd jdVar, byte[] bArr, int i10, int i11, fa faVar) throws IOException {
        Object objA = jdVar.a();
        int iJ = j(objA, jdVar, bArr, i10, i11, faVar);
        jdVar.h(objA);
        faVar.f108427c = objA;
        return iJ;
    }

    static int i(jd jdVar, byte[] bArr, int i10, int i11, int i12, fa faVar) throws IOException {
        Object objA = jdVar.a();
        int iK = k(objA, jdVar, bArr, i10, i11, i12, faVar);
        jdVar.h(objA);
        faVar.f108427c = objA;
        return iK;
    }

    static int j(Object obj, jd jdVar, byte[] bArr, int i10, int i11, fa faVar) throws IOException {
        int iB = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iB = b(i12, bArr, iB, faVar);
            i12 = faVar.f108425a;
        }
        int i13 = iB;
        if (i12 < 0 || i12 > i11 - i13) {
            throw new cc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = faVar.f108429e + 1;
        faVar.f108429e = i14;
        q(i14);
        int i15 = i13 + i12;
        jdVar.i(obj, bArr, i13, i15, faVar);
        faVar.f108429e--;
        faVar.f108427c = obj;
        return i15;
    }

    static int k(Object obj, jd jdVar, byte[] bArr, int i10, int i11, int i12, fa faVar) throws IOException {
        int i13 = faVar.f108429e + 1;
        faVar.f108429e = i13;
        q(i13);
        int iA = ((bd) jdVar).A(obj, bArr, i10, i11, i12, faVar);
        faVar.f108429e--;
        faVar.f108427c = obj;
        return iA;
    }

    static int l(int i10, byte[] bArr, int i11, int i12, zb zbVar, fa faVar) {
        rb rbVar = (rb) zbVar;
        int iA = a(bArr, i11, faVar);
        rbVar.l(faVar.f108425a);
        while (iA < i12) {
            int iA2 = a(bArr, iA, faVar);
            if (i10 != faVar.f108425a) {
                break;
            }
            iA = a(bArr, iA2, faVar);
            rbVar.l(faVar.f108425a);
        }
        return iA;
    }

    static int m(byte[] bArr, int i10, zb zbVar, fa faVar) throws IOException {
        rb rbVar = (rb) zbVar;
        int iA = a(bArr, i10, faVar);
        int i11 = faVar.f108425a + iA;
        while (iA < i11) {
            iA = a(bArr, iA, faVar);
            rbVar.l(faVar.f108425a);
        }
        if (iA == i11) {
            return iA;
        }
        throw new cc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int n(jd jdVar, int i10, byte[] bArr, int i11, int i12, zb zbVar, fa faVar) throws IOException {
        int iH = h(jdVar, bArr, i11, i12, faVar);
        zbVar.add(faVar.f108427c);
        while (iH < i12) {
            int iA = a(bArr, iH, faVar);
            if (i10 != faVar.f108425a) {
                break;
            }
            iH = h(jdVar, bArr, iA, i12, faVar);
            zbVar.add(faVar.f108427c);
        }
        return iH;
    }

    static int o(int i10, byte[] bArr, int i11, int i12, wd wdVar, fa faVar) throws cc {
        if ((i10 >>> 3) == 0) {
            throw new cc("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iC = c(bArr, i11, faVar);
            wdVar.k(i10, Long.valueOf(faVar.f108426b));
            return iC;
        }
        if (i13 == 1) {
            wdVar.k(i10, Long.valueOf(e(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iA = a(bArr, i11, faVar);
            int i14 = faVar.f108425a;
            if (i14 < 0) {
                throw new cc("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i14 > bArr.length - iA) {
                throw new cc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i14 == 0) {
                wdVar.k(i10, ra.f108771b);
            } else {
                wdVar.k(i10, ra.n(bArr, iA, i14));
            }
            return iA + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new cc("Protocol message contained an invalid tag (zero).");
            }
            wdVar.k(i10, Integer.valueOf(d(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        wd wdVarB = wd.b();
        int i16 = faVar.f108429e + 1;
        faVar.f108429e = i16;
        q(i16);
        int i17 = 0;
        while (i11 < i12) {
            int iA2 = a(bArr, i11, faVar);
            int i18 = faVar.f108425a;
            if (i18 == i15) {
                i17 = i18;
                i11 = iA2;
                break;
            }
            i11 = o(i18, bArr, iA2, i12, wdVarB, faVar);
            i17 = i18;
        }
        faVar.f108429e--;
        if (i11 > i12 || i17 != i15) {
            throw new cc("Failed to parse the message.");
        }
        wdVar.k(i10, wdVarB);
        return i11;
    }

    static int p(int i10, byte[] bArr, int i11, int i12, fa faVar) throws cc {
        if ((i10 >>> 3) == 0) {
            throw new cc("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return c(bArr, i11, faVar);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return a(bArr, i11, faVar) + faVar.f108425a;
        }
        int i14 = 1 << 3;
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw new cc("Protocol message contained an invalid tag (zero).");
        }
        int i15 = (i10 & (-8)) | 4;
        int i16 = 0;
        while (i11 < i12) {
            i11 = a(bArr, i11, faVar);
            i16 = faVar.f108425a;
            if (i16 == i15) {
                break;
            }
            i11 = p(i16, bArr, i11, i12, faVar);
        }
        if (i11 > i12 || i16 != i15) {
            throw new cc("Failed to parse the message.");
        }
        return i11;
    }

    private static void q(int i10) throws cc {
        if (i10 >= f108444a) {
            throw new cc("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
