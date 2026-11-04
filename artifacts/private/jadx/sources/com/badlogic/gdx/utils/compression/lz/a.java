package com.badlogic.gdx.utils.compression.lz;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class a extends b {
    static final int A = 1;
    static final int B = 1024;
    static final int C = 0;
    static final int D = 1073741823;
    private static final int[] E = new int[256];

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final int f95275x = 1024;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static final int f95276y = 65536;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static final int f95277z = 65536;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f95278l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f95280n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int[] f95281o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    int[] f95282p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f95284r;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f95279m = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f95283q = 255;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f95285s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    boolean f95286t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    int f95287u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    int f95288v = 4;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    int f95289w = 66560;

    static {
        for (int i10 = 0; i10 < 256; i10++) {
            int i11 = i10;
            for (int i12 = 0; i12 < 8; i12++) {
                i11 = (i11 & 1) != 0 ? (i11 >>> 1) ^ (-306674912) : i11 >>> 1;
            }
            E[i10] = i11;
        }
    }

    public a() {
        int i10 = 2 & 0;
    }

    @Override // com.badlogic.gdx.utils.compression.lz.b
    public void f() throws IOException {
        super.f();
        for (int i10 = 0; i10 < this.f95285s; i10++) {
            this.f95282p[i10] = 0;
        }
        this.f95278l = 0;
        j(-1);
    }

    @Override // com.badlogic.gdx.utils.compression.lz.b
    public void h() throws IOException {
        int i10 = this.f95278l + 1;
        this.f95278l = i10;
        if (i10 >= this.f95279m) {
            this.f95278l = 0;
        }
        super.h();
        if (this.f95297h == 1073741823) {
            o();
        }
    }

    public boolean m(int i10, int i11, int i12, int i13) {
        int i14;
        if (i10 > 1073741567) {
            return false;
        }
        this.f95283q = (i12 >> 1) + 16;
        int i15 = i11 + i10;
        super.a(i15, i13 + i12, (((i15 + i12) + i13) / 2) + 256);
        this.f95280n = i12;
        int i16 = i10 + 1;
        if (this.f95279m != i16) {
            this.f95279m = i16;
            this.f95281o = new int[i16 * 2];
        }
        if (this.f95286t) {
            int i17 = i10 - 1;
            int i18 = i17 | (i17 >> 1);
            int i19 = i18 | (i18 >> 2);
            int i20 = i19 | (i19 >> 4);
            int i21 = ((i20 | (i20 >> 8)) >> 1) | 65535;
            if (i21 > 16777216) {
                i21 >>= 1;
            }
            this.f95284r = i21;
            i14 = i21 + 1 + this.f95289w;
        } else {
            i14 = 65536;
        }
        if (i14 != this.f95285s) {
            this.f95285s = i14;
            this.f95282p = new int[i14];
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:43:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:46:0x0107  */
    /* JADX WARN: Code duplicated, block: B:49:0x010d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0114  */
    /* JADX WARN: Code duplicated, block: B:52:0x0116  */
    /* JADX WARN: Code duplicated, block: B:55:0x0137 A[LOOP:1: B:55:0x0137->B:78:?, LOOP_START, PHI: r15
      0x0137: PHI (r15v2 int) = (r15v0 int), (r15v3 int) binds: [B:54:0x0135, B:78:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x013b  */
    /* JADX WARN: Code duplicated, block: B:60:0x0149  */
    /* JADX WARN: Code duplicated, block: B:63:0x0162  */
    /* JADX WARN: Code duplicated, block: B:66:0x0172  */
    /* JADX WARN: Code duplicated, block: B:68:0x017e  */
    /* JADX WARN: Code duplicated, block: B:74:0x018d A[EDGE_INSN: B:74:0x018d->B:70:0x018d BREAK  A[LOOP:0: B:45:0x0105->B:69:0x0188], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0147 A[EDGE_INSN: B:76:0x0147->B:59:0x0147 BREAK  A[LOOP:1: B:55:0x0137->B:78:?], SYNTHETIC] */
    public int n(int[] iArr) throws IOException {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int iMin;
        byte[] bArr;
        byte[] bArr2;
        int i28;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        int i29 = this.f95297h;
        int i30 = this.f95280n;
        int i31 = i29 + i30;
        int i32 = this.f95300k;
        if (i31 > i32 && (i30 = i32 - i29) < this.f95288v) {
            h();
            return 0;
        }
        int i33 = this.f95279m;
        int i34 = i29 > i33 ? i29 - i33 : 0;
        int i35 = this.f95295f;
        int i36 = i35 + i29;
        boolean z10 = this.f95286t;
        if (z10) {
            int[] iArr2 = E;
            byte[] bArr6 = this.f95290a;
            int i37 = iArr2[bArr6[i36] & 255] ^ (bArr6[i36 + 1] & 255);
            i11 = i37 & 1023;
            int i38 = i37 ^ ((bArr6[i36 + 2] & 255) << 8);
            i12 = 65535 & i38;
            i10 = ((iArr2[bArr6[i36 + 3] & 255] << 5) ^ i38) & this.f95284r;
        } else {
            byte[] bArr7 = this.f95290a;
            i10 = ((bArr7[i36 + 1] & 255) << 8) ^ (bArr7[i36] & 255);
            i11 = 0;
            i12 = 0;
        }
        int[] iArr3 = this.f95282p;
        int i39 = this.f95289w;
        int i40 = iArr3[i39 + i10];
        if (z10) {
            int i41 = iArr3[i11];
            int i42 = i12 + 1024;
            int i43 = iArr3[i42];
            iArr3[i11] = i29;
            iArr3[i42] = i29;
            if (i41 > i34) {
                byte[] bArr8 = this.f95290a;
                i13 = 0;
                if (bArr8[i35 + i41] == bArr8[i36]) {
                    iArr[0] = 2;
                    iArr[1] = (i29 - i41) - 1;
                    i16 = 2;
                    i15 = 2;
                }
                if (i43 > i34) {
                    bArr5 = this.f95290a;
                    i14 = 1;
                    if (bArr5[i35 + i43] == bArr5[i36]) {
                        if (i43 == i41) {
                            i16 -= 2;
                        }
                        int i44 = i16 + 1;
                        i15 = 3;
                        iArr[i16] = 3;
                        i16 += 2;
                        iArr[i44] = (i29 - i43) - 1;
                        i41 = i43;
                    }
                } else {
                    i14 = 1;
                }
                i16 = (i16 != 0 && i41 == i40) ? i16 - 2 : 0;
                iArr3[i39 + i10] = i29;
                int i45 = this.f95278l;
                i17 = (i45 << 1) + 1;
                i18 = i45 << 1;
                i19 = this.f95287u;
                if (i19 != 0 && i40 > i34) {
                    bArr4 = this.f95290a;
                    if (bArr4[i35 + i40 + i19] != bArr4[i36 + i19]) {
                        int i46 = i16 + 1;
                        iArr[i16] = i19;
                        i16 += 2;
                        iArr[i46] = (i29 - i40) - 1;
                        i15 = i19;
                    }
                }
                i20 = this.f95283q;
                i21 = i19;
                while (i40 > i34) {
                    i22 = i20 - 1;
                    if (i20 == 0) {
                        break;
                    }
                    i23 = this.f95297h - i40;
                    i24 = this.f95278l;
                    if (i23 <= i24) {
                        i25 = i24 - i23;
                    } else {
                        i25 = (i24 - i23) + this.f95279m;
                    }
                    i26 = i25 << 1;
                    i27 = this.f95295f + i40;
                    iMin = Math.min(i19, i21);
                    bArr = this.f95290a;
                    int i47 = i34;
                    if (bArr[i27 + iMin] == bArr[i36 + iMin]) {
                        do {
                            iMin++;
                            if (iMin == i30) {
                                break;
                            }
                            bArr3 = this.f95290a;
                        } while (bArr3[i27 + iMin] == bArr3[i36 + iMin]);
                        if (i15 < iMin) {
                            int i48 = i16 + 1;
                            iArr[i16] = iMin;
                            i16 += 2;
                            iArr[i48] = i23 - 1;
                            if (iMin == i30) {
                                int[] iArr4 = this.f95281o;
                                iArr4[i18] = iArr4[i26];
                                iArr4[i17] = iArr4[i26 + 1];
                            } else {
                                i15 = iMin;
                            }
                        }
                    }
                    bArr2 = this.f95290a;
                    if ((bArr2[i27 + iMin] & 255) < (bArr2[i36 + iMin] & 255)) {
                        int[] iArr5 = this.f95281o;
                        iArr5[i18] = i40;
                        int i49 = i26 + 1;
                        i28 = iArr5[i49];
                        i18 = i49;
                        i21 = iMin;
                    } else {
                        int[] iArr6 = this.f95281o;
                        iArr6[i17] = i40;
                        i28 = iArr6[i26];
                        i17 = i26;
                        i19 = iMin;
                    }
                    i40 = i28;
                    i20 = i22;
                    i34 = i47;
                    h();
                    return i16;
                }
                int[] iArr7 = this.f95281o;
                iArr7[i18] = i13;
                iArr7[i17] = i13;
                h();
                return i16;
            }
            i13 = 0;
            i15 = 1;
            i16 = i13;
            if (i43 > i34) {
                bArr5 = this.f95290a;
                i14 = 1;
                if (bArr5[i35 + i43] == bArr5[i36]) {
                    if (i43 == i41) {
                        i16 -= 2;
                    }
                    int i410 = i16 + 1;
                    i15 = 3;
                    iArr[i16] = 3;
                    i16 += 2;
                    iArr[i410] = (i29 - i43) - 1;
                    i41 = i43;
                }
            } else {
                i14 = 1;
            }
            if (i16 != 0) {
            }
            iArr3[i39 + i10] = i29;
            int i411 = this.f95278l;
            i17 = (i411 << 1) + 1;
            i18 = i411 << 1;
            i19 = this.f95287u;
            if (i19 != 0) {
                bArr4 = this.f95290a;
                if (bArr4[i35 + i40 + i19] != bArr4[i36 + i19]) {
                    int i412 = i16 + 1;
                    iArr[i16] = i19;
                    i16 += 2;
                    iArr[i412] = (i29 - i40) - 1;
                    i15 = i19;
                }
            }
            i20 = this.f95283q;
            i21 = i19;
            while (i40 > i34) {
                i22 = i20 - 1;
                if (i20 == 0) {
                    break;
                    break;
                }
                i23 = this.f95297h - i40;
                i24 = this.f95278l;
                if (i23 <= i24) {
                    i25 = i24 - i23;
                } else {
                    i25 = (i24 - i23) + this.f95279m;
                }
                i26 = i25 << 1;
                i27 = this.f95295f + i40;
                iMin = Math.min(i19, i21);
                bArr = this.f95290a;
                int i413 = i34;
                if (bArr[i27 + iMin] == bArr[i36 + iMin]) {
                    do {
                        iMin++;
                        if (iMin == i30) {
                            break;
                            break;
                        }
                        bArr3 = this.f95290a;
                    } while (bArr3[i27 + iMin] == bArr3[i36 + iMin]);
                    if (i15 < iMin) {
                        int i414 = i16 + 1;
                        iArr[i16] = iMin;
                        i16 += 2;
                        iArr[i414] = i23 - 1;
                        if (iMin == i30) {
                            int[] iArr8 = this.f95281o;
                            iArr8[i18] = iArr8[i26];
                            iArr8[i17] = iArr8[i26 + 1];
                        } else {
                            i15 = iMin;
                        }
                    }
                }
                bArr2 = this.f95290a;
                if ((bArr2[i27 + iMin] & 255) < (bArr2[i36 + iMin] & 255)) {
                    int[] iArr9 = this.f95281o;
                    iArr9[i18] = i40;
                    int i415 = i26 + 1;
                    i28 = iArr9[i415];
                    i18 = i415;
                    i21 = iMin;
                } else {
                    int[] iArr10 = this.f95281o;
                    iArr10[i17] = i40;
                    i28 = iArr10[i26];
                    i17 = i26;
                    i19 = iMin;
                }
                i40 = i28;
                i20 = i22;
                i34 = i413;
                h();
                return i16;
            }
            int[] iArr11 = this.f95281o;
            iArr11[i18] = i13;
            iArr11[i17] = i13;
            h();
            return i16;
        }
        i13 = 0;
        i14 = 1;
        i15 = i14;
        iArr3[i39 + i10] = i29;
        int i416 = this.f95278l;
        i17 = (i416 << 1) + 1;
        i18 = i416 << 1;
        i19 = this.f95287u;
        if (i19 != 0) {
            bArr4 = this.f95290a;
            if (bArr4[i35 + i40 + i19] != bArr4[i36 + i19]) {
                int i417 = i16 + 1;
                iArr[i16] = i19;
                i16 += 2;
                iArr[i417] = (i29 - i40) - 1;
                i15 = i19;
            }
        }
        i20 = this.f95283q;
        i21 = i19;
        while (i40 > i34) {
            i22 = i20 - 1;
            if (i20 == 0) {
                break;
                break;
            }
            i23 = this.f95297h - i40;
            i24 = this.f95278l;
            if (i23 <= i24) {
                i25 = i24 - i23;
            } else {
                i25 = (i24 - i23) + this.f95279m;
            }
            i26 = i25 << 1;
            i27 = this.f95295f + i40;
            iMin = Math.min(i19, i21);
            bArr = this.f95290a;
            int i418 = i34;
            if (bArr[i27 + iMin] == bArr[i36 + iMin]) {
                do {
                    iMin++;
                    if (iMin == i30) {
                        break;
                        break;
                    }
                    bArr3 = this.f95290a;
                } while (bArr3[i27 + iMin] == bArr3[i36 + iMin]);
                if (i15 < iMin) {
                    int i419 = i16 + 1;
                    iArr[i16] = iMin;
                    i16 += 2;
                    iArr[i419] = i23 - 1;
                    if (iMin == i30) {
                        int[] iArr12 = this.f95281o;
                        iArr12[i18] = iArr12[i26];
                        iArr12[i17] = iArr12[i26 + 1];
                    } else {
                        i15 = iMin;
                    }
                }
            }
            bArr2 = this.f95290a;
            if ((bArr2[i27 + iMin] & 255) < (bArr2[i36 + iMin] & 255)) {
                int[] iArr13 = this.f95281o;
                iArr13[i18] = i40;
                int i4110 = i26 + 1;
                i28 = iArr13[i4110];
                i18 = i4110;
                i21 = iMin;
            } else {
                int[] iArr14 = this.f95281o;
                iArr14[i17] = i40;
                i28 = iArr14[i26];
                i17 = i26;
                i19 = iMin;
            }
            i40 = i28;
            i20 = i22;
            i34 = i418;
            h();
            return i16;
        }
        int[] iArr15 = this.f95281o;
        iArr15[i18] = i13;
        iArr15[i17] = i13;
        h();
        return i16;
    }

    void o() {
        int i10 = this.f95297h;
        int i11 = this.f95279m;
        int i12 = i10 - i11;
        p(this.f95281o, i11 * 2, i12);
        p(this.f95282p, this.f95285s, i12);
        j(i12);
    }

    void p(int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = iArr[i12];
            iArr[i12] = i13 <= i11 ? 0 : i13 - i11;
        }
    }

    public void q(int i10) {
        this.f95283q = i10;
    }

    public void r(int i10) {
        boolean z10 = i10 > 2;
        this.f95286t = z10;
        if (z10) {
            this.f95287u = 0;
            this.f95288v = 4;
            this.f95289w = 66560;
        } else {
            this.f95287u = 2;
            this.f95288v = 3;
            this.f95289w = 0;
        }
    }

    public void s(int i10) throws IOException {
        int i11;
        byte[] bArr;
        int i12 = i10;
        do {
            int i13 = this.f95297h;
            int i14 = this.f95280n;
            int i15 = i13 + i14;
            int i16 = this.f95300k;
            if (i15 > i16 && (i14 = i16 - i13) < this.f95288v) {
                h();
            } else {
                int i17 = this.f95279m;
                int i18 = i13 > i17 ? i13 - i17 : 0;
                int i19 = this.f95295f + i13;
                if (this.f95286t) {
                    int[] iArr = E;
                    byte[] bArr2 = this.f95290a;
                    int i20 = iArr[bArr2[i19] & 255] ^ (bArr2[i19 + 1] & 255);
                    int[] iArr2 = this.f95282p;
                    iArr2[i20 & 1023] = i13;
                    int i21 = i20 ^ ((bArr2[i19 + 2] & 255) << 8);
                    iArr2[(65535 & i21) + 1024] = i13;
                    i11 = ((iArr[bArr2[i19 + 3] & 255] << 5) ^ i21) & this.f95284r;
                } else {
                    byte[] bArr3 = this.f95290a;
                    i11 = ((bArr3[i19 + 1] & 255) << 8) ^ (bArr3[i19] & 255);
                }
                int[] iArr3 = this.f95282p;
                int i22 = this.f95289w;
                int i23 = iArr3[i22 + i11];
                iArr3[i22 + i11] = i13;
                int i24 = this.f95278l;
                int i25 = (i24 << 1) + 1;
                int i26 = i24 << 1;
                int i27 = this.f95287u;
                int i28 = i23;
                int i29 = this.f95283q;
                int i30 = i27;
                while (true) {
                    if (i28 > i18) {
                        int i31 = i29 - 1;
                        if (i29 != 0) {
                            int i32 = this.f95297h - i28;
                            int i33 = this.f95278l;
                            int i34 = (i32 <= i33 ? i33 - i32 : (i33 - i32) + this.f95279m) << 1;
                            int i35 = this.f95295f + i28;
                            int iMin = Math.min(i27, i30);
                            byte[] bArr4 = this.f95290a;
                            if (bArr4[i35 + iMin] == bArr4[i19 + iMin]) {
                                do {
                                    iMin++;
                                    if (iMin == i14) {
                                        break;
                                    } else {
                                        bArr = this.f95290a;
                                    }
                                } while (bArr[i35 + iMin] == bArr[i19 + iMin]);
                                if (iMin == i14) {
                                    int[] iArr4 = this.f95281o;
                                    iArr4[i26] = iArr4[i34];
                                    iArr4[i25] = iArr4[i34 + 1];
                                }
                            }
                            byte[] bArr5 = this.f95290a;
                            if ((bArr5[i35 + iMin] & 255) < (bArr5[i19 + iMin] & 255)) {
                                int[] iArr5 = this.f95281o;
                                iArr5[i26] = i28;
                                int i36 = i34 + 1;
                                i28 = iArr5[i36];
                                i26 = i36;
                                i30 = iMin;
                            } else {
                                int[] iArr6 = this.f95281o;
                                iArr6[i25] = i28;
                                i28 = iArr6[i34];
                                i25 = i34;
                                i27 = iMin;
                            }
                            i29 = i31;
                        }
                        h();
                    }
                    int[] iArr7 = this.f95281o;
                    iArr7[i26] = 0;
                    iArr7[i25] = 0;
                    h();
                }
            }
            i12--;
        } while (i12 != 0);
    }
}
