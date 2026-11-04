package com.google.zxing.common;

import com.google.zxing.m;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f130331i = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f130332j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f130333k = 7;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f130334l = 40;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f130335m = 24;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f130336h;

    public j(com.google.zxing.j jVar) {
        super(jVar);
    }

    private static int[][] i(byte[] bArr, int i10, int i11, int i12, int i13) {
        int i14 = 8;
        int i15 = i13 - 8;
        int i16 = i12 - 8;
        char c10 = 2;
        boolean z10 = true;
        int i17 = 0;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i11, i10);
        int i18 = 0;
        while (i18 < i11) {
            int i19 = i18 << 3;
            if (i19 > i15) {
                i19 = i15;
            }
            int i20 = i17;
            while (i20 < i10) {
                int i21 = i20 << 3;
                if (i21 > i16) {
                    i21 = i16;
                }
                int i22 = (i19 * i12) + i21;
                char c11 = c10;
                boolean z11 = z10;
                int i23 = i17;
                int i24 = i23;
                int i25 = i24;
                int i26 = 255;
                while (i23 < i14) {
                    int i27 = i17;
                    int i28 = i25;
                    while (i27 < i14) {
                        int i29 = bArr[i22 + i27] & 255;
                        i24 += i29;
                        if (i29 < i26) {
                            i26 = i29;
                        }
                        if (i29 > i28) {
                            i28 = i29;
                        }
                        i27++;
                        i14 = 8;
                    }
                    if (i28 - i26 > 24) {
                        while (true) {
                            i23++;
                            i22 += i12;
                            if (i23 < 8) {
                                int i30 = 0;
                                for (int i31 = 8; i30 < i31; i31 = 8) {
                                    i24 += bArr[i22 + i30] & 255;
                                    i30++;
                                }
                            }
                        }
                    }
                    i23++;
                    i22 += i12;
                    i25 = i28;
                    i14 = 8;
                    i17 = 0;
                }
                int i32 = i24 >> 6;
                if (i25 - i26 <= 24) {
                    i32 = i26 / 2;
                    if (i18 > 0 && i20 > 0) {
                        int[] iArr2 = iArr[i18 - 1];
                        int i33 = i20 - 1;
                        int i34 = ((iArr2[i20] + (iArr[i18][i33] * 2)) + iArr2[i33]) / 4;
                        if (i26 < i34) {
                            i32 = i34;
                        }
                    }
                }
                iArr[i18][i20] = i32;
                i20++;
                c10 = c11;
                z10 = z11;
                i14 = 8;
                i17 = 0;
            }
            i18++;
            i14 = 8;
            i17 = 0;
        }
        return iArr;
    }

    private static void j(byte[] bArr, int i10, int i11, int i12, int i13, int[][] iArr, b bVar) {
        int i14 = i13 - 8;
        int i15 = i12 - 8;
        for (int i16 = 0; i16 < i11; i16++) {
            int i17 = i16 << 3;
            int i18 = i17 > i14 ? i14 : i17;
            int iK = k(i16, 2, i11 - 3);
            for (int i19 = 0; i19 < i10; i19++) {
                int i20 = i19 << 3;
                int i21 = i20 > i15 ? i15 : i20;
                int iK2 = k(i19, 2, i10 - 3);
                int i22 = 0;
                for (int i23 = -2; i23 <= 2; i23++) {
                    int[] iArr2 = iArr[iK + i23];
                    i22 += iArr2[iK2 - 2] + iArr2[iK2 - 1] + iArr2[iK2] + iArr2[iK2 + 1] + iArr2[iK2 + 2];
                }
                l(bArr, i21, i18, i22 / 25, i12, bVar);
            }
        }
    }

    private static int k(int i10, int i11, int i12) {
        if (i10 < i11) {
            return i11;
        }
        return i10 > i12 ? i12 : i10;
    }

    private static void l(byte[] bArr, int i10, int i11, int i12, int i13, b bVar) {
        int i14 = (i11 * i13) + i10;
        int i15 = 0;
        while (i15 < 8) {
            for (int i16 = 0; i16 < 8; i16++) {
                if ((bArr[i14 + i16] & 255) <= i12) {
                    bVar.q(i10 + i16, i11 + i15);
                }
            }
            i15++;
            i14 += i13;
        }
    }

    @Override // com.google.zxing.common.h, com.google.zxing.b
    public com.google.zxing.b a(com.google.zxing.j jVar) {
        return new j(jVar);
    }

    @Override // com.google.zxing.common.h, com.google.zxing.b
    public b b() throws m {
        b bVar = this.f130336h;
        if (bVar != null) {
            return bVar;
        }
        com.google.zxing.j jVarE = e();
        int iE = jVarE.e();
        int iB = jVarE.b();
        if (iE < 40 || iB < 40) {
            this.f130336h = super.b();
        } else {
            byte[] bArrC = jVarE.c();
            int i10 = iE >> 3;
            if ((iE & 7) != 0) {
                i10++;
            }
            int i11 = i10;
            int i12 = iB >> 3;
            if ((iB & 7) != 0) {
                i12++;
            }
            int i13 = i12;
            int[][] iArrI = i(bArrC, i11, i13, iE, iB);
            b bVar2 = new b(iE, iB);
            j(bArrC, i11, i13, iE, iB, iArrI, bVar2);
            this.f130336h = bVar2;
        }
        return this.f130336h;
    }
}
