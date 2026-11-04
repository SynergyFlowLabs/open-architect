package com.google.zxing.aztec.encoder;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f130123a = 33;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f130124b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f130125c = 32;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f130126d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f130127e = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    private c() {
    }

    private static int[] a(com.google.zxing.common.a aVar, int i10, int i11) {
        int[] iArr = new int[i11];
        int iL = aVar.l() / i10;
        for (int i12 = 0; i12 < iL; i12++) {
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                i13 |= aVar.h((i12 * i10) + i14) ? 1 << ((i10 - i14) - 1) : 0;
            }
            iArr[i12] = i13;
        }
        return iArr;
    }

    private static void b(com.google.zxing.common.b bVar, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12 += 2) {
            int i13 = i10 - i12;
            int i14 = i13;
            while (true) {
                int i15 = i10 + i12;
                if (i14 <= i15) {
                    bVar.q(i14, i13);
                    bVar.q(i14, i15);
                    bVar.q(i13, i14);
                    bVar.q(i15, i14);
                    i14++;
                }
            }
        }
        int i16 = i10 - i11;
        bVar.q(i16, i16);
        int i17 = i16 + 1;
        bVar.q(i17, i16);
        bVar.q(i16, i17);
        int i18 = i10 + i11;
        bVar.q(i18, i16);
        bVar.q(i18, i17);
        bVar.q(i18, i18 - 1);
    }

    private static void c(com.google.zxing.common.b bVar, boolean z10, int i10, com.google.zxing.common.a aVar) {
        int i11 = i10 / 2;
        int i12 = 0;
        if (z10) {
            while (i12 < 7) {
                int i13 = (i11 - 3) + i12;
                if (aVar.h(i12)) {
                    bVar.q(i13, i11 - 5);
                }
                if (aVar.h(i12 + 7)) {
                    bVar.q(i11 + 5, i13);
                }
                if (aVar.h(20 - i12)) {
                    bVar.q(i13, i11 + 5);
                }
                if (aVar.h(27 - i12)) {
                    bVar.q(i11 - 5, i13);
                }
                i12++;
            }
            return;
        }
        while (i12 < 10) {
            int i14 = (i11 - 5) + i12 + (i12 / 5);
            if (aVar.h(i12)) {
                bVar.q(i14, i11 - 7);
            }
            if (aVar.h(i12 + 10)) {
                bVar.q(i11 + 7, i14);
            }
            if (aVar.h(29 - i12)) {
                bVar.q(i14, i11 + 7);
            }
            if (aVar.h(39 - i12)) {
                bVar.q(i11 - 7, i14);
            }
            i12++;
        }
    }

    public static a d(byte[] bArr) {
        return e(bArr, 33, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a e(byte[] bArr, int i10, int i11) {
        com.google.zxing.common.a aVarI;
        int i12;
        boolean z10;
        int iAbs;
        int iJ;
        int i13;
        com.google.zxing.common.a aVarA = new d(bArr).a();
        int iL = ((aVarA.l() * i10) / 100) + 11;
        int iL2 = aVarA.l() + iL;
        int i14 = 1;
        if (i11 != 0) {
            boolean z11 = i11 < 0;
            iAbs = Math.abs(i11);
            if (iAbs > (z11 ? 4 : 32)) {
                throw new IllegalArgumentException(String.format("Illegal value %s for layers", Integer.valueOf(i11)));
            }
            iJ = j(iAbs, z11);
            i12 = f130127e[iAbs];
            int i15 = iJ - (iJ % i12);
            aVarI = i(aVarA, i12);
            if (aVarI.l() + iL > i15) {
                z10 = z11;
                throw new IllegalArgumentException("Data to large for user specified layer");
            }
            if (z11) {
                z10 = z11;
                if (aVarI.l() > (i12 << 6)) {
                    throw new IllegalArgumentException("Data to large for user specified layer");
                }
            }
        } else {
            com.google.zxing.common.a aVarI2 = null;
            int i16 = 0;
            int i17 = 0;
            while (true) {
                if (i16 > 32) {
                    throw new IllegalArgumentException("Data too large for an Aztec code");
                }
                boolean z12 = i16 <= 3 ? i14 : 0;
                int i18 = z12 != 0 ? i16 + 1 : i16;
                int iJ2 = j(i18, z12);
                if (iL2 <= iJ2) {
                    if (aVarI2 == null || i17 != f130127e[i18]) {
                        int i19 = f130127e[i18];
                        i17 = i19;
                        aVarI2 = i(aVarA, i19);
                    }
                    int i20 = iJ2 - (iJ2 % i17);
                    if ((z12 == 0 || aVarI2.l() <= (i17 << 6)) && aVarI2.l() + iL <= i20) {
                        aVarI = aVarI2;
                        i12 = i17;
                        z10 = z12;
                        iAbs = i18;
                        iJ = iJ2;
                        break;
                    }
                }
                i16++;
                i14 = i14;
            }
        }
        com.google.zxing.common.a aVarF = f(aVarI, iJ, i12);
        int iL3 = aVarI.l() / i12;
        com.google.zxing.common.a aVarG = g(z10, iAbs, iL3);
        int i21 = (z10 ? 11 : 14) + (iAbs << 2);
        int[] iArr = new int[i21];
        int i22 = 2;
        if (z10) {
            for (int i23 = 0; i23 < i21; i23++) {
                iArr[i23] = i23;
            }
            i13 = i21;
        } else {
            int i24 = i21 / 2;
            i13 = i21 + 1 + (((i24 - 1) / 15) * 2);
            int i25 = i13 / 2;
            for (int i26 = 0; i26 < i24; i26++) {
                int i27 = (i26 / 15) + i26;
                iArr[(i24 - i26) - i14] = (i25 - i27) - 1;
                iArr[i24 + i26] = i27 + i25 + i14;
            }
        }
        com.google.zxing.common.b bVar = new com.google.zxing.common.b(i13);
        int i28 = 0;
        for (int i29 = 0; i29 < iAbs; i29++) {
            int i30 = ((iAbs - i29) << i22) + (z10 ? 9 : 12);
            for (int i31 = 0; i31 < i30; i31++) {
                int i32 = i31 << 1;
                int i33 = 0;
                while (i33 < i22) {
                    int i34 = i14;
                    if (aVarF.h(i28 + i32 + i33)) {
                        int i35 = i29 << 1;
                        bVar.q(iArr[i35 + i33], iArr[i35 + i31]);
                    }
                    if (aVarF.h((i30 << 1) + i28 + i32 + i33)) {
                        int i36 = i29 << 1;
                        bVar.q(iArr[i36 + i31], iArr[((i21 - 1) - i36) - i33]);
                    }
                    if (aVarF.h((i30 << 2) + i28 + i32 + i33)) {
                        int i37 = (i21 - 1) - (i29 << 1);
                        bVar.q(iArr[i37 - i33], iArr[i37 - i31]);
                    }
                    if (aVarF.h((i30 * 6) + i28 + i32 + i33)) {
                        int i38 = i29 << 1;
                        bVar.q(iArr[((i21 - 1) - i38) - i31], iArr[i38 + i33]);
                    }
                    i33++;
                    i14 = i34;
                    i22 = i22;
                }
            }
            i28 += i30 << 3;
        }
        c(bVar, z10, i13, aVarG);
        if (z10) {
            b(bVar, i13 / 2, 5);
        } else {
            int i39 = i13 / 2;
            b(bVar, i39, 7);
            int i40 = 0;
            int i41 = 0;
            while (i41 < (i21 / 2) - 1) {
                for (int i42 = i39 & 1; i42 < i13; i42 += 2) {
                    int i43 = i39 - i40;
                    bVar.q(i43, i42);
                    int i44 = i39 + i40;
                    bVar.q(i44, i42);
                    bVar.q(i42, i43);
                    bVar.q(i42, i44);
                }
                i41 += 15;
                i40 += 16;
            }
        }
        a aVar = new a();
        aVar.g(z10);
        aVar.j(i13);
        aVar.h(iAbs);
        aVar.f(iL3);
        aVar.i(bVar);
        return aVar;
    }

    private static com.google.zxing.common.a f(com.google.zxing.common.a aVar, int i10, int i11) {
        int iL = aVar.l() / i11;
        com.google.zxing.common.reedsolomon.d dVar = new com.google.zxing.common.reedsolomon.d(h(i11));
        int i12 = i10 / i11;
        int[] iArrA = a(aVar, i11, i12);
        dVar.b(iArrA, i12 - iL);
        com.google.zxing.common.a aVar2 = new com.google.zxing.common.a();
        aVar2.c(0, i10 % i11);
        for (int i13 : iArrA) {
            aVar2.c(i13, i11);
        }
        return aVar2;
    }

    static com.google.zxing.common.a g(boolean z10, int i10, int i11) {
        com.google.zxing.common.a aVar = new com.google.zxing.common.a();
        if (z10) {
            aVar.c(i10 - 1, 2);
            aVar.c(i11 - 1, 6);
            return f(aVar, 28, 4);
        }
        aVar.c(i10 - 1, 5);
        aVar.c(i11 - 1, 11);
        return f(aVar, 40, 4);
    }

    private static com.google.zxing.common.reedsolomon.a h(int i10) {
        if (i10 == 4) {
            return com.google.zxing.common.reedsolomon.a.f130356k;
        }
        if (i10 == 6) {
            return com.google.zxing.common.reedsolomon.a.f130355j;
        }
        if (i10 == 8) {
            return com.google.zxing.common.reedsolomon.a.f130359n;
        }
        if (i10 == 10) {
            return com.google.zxing.common.reedsolomon.a.f130354i;
        }
        if (i10 == 12) {
            return com.google.zxing.common.reedsolomon.a.f130353h;
        }
        throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i10)));
    }

    static com.google.zxing.common.a i(com.google.zxing.common.a aVar, int i10) {
        com.google.zxing.common.a aVar2 = new com.google.zxing.common.a();
        int iL = aVar.l();
        int i11 = (1 << i10) - 2;
        int i12 = 0;
        while (i12 < iL) {
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                int i15 = i12 + i14;
                if (i15 >= iL || aVar.h(i15)) {
                    i13 |= 1 << ((i10 - 1) - i14);
                }
            }
            int i16 = i13 & i11;
            if (i16 == i11) {
                aVar2.c(i16, i10);
            } else {
                if (i16 == 0) {
                    aVar2.c(i13 | 1, i10);
                } else {
                    aVar2.c(i13, i10);
                }
                i12 += i10;
            }
            i12--;
            i12 += i10;
        }
        return aVar2;
    }

    private static int j(int i10, boolean z10) {
        return ((z10 ? 88 : com.planner5d.library.engine.input.f.b.B) + (i10 << 4)) * i10;
    }
}
