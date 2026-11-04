package com.google.zxing.oned;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f130541d = 2.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f130542e = 1.5f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f130546i = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f130548a = new StringBuilder(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f130549b = new int[80];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f130550c = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f130543f = "0123456789-$:/.+ABCD";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final char[] f130544g = f130543f.toCharArray();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int[] f130545h = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final char[] f130547j = {'A', 'B', 'C', 'D'};

    static {
        int i10 = 1 & 4;
    }

    static boolean h(char[] cArr, char c10) {
        if (cArr != null) {
            for (char c11 : cArr) {
                if (c11 == c10) {
                    return true;
                }
            }
        }
        return false;
    }

    private void i(int i10) {
        int[] iArr = this.f130549b;
        int i11 = this.f130550c;
        iArr[i11] = i10;
        int i12 = i11 + 1;
        this.f130550c = i12;
        if (i12 >= iArr.length) {
            int[] iArr2 = new int[i12 << 1];
            System.arraycopy(iArr, 0, iArr2, 0, i12);
            this.f130549b = iArr2;
        }
    }

    private int j() throws com.google.zxing.m {
        for (int i10 = 1; i10 < this.f130550c; i10 += 2) {
            int iL = l(i10);
            if (iL != -1 && h(f130547j, f130544g[iL])) {
                int i11 = 0;
                for (int i12 = i10; i12 < i10 + 7; i12++) {
                    i11 += this.f130549b[i12];
                }
                if (i10 == 1 || this.f130549b[i10 - 1] >= i11 / 2) {
                    return i10;
                }
            }
        }
        throw com.google.zxing.m.a();
    }

    private void k(com.google.zxing.common.a aVar) throws com.google.zxing.m {
        int i10 = 0;
        this.f130550c = 0;
        int iK = aVar.k(0);
        int iL = aVar.l();
        if (iK >= iL) {
            throw com.google.zxing.m.a();
        }
        boolean z10 = true;
        while (iK < iL) {
            if (aVar.h(iK) != z10) {
                i10++;
            } else {
                i(i10);
                z10 = !z10;
                i10 = 1;
            }
            iK++;
        }
        i(i10);
    }

    private int l(int i10) {
        int i11 = i10 + 7;
        if (i11 >= this.f130550c) {
            return -1;
        }
        int[] iArr = this.f130549b;
        int i12 = Integer.MAX_VALUE;
        int i13 = 0;
        int i14 = Integer.MAX_VALUE;
        int i15 = 0;
        for (int i16 = i10; i16 < i11; i16 += 2) {
            int i17 = iArr[i16];
            if (i17 < i14) {
                i14 = i17;
            }
            if (i17 > i15) {
                i15 = i17;
            }
        }
        int i18 = (i14 + i15) / 2;
        int i19 = 0;
        for (int i20 = i10 + 1; i20 < i11; i20 += 2) {
            int i21 = iArr[i20];
            if (i21 < i12) {
                i12 = i21;
            }
            if (i21 > i19) {
                i19 = i21;
            }
        }
        int i22 = (i12 + i19) / 2;
        int i23 = 128;
        int i24 = 0;
        for (int i25 = 0; i25 < 7; i25++) {
            i23 >>= 1;
            if (iArr[i10 + i25] > ((i25 & 1) == 0 ? i18 : i22)) {
                i24 |= i23;
            }
        }
        while (true) {
            int[] iArr2 = f130545h;
            if (i13 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i13] == i24) {
                return i13;
            }
            i13++;
        }
    }

    private void m(int i10) throws com.google.zxing.m {
        int[] iArr = new int[4];
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        int[] iArr2 = new int[4];
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int length = this.f130548a.length() - 1;
        int i11 = i10;
        int i12 = 0;
        while (true) {
            int i13 = f130545h[this.f130548a.charAt(i12)];
            for (int i14 = 6; i14 >= 0; i14--) {
                int i15 = (i14 & 1) + ((i13 & 1) << 1);
                iArr[i15] = iArr[i15] + this.f130549b[i11 + i14];
                iArr2[i15] = iArr2[i15] + 1;
                i13 >>= 1;
            }
            if (i12 >= length) {
                break;
            }
            i11 += 8;
            i12++;
        }
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        for (int i16 = 0; i16 < 2; i16++) {
            fArr2[i16] = 0.0f;
            int i17 = i16 + 2;
            float f10 = iArr[i16] / iArr2[i16];
            int i18 = iArr[i17];
            int i19 = iArr2[i17];
            float f11 = (f10 + (i18 / i19)) / 2.0f;
            fArr2[i17] = f11;
            fArr[i16] = f11;
            fArr[i17] = ((i18 * 2.0f) + f130542e) / i19;
        }
        int i20 = i10;
        int i21 = 0;
        loop3: while (true) {
            int i22 = f130545h[this.f130548a.charAt(i21)];
            for (int i23 = 6; i23 >= 0; i23--) {
                int i24 = (i23 & 1) + ((i22 & 1) << 1);
                float f12 = this.f130549b[i20 + i23];
                if (f12 < fArr2[i24] || f12 > fArr[i24]) {
                    break loop3;
                }
                i22 >>= 1;
            }
            if (i21 >= length) {
                return;
            }
            i20 += 8;
            i21++;
        }
        throw com.google.zxing.m.a();
    }

    @Override // com.google.zxing.oned.r
    public com.google.zxing.r b(int i10, com.google.zxing.common.a aVar, Map<com.google.zxing.e, ?> map) throws com.google.zxing.m {
        int i11;
        Arrays.fill(this.f130549b, 0);
        k(aVar);
        int iJ = j();
        this.f130548a.setLength(0);
        int i12 = iJ;
        while (true) {
            int iL = l(i12);
            if (iL == -1) {
                throw com.google.zxing.m.a();
            }
            this.f130548a.append((char) iL);
            i11 = i12 + 8;
            if ((this.f130548a.length() > 1 && h(f130547j, f130544g[iL])) || i11 >= this.f130550c) {
                break;
            }
            i12 = i11;
        }
        int i13 = i12 + 7;
        int i14 = this.f130549b[i13];
        int i15 = 0;
        for (int i16 = -8; i16 < -1; i16++) {
            i15 += this.f130549b[i11 + i16];
        }
        if (i11 < this.f130550c && i14 < i15 / 2) {
            throw com.google.zxing.m.a();
        }
        m(iJ);
        for (int i17 = 0; i17 < this.f130548a.length(); i17++) {
            StringBuilder sb2 = this.f130548a;
            sb2.setCharAt(i17, f130544g[sb2.charAt(i17)]);
        }
        char cCharAt = this.f130548a.charAt(0);
        char[] cArr = f130547j;
        if (!h(cArr, cCharAt)) {
            throw com.google.zxing.m.a();
        }
        StringBuilder sb3 = this.f130548a;
        if (!h(cArr, sb3.charAt(sb3.length() - 1))) {
            throw com.google.zxing.m.a();
        }
        if (this.f130548a.length() <= 3) {
            throw com.google.zxing.m.a();
        }
        if (map == null || !map.containsKey(com.google.zxing.e.RETURN_CODABAR_START_END)) {
            StringBuilder sb4 = this.f130548a;
            sb4.deleteCharAt(sb4.length() - 1);
            this.f130548a.deleteCharAt(0);
        }
        int i18 = 0;
        for (int i19 = 0; i19 < iJ; i19++) {
            i18 += this.f130549b[i19];
        }
        float f10 = i18;
        while (iJ < i13) {
            i18 += this.f130549b[iJ];
            iJ++;
        }
        float f11 = i10;
        return new com.google.zxing.r(this.f130548a.toString(), null, new com.google.zxing.t[]{new com.google.zxing.t(f10, f11), new com.google.zxing.t(i18, f11)}, com.google.zxing.a.CODABAR);
    }
}
