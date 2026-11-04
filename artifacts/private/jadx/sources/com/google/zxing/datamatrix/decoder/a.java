package com.google.zxing.datamatrix.decoder;

import com.google.zxing.h;

/* JADX INFO: loaded from: classes5.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.zxing.common.b f130374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.zxing.common.b f130375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f130376c;

    a(com.google.zxing.common.b bVar) throws h {
        int iH = bVar.h();
        if (iH < 8 || iH > 144 || (iH & 1) != 0) {
            throw h.a();
        }
        this.f130376c = j(bVar);
        com.google.zxing.common.b bVarA = a(bVar);
        this.f130374a = bVarA;
        this.f130375b = new com.google.zxing.common.b(bVarA.l(), bVarA.h());
    }

    private com.google.zxing.common.b a(com.google.zxing.common.b bVar) {
        int iF = this.f130376c.f();
        int iE = this.f130376c.e();
        if (bVar.h() != iF) {
            throw new IllegalArgumentException("Dimension of bitMatrix must match the version size");
        }
        int iC = this.f130376c.c();
        int iB = this.f130376c.b();
        int i10 = iF / iC;
        int i11 = iE / iB;
        com.google.zxing.common.b bVar2 = new com.google.zxing.common.b(i11 * iB, i10 * iC);
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = i12 * iC;
            for (int i14 = 0; i14 < i11; i14++) {
                int i15 = i14 * iB;
                for (int i16 = 0; i16 < iC; i16++) {
                    int i17 = ((iC + 2) * i12) + 1 + i16;
                    int i18 = i13 + i16;
                    for (int i19 = 0; i19 < iB; i19++) {
                        if (bVar.e(((iB + 2) * i14) + 1 + i19, i17)) {
                            bVar2.q(i15 + i19, i18);
                        }
                    }
                }
            }
        }
        return bVar2;
    }

    private int d(int i10, int i11) {
        int i12 = i10 - 1;
        int i13 = (h(i12, 0, i10, i11) ? 1 : 0) << 1;
        if (h(i12, 1, i10, i11)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (h(i12, 2, i10, i11)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        if (h(0, i11 - 2, i10, i11)) {
            i15 |= 1;
        }
        int i16 = i15 << 1;
        int i17 = i11 - 1;
        if (h(0, i17, i10, i11)) {
            i16 |= 1;
        }
        int i18 = i16 << 1;
        if (h(1, i17, i10, i11)) {
            i18 |= 1;
        }
        int i19 = i18 << 1;
        if (h(2, i17, i10, i11)) {
            i19 |= 1;
        }
        int i20 = i19 << 1;
        return h(3, i17, i10, i11) ? i20 | 1 : i20;
    }

    private int e(int i10, int i11) {
        int i12 = (h(i10 + (-3), 0, i10, i11) ? 1 : 0) << 1;
        if (h(i10 - 2, 0, i10, i11)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (h(i10 - 1, 0, i10, i11)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (h(0, i11 - 4, i10, i11)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        if (h(0, i11 - 3, i10, i11)) {
            i15 |= 1;
        }
        int i16 = i15 << 1;
        if (h(0, i11 - 2, i10, i11)) {
            i16 |= 1;
        }
        int i17 = i16 << 1;
        int i18 = i11 - 1;
        if (h(0, i18, i10, i11)) {
            i17 |= 1;
        }
        int i19 = i17 << 1;
        return h(1, i18, i10, i11) ? i19 | 1 : i19;
    }

    private int f(int i10, int i11) {
        int i12 = i10 - 1;
        int i13 = (h(i12, 0, i10, i11) ? 1 : 0) << 1;
        int i14 = i11 - 1;
        if (h(i12, i14, i10, i11)) {
            i13 |= 1;
        }
        int i15 = i13 << 1;
        int i16 = i11 - 3;
        if (h(0, i16, i10, i11)) {
            i15 |= 1;
        }
        int i17 = i15 << 1;
        int i18 = i11 - 2;
        if (h(0, i18, i10, i11)) {
            i17 |= 1;
        }
        int i19 = i17 << 1;
        if (h(0, i14, i10, i11)) {
            i19 |= 1;
        }
        int i20 = i19 << 1;
        if (h(1, i16, i10, i11)) {
            i20 |= 1;
        }
        int i21 = i20 << 1;
        if (h(1, i18, i10, i11)) {
            i21 |= 1;
        }
        int i22 = i21 << 1;
        return h(1, i14, i10, i11) ? i22 | 1 : i22;
    }

    private int g(int i10, int i11) {
        int i12 = (h(i10 + (-3), 0, i10, i11) ? 1 : 0) << 1;
        if (h(i10 - 2, 0, i10, i11)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (h(i10 - 1, 0, i10, i11)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (h(0, i11 - 2, i10, i11)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        int i16 = i11 - 1;
        if (h(0, i16, i10, i11)) {
            i15 |= 1;
        }
        int i17 = i15 << 1;
        if (h(1, i16, i10, i11)) {
            i17 |= 1;
        }
        int i18 = i17 << 1;
        if (h(2, i16, i10, i11)) {
            i18 |= 1;
        }
        int i19 = i18 << 1;
        return h(3, i16, i10, i11) ? i19 | 1 : i19;
    }

    private boolean h(int i10, int i11, int i12, int i13) {
        if (i10 < 0) {
            i10 += i12;
            i11 += 4 - ((i12 + 4) & 7);
        }
        if (i11 < 0) {
            i11 += i13;
            i10 += 4 - ((i13 + 4) & 7);
        }
        this.f130375b.q(i11, i10);
        return this.f130374a.e(i11, i10);
    }

    private int i(int i10, int i11, int i12, int i13) {
        int i14 = i10 - 2;
        int i15 = i11 - 2;
        int i16 = (h(i14, i15, i12, i13) ? 1 : 0) << 1;
        int i17 = i11 - 1;
        if (h(i14, i17, i12, i13)) {
            i16 |= 1;
        }
        int i18 = i16 << 1;
        int i19 = i10 - 1;
        if (h(i19, i15, i12, i13)) {
            i18 |= 1;
        }
        int i20 = i18 << 1;
        if (h(i19, i17, i12, i13)) {
            i20 |= 1;
        }
        int i21 = i20 << 1;
        if (h(i19, i11, i12, i13)) {
            i21 |= 1;
        }
        int i22 = i21 << 1;
        if (h(i10, i15, i12, i13)) {
            i22 |= 1;
        }
        int i23 = i22 << 1;
        if (h(i10, i17, i12, i13)) {
            i23 |= 1;
        }
        int i24 = i23 << 1;
        return h(i10, i11, i12, i13) ? i24 | 1 : i24;
    }

    private static e j(com.google.zxing.common.b bVar) throws h {
        return e.h(bVar.h(), bVar.l());
    }

    e b() {
        return this.f130376c;
    }

    byte[] c() throws h {
        byte[] bArr = new byte[this.f130376c.g()];
        int iH = this.f130374a.h();
        int iL = this.f130374a.l();
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        int i12 = 4;
        while (true) {
            if (i12 == iH && i10 == 0 && !z10) {
                bArr[i11] = (byte) d(iH, iL);
                i12 -= 2;
                i10 += 2;
                i11++;
                z10 = true;
            } else {
                int i13 = iH - 2;
                if (i12 == i13 && i10 == 0 && (iL & 3) != 0 && !z11) {
                    bArr[i11] = (byte) e(iH, iL);
                    i12 -= 2;
                    i10 += 2;
                    i11++;
                    z11 = true;
                } else if (i12 == iH + 4 && i10 == 2 && (iL & 7) == 0 && !z12) {
                    bArr[i11] = (byte) f(iH, iL);
                    i12 -= 2;
                    i10 += 2;
                    i11++;
                    z12 = true;
                } else if (i12 == i13 && i10 == 0 && (iL & 7) == 4 && !z13) {
                    bArr[i11] = (byte) g(iH, iL);
                    i12 -= 2;
                    i10 += 2;
                    i11++;
                    z13 = true;
                } else {
                    while (true) {
                        if (i12 < iH && i10 >= 0 && !this.f130375b.e(i10, i12)) {
                            bArr[i11] = (byte) i(i12, i10, iH, iL);
                            i11++;
                        }
                        int i14 = i12 - 2;
                        int i15 = i10 + 2;
                        if (i14 < 0 || i15 >= iL) {
                            break;
                        }
                        i12 = i14;
                        i10 = i15;
                    }
                    int i16 = i12 - 1;
                    int i17 = i10 + 5;
                    while (true) {
                        if (i16 >= 0 && i17 < iL && !this.f130375b.e(i17, i16)) {
                            bArr[i11] = (byte) i(i16, i17, iH, iL);
                            i11++;
                        }
                        int i18 = i16 + 2;
                        int i19 = i17 - 2;
                        if (i18 >= iH || i19 < 0) {
                            break;
                        }
                        i16 = i18;
                        i17 = i19;
                    }
                    i12 = i16 + 5;
                    i10 = i17 - 1;
                }
            }
            if (i12 >= iH && i10 >= iL) {
                break;
            }
        }
        if (i11 == this.f130376c.g()) {
            return bArr;
        }
        throw h.a();
    }
}
