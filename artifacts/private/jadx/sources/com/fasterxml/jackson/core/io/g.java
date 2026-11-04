package com.fasterxml.jackson.core.io;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char[] f102426d = a.d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f102427e = a.c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f102428f = 55296;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f102429g = 56319;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f102430h = 56320;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f102431i = 57343;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.fasterxml.jackson.core.util.n f102432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected com.fasterxml.jackson.core.util.c f102433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final char[] f102434c = {'\\', 0, org.locationtech.jts.geom.l.f338160j, org.locationtech.jts.geom.l.f338160j, 0, 0};

    private int a(int i10, int i11, com.fasterxml.jackson.core.util.c cVar, int i12) {
        cVar.m(i12);
        cVar.b(92);
        if (i11 < 0) {
            cVar.b(me.relex.circleindicator.a.f332619e);
            if (i10 > 255) {
                byte[] bArr = f102427e;
                cVar.b(bArr[i10 >> 12]);
                cVar.b(bArr[(i10 >> 8) & 15]);
                i10 &= 255;
            } else {
                cVar.b(48);
                cVar.b(48);
            }
            byte[] bArr2 = f102427e;
            cVar.b(bArr2[i10 >> 4]);
            cVar.b(bArr2[i10 & 15]);
        } else {
            cVar.b((byte) i11);
        }
        return cVar.j();
    }

    private int b(int i10, char[] cArr) {
        cArr[1] = (char) i10;
        return 2;
    }

    private int c(int i10, char[] cArr) {
        cArr[1] = AbstractJsonLexerKt.UNICODE_ESC;
        char[] cArr2 = f102426d;
        cArr[4] = cArr2[i10 >> 4];
        cArr[5] = cArr2[i10 & 15];
        return 6;
    }

    private static int d(int i10, int i11) {
        if (i11 >= 56320 && i11 <= 57343) {
            return ((i10 - 55296) << 10) + 65536 + (i11 - 56320);
        }
        throw new IllegalArgumentException("Broken surrogate pair: first char 0x" + Integer.toHexString(i10) + ", second 0x" + Integer.toHexString(i11) + "; illegal combination");
    }

    private static void e(int i10) {
        throw new IllegalArgumentException(o.c(i10));
    }

    @Deprecated
    public static g g() {
        return com.fasterxml.jackson.core.util.b.c();
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ff A[SYNTHETIC] */
    public byte[] f(String str) {
        int i10;
        int i11;
        com.fasterxml.jackson.core.util.c cVar = this.f102433b;
        if (cVar == null) {
            cVar = new com.fasterxml.jackson.core.util.c((com.fasterxml.jackson.core.util.a) null);
            this.f102433b = cVar;
        }
        int length = str.length();
        byte[] bArrL = cVar.l();
        int length2 = bArrL.length;
        int i12 = 0;
        int i13 = 0;
        loop0: while (i12 < length) {
            int i14 = i12 + 1;
            char cCharAt = str.charAt(i12);
            while (cCharAt <= 127) {
                if (i13 >= length2) {
                    bArrL = cVar.g();
                    length2 = bArrL.length;
                    i13 = 0;
                }
                int i15 = i13 + 1;
                bArrL[i13] = (byte) cCharAt;
                if (i14 >= length) {
                    i13 = i15;
                    break loop0;
                }
                char cCharAt2 = str.charAt(i14);
                i14++;
                cCharAt = cCharAt2;
                i13 = i15;
            }
            if (i13 >= length2) {
                bArrL = cVar.g();
                length2 = bArrL.length;
                i13 = 0;
            }
            if (cCharAt < 2048) {
                i10 = i13 + 1;
                bArrL[i13] = (byte) ((cCharAt >> 6) | 192);
            } else {
                if (cCharAt < 55296 || cCharAt > 57343) {
                    int i16 = i13 + 1;
                    bArrL[i13] = (byte) ((cCharAt >> '\f') | 224);
                    if (i16 >= length2) {
                        bArrL = cVar.g();
                        length2 = bArrL.length;
                        i16 = 0;
                    }
                    bArrL[i16] = (byte) (((cCharAt >> 6) & 63) | 128);
                    i10 = i16 + 1;
                } else {
                    if (cCharAt > 56319) {
                        e(cCharAt);
                    }
                    if (i14 >= length) {
                        e(cCharAt);
                    }
                    int i17 = i14 + 1;
                    int iD = d(cCharAt, str.charAt(i14));
                    if (iD > 1114111) {
                        e(iD);
                    }
                    int i18 = i13 + 1;
                    bArrL[i13] = (byte) ((iD >> 18) | 240);
                    if (i18 >= length2) {
                        bArrL = cVar.g();
                        length2 = bArrL.length;
                        i18 = 0;
                    }
                    int i19 = i18 + 1;
                    bArrL[i18] = (byte) (((iD >> 12) & 63) | 128);
                    if (i19 >= length2) {
                        bArrL = cVar.g();
                        length2 = bArrL.length;
                        i19 = 0;
                    }
                    int i20 = i19 + 1;
                    bArrL[i19] = (byte) (((iD >> 6) & 63) | 128);
                    i11 = iD;
                    i12 = i17;
                    i10 = i20;
                }
                if (i10 >= length2) {
                    bArrL = cVar.g();
                    length2 = bArrL.length;
                    i10 = 0;
                }
                bArrL[i10] = (byte) ((i11 & 63) | 128);
                i13 = i10 + 1;
            }
            i11 = cCharAt;
            i12 = i14;
            if (i10 >= length2) {
                bArrL = cVar.g();
                length2 = bArrL.length;
                i10 = 0;
            }
            bArrL[i10] = (byte) ((i11 & 63) | 128);
            i13 = i10 + 1;
        }
        return this.f102433b.f(i13);
    }

    public void h(CharSequence charSequence, StringBuilder sb2) {
        int[] iArrE = a.e();
        int length = iArrE.length;
        int length2 = charSequence.length();
        int i10 = 0;
        while (i10 < length2) {
            do {
                char cCharAt = charSequence.charAt(i10);
                if (cCharAt >= length || iArrE[cCharAt] == 0) {
                    sb2.append(cCharAt);
                    i10++;
                } else {
                    int i11 = i10 + 1;
                    char cCharAt2 = charSequence.charAt(i10);
                    int i12 = iArrE[cCharAt2];
                    sb2.append(this.f102434c, 0, i12 < 0 ? c(cCharAt2, this.f102434c) : b(i12, this.f102434c));
                    i10 = i11;
                }
            } while (i10 < length2);
            return;
        }
    }

    public char[] i(String str) {
        com.fasterxml.jackson.core.util.n nVar = this.f102432a;
        if (nVar == null) {
            nVar = new com.fasterxml.jackson.core.util.n(null);
            this.f102432a = nVar;
        }
        char[] cArrN = nVar.n();
        int[] iArrE = a.e();
        int length = iArrE.length;
        int length2 = str.length();
        int i10 = 0;
        int i11 = 0;
        loop0: while (i10 < length2) {
            while (true) {
                char cCharAt = str.charAt(i10);
                if (cCharAt >= length || iArrE[cCharAt] == 0) {
                    if (i11 >= cArrN.length) {
                        cArrN = nVar.s();
                        i11 = 0;
                    }
                    int i12 = i11 + 1;
                    cArrN[i11] = cCharAt;
                    i10++;
                    if (i10 >= length2) {
                        i11 = i12;
                        break loop0;
                    }
                    i11 = i12;
                }
            }
            int i13 = i10 + 1;
            char cCharAt2 = str.charAt(i10);
            int i14 = iArrE[cCharAt2];
            int iC = i14 < 0 ? c(cCharAt2, this.f102434c) : b(i14, this.f102434c);
            int i15 = i11 + iC;
            if (i15 > cArrN.length) {
                int length3 = cArrN.length - i11;
                if (length3 > 0) {
                    System.arraycopy(this.f102434c, 0, cArrN, i11, length3);
                }
                cArrN = nVar.s();
                int i16 = iC - length3;
                System.arraycopy(this.f102434c, length3, cArrN, 0, i16);
                i11 = i16;
            } else {
                System.arraycopy(this.f102434c, 0, cArrN, i11, iC);
                i11 = i15;
            }
            i10 = i13;
        }
        nVar.I(i11);
        return nVar.g();
    }

    public byte[] j(String str) {
        int i10;
        int i11;
        int i12;
        com.fasterxml.jackson.core.util.c cVar = this.f102433b;
        if (cVar == null) {
            cVar = new com.fasterxml.jackson.core.util.c((com.fasterxml.jackson.core.util.a) null);
            this.f102433b = cVar;
        }
        int length = str.length();
        byte[] bArrL = cVar.l();
        int i13 = 0;
        int iA = 0;
        loop0: while (i13 < length) {
            int[] iArrE = a.e();
            while (true) {
                char cCharAt = str.charAt(i13);
                if (cCharAt > 127 || iArrE[cCharAt] != 0) {
                    break;
                    break;
                }
                if (iA >= bArrL.length) {
                    bArrL = cVar.g();
                    iA = 0;
                }
                int i14 = iA + 1;
                bArrL[iA] = (byte) cCharAt;
                i13++;
                if (i13 >= length) {
                    iA = i14;
                    break loop0;
                }
                iA = i14;
            }
            if (iA >= bArrL.length) {
                bArrL = cVar.g();
                iA = 0;
            }
            int i15 = i13 + 1;
            char cCharAt2 = str.charAt(i13);
            if (cCharAt2 <= 127) {
                iA = a(cCharAt2, iArrE[cCharAt2], cVar, iA);
                bArrL = cVar.h();
            } else {
                if (cCharAt2 <= 2047) {
                    i12 = iA + 1;
                    bArrL[iA] = (byte) ((cCharAt2 >> 6) | 192);
                    i11 = (cCharAt2 & '?') | 128;
                } else {
                    if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                        int i16 = iA + 1;
                        bArrL[iA] = (byte) ((cCharAt2 >> '\f') | 224);
                        if (i16 >= bArrL.length) {
                            bArrL = cVar.g();
                            i16 = 0;
                        }
                        bArrL[i16] = (byte) (((cCharAt2 >> 6) & 63) | 128);
                        i10 = i16 + 1;
                        i11 = (cCharAt2 & '?') | 128;
                    } else {
                        if (cCharAt2 > 56319) {
                            e(cCharAt2);
                        }
                        if (i15 >= length) {
                            e(cCharAt2);
                        }
                        int i17 = i13 + 2;
                        int iD = d(cCharAt2, str.charAt(i15));
                        if (iD > 1114111) {
                            e(iD);
                        }
                        int i18 = iA + 1;
                        bArrL[iA] = (byte) ((iD >> 18) | 240);
                        if (i18 >= bArrL.length) {
                            bArrL = cVar.g();
                            i18 = 0;
                        }
                        int i19 = i18 + 1;
                        bArrL[i18] = (byte) (((iD >> 12) & 63) | 128);
                        if (i19 >= bArrL.length) {
                            bArrL = cVar.g();
                            i19 = 0;
                        }
                        int i20 = i19 + 1;
                        bArrL[i19] = (byte) (((iD >> 6) & 63) | 128);
                        i11 = (iD & 63) | 128;
                        i10 = i20;
                        i15 = i17;
                    }
                    i12 = i10;
                }
                if (i12 >= bArrL.length) {
                    bArrL = cVar.g();
                    i12 = 0;
                }
                bArrL[i12] = (byte) i11;
                iA = i12 + 1;
            }
            i13 = i15;
        }
        return this.f102433b.f(iA);
    }
}
