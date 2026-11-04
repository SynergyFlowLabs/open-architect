package com.google.zxing.oned;

import com.canhub.cropper.core.CropImageOptions;
import java.util.Arrays;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f130603c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char[] f130604d = f130603c.toCharArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int[] f130605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f130606f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f130607a = new StringBuilder(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f130608b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, androidx.constraintlayout.core.motion.utils.v.c.f44021v, androidx.constraintlayout.core.motion.utils.v.c.f44017r, 418, 404, 402, 394, CropImageOptions.S3, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, com.rabbitmq.client.a.f264843n, 410, 364, 358, 310, 314, 302, 468, 466, com.facebook.internal.p.f100032p, 366, 374, 430, 294, 474, 470, 306, 350};
        f130605e = iArr;
        f130606f = iArr[47];
    }

    private static void h(CharSequence charSequence) throws com.google.zxing.d {
        int length = charSequence.length();
        i(charSequence, length - 2, 20);
        i(charSequence, length - 1, 15);
    }

    private static void i(CharSequence charSequence, int i10, int i11) throws com.google.zxing.d {
        int iIndexOf = 0;
        int i12 = 1;
        for (int i13 = i10 - 1; i13 >= 0; i13--) {
            iIndexOf += f130603c.indexOf(charSequence.charAt(i13)) * i12;
            i12++;
            if (i12 > i11) {
                i12 = 1;
            }
        }
        if (charSequence.charAt(i10) != f130604d[iIndexOf % 47]) {
            throw com.google.zxing.d.a();
        }
    }

    private static String j(CharSequence charSequence) throws com.google.zxing.h {
        int i10;
        char c10;
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i11 = 0;
        while (i11 < length) {
            char cCharAt = charSequence.charAt(i11);
            if (cCharAt >= 'a' && cCharAt <= 'd') {
                if (i11 >= length - 1) {
                    throw com.google.zxing.h.a();
                }
                i11++;
                char cCharAt2 = charSequence.charAt(i11);
                switch (cCharAt) {
                    case com.planner5d.library.engine.input.f.b.f160715o1 /* 97 */:
                        if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                            throw com.google.zxing.h.a();
                        }
                        i10 = cCharAt2 - '@';
                        c10 = (char) i10;
                        sb2.append(c10);
                        break;
                    case com.planner5d.library.engine.input.f.b.f160718p1 /* 98 */:
                        if (cCharAt2 >= 'A' && cCharAt2 <= 'E') {
                            i10 = cCharAt2 - '&';
                        } else if (cCharAt2 >= 'F' && cCharAt2 <= 'J') {
                            i10 = cCharAt2 - 11;
                        } else if (cCharAt2 < 'K' || cCharAt2 > 'O') {
                            if (cCharAt2 >= 'P' && cCharAt2 <= 'S') {
                                i10 = cCharAt2 + '+';
                            } else {
                                if (cCharAt2 < 'T' || cCharAt2 > 'Z') {
                                    throw com.google.zxing.h.a();
                                }
                                c10 = com.google.common.base.c.N;
                            }
                            sb2.append(c10);
                        } else {
                            i10 = cCharAt2 + 16;
                        }
                        c10 = (char) i10;
                        sb2.append(c10);
                        break;
                    case 'c':
                        if (cCharAt2 >= 'A' && cCharAt2 <= 'O') {
                            i10 = cCharAt2 - ' ';
                            c10 = (char) i10;
                        } else {
                            if (cCharAt2 != 'Z') {
                                throw com.google.zxing.h.a();
                            }
                            c10 = AbstractJsonLexerKt.COLON;
                        }
                        sb2.append(c10);
                        break;
                    case 'd':
                        if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                            throw com.google.zxing.h.a();
                        }
                        i10 = cCharAt2 + ' ';
                        c10 = (char) i10;
                        sb2.append(c10);
                        break;
                    default:
                        c10 = 0;
                        sb2.append(c10);
                        break;
                }
            } else {
                sb2.append(cCharAt);
            }
            i11++;
        }
        return sb2.toString();
    }

    private int[] k(com.google.zxing.common.a aVar) throws com.google.zxing.m {
        int iL = aVar.l();
        int iJ = aVar.j(0);
        Arrays.fill(this.f130608b, 0);
        int[] iArr = this.f130608b;
        int length = iArr.length;
        boolean z10 = false;
        int i10 = 0;
        int i11 = iJ;
        while (iJ < iL) {
            int i12 = 3 ^ 1;
            if (aVar.h(iJ) != z10) {
                iArr[i10] = iArr[i10] + 1;
            } else {
                if (i10 != length - 1) {
                    i10++;
                } else {
                    if (m(iArr) == f130606f) {
                        return new int[]{i11, iJ};
                    }
                    i11 += iArr[0] + iArr[1];
                    int i13 = i10 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i13);
                    iArr[i13] = 0;
                    iArr[i10] = 0;
                    i10--;
                }
                iArr[i10] = 1;
                z10 = !z10;
            }
            iJ++;
        }
        throw com.google.zxing.m.a();
    }

    private static char l(int i10) throws com.google.zxing.m {
        int i11 = 0;
        while (true) {
            int[] iArr = f130605e;
            if (i11 >= iArr.length) {
                throw com.google.zxing.m.a();
            }
            if (iArr[i11] == i10) {
                return f130604d[i11];
            }
            i11++;
        }
    }

    private static int m(int[] iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        int length = iArr.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            int iRound = Math.round((iArr[i13] * 9.0f) / i10);
            if (iRound <= 0 || iRound > 4) {
                return -1;
            }
            if ((i13 & 1) == 0) {
                for (int i14 = 0; i14 < iRound; i14++) {
                    i12 = (i12 << 1) | 1;
                }
            } else {
                i12 <<= iRound;
            }
        }
        return i12;
    }

    @Override // com.google.zxing.oned.r
    public com.google.zxing.r b(int i10, com.google.zxing.common.a aVar, Map<com.google.zxing.e, ?> map) throws com.google.zxing.m, com.google.zxing.d, com.google.zxing.h {
        int[] iArrK = k(aVar);
        int iJ = aVar.j(iArrK[1]);
        int iL = aVar.l();
        int[] iArr = this.f130608b;
        Arrays.fill(iArr, 0);
        StringBuilder sb2 = this.f130607a;
        sb2.setLength(0);
        while (true) {
            r.f(aVar, iJ, iArr);
            int iM = m(iArr);
            if (iM < 0) {
                throw com.google.zxing.m.a();
            }
            char cL = l(iM);
            sb2.append(cL);
            int i11 = iJ;
            for (int i12 : iArr) {
                i11 += i12;
            }
            int iJ2 = aVar.j(i11);
            if (cL == '*') {
                sb2.deleteCharAt(sb2.length() - 1);
                int i13 = 0;
                for (int i14 : iArr) {
                    i13 += i14;
                }
                if (iJ2 == iL || !aVar.h(iJ2)) {
                    throw com.google.zxing.m.a();
                }
                if (sb2.length() < 2) {
                    throw com.google.zxing.m.a();
                }
                h(sb2);
                sb2.setLength(sb2.length() - 2);
                float f10 = i10;
                return new com.google.zxing.r(j(sb2), null, new com.google.zxing.t[]{new com.google.zxing.t((iArrK[1] + iArrK[0]) / 2.0f, f10), new com.google.zxing.t(iJ + (i13 / 2.0f), f10)}, com.google.zxing.a.CODE_93);
            }
            iJ = iJ2;
        }
    }
}
