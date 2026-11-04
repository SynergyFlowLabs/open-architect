package com.google.zxing.oned;

import java.util.Arrays;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final String f130596e = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int[] f130597f = {52, 289, 97, 352, 49, 304, com.planner5d.library.engine.input.f.b.B, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, 133, 388, 196, 168, 162, 138, 42};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int f130598g = 148;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f130599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f130600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final StringBuilder f130601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f130602d;

    public e() {
        this(false);
    }

    private static String h(CharSequence charSequence) throws com.google.zxing.h {
        int i10;
        char c10;
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i11 = 0;
        while (i11 < length) {
            char cCharAt = charSequence.charAt(i11);
            if (cCharAt == '+' || cCharAt == '$' || cCharAt == '%' || cCharAt == '/') {
                i11++;
                char cCharAt2 = charSequence.charAt(i11);
                if (cCharAt != '$') {
                    if (cCharAt != '%') {
                        if (cCharAt != '+') {
                            if (cCharAt != '/') {
                                c10 = 0;
                            } else if (cCharAt2 >= 'A' && cCharAt2 <= 'O') {
                                i10 = cCharAt2 - ' ';
                            } else {
                                if (cCharAt2 != 'Z') {
                                    throw com.google.zxing.h.a();
                                }
                                c10 = AbstractJsonLexerKt.COLON;
                            }
                        } else {
                            if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                                throw com.google.zxing.h.a();
                            }
                            i10 = cCharAt2 + ' ';
                        }
                    } else if (cCharAt2 >= 'A' && cCharAt2 <= 'E') {
                        i10 = cCharAt2 - '&';
                    } else if (cCharAt2 >= 'F' && cCharAt2 <= 'J') {
                        i10 = cCharAt2 - 11;
                    } else if (cCharAt2 >= 'K' && cCharAt2 <= 'O') {
                        i10 = cCharAt2 + 16;
                    } else if (cCharAt2 >= 'P' && cCharAt2 <= 'T') {
                        i10 = cCharAt2 + '+';
                    } else if (cCharAt2 == 'U') {
                        c10 = 0;
                    } else if (cCharAt2 == 'V') {
                        c10 = '@';
                    } else if (cCharAt2 == 'W') {
                        c10 = '`';
                    } else {
                        if (cCharAt2 != 'X' && cCharAt2 != 'Y' && cCharAt2 != 'Z') {
                            throw com.google.zxing.h.a();
                        }
                        c10 = com.google.common.base.c.N;
                    }
                    sb2.append(c10);
                } else {
                    if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                        throw com.google.zxing.h.a();
                    }
                    i10 = cCharAt2 - '@';
                }
                c10 = (char) i10;
                sb2.append(c10);
            } else {
                sb2.append(cCharAt);
            }
            i11++;
        }
        return sb2.toString();
    }

    private static int[] i(com.google.zxing.common.a aVar, int[] iArr) throws com.google.zxing.m {
        int iL = aVar.l();
        int iJ = aVar.j(0);
        int length = iArr.length;
        boolean z10 = false;
        int i10 = 0;
        int i11 = iJ;
        while (iJ < iL) {
            if (aVar.h(iJ) != z10) {
                iArr[i10] = iArr[i10] + 1;
            } else {
                if (i10 != length - 1) {
                    i10++;
                } else {
                    if (k(iArr) == 148 && aVar.o(Math.max(0, i11 - ((iJ - i11) / 2)), i11, false)) {
                        return new int[]{i11, iJ};
                    }
                    i11 += iArr[0] + iArr[1];
                    int i12 = i10 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i12);
                    iArr[i12] = 0;
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

    private static char j(int i10) throws com.google.zxing.m {
        int i11 = 0;
        while (true) {
            int[] iArr = f130597f;
            if (i11 >= iArr.length) {
                if (i10 == 148) {
                    return '*';
                }
                throw com.google.zxing.m.a();
            }
            if (iArr[i11] == i10) {
                return f130596e.charAt(i11);
            }
            i11++;
        }
    }

    private static int k(int[] iArr) {
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            int i11 = Integer.MAX_VALUE;
            for (int i12 : iArr) {
                if (i12 < i11 && i12 > i10) {
                    i11 = i12;
                }
            }
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < length; i16++) {
                int i17 = iArr[i16];
                if (i17 > i11) {
                    i14 |= 1 << ((length - 1) - i16);
                    i13++;
                    i15 += i17;
                }
            }
            if (i13 == 3) {
                for (int i18 = 0; i18 < length && i13 > 0; i18++) {
                    int i19 = iArr[i18];
                    if (i19 > i11) {
                        i13--;
                        if ((i19 << 1) >= i15) {
                            return -1;
                        }
                    }
                }
                return i14;
            }
            if (i13 <= 3) {
                return -1;
            }
            i10 = i11;
        }
    }

    @Override // com.google.zxing.oned.r
    public com.google.zxing.r b(int i10, com.google.zxing.common.a aVar, Map<com.google.zxing.e, ?> map) throws com.google.zxing.m, com.google.zxing.d, com.google.zxing.h {
        int[] iArr = this.f130602d;
        Arrays.fill(iArr, 0);
        StringBuilder sb2 = this.f130601c;
        sb2.setLength(0);
        int[] iArrI = i(aVar, iArr);
        int iJ = aVar.j(iArrI[1]);
        int iL = aVar.l();
        while (true) {
            r.f(aVar, iJ, iArr);
            int iK = k(iArr);
            if (iK < 0) {
                throw com.google.zxing.m.a();
            }
            char cJ = j(iK);
            sb2.append(cJ);
            int i11 = iJ;
            for (int i12 : iArr) {
                i11 += i12;
            }
            int iJ2 = aVar.j(i11);
            if (cJ == '*') {
                sb2.setLength(sb2.length() - 1);
                int i13 = 0;
                for (int i14 : iArr) {
                    i13 += i14;
                }
                int i15 = (iJ2 - iJ) - i13;
                if (iJ2 != iL && (i15 << 1) < i13) {
                    throw com.google.zxing.m.a();
                }
                if (this.f130599a) {
                    int length = sb2.length() - 1;
                    int iIndexOf = 0;
                    for (int i16 = 0; i16 < length; i16++) {
                        iIndexOf += f130596e.indexOf(this.f130601c.charAt(i16));
                    }
                    if (sb2.charAt(length) != f130596e.charAt(iIndexOf % 43)) {
                        throw com.google.zxing.d.a();
                    }
                    sb2.setLength(length);
                }
                if (sb2.length() == 0) {
                    throw com.google.zxing.m.a();
                }
                float f10 = i10;
                return new com.google.zxing.r(this.f130600b ? h(sb2) : sb2.toString(), null, new com.google.zxing.t[]{new com.google.zxing.t((iArrI[1] + iArrI[0]) / 2.0f, f10), new com.google.zxing.t(iJ + (i13 / 2.0f), f10)}, com.google.zxing.a.CODE_39);
            }
            iJ = iJ2;
        }
    }

    public e(boolean z10) {
        this(z10, false);
    }

    public e(boolean z10, boolean z11) {
        this.f130599a = z10;
        this.f130600b = z11;
        this.f130601c = new StringBuilder(20);
        this.f130602d = new int[9];
    }
}
