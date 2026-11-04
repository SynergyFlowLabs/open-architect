package com.google.zxing.datamatrix.encoder;

import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char f130429a = 129;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final char f130430b = 230;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final char f130431c = 231;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final char f130432d = 235;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final char f130433e = 236;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final char f130434f = 237;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final char f130435g = 238;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final char f130436h = 239;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final char f130437i = 240;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final char f130438j = 254;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final char f130439k = 254;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f130440l = "[)>\u001e05\u001d";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f130441m = "[)>\u001e06\u001d";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f130442n = "\u001e\u0004";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final int f130443o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final int f130444p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final int f130445q = 2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final int f130446r = 3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final int f130447s = 4;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final int f130448t = 5;

    private j() {
    }

    public static int a(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        int i11 = 0;
        if (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            while (g(cCharAt) && i10 < length) {
                i11++;
                i10++;
                if (i10 < length) {
                    cCharAt = charSequence.charAt(i10);
                }
            }
        }
        return i11;
    }

    public static String b(String str) {
        return c(str, l.FORCE_NONE, null, null);
    }

    public static String c(String str, l lVar, com.google.zxing.f fVar, com.google.zxing.f fVar2) {
        int iF = 0;
        g[] gVarArr = {new a(), new c(), new m(), new n(), new f(), new b()};
        h hVar = new h(str);
        hVar.o(lVar);
        hVar.m(fVar, fVar2);
        if (str.startsWith(f130440l) && str.endsWith(f130442n)) {
            hVar.s(f130433e);
            hVar.n(2);
            hVar.f130420f += 7;
        } else if (str.startsWith(f130441m) && str.endsWith(f130442n)) {
            hVar.s(f130434f);
            hVar.n(2);
            hVar.f130420f += 7;
        }
        while (hVar.j()) {
            gVarArr[iF].b(hVar);
            if (hVar.f() >= 0) {
                iF = hVar.f();
                hVar.k();
            }
        }
        int iA = hVar.a();
        hVar.q();
        int iB = hVar.h().b();
        if (iA < iB && iF != 0 && iF != 5 && iF != 4) {
            hVar.s((char) 254);
        }
        StringBuilder sbB = hVar.b();
        if (sbB.length() < iB) {
            sbB.append(f130429a);
        }
        while (sbB.length() < iB) {
            sbB.append(p(f130429a, sbB.length() + 1));
        }
        return hVar.b().toString();
    }

    private static int d(float[] fArr, int[] iArr, int i10, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        for (int i11 = 0; i11 < 6; i11++) {
            int iCeil = (int) Math.ceil(fArr[i11]);
            iArr[i11] = iCeil;
            if (i10 > iCeil) {
                Arrays.fill(bArr, (byte) 0);
                i10 = iCeil;
            }
            if (i10 == iCeil) {
                bArr[i11] = (byte) (bArr[i11] + 1);
            }
        }
        return i10;
    }

    private static int e(byte[] bArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 6; i11++) {
            i10 += bArr[i11];
        }
        return i10;
    }

    static void f(char c10) {
        String hexString = Integer.toHexString(c10);
        throw new IllegalArgumentException("Illegal character: " + c10 + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    static boolean g(char c10) {
        return c10 >= '0' && c10 <= '9';
    }

    static boolean h(char c10) {
        return c10 >= 128 && c10 <= 255;
    }

    private static boolean i(char c10) {
        if (c10 == ' ') {
            return true;
        }
        if (c10 < '0' || c10 > '9') {
            return c10 >= 'A' && c10 <= 'Z';
        }
        return true;
    }

    private static boolean j(char c10) {
        return c10 >= ' ' && c10 <= '^';
    }

    private static boolean k(char c10) {
        return c10 == ' ' || (c10 >= '0' && c10 <= '9') || (c10 >= 'a' && c10 <= 'z');
    }

    private static boolean l(char c10) {
        if (n(c10) || c10 == ' ') {
            return true;
        }
        if (c10 < '0' || c10 > '9') {
            return c10 >= 'A' && c10 <= 'Z';
        }
        return true;
    }

    private static boolean m(char c10) {
        return false;
    }

    private static boolean n(char c10) {
        return c10 == '\r' || c10 == '*' || c10 == '>';
    }

    static int o(CharSequence charSequence, int i10, int i11) {
        float[] fArr;
        float f10;
        if (i10 >= charSequence.length()) {
            return i11;
        }
        float f11 = 2.0f;
        float f12 = 1.0f;
        int i12 = 5;
        if (i11 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[6];
            fArr[0] = 1.0f;
            fArr[1] = 2.0f;
            fArr[2] = 2.0f;
            fArr[3] = 2.0f;
            fArr[4] = 2.0f;
            fArr[5] = 2.25f;
            fArr[i11] = 0.0f;
        }
        int i13 = 0;
        while (true) {
            int i14 = i10 + i13;
            if (i14 == charSequence.length()) {
                byte[] bArr = new byte[6];
                int[] iArr = new int[6];
                int iD = d(fArr, iArr, Integer.MAX_VALUE, bArr);
                int iE = e(bArr);
                if (iArr[0] == iD) {
                    return 0;
                }
                if (iE == 1 && bArr[i12] > 0) {
                    return i12;
                }
                if (iE == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (iE != 1 || bArr[2] <= 0) {
                    return (iE != 1 || bArr[3] <= 0) ? 1 : 3;
                }
                return 2;
            }
            char cCharAt = charSequence.charAt(i14);
            i13++;
            if (g(cCharAt)) {
                fArr[0] = fArr[0] + 0.5f;
                f10 = f12;
            } else if (h(cCharAt)) {
                f10 = f12;
                float fCeil = (float) Math.ceil(fArr[0]);
                fArr[0] = fCeil;
                fArr[0] = fCeil + f11;
            } else {
                f10 = f12;
                float fCeil2 = (float) Math.ceil(fArr[0]);
                fArr[0] = fCeil2;
                fArr[0] = fCeil2 + f10;
            }
            if (i(cCharAt)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (h(cCharAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (k(cCharAt)) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (h(cCharAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (l(cCharAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (h(cCharAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (j(cCharAt)) {
                fArr[4] = fArr[4] + 0.75f;
            } else if (h(cCharAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            if (m(cCharAt)) {
                fArr[i12] = fArr[i12] + 4.0f;
            } else {
                fArr[i12] = fArr[i12] + f10;
            }
            if (i13 >= 4) {
                int[] iArr2 = new int[6];
                byte[] bArr2 = new byte[6];
                d(fArr, iArr2, Integer.MAX_VALUE, bArr2);
                int iE2 = e(bArr2);
                int i15 = iArr2[0];
                int i16 = iArr2[i12];
                if (i15 < i16 && i15 < iArr2[1] && i15 < iArr2[2] && i15 < iArr2[3] && i15 < iArr2[4]) {
                    return 0;
                }
                if (i16 >= i15) {
                    byte b10 = bArr2[1];
                    byte b11 = bArr2[2];
                    byte b12 = bArr2[3];
                    byte b13 = bArr2[4];
                    if (b10 + b11 + b12 + b13 != 0) {
                        if (iE2 == 1 && b13 > 0) {
                            return 4;
                        }
                        if (iE2 == 1 && b11 > 0) {
                            return 2;
                        }
                        if (iE2 == 1 && b12 > 0) {
                            return 3;
                        }
                        int i17 = iArr2[1];
                        if (i17 + 1 < i15 && i17 + 1 < i16 && i17 + 1 < iArr2[4] && i17 + 1 < iArr2[2]) {
                            int i18 = iArr2[3];
                            if (i17 < i18) {
                                return 1;
                            }
                            if (i17 == i18) {
                                for (int i19 = i10 + i13 + 1; i19 < charSequence.length(); i19++) {
                                    char cCharAt2 = charSequence.charAt(i19);
                                    if (n(cCharAt2)) {
                                        return 3;
                                    }
                                    if (!l(cCharAt2)) {
                                        break;
                                    }
                                }
                                return 1;
                            }
                        }
                    }
                }
                return i12;
            }
            f12 = f10;
            i12 = i12;
            f11 = 2.0f;
        }
    }

    private static char p(char c10, int i10) {
        int i11 = c10 + ((i10 * com.planner5d.library.engine.input.f.b.H1) % com.planner5d.library.engine.input.f.b.W1) + 1;
        if (i11 > 254) {
            i11 -= 254;
        }
        return (char) i11;
    }
}
