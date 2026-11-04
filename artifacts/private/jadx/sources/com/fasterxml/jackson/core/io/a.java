package com.fasterxml.jackson.core.io;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f102399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f102400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f102401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f102402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f102403e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f102404f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f102405g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f102406h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f102407i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int[] f102408j;

    static {
        int i10;
        char[] charArray = "0123456789ABCDEF".toCharArray();
        f102399a = charArray;
        int length = charArray.length;
        f102400b = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            f102400b[i11] = (byte) f102399a[i11];
        }
        int[] iArr = new int[256];
        for (int i12 = 0; i12 < 32; i12++) {
            iArr[i12] = -1;
        }
        iArr[34] = 1;
        iArr[92] = 1;
        f102401c = iArr;
        int length2 = iArr.length;
        int[] iArr2 = new int[length2];
        System.arraycopy(iArr, 0, iArr2, 0, length2);
        for (int i13 = 128; i13 < 256; i13++) {
            if ((i13 & 224) == 192) {
                i10 = 2;
            } else if ((i13 & 240) == 224) {
                i10 = 3;
            } else {
                i10 = (i13 & com.planner5d.library.engine.input.f.b.R1) == 240 ? 4 : -1;
            }
            iArr2[i13] = i10;
        }
        f102402d = iArr2;
        int[] iArr3 = new int[256];
        Arrays.fill(iArr3, -1);
        for (int i14 = 33; i14 < 256; i14++) {
            if (Character.isJavaIdentifierPart((char) i14)) {
                iArr3[i14] = 0;
            }
        }
        iArr3[64] = 0;
        iArr3[35] = 0;
        iArr3[42] = 0;
        iArr3[45] = 0;
        iArr3[43] = 0;
        f102403e = iArr3;
        int[] iArr4 = new int[256];
        System.arraycopy(iArr3, 0, iArr4, 0, 256);
        Arrays.fill(iArr4, 128, 128, 0);
        f102404f = iArr4;
        int[] iArr5 = new int[256];
        int[] iArr6 = f102402d;
        System.arraycopy(iArr6, 128, iArr5, 128, 128);
        Arrays.fill(iArr5, 0, 32, -1);
        iArr5[9] = 0;
        iArr5[10] = 10;
        iArr5[13] = 13;
        iArr5[42] = 42;
        f102405g = iArr5;
        int[] iArr7 = new int[256];
        System.arraycopy(iArr6, 128, iArr7, 128, 128);
        Arrays.fill(iArr7, 0, 32, -1);
        iArr7[32] = 1;
        iArr7[9] = 1;
        iArr7[10] = 10;
        iArr7[13] = 13;
        iArr7[47] = 47;
        iArr7[35] = 35;
        f102406h = iArr7;
        int[] iArr8 = new int[128];
        for (int i15 = 0; i15 < 32; i15++) {
            iArr8[i15] = -1;
        }
        iArr8[34] = 34;
        iArr8[92] = 92;
        iArr8[8] = 98;
        iArr8[9] = 116;
        iArr8[12] = 102;
        iArr8[10] = 110;
        iArr8[13] = 114;
        f102407i = iArr8;
        int[] iArr9 = new int[128];
        f102408j = iArr9;
        Arrays.fill(iArr9, -1);
        for (int i16 = 0; i16 < 10; i16++) {
            f102408j[i16 + 48] = i16;
        }
        for (int i17 = 0; i17 < 6; i17++) {
            int[] iArr10 = f102408j;
            int i18 = i17 + 10;
            iArr10[i17 + 97] = i18;
            iArr10[i17 + 65] = i18;
        }
    }

    public static void a(StringBuilder sb2, String str) {
        int[] iArr = f102407i;
        int length = iArr.length;
        int length2 = str.length();
        for (int i10 = 0; i10 < length2; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= length || iArr[cCharAt] == 0) {
                sb2.append(cCharAt);
            } else {
                sb2.append('\\');
                int i11 = iArr[cCharAt];
                if (i11 < 0) {
                    sb2.append(AbstractJsonLexerKt.UNICODE_ESC);
                    sb2.append(org.locationtech.jts.geom.l.f338160j);
                    sb2.append(org.locationtech.jts.geom.l.f338160j);
                    char[] cArr = f102399a;
                    sb2.append(cArr[cCharAt >> 4]);
                    sb2.append(cArr[cCharAt & 15]);
                } else {
                    sb2.append((char) i11);
                }
            }
        }
    }

    public static int b(int i10) {
        if (i10 > 127) {
            return -1;
        }
        return f102408j[i10];
    }

    public static byte[] c() {
        return (byte[]) f102400b.clone();
    }

    public static char[] d() {
        return (char[]) f102399a.clone();
    }

    public static int[] e() {
        return f102407i;
    }

    public static int[] f() {
        return f102405g;
    }

    public static int[] g() {
        return f102401c;
    }

    public static int[] h() {
        return f102403e;
    }

    public static int[] i() {
        return f102402d;
    }

    public static int[] j() {
        return f102404f;
    }

    public static int[] k() {
        return f102406h;
    }
}
