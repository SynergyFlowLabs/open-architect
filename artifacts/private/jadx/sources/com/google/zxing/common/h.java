package com.google.zxing.common;

import com.google.zxing.m;

/* JADX INFO: loaded from: classes5.dex */
public class h extends com.google.zxing.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f130324d = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f130325e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f130326f = 32;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte[] f130327g = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f130328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f130329c;

    public h(com.google.zxing.j jVar) {
        super(jVar);
        this.f130328b = f130327g;
        this.f130329c = new int[32];
    }

    private static int g(int[] iArr) throws m {
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = iArr[i13];
            if (i14 > i10) {
                i12 = i13;
                i10 = i14;
            }
            if (i14 > i11) {
                i11 = i14;
            }
        }
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < length; i17++) {
            int i18 = i17 - i12;
            int i19 = iArr[i17] * i18 * i18;
            if (i19 > i16) {
                i15 = i17;
                i16 = i19;
            }
        }
        if (i12 <= i15) {
            int i20 = i12;
            i12 = i15;
            i15 = i20;
        }
        if (i12 - i15 <= length / 16) {
            throw m.a();
        }
        int i21 = i12 - 1;
        int i22 = -1;
        int i23 = i21;
        while (i21 > i15) {
            int i24 = i21 - i15;
            int i25 = i24 * i24 * (i12 - i21) * (i11 - iArr[i21]);
            if (i25 > i22) {
                i23 = i21;
                i22 = i25;
            }
            i21--;
        }
        return i23 << 3;
    }

    private void h(int i10) {
        if (this.f130328b.length < i10) {
            this.f130328b = new byte[i10];
        }
        for (int i11 = 0; i11 < 32; i11++) {
            this.f130329c[i11] = 0;
        }
    }

    @Override // com.google.zxing.b
    public com.google.zxing.b a(com.google.zxing.j jVar) {
        return new h(jVar);
    }

    @Override // com.google.zxing.b
    public b b() throws m {
        com.google.zxing.j jVarE = e();
        int iE = jVarE.e();
        int iB = jVarE.b();
        b bVar = new b(iE, iB);
        h(iE);
        int[] iArr = this.f130329c;
        for (int i10 = 1; i10 < 5; i10++) {
            byte[] bArrD = jVarE.d((iB * i10) / 5, this.f130328b);
            int i11 = (iE << 2) / 5;
            for (int i12 = iE / 5; i12 < i11; i12++) {
                int i13 = (bArrD[i12] & 255) >> 3;
                iArr[i13] = iArr[i13] + 1;
            }
        }
        int iG = g(iArr);
        byte[] bArrC = jVarE.c();
        for (int i14 = 0; i14 < iB; i14++) {
            int i15 = i14 * iE;
            for (int i16 = 0; i16 < iE; i16++) {
                if ((bArrC[i15 + i16] & 255) < iG) {
                    bVar.q(i16, i14);
                }
            }
        }
        return bVar;
    }

    @Override // com.google.zxing.b
    public a c(int i10, a aVar) throws m {
        com.google.zxing.j jVarE = e();
        int iE = jVarE.e();
        if (aVar == null || aVar.l() < iE) {
            aVar = new a(iE);
        } else {
            aVar.d();
        }
        h(iE);
        byte[] bArrD = jVarE.d(i10, this.f130328b);
        int[] iArr = this.f130329c;
        for (int i11 = 0; i11 < iE; i11++) {
            int i12 = (bArrD[i11] & 255) >> 3;
            iArr[i12] = iArr[i12] + 1;
        }
        int iG = g(iArr);
        if (iE < 3) {
            for (int i13 = 0; i13 < iE; i13++) {
                if ((bArrD[i13] & 255) < iG) {
                    aVar.r(i13);
                }
            }
        } else {
            int i14 = bArrD[0] & 255;
            int i15 = bArrD[1] & 255;
            int i16 = 1;
            while (i16 < iE - 1) {
                int i17 = i16 + 1;
                int i18 = bArrD[i17] & 255;
                if ((((i15 << 2) - i14) - i18) / 2 < iG) {
                    aVar.r(i16);
                }
                i14 = i15;
                i16 = i17;
                i15 = i18;
            }
        }
        return aVar;
    }
}
